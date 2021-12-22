import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba osoba1 = new Osoba("Dariusz","Skalski",1){};
        Osoba osoba2 = new Osoba("Tadeusz","Nowak",2){};
        Osoba osoba3 = new Osoba("Karol","Karolak",3){};
        Osoba osoba4 = new Osoba("Patryk","Dąb",4){};
        Osoba osoba5 = new Osoba("Kazimierz","Kasjan",5){};
        Student student1 = new Student(osoba1,WydzialEnum.Fiz){};
        Student student2 = new Student(osoba2,WydzialEnum.Wf){};
        Student student3 = new Student(osoba3,WydzialEnum.Tir){};
        Student student4 = new Student(osoba4,WydzialEnum.Fiz){};
        Student student5 = new Student(osoba5,WydzialEnum.Fiz){};
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(student1);
        studenci.add(student2);
        studenci.add(student3);
        studenci.add(student4);
        studenci.add(student5);
        for(Student student:studenci){
            System.out.println(student.getOsoba() +", "+ student.getWydzialEnum() );
        }



    }
}
