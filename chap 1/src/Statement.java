import java.util.List;

/**
 * @author 민경수
 * @description statement
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Statement {

    public void statement(InvoiceDTO invoice, List<Play> plays) {
        int totalAmount = 0;
        int volumnCredits = 0;

        String result = "invoice: (고객명: " + invoice.getCustomer() + ")\n";

        for (Invoice inv : invoice.getPerformances()) {
            int thisAmount = 0;
            
            Play playId = plays.get(plays.indexOf(inv.getPlayId()));
            switch (playId.type) {
                case "tragedy":
                    thisAmount = 40000;
                    if (inv.getAudience() > 30) {
                        thisAmount += 1000 * (inv.getAudience() - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (inv.getAudience() > 20) {
                        thisAmount += 10000 + 500 * (inv.getAudience() - 20);
                    }
                    thisAmount += 300 * inv.getAudience();
                    break;
                default:
                    throw new GenreNotFoundException(playId.type);
            }
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
}