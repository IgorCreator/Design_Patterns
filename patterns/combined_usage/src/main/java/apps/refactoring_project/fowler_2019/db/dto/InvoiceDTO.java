package apps.refactoring_project.fowler_2019.db.dto;

import java.util.List;

public class InvoiceDTO {

    String customer;
    List<PerformanceDTO> performances;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<PerformanceDTO> getPerformances() {
        return performances;
    }

    public void setPerformances(List<PerformanceDTO> performances) {
        this.performances = performances;
    }
}
