// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia;
        System.out.println("Text?");
        String text = Entrada.readLine();
        if (Character.isLetter(text.charAt(0))) {
            System.out.print(text.charAt(0));
        }
        for (int num = 1; num < text.length(); num++) {
            if (Character.isLetter(text.charAt(num))) {
                System.out.print(", " + text.charAt(num));
            }
        }
    }
}
