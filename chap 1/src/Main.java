import java.util.ArrayList;
import java.util.List;

/**
 * @author 민경수
 * @description main
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Main {
    public static void main(String[] args) {
        int totalAmount = 0;
        int volumnCredits = 0;

        InvoiceDTO invoiceDTO = new InvoiceDTO();
        invoiceDTO.setCustomer("BigCo");

        List<Invoice> invoiceList = new ArrayList<>();
        invoiceList.add(new Invoice(new Hamlet("Hamlet", "tragedy"), 55));
        invoiceList.add(new Invoice(new AsLike("AsLike", "comedy"), 35));
        invoiceList.add(new Invoice(new Othello("Othllo", "tragedy"), 40));

        invoiceDTO.setInvoiceList(invoiceList);

        String result = "invoice: (고객명: " + invoiceDTO.getCustomer() + ")\n";

        for (Invoice invoice : invoiceList) {
            int thisAmount = 0;
            Play playId = invoice.getPlayId();
            switch (playId.type) {
                case "tragedy":
                    thisAmount = 40000;
                    if (invoice.getAudience() > 30) {
                        thisAmount += 1000 * (invoice.getAudience() - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (invoice.getAudience() > 20) {
                        thisAmount += 10000 + 500 * (invoice.getAudience() - 20);
                    }
                    thisAmount += 300 * invoice.getAudience();
                    break;
                default:
                    throw new GenreNotFoundException(playId.type);
            }
            volumnCredits += Math.max(invoice.getAudience() - 30, 0);

            if ("comedy".equals(playId.type)) {
                volumnCredits += Math.floor(invoice.getAudience() / 5);
            }

            result = result + playId.name + " : " + thisAmount / 100 + "(" + invoice.getAudience() + " 석)\n";
            totalAmount += thisAmount;



        }
        result = result + "total Amount: " + totalAmount / 100 + "\n";
        result = result + "total saved points: " + volumnCredits + " 점\n";
        System.out.println("result = " + result);

    }

}