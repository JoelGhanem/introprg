// prgorama segona igual a la penultima
public class SegonaIgualPenultima {
    public static void main(String[] args) {
        System.out.println("Ves introduïnt texts (finalitza amb enter sol)");
        String paraula = Entrada.readLine();
        while (paraula.isEmpty() == false) {
            if (paraula.length() <= 1) {
                System.out.println("Segona diferent de penúltima");
            }
            else if (paraula.length() > 1) {
                if (paraula.charAt(1) != paraula.charAt(paraula.length()-2)) {
                    System.out.println("Segona diferent de penúltima");
                }
                else if (paraula.charAt(1) == paraula.charAt(paraula.length()-2)) {
                    System.out.println("Segona igual a penúltima");
                }
            }
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
