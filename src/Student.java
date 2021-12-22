public class Student {
    private Osoba osoba;
    private WydzialEnum wydzialEnum;

    public Student(String osoba, WydzialEnum wydzialEnum) {
        this.osoba = osoba;
        this.wydzialEnum = wydzialEnum;
    }
public Student(){}
    public Osoba getOsoba() {
        return osoba;
    }

    public WydzialEnum getWydzialEnum() {
        return wydzialEnum;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public void setWydzialEnum(WydzialEnum wydzialEnum) {
        this.wydzialEnum = wydzialEnum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "osoba=" + osoba +
                ", wydzialEnum=" + wydzialEnum +
                '}';
    }
}
