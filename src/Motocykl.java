public class Motocykl extends Pojazd {
    int waga;
    int pojSilnika;
    int moc;

    public Motocykl(String marka, int liczbaMiejsc, int waga, int pojSilnika,int moc) {
        super(marka, liczbaMiejsc);
        this.waga = waga;
        this.pojSilnika = pojSilnika;
        this.moc = moc;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "waga=" + waga +
                ", pojSilnika=" + pojSilnika +
                ", moc=" + moc +
                ", marka='" + marka + '\'' +
                ", liczbaMiejsc=" + liczbaMiejsc +
                '}';
    }
}
