//Desenvolupa una versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.
public class LloroQuadrat {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();
        while (!paraula.isEmpty()) {
            if (paraula.equals("dibuixa quadrat")) {
                dibuixaQuadrat();
            } else if (paraula.equals("dibuixa rectangle")) {
                rectangle();
            } else {
                System.out.println("El lloro repeteix: " + paraula);
            }
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
    public static void dibuixaQuadrat() {
        for (int li = 0; li < 5; li++) {
            dibuixaLin();
            System.out.println();
        }
    }
    public static void rectangle() {
        for (int li = 0; li < 5; li++) {
            dibuixaLin();
            dibuixaLin();
            System.out.println();
        }
    }
    public static void dibuixaLin() {
        for (int co = 0; co < 5; co++) {
            System.out.print(" X");
        }
    }
}
