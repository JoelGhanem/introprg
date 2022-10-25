// Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir, decreixentment). A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent a la línia
public class TriangleInvertit {
    public static void main(String[] args) {
        int num;
        System.out.println("Nombre?");
        num = Integer.parseInt(Entrada.readLine());
        for (int li = num; li >= 1; li--) {
            for (int co = 1; co <= li; co++) {
                System.out.print(co);
                if (co != li) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}

