//En aquesta ocasió farem una nova versió que faci ús dels nous mecanismes de control de bucles.
//El programa realitzarà la mateixa funcionalitat que l'exercici original, més:
//permetrà cancel·lar la partida en introduir una entrada buida (tal i com demanava Exercici 31_40. Endevina amb cancel·lació
//comprovarà que l'entrada siguin realment valors enters (com a Exercici 31_75. És enter)
public class Endevina {
    public static void main(String[] args) {
        int numero = 1;
        int numeroPensat = 42;
        String valor;
        System.out.println("Nombre?");
        valor = Entrada.readLine();
        numero = Integer.parseInt(valor);
        while (!valor.isEmpty() && numero != numeroPensat) {
            if (numero <= 0) {
                System.out.println("Fora de rang");
                System.out.println("Nombre?");
                numero = Integer.parseInt(Entrada.readLine());
            }
            else if (numero > 100) {
                System.out.println("Fora de rang");
                System.out.println("Nombre?");
                numero = Integer.parseInt(Entrada.readLine());
            }
            else if (numero > numeroPensat) {
                System.out.println("Massa gran");
                System.out.println("Nombre?");
                numero = Integer.parseInt(Entrada.readLine());
            }
            else if (numero < numeroPensat) {
                System.out.println("Massa petit");
                System.out.println("Nombre?");
                numero = Integer.parseInt(Entrada.readLine());
            } 
        }
        if (numero == numeroPensat) {
            System.out.println("Encertat!");
        }
        else {
            System.out.println("Només nombres");
        }
    }
}
