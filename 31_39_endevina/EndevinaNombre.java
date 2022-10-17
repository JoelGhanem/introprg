// Programa que et fa jugar amb ell per que endevis un nombre
public class EndevinaNombre {
    public static void main(String[] args) {
        int numero = 0;
        int numeroPensat = 42;
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        numero = Integer.parseInt(Entrada.readLine());
        while ((numero != numeroPensat) == true) {
            System.out.println("Introdueix un valor");
            numero = Integer.parseInt(Entrada.readLine());
            if (numero > numeroPensat) {
                System.out.println("És més petit que " + numero);
                System.out.println("Introdueix un valor");
                numero = Integer.parseInt(Entrada.readLine());
            }
            if (numero < numeroPensat) {
                System.out.println("És més gran que " + numero);
                System.out.println("Introdueix un valor");
                numero = Integer.parseInt(Entrada.readLine());
            }
            if ((numero <= 0) == true) {
                System.out.println("Com a mínim 1");
                System.out.println("Introdueix un valor");
                numero = Integer.parseInt(Entrada.readLine());
            }
            if ((numero > 100) == true) {
                System.out.println("Com a màxim 100");
                System.out.println("Introdueix un valor");
                numero = Integer.parseInt(Entrada.readLine());
            }
            System.out.println("Introdueix un valor");
            numero = Integer.parseInt(Entrada.readLine());
        }
        if (numero == numeroPensat) {
            System.out.println("Has encertat!");
        }
    }
}
