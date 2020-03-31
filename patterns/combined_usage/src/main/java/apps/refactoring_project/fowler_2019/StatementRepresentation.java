package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import apps.refactoring_project.fowler_2019.pojo.Data;
import apps.refactoring_project.fowler_2019.pojo.Performance;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;

public class StatementRepresentation {
    StatementController controller;

    public StatementRepresentation() {
        this.controller = new StatementController();
    }

    public String statement(InvoiceDTO invoice, Map<String, PlayDTO> plays) {
        return renderPlainText(controller.createStatementData(invoice, plays));
    }

    public String htmlStatement(InvoiceDTO invoice, Map<String, PlayDTO> plays){
        return renderHTML(controller.createStatementData(invoice, plays));
    }

    private String renderHTML(Data data) {
        StringBuilder result = new StringBuilder();

        result.append("<h1>")
                .append("Statement for ").append(data.getCustomer())
                .append("</h1>").append("\n")
                .append("<table>").append("\n")
                .append("<tr>")
                    .append("<th>").append("play").append("</th>")
                    .append("<th>").append("seats").append("</th>")
                    .append("<th>").append("cost").append("</th>")
                .append("</tr>")
                .append("\n");

        for (Performance perf : data.getPerformances()) {
            result.append("\t")
                    .append("<tr>")
                        .append("<td>").append(perf.getPlay().getName()).append("</td>")
                        .append("<td>").append(perf.getAudience()).append("</td>")
                        .append("<td>").append(usd(perf.getAmount())).append("</td>")
                    .append("</tr>")
                    .append("\n");
        }

        result.append("<table>").append("\n")
                .append("<p>")
                .append("Amount owed is ").append("<em>").append(usd(data.getTotalAmount())).append("</em>")
                .append("</p>").append("\n")
                .append("<p>")
                .append("You earned ").append("<em>").append(data.getTotalVolumeCredits()).append("</em>").append(" credits")
                .append("</p>").append("\n");

        return result.toString();
    }

    private String renderPlainText(Data data) {
        StringBuilder result = new StringBuilder();

        result.append("Statement for ").append(data.getCustomer()).append("\n");

        for (Performance perf : data.getPerformances()) {
            result.append("\t")
                    .append(perf.getPlay().getName()).append(":")
                    .append(usd(perf.getAmount()))
                    .append(" (").append(perf.getAudience()).append(" seats)")
                    .append("\n");
        }

        result.append("Amount owed is ").append(usd(data.getTotalAmount())).append("\n")
                .append("You earned ").append(data.getTotalVolumeCredits()).append(" credits").append("\n");

        return result.toString();
    }

    private String usd(int number) {
        StringBuilder result = new StringBuilder();

        Currency usd = Currency.getInstance("USD");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        numberFormat.setCurrency(usd);

        result.append(numberFormat.format(number / 100)).append(" ").append(usd.getCurrencyCode());
        return result.toString();
    }
}
