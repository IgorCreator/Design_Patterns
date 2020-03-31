package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.pojo.Invoice;
import apps.refactoring_project.fowler_2019.pojo.Performance;
import apps.refactoring_project.fowler_2019.pojo.Play;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;

public class StatementReader {

    private Map<String, Play> plays;
    private Invoice invoice;

    public String statement(Invoice invoice, Map<String, Play> plays) {
        this.plays = plays;
        this.invoice = invoice;

        int totalAmount = 0;

        StringBuilder result = new StringBuilder("Statement for " + invoice.getCustomer() + "\n");

        Currency usd = Currency.getInstance("USD");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        for (Performance perf : invoice.getPerformances()) {
            // print line for this order
            result.append("\t")
                    .append(playFor(perf).getName()).append(":")
                    .append(usd(amountFor(perf))).append(" ").append(usd.getCurrencyCode())
                    .append(" (").append(perf.getAudience()).append(" seats)")
                    .append("\n");

            totalAmount += amountFor(perf);
        }

        result.append("Amount owed is ").append(usd(totalAmount)).append(" ").append(usd.getCurrencyCode())
                .append("\n").append("You earned ").append(getVolumeCredits()).append(" credits").append("\n");

        return result.toString();
    }

    private int getVolumeCredits() {
        int volumeCredits = 0;
        for (Performance perf : invoice.getPerformances()) {
            volumeCredits += volumeCreditsFor(perf);
        }
        return volumeCredits;
    }

    private int volumeCreditsFor(Performance performance) {
        int result = 0;
        // add volume credits
        result += Math.max(performance.getAudience() - 30, 0);
        // add extra credit for every ten comedy attendees
        if("comedy" == playFor(performance).getType())
            result += Math.floor(performance.getAudience() / 5);
        return result;
    }

    private Play playFor(Performance perf) {
        return plays.get(perf.getPlayID());
    }

    private String usd(int number){
        Currency usd = Currency.getInstance("USD");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        numberFormat.setCurrency(usd);
        return numberFormat.format(number / 100);
    }

    private int amountFor(Performance performance) {
        int result;
        switch (playFor(performance).getType()) {
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
                throw new IllegalStateException("Unknown type: " + playFor(performance).getType());
        }
        return result;
    }
}
