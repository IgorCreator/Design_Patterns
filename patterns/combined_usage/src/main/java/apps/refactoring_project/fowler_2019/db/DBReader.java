package apps.refactoring_project.fowler_2019.db;

import apps.refactoring_project.fowler_2019.db.dto.InvoiceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class DBReader {

    private static String pathnamePlays = "C:\\Users\\a638908\\User_folder\\Project\\Design_patterns\\patterns\\combined_usage\\src\\main\\java\\apps\\refactoring_project\\fowler_2019\\db\\plays.json";
    private static String pathnameInvoice = "C:\\Users\\a638908\\User_folder\\Project\\Design_patterns\\patterns\\combined_usage\\src\\main\\java\\apps\\refactoring_project\\fowler_2019\\db\\invoice.json";

    public static Map<String, PlayDTO> parsePlaysJson() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, PlayDTO> plays = objectMapper.readValue(new File(pathnamePlays), new TypeReference<Map<String, PlayDTO>>() {
        });
        return plays;
    }

    public static InvoiceDTO parseInvoicesJSON() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InvoiceDTO invoice = objectMapper.readValue(new File(pathnameInvoice), InvoiceDTO.class);
        return invoice;
    }
}
