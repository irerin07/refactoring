import java.util.List;

/**
 * @author 민경수
 * @description invoice dto
 * @since 2021.09.11
 **********************************************************************************************************************/
public class InvoiceDTO {
    private String customer;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    private List<Invoice> invoiceList;

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
}