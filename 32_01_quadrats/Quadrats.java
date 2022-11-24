//Desenvolupa un programa que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res.
public class Quadrats {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int quantitat = Integer.parseInt(Entrada.readLine());
        if (quantitat > 0) {
            for (int q = 0; q < quantitat; q++) {
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
