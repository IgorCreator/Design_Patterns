package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.calc.ComedyCalculator;
import apps.refactoring_project.fowler_2019.calc.PerformanceCalculator;
import apps.refactoring_project.fowler_2019.calc.TragedyCalculator;
import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import apps.refactoring_project.fowler_2019.pojo.Data;
import apps.refactoring_project.fowler_2019.pojo.Performance;

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

    private Performance enrichPerformance(PerformanceDTO performanceDTO) {
        Performance performance = new Performance(performanceDTO);
        PerformanceCalculator calculator = createPerformanceCalculator(performanceDTO, playFor(performance));
        performance.setPlay(calculator.getPlay());
        performance.setAmount(calculator.getAmount());
        performance.setVolumeCredits(calculator.getVolumeCredits());
        return performance;
    }

    private PerformanceCalculator createPerformanceCalculator(PerformanceDTO performance, PlayDTO play) {
        switch (play.getType()){
            case "tragedy" : return new TragedyCalculator(performance, play);
            case "comedy" : return new ComedyCalculator(performance, play);
            default: throw new IllegalStateException("Unknown type: " + play.getType());
        }
    }

    private PlayDTO playFor(Performance perf) {
        return plays.get(perf.getPlayID());
    }

    private int totalAmount(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getAmount).sum();
    }

    private int totalVolumeCredits(Data data) {
        return data.getPerformances().stream().mapToInt(Performance::getVolumeCredits).sum();
    }
}
