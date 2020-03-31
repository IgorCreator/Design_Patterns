package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.DBReader;
import apps.refactoring_project.fowler_2019.pojo.Invoice;
import apps.refactoring_project.fowler_2019.pojo.Play;

import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Invoice invoice = DBReader.parseInvoicesJSON();
        Map<String, Play> plays = DBReader.parsePlaysJson();

        StatementReader reader = new StatementReader();
        System.out.println(reader.statement(invoice, plays));
    }

}
