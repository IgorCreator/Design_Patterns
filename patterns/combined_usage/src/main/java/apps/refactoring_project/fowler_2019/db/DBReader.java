package apps.refactoring_project.fowler_2019.db;

import apps.refactoring_project.fowler_2019.pojo.Invoice;
import apps.refactoring_project.fowler_2019.pojo.Play;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DBReader {

    private static String pathnamePlays = "C:\\Users\\a638908\\User_folder\\Project\\Design_patterns\\patterns\\combined_usage\\src\\main\\java\\apps\\refactoring_project\\fowler_2019\\db\\plays.json";
    private static String pathnameInvoice = "C:\\Users\\a638908\\User_folder\\Project\\Design_patterns\\patterns\\combined_usage\\src\\main\\java\\apps\\refactoring_project\\fowler_2019\\db\\invoice.json";

    public static Map<String, Play> parsePlaysJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Play> plays = objectMapper.readValue(new File(pathnamePlays), new TypeReference<Map<String, Play>>() {
        });
        return plays;
    }

    public static Invoice parseInvoicesJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Invoice invoice = objectMapper.readValue(new File(pathnameInvoice), Invoice.class);
        return invoice;
    }
}
