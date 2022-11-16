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
        int check = 0;
        // para que solo coja el valor si es un digito
        for (int i = 0;i < valor.length();i++){
            if (!valor.isEmpty() && Character.isDigit(valor.charAt(i))) {
                numero = Integer.parseInt(valor);
            }
        }
        while (numero != numeroPensat && !valor.isEmpty()) {
            for (int i = 0;i < valor.length();i++){
                if (!valor.isEmpty() && Character.isDigit(valor.charAt(i))) {
                    numero = Integer.parseInt(valor);
                }
            }
            //para que diga solo nombres en el caso de q no sea un digito
            for (int i = 0;i < valor.length();i++){
                if (Character.isLetter(valor.charAt(i))) {
                    check = 1;
                }
            }
            if (check == 1) {
                System.out.println("Només nombres");
                System.out.println("Nombre?");
                valor = Entrada.readLine();
                check = 0;
            }else if (numero > 100 || numero <= 0) {
                System.out.println("Fora de rang");
                System.out.println("Nombre?");
                valor = Entrada.readLine();
            }
            else if (numero > numeroPensat) {
                System.out.println("Massa gran");
                System.out.println("Nombre?");
                valor = Entrada.readLine();
            }
            else if (numero < numeroPensat) {
                System.out.println("Massa petit");
                System.out.println("Nombre?");
                valor = Entrada.readLine();
            } 
        }
        if (valor.isEmpty()) {
            System.out.println("Cancel·lat!");
        }
        if (numero == numeroPensat) {
            System.out.println("Encertat!");
        }
    }
}
