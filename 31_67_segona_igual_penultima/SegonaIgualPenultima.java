// prgorama segona igual a la penultima
public class SegonaIgualPenultima {
    public static void main(String[] args) {
        System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
        String paraula = Entrada.readLine();
        if (paraula.charAt(1) != paraula.charAt(paraula.length()-2)) {
            System.out.println("Segona diferent de penúltima");
        }
        else if (paraula.charAt(1) == paraula.charAt(paraula.length()-2)) {
            System.out.println("Segona igual a penúltima");
        }
    }
}


