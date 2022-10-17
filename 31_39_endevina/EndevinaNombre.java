// Programa que et fa jugar amb ell per que endevis un nombre
public class EndevinaNombre {
    public static void main(String[] args) {
        int numero = 0;
        int numeroPensat = 42;
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        numero = Integer.parseInt(Entrada.readLine());
        while (numero != numeroPensat) {
            if (numero > numeroPensat) {
            System.out.println("És més petit que " + numero);
            }
            if (numero < numeroPensat) {
            System.out.println("És més gran que " + numero);
            }
            if ((numero <= 0) == true) {
                System.out.println("Com a mínim 1");
            }
            if ((numero > 100) == true) {
                System.out.println("Com a màxim 100");
            }
            System.out.println("Introdueix un valor");
        }
        if (numeroPensat == numero) {
            System.out.println("Has encertat!");
        }
    }
}
