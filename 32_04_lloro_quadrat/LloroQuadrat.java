//Desenvolupa una versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.
public class LloroQuadrat {
    public static void main(String[] args) {
        System.out.print("El lloro espera paraula:");
        String paraula = Entrada.readLine();
        while (!paraula.isEmpty()) {
            if (paraula.equals("dibuixa quadrat")) {
                quadrat();
            } else if (paraula.equals("dibuixa rectangle")) {
                rectangle();
            } else {
                System.out.println("El lloro repeteix: " + paraula);
            }
            System.out.print("El lloro espera paraula:");
            paraula = Entrada.readLine();
        }
        adeu();
    }
    public static void quadrat() {
        for (int li = 0; li < 5; li++) {
            for (int co = 0; co < 5; co++) {
                System.out.print(" X");
            }
            System.out.println();
        }
    }
    public static void rectangle() {
        quadrat();
        quadrat();
    }
    public static void adeu() {
        System.out.println("Adéu");
    }
}
