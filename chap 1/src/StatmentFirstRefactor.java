import java.util.List;

/**
 * @author 민경수
 * @description statment first refactor
 * @since 2021.09.11
 **********************************************************************************************************************/
public class StatmentFirstRefactor {

    public static StatementData statementData;

    public String statement(InvoiceDTO invoice, List<Play> plays){
        statementData = new StatementData(invoice);
        StatementData newStatementData = statementData;
        newStatementData.setPlays(plays);
        return renderPlainText(newStatementData, plays);
    }

    private String renderPlainText(StatementData statementData, List<Play> playList) {

        String result = "invoice: (고객명: " + statementData.getCustomer() + ")\n";

        for (Invoice inv : statementData.getPerformances()) {
            result = result + playFor(inv).name + " : " + amountFor(inv) / 100 + "(" + inv.getAudience() + " 석)\n";
        }

        result = result + "total Amount: " + totalAmount() / 100 + "\n";
        result = result + "total saved points: " + totalVolumeCredits() + " 점\n";
        return result;

    }

    private int totalAmount() {
        int result = 0;
        for (Invoice invoice : statementData.getPerformances()) {
            result += amountFor(invoice);

        }
        return result;

    }

    private int amountFor(Invoice inv) {
        int result = 0;
        switch (playFor(inv).type) {
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
                throw new GenreNotFoundException(playFor(inv).type);
        }
        return result;
    }

    private Play playFor(Invoice invoice) {
        Play play = statementData.getPlays().get(statementData.getPlays().indexOf(invoice.getPlayId()));
        return play;
    }

    private Integer volumnCreditsFor(Invoice inv) {
        int result = 0;
        result += Math.max(inv.getAudience() - 30, 0);
        if ("comedy".equals(playFor(inv).type)) {
            result += Math.floor(inv.getAudience() / 5);
        }

        return result;
    }

    private Integer totalVolumeCredits() {
        int result = 0;
        for (Invoice inv : statementData.getPerformances()) {
            result += volumnCreditsFor(inv);
        }
        return result;
    }
}