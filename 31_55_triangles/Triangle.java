//segunda vez que hago el ejercicio
public class Triangle {
    public static void main(String[] args) {
        int num;
        System.out.println("quants?");
        num = Integer.parseInt(Entrada.readLine());
        for (int quantitat = 0; quantitat != num; quantitat++) {
            for (int li = 1; li <= 10; li++) {
                for (int puntito = 9; puntito >= li ; puntito--) {
                    System.out.print(".");
                }
                for (int coP = 10 - li ; coP <= 9; coP++) {
                    System.out.print(coP);
                }
                for (int coN = 8; coN >= 10 - li; coN--) {
                    System.out.print(coN);
                }
                for (int punticos = 9; punticos >= li; punticos--) {
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}



