package Collections;

import java.util.Objects;

public class Sa {

    private int i;

    private String a;

    public Sa( int i, String a) {
        this.a = a;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Sa{" +
                "a='" + a + '\'' +
                ", i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sa sa = (Sa) o;
        return i == sa.i && Objects.equals(a, sa.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, a);
    }
}
