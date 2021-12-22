import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        p1.setX(2);
        p1.setY(4);
        System.out.printf("x = %d, y = %d\n", p1.getX(), p1.getY());
        System.out.println("Suma: " + p1.suma() + "\n");
        Punkt p2 = new Punkt(10, 20, 6);
        System.out.printf("x = %d, y = %d\n", p2.getX(), p2.getY());
        System.out.println("Suma: " + p2.suma(1) + "\n");
        p2.setY(13);
        p2.wyswietl();
    }
}

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

