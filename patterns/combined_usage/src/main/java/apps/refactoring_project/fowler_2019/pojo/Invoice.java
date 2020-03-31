package apps.refactoring_project.fowler_2019.pojo;

import java.util.List;

public class Invoice {

    String customer;
    List<Performances> performances;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Performances> getPerformances() {
        return performances;
    }

    public void setPerformens(List<Performances> performances) {
        this.performances = performances;
    }
}
