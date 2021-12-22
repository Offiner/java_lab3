public class Rower extends Pojazd {
    double waga;
    String typRoweru;

    public Rower(String marka, int liczbaMiejsc, double waga, String typRoweru) {
        super(marka, liczbaMiejsc);
        this.waga = waga;
        this.typRoweru = typRoweru;
    }

    @Override
    public String toString() {
        return "Rower{" +
                "marka='" + marka + '\'' +
                ", liczbaMiejsc=" + liczbaMiejsc +
                ", waga=" + waga +
                ", typRoweru='" + typRoweru + '\'' +
                '}';
    }
}
