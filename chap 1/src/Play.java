import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Play play = (Play) o;
        return Objects.equals(name, play.name) && Objects.equals(type, play.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}