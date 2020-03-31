package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.DBReader;
import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatementRepresentationTest {

    @Test
    public void assertPlainText() throws IOException {
        StatementRepresentation presenter = new StatementRepresentation();

        InvoiceDTO invoice = DBReader.parseInvoicesJSON();
        Map<String, PlayDTO> plays = DBReader.parsePlaysJson();

        String expected = "Statement for BigCo\n" +
                "\tHamlet:$650.00 USD (55 seats)\n" +
                "\tAs You Like It:$580.00 USD (35 seats)\n" +
                "\tOthello:$500.00 USD (40 seats)\n" +
                "Amount owed is $1,730.00 USD\n" +
                "You earned 40 credits\n";

        String actual = presenter.statement(invoice, plays);
        compareResults(expected, actual);
    }

    @Test
    public void assertHTML() throws IOException {
        StatementRepresentation presenter = new StatementRepresentation();

        InvoiceDTO invoice = DBReader.parseInvoicesJSON();
        Map<String, PlayDTO> plays = DBReader.parsePlaysJson();

        String expected = "<h1>Statement for BigCo</h1>\n" +
                "<table>\n" +
                "<tr><th>play</th><th>seats</th><th>cost</th></tr>\n" +
                "\t<tr><td>Hamlet</td><td>55</td><td>$650.00 USD</td></tr>\n" +
                "\t<tr><td>As You Like It</td><td>35</td><td>$580.00 USD</td></tr>\n" +
                "\t<tr><td>Othello</td><td>40</td><td>$500.00 USD</td></tr>\n" +
                "<table>\n" +
                "<p>Amount owed is <em>$1,730.00 USD</em></p>\n" +
                "<p>You earned <em>40</em> credits</p>\n";

        String actual = presenter.htmlStatement(invoice, plays);
        compareResults(expected, actual);
    }

    private void compareResults(String expected, String actual) {
        assertEquals(expected, actual);
    }
}