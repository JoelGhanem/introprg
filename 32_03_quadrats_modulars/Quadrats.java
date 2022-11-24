//Desenvolupa una nova versió del programa anterior. Aquest cop, des de dibuixaQuadrats() es cridarà un mòdul anomenat dibuixaQuadrat() que farà la feina de dibuixar les difents línies del quadrat fent servir dibuixaLinia()
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrat();
    }
    public static void dibuixaQuadrat() {
        System.out.println("Quants?");
        String texto = Entrada.readLine();
        if (!texto.isEmpty()) {
            int quants = Integer.parseInt(texto);
            if (quants > 0) {
                for (int q = 0; q < quants; q++) {
                    for (int li = 0; li < 5; li++) { 
                    dibuixaLinia();
                    }
                System.out.println();
                }
            }
        }
    }
    public static void dibuixaLinia() {
        for (int co = 0; co < 5; co ++) {
            System.out.print(" X");
        }
        System.out.println();
    }
}
