package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.DBReader;
import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatementReaderTest {

    @Test
    public void assertExit() throws IOException {
        StatementReader reader = new StatementReader();

        InvoiceDTO invoice = DBReader.parseInvoicesJSON();
        Map<String, PlayDTO> plays = DBReader.parsePlaysJson();

        String expected = "Statement for BigCo\n" +
                "\tHamlet:$650.00 USD (55 seats)\n" +
                "\tAs You Like It:$580.00 USD (35 seats)\n" +
                "\tOthello:$500.00 USD (40 seats)\n" +
                "Amount owed is $1,730.00 USD\n" +
                "You earned 40 credits\n";

        assertEquals(expected, reader.statement(invoice, plays));
    }
}