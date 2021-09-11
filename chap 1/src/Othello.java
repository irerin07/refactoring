/**
 * @author 민경수
 * @description othello
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Othello extends Play{
    public String name = "Othello";
    public String type = "tragedy";

    public Othello(String name, String type){
        super(name, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}