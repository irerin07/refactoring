import java.util.List;

/**
 * @author 민경수
 * @description invoice dto
 * @since 2021.09.11
 **********************************************************************************************************************/
public class InvoiceDTO {
    private String customer;
    private List<Invoice> performances;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Invoice> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Invoice> performances) {
        this.performances = performances;
    }
}