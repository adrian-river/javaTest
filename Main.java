public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.puertas);

        suma(10, 20, 30);
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
class Coche {
    public int puertas = 4;
    public void AumentarPuertas() {
        this.puertas++;
    }
}
