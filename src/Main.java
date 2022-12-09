public class Main {
    public static void main(String[] args) {
        // 1)
        var numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else if (numeroIf == 0) {
            System.out.println("Es igual a cero");

            // 2)
            int numeroWhile = -5;
            while (numeroWhile < 3) {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;

                // 3)
                int numWhile = -2;
                do {
                    System.out.println(numWhile);
                    numWhile = numWhile + 1;
                }
                while (numWhile < 3);

                // 4)
                for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                    System.out.println(numeroFor);
                }

                // 5)
                var estacion = "verano";
                switch (estacion) {
                    default:
                        System.out.println("DEFAULT");
                        break;
                    case "Primavera":
                        System.out.println("Es Primavera!!!");
                        break;
                    case "Invierno":
                        System.out.println("Es invierno!!!");
                        break;
                    case "verano":
                        System.out.println("Es verano!!!");
                        break;
                }

            }
        }
    }
}

