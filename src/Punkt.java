/* klasa Punkt */
public class Punkt {
    private int x;
    private int y;
    private char znak = 'y';

    Punkt() {
    }

    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Punkt(int x, int y, int z) {
        this.x = x;
        this.y = y + z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.zmienY();
        this.y = y;
    }

    public int suma() {
        return this.x + this.y;
    }

    public int suma(int z) {
        return z + this.y;
    }

    public void wyswietl() {
        System.out.println("Zmienna x: " + this.x + ", Zmienna y: " + this.y);
    }

    private void zmienY() {
        System.out.println("Zmieniono zmienną " + this.znak);
    }
}
    /* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */

