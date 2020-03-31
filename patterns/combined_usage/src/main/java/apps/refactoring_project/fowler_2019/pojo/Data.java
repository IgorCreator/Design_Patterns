package apps.refactoring_project.fowler_2019.pojo;

import java.util.List;

public class Data {

    String customer;
    List<Performance> performances;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }

}
