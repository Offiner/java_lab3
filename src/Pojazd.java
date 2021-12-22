public class Pojazd {
    String marka;
    int liczbaMiejsc;


    public Pojazd() {
    }

    public Pojazd(String marka, int liczbaMiejsc) {
        this.marka = marka;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "marka='" + marka + '\'' +
                ", liczbaMiejsc=" + liczbaMiejsc +
                '}';
    }
}
