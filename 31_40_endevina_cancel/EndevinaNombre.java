// Programa que et fa jugar amb ell per que endevis un nombre
public class EndevinaNombre {
    public static void main(String[] args) {
        Integer numero = 1;
        Integer numeroPensat = 42;
        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");
        numero = Integer.parseInt(Entrada.readLine());
        if (numero != numeroPensat) {
            while (numero != numeroPensat) {
                if (numero <= 0) {
                    System.out.println("Com a mínim 1");
                    System.out.println("Introdueix un valor");
                    numero = Integer.parseInt(Entrada.readLine());
                }
                else if (numero > 100) {
                    System.out.println("Com a màxim 100");
                    System.out.println("Introdueix un valor");
                    numero = Integer.parseInt(Entrada.readLine());
                }
                else if (numero > numeroPensat) {
                    System.out.println("És més petit que " + numero);
                    System.out.println("Introdueix un valor");
                    numero = Integer.parseInt(Entrada.readLine());
                }
                else if (numero < numeroPensat) {
                    System.out.println("És més gran que " + numero);
                    System.out.println("Introdueix un valor");
                    numero = Integer.parseInt(Entrada.readLine());
                }
            }
            if (numero == null) {
                System.out.println("Cancel·lat!");
            }
        }
        if (numero == numeroPensat) {
            System.out.println("Has encertat!");
        }

    }
}
