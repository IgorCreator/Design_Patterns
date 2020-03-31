package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.DBReader;
import apps.refactoring_project.fowler_2019.pojo.Invoice;
import apps.refactoring_project.fowler_2019.pojo.Performances;
import apps.refactoring_project.fowler_2019.pojo.Play;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;

public class StatementReader {

    public static void main(String[] args) throws IOException {
        Invoice invoice = DBReader.parseInvoicesJSON();
        Map<String,Play> plays = DBReader.parsePlaysJson();

        StatementReader reader = new StatementReader();
        System.out.println(reader.statement(invoice, plays));
    }

    public String statement(Invoice invoice, Map<String,Play> plays) {
        int totalAmount = 0;
        int volumeCredits = 0;
        StringBuilder result = new StringBuilder("Statement for " + invoice.getCustomer() + "\n");

        Currency usd = Currency.getInstance("USD");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        format.setCurrency(usd);

        for (Performances perf : invoice.getPerformances()) {
            Play play = plays.get(perf.getPlayID());

            int thisAmount = 0;

            switch (play.getType()) {
                case "tragedy":
                    thisAmount = 40000;
                    if (perf.getAudience() > 30) {
                        thisAmount += 1000 * (perf.getAudience() - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (perf.getAudience() > 20) {
                        thisAmount += 10000 + 500 * (perf.getAudience() - 20);
                    }
                    thisAmount += 300 * perf.getAudience();
                    break;
                default:
                    throw new IllegalStateException("Unknown type: " + play.getType());
            }

            // add volume credits
            volumeCredits += Math.max(perf.getAudience() - 30, 0);
            // add extra credit for every ten comedy attendees
            if("comedy" == play.getType())
                volumeCredits += Math.floor(perf.getAudience() / 5);

            // print line for this order
            result.append("\t")
                    .append(play.getName()).append(":")
                    .append(format.format(thisAmount / 100)).append(" ").append(usd.getCurrencyCode())
                    .append(" (").append(perf.getAudience()).append(" seats)")
                    .append("\n");

            totalAmount += thisAmount;
        }

        result.append("Amount owed is ").append(format.format(totalAmount / 100)).append(" ").append(usd.getCurrencyCode())
                .append("\n").append("You earned ").append(volumeCredits).append(" credits").append("\n");

        return result.toString();
    }
}
