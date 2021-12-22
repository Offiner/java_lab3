public class Osoba {
    protected String imie;
    protected String nazwisko;
    protected int index;



    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.index = 0;
    }

    public Osoba(String imie, String nazwisko, int index) {
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


    @Override
    public String toString() {
        return
                "Imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index
                ;
    }

    ;
    }

