package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import apps.refactoring_project.fowler_2019.pojo.Data;
import apps.refactoring_project.fowler_2019.pojo.Performance;
import apps.refactoring_project.fowler_2019.pojo.Play;

import java.text.NumberFormat;
import java.util.*;

public class StatementReader {

    private Map<String, PlayDTO> plays;

    public String statement(InvoiceDTO invoice, Map<String, PlayDTO> plays) {
        return renderPlainText(createStatementData(invoice, plays));
    }

    private Data createStatementData(InvoiceDTO invoice, Map<String, PlayDTO> plays) {
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

    private String renderPlainText(Data data) {
        StringBuilder result = new StringBuilder("Statement for " + data.getCustomer() + "\n");

        Currency usd = Currency.getInstance("USD");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        for (Performance perf : data.getPerformances()) {
            // print line for this order
            result.append("\t")
                    .append(perf.getPlay().getName()).append(":")
                    .append(usd(perf.getAmount())).append(" ").append(usd.getCurrencyCode())
                    .append(" (").append(perf.getAudience()).append(" seats)")
                    .append("\n");
        }

        result.append("Amount owed is ").append(usd(data.getTotalAmount())).append(" ").append(usd.getCurrencyCode())
                .append("\n").append("You earned ").append(data.getTotalVolumeCredits()).append(" credits").append("\n");

        return result.toString();
    }

    private int totalAmount(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getAmount).sum();
    }

    private int totalVolumeCredits(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getVolumeCredits).sum();
    }

    private String usd(int number) {
        Currency usd = Currency.getInstance("USD");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        numberFormat.setCurrency(usd);
        return numberFormat.format(number / 100);
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
}
