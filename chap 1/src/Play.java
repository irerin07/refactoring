/**
 * @author 민경수
 * @description play
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Play {
    public String name;
    public String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}