import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Othello othello = (Othello) o;
        return Objects.equals(name, othello.name) && Objects.equals(type, othello.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, type);
    }
}