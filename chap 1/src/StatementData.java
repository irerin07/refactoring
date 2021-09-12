import java.util.List;

/**
 * @author 민경수
 * @description statement data
 * @since 2021.09.11
 **********************************************************************************************************************/
public class StatementData {
    private String customer;
    private List<Invoice> performances;
    private List<Play> plays;

    public List<Play> getPlays() {
        return plays;
    }

    public void setPlays(List<Play> plays) {
        this.plays = plays;
    }

    public StatementData(InvoiceDTO invoiceDTO){
        this.customer = invoiceDTO.getCustomer();
        this.performances = invoiceDTO.getPerformances();
    }

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