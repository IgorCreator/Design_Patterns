package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import apps.refactoring_project.fowler_2019.pojo.Data;
import apps.refactoring_project.fowler_2019.pojo.Performance;
import apps.refactoring_project.fowler_2019.pojo.Play;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StatementController {

    private Map<String, PlayDTO> plays;

    public Data createStatementData(InvoiceDTO invoice, Map<String, PlayDTO> plays) {
        this.plays = plays;
        Data statementData = new Data();
        statementData.setCustomer(invoice.getCustomer());
        statementData.setPerformances(fillPerformances(invoice));
        statementData.setTotalAmount(totalAmount(statementData));
        statementData.setTotalVolumeCredits(totalVolumeCredits(statementData));
        return statementData;
    }

    private List<Performance> fillPerformances(InvoiceDTO invoice) {
        List<Performance> performanceList = new ArrayList<>();
        for (PerformanceDTO perf : invoice.getPerformances()) {
            performanceList.add(enrichPerformance(perf));
        }
        return performanceList;
    }

    private Performance enrichPerformance(PerformanceDTO perf) {
        Performance performance = new Performance(perf);
        performance.setPlay(playFor(performance));
        performance.setAmount(amountFor(performance));
        performance.setVolumeCredits(volumeCreditsFor(performance));
        return performance;
    }

    private Play playFor(Performance perf) {
        PlayDTO playDTO = plays.get(perf.getPlayID());
        return new Play(playDTO);
    }

    private int amountFor(Performance performance) {
        int result;
        switch (performance.getPlay().getType()) {
            case "tragedy":
                result = 40000;
                if (performance.getAudience() > 30) {
                    result += 1000 * (performance.getAudience() - 30);
                }
                break;
            case "comedy":
                result = 30000;
                if (performance.getAudience() > 20) {
                    result += 10000 + 500 * (performance.getAudience() - 20);
                }
                result += 300 * performance.getAudience();
                break;
            default:
                throw new IllegalStateException("Unknown type: " + performance.getPlay().getType());
        }
        return result;
    }

    private int volumeCreditsFor(Performance performance) {
        int result = 0;
        // add volume credits
        result += Math.max(performance.getAudience() - 30, 0);
        // add extra credit for every ten comedy attendees
        if ("comedy" == performance.getPlay().getType())
            result += Math.floor(performance.getAudience() / 5);
        return result;
    }

    private int totalAmount(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getAmount).sum();
    }

    private int totalVolumeCredits(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getVolumeCredits).sum();
    }
}
