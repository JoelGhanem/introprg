// loro que acaba de otra amnera a los otros 4 putos loros
public class LloroAcabaLletra {
    public static void main (String[] args) {
        String paraula;
        char fin;
        String vocals = ("aeiou");
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        paraula = Entrada.readLine();
        if (!paraula.isEmpty()) {
            paraula = Entrada.readLine();
            fin = paraula.charAt(paraula.length()-1);
            // si la palabra no esta vacia
            while (!paraula.isEmpty()) {
                for (int i = 0; i < vocals.length(); i++) {
                    if (fin == vocals.charAt(i)) {
                        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
                    } else {
                        System.out.println(" El lloro diu: " + paraula);
                        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
                    }
                }
            }
        } else { 
            System.out.println("Adéu");
        }
    }
}
