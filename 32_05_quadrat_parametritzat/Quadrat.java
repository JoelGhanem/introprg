//Desenvolupa un programa que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.
public class Quadrat {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        for (int li = 0; li < numero; li++) {
            dibuixaQuadrat(numero);
            System.out.println();
        }
    }
    public static void dibuixaQuadrat(int numero) {
        for (int co = 0; co < numero; co++) {
            System.out.print(" X");
        }
    }
}
