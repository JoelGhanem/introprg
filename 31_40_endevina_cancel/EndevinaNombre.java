// Programa que et fa jugar amb ell per que endevis un nombre
public class EndevinaNombre {
  public static void main(String[] args) {
    Integer numPensat = 42;
    String num = " ";
    Integer numero = 0;
    Integer numerito = 0;
    System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
    System.out.println("Introdueix un valor");
    num = (Entrada.readLine());
    if (num.equals("")) {
      System.out.println("Cancel·lat!");
    }
    else if (num != null) {
      numero = Integer.parseInt(num);

      if (numero != numPensat) {
        while (numero != numPensat) {
          if (numero <= 0) {
            System.out.println("Com a mínim 1");
            System.out.println("Introdueix un valor");
            num = (Entrada.readLine());
            if (num.equals("")) {
              numerito = 1;
              numero = 42;
            } 
            else if (num != null) {
              numero = Integer.parseInt(num);
            }
          }
          else if (numero > 100) {
            System.out.println("Com a màxim 100");
            System.out.println("Introdueix un valor");
            num = (Entrada.readLine());
            numero = Integer.parseInt(num);
          }
          else if (numero > numPensat) {
            System.out.println("És més petit que " + num);
            System.out.println("Introdueix un valor");
            num = (Entrada.readLine());
            if (num.equals("")) {
              return;
            }
            else if (num != null) {
              numero = Integer.parseInt(num);
            }
          }
          else if (numero < numPensat) {
            System.out.println("És més gran que " + num);
            System.out.println("Introdueix un valor");
            num = (Entrada.readLine());
            numero = Integer.parseInt(num);
          }
        }
        if (num.equals("")) {
          System.out.println("Cancel·lat!");
        }
      }
    }
    if (numerito != 1) {
      if (numero == numPensat) {
        System.out.println("Has encertat!");
      }
    }
  }
}
