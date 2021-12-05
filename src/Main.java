import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */

        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

        enum LiczbyEnum{jeden, dwa, trzy, cztery, pięć, sześć}
        enum StatusEnum{KONTYNUUJEMY, KONIEC}

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę iteracji:");
        int i = scan.nextInt();
        while (i>0)
         {

            System.out.println("Wpisz liczbę");
            switch(scan.nextInt()) {

                case 1:
                    System.out.println(LiczbyEnum.jeden);

                    break;
                case 2:
                    System.out.println(LiczbyEnum.dwa);

                    break;
                case 3:
                    System.out.println(LiczbyEnum.trzy);

                    break;
                case 4:
                    System.out.println(LiczbyEnum.cztery);

                    break;
                case 5:
                    System.out.println(LiczbyEnum.pięć);

                    break;
                case 6:
                    System.out.println(LiczbyEnum.sześć);

                    break;
                default:System.out.println(StatusEnum.KONIEC);

            }
             i--;
            if(i==0){
                System.out.println(StatusEnum.KONIEC);}else
                System.out.println(StatusEnum.KONTYNUUJEMY);
        }
        }

        /* Prosty enum */
        enum KolorEnum {
            CZERWONY, ZIELONY, NIEBIESKI;
        }

        /* enum z metodą i zmienną */
        enum WielkoscEnum {
            MALY(false), DUZY(true), SREDNI(false), OGROMNY(true);

            boolean wielkosc;

            WielkoscEnum(boolean czyDuzy) {
                wielkosc = czyDuzy;
            }
        }
    }

