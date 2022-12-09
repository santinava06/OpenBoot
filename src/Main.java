public class Main {
    public static void main(String[] args) {
        // Primera Parte
        int param1 = 30;
        int param2 = 56;
        int param3 = 89;
        var valor = suma(param1, param2, param3);
        System.out.println(valor);

        // Segunda Parte
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }

    // Primera Parte
    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}
// Segunda Parte
class Coche {
    public int puertas = 4;

    public void agregarPuertas(){
        this.puertas++;
    }
}

