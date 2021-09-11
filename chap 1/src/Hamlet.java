/**
 * @author 민경수
 * @description hamlet
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Hamlet extends Play{
    public String name = "Hamlet";
    public String type = "tragedy";

    public Hamlet(String name, String type){
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