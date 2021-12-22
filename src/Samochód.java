public class Samochód extends Pojazd {
    String model;
    double moc;
    double pojSilnika;


    public Samochód(String marka, int liczbaMiejsc, String model, double moc, double pojSilnika) {
        super(marka, liczbaMiejsc);
        this.model = model;
        this.moc = moc;
        this.pojSilnika = pojSilnika;
    }

    @Override
    public String toString() {
        return "Samochód{" +
                "marka='" + marka + '\'' +
                ", liczbaMiejsc=" + liczbaMiejsc +
                ", model='" + model + '\'' +
                ", moc=" + moc +
                ", pojSilnika=" + pojSilnika +
                '}';
    }
}
