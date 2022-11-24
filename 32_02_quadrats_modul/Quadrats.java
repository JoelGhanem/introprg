//Desenvolupa una nova versió del programa anterior. Aquest cop, des de main es cridarà un mòdul anomenat dibuixaQuadrats() que farà la feina de demanar el número de quadrats a dibuixar i els dibuixarà.
public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrat();
    }
    public static void dibuixaQuadrat() {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (quants > 0) {
            for (int q = 0; q < quants; q++){
                for (int li = 0; li < 5; li++) {
                    for (int co = 0; co < 5; co++) {
                        System.out.print(" X");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
