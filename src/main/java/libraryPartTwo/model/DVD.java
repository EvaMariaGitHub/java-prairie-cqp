package libraryPartTwo.model;


import java.util.Objects;

public class DVD extends CD {
    private Movie kind;
    private boolean threeD;

    public DVD(String title, int time, int shippingDay, Movie kind, boolean threeD) {
        super(title, time, shippingDay);
        this.kind = kind;
        this.threeD = threeD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DVD dvd = (DVD) o;
        return threeD == dvd.threeD &&
                kind == dvd.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind, threeD);
    }
}
