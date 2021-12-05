import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student student1 = new Student();
        student1.imie = "Adam";
        student1.nazwisko = "Borek";
        student1.id = 1;
        student1.men = true;

        Student student2 = new Student();
        student2.imie = "Kamil";
        student2.nazwisko = "Dąb";
        student2.id = 2;
        student2.men = true;

        Student student3 = new Student();
        student3.imie = "Alicja";
        student3.nazwisko = "Borek";
        student3.id = 3;
        student3.men = false;
        Student[] studenci = new Student[3];
            studenci[0]=student1;
            studenci[1]=student2;
            studenci[2]=student3;
            for (int i=0; i<3;i++) {
                System.out.println(studenci[i].imie);
                System.out.println(studenci[i].nazwisko);
                System.out.println(studenci[i].id);
                if(studenci[i].men){ System.out.println("mężczyzna");}else
                    System.out.println("kobieta");
                System.out.println();
            }
    }
}
