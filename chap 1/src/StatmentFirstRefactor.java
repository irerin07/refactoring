import java.util.List;

/**
 * @author 민경수
 * @description statment first refactor
 * @since 2021.09.11
 **********************************************************************************************************************/
public class StatmentFirstRefactor {
    public void statement(InvoiceDTO invoice, List<Play> plays) {
        int totalAmount = 0;
        int volumnCredits = 0;

        String result = "invoice: (고객명: " + invoice.getCustomer() + ")\n";

        for (Invoice inv : invoice.getInvoiceList()) {
            int thisAmount = 0;

            Play playId = plays.get(plays.indexOf(inv.getPlayId()));
            thisAmount = amountFor(inv, playId);
            volumnCredits += Math.max(inv.getAudience() - 30, 0);

            if ("comedy".equals(playId.type)) {
                volumnCredits += Math.floor(inv.getAudience() / 5);
            }

            result = result + playId.name + " : " + thisAmount / 100 + "(" + inv.getAudience() + " 석)\n";
            totalAmount += thisAmount;



        }
        result = result + "total Amount: " + totalAmount / 100 + "\n";
        result = result + "total saved points: " + volumnCredits + " 점\n";
        System.out.println("result = " + result);

    }

    private int amountFor(Invoice inv, Play playId){
        int result = 0;
        switch (playId.type) {
            case "tragedy":
                result = 40000;
                if (inv.getAudience() > 30) {
                    result += 1000 * (inv.getAudience() - 30);
                }
                break;
            case "comedy":
                result = 30000;
                if (inv.getAudience() > 20) {
                    result += 10000 + 500 * (inv.getAudience() - 20);
                }
                result += 300 * inv.getAudience();
                break;
            default:
                throw new GenreNotFoundException(playId.type);
        }
        return result;
    }
}