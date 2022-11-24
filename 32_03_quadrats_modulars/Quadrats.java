//Desenvolupa una nova versió del programa anterior. Aquest cop, des de dibuixaQuadrats() es cridarà un mòdul anomenat dibuixaQuadrat() que farà la feina de dibuixar les difents línies del quadrat fent servir dibuixaLinia()
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();
        dibuixaQuadrat();
    }
    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        String texto = Entrada.readLine();
        if (!texto.isEmpty()) {
            int quants = Integer.parseInt(texto);
            if (quants > 0) {
                for (int q = 1; q < quants; q++) {
                    dibuixaQuadrat();
                }
            }
        }
    }
    public static void dibuixaQuadrat() {
        for (int li = 0; li < 5; li++) { 
            dibuixaLinia();
        }
        System.out.println();
    }
    public static void dibuixaLinia() {
        for (int co = 0; co < 5; co ++) {
            System.out.print(" X");
        }
        System.out.println();
    }
}
