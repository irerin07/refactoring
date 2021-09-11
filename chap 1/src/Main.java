import java.util.ArrayList;
import java.util.List;

/**
 * @author 민경수
 * @description main
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Main {
    public static void main(String[] args) {
//        Statement statement = new Statement();
        StatmentFirstRefactor statement = new StatmentFirstRefactor();
        InvoiceDTO invoiceDTO = new InvoiceDTO();
        invoiceDTO.setCustomer("BigCo");

        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(new Invoice(new Hamlet("Hamlet", "tragedy"), 55));
        invoiceList.add(new Invoice(new AsLike("AsLike", "comedy"), 35));
        invoiceList.add(new Invoice(new Othello("Othello", "tragedy"), 40));

        invoiceDTO.setInvoiceList(invoiceList);

        List<Play> plays = new ArrayList<>();
        plays.add(new Hamlet("Hamlet", "tragedy"));
        plays.add(new AsLike("AsLike", "comedy"));
        plays.add(new Othello("Othello", "tragedy"));

        statement.statement(invoiceDTO, plays);
    }

}