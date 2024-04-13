package collections;

import java.util.Objects;

public class Ex {

    private String S;
    private int i;
    public Ex(String S, int i) {
        this.S = S;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Ex{i=" + i + " , " + "s='" + S + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex ex = (Ex) o;
        return i == ex.i && Objects.equals(S, ex.S);
    }

    @Override
    public int hashCode() {
        return Objects.hash(S, i);
    }
}
