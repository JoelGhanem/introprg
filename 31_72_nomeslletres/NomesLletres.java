// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia = "";
        System.out.println("Text?");
        String text = Entrada.readLine();
        for (int num = 0; num < text.length(); num++) {
            if (Character.isLetter(text.charAt(num))) {
                limpia = limpia + text.charAt(num); 
                System.out.print(limpia);
                for (int numero = 0; numero < limpia.length(); numero ++) {
                    System.out.print(", ");
                }
            }
        }
    }
}
