// no me acepta el comenteario en el prgtest programa que hace rmobos, siogue sin aceptarmelo 
public class Rombos {
    public static void main(String[] args) {
        int num;
        System.out.println("quants?");
        num = Integer.parseInt(Entrada.readLine());
        for (int quantitat = 0; quantitat != num; quantitat++) {
            for (int li = 1; li <= 10 ; li++) {
                for (int puntito = 9; puntito >= li; puntito--) {
                    System.out.print(".");
                }
                for (int cop = 10 - li; cop <= 9; cop++) {
                    System.out.print(cop);
                }
                for (int con = 8; con >= 10 - li; con--) {
                    System.out.print(con);
                }
                for (int puntito = 9; puntito >= li; puntito--) {
                    System.out.print(".");
                }
                System.out.println();
            }
            for (int li = 1; li <= 9; li++) {
                for (int puntito = 1; puntito <= li; puntito++) {
                    System.out.print(".");
                }
                for (int cop = 0 + li; cop <= 9; cop++) {
                    System.out.print(cop);
                }
                for (int con = 8; con >= li; con--) {
                    System.out.print(con);
                }
                for (int puntito = 1; puntito <= li; puntito++) {
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}
