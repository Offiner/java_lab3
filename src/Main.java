import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Samochód s1 = new Samochód("Fiat",5,"Punto",130,1989);
        Samochód s2 = new Samochód("Dodge",5,"Challenger",460,1989);
        Motocykl m1 = new Motocykl("BMW",2,130,1099, 110);
        Motocykl m2 = new Motocykl("YAMAHA",2,110,999, 150);
        Rower r1 = new Rower("Kellys",1,11.3,"MTB");
        Rower r2 = new Rower("Catrina",1,13.6,"BMX");
        ArrayList<Samochód> samochody = new ArrayList<>();
        ArrayList<Motocykl> motocykle = new ArrayList<>();
        ArrayList<Rower> rowery =   new ArrayList<>();
        samochody.add(s1);
        samochody.add(s2);
        motocykle.add(m1);
        motocykle.add(m2);
        rowery.add(r1);
        rowery.add(r2);
        samochody.forEach((n)-> System.out.println(n));
        motocykle.forEach((n)-> System.out.println(n));
        rowery.forEach((n)-> System.out.println(n));

        

     }
}
