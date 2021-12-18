public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int index;



    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.index = 0;
    }

    public Osoba(String imie, String nazwisko, int pieniadze) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /*public int wyliczPieniadze() {
        return this.pieniadze;
    }*/

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                '}';
    }

    ;
    }

