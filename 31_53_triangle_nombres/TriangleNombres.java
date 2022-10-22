// Desenvolupa un programa que demani un nombre positiu més gran que 0. El programa escriurà una línia per nombre entre el 1 i el nombre introduït (es a dir, creixentment). A cada línia escriurà tots els nombres des del nombre corresponent a la línia fins al 1.
public class TriangleNombres {
    public static void main(String[] args) {
        int num;
        System.out.println("Nombre?");
        num = Integer.parseInt(Entrada.readLine());
        for (int li =1; li <= num; li++) {
            for (int co = 1; co <= li; co++) {
                System.out.print(" " + co);
            }
            System.out.println();
        }
    }
}

