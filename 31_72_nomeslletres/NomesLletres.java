// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        for (int num = 0; num < text.length(); num++) {
            if (Character.isLetter(text.charAt(num))) {
                String limpia = (Character.isLetter(text.charAt(num)) == true);
                System.out.print(limpia);
                for (int numero = 0; num < limpia.length(); numero ++) {
                    System.out.print(", ");
                }
            }
        }
    }
}
