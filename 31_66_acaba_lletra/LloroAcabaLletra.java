// loro que acaba de otra amnera a los otros 4 putos loros
public class LloroAcabaLletra {
    public static void main (String[] args) {
        String paraula;
        char fin;
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        paraula = Entrada.readLine();
        // si la palabra no esta vacia
        while (!paraula.isEmpty()) {
            fin = paraula.charAt(paraula.length()-1);
            if (Character.isLetter(fin)) {
                if (fin != 'i' && fin != 'a' && fin != 'e' && fin != 'o' && fin != 'u') {
                    System.out.println(" El lloro diu: " + paraula);
                }
                System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
                paraula = Entrada.readLine();
            }
        }
        System.out.print("Adéu");
    }
} 
