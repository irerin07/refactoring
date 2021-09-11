import java.util.Objects;

/**
 * @author 민경수
 * @description as like
 * @since 2021.09.11
 **********************************************************************************************************************/
public class AsLike extends Play{
    public String name = "AsLike";
    public String type = "comedy";

    public AsLike(String name, String type){
        super(name, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AsLike asLike = (AsLike) o;
        return Objects.equals(name, asLike.name) && Objects.equals(type, asLike.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, type);
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