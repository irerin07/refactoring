import java.util.Objects;

/**
 * @author 민경수
 * @description hamlet
 * @since 2021.09.11
 **********************************************************************************************************************/
public class Hamlet extends Play{
    public String name = "Hamlet";
    public String type = "tragedy";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hamlet hamlet = (Hamlet) o;
        return Objects.equals(name, hamlet.name) && Objects.equals(type, hamlet.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, type);
    }

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