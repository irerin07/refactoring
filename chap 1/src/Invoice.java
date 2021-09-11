/**
 * @author 민경수
 * @description invoice
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Invoice {
    private Play playId;
    private Integer audience;

    public Invoice(Play playId, int audience) {
        this.playId = playId;
        this.audience = audience;
    }

    public Play getPlayId() {
        return playId;
    }

    public void setPlayId(Play playId) {
        this.playId = playId;
    }

    public Integer getAudience() {
        return audience;
    }

    public void setAudience(Integer audience) {
        this.audience = audience;
    }
}