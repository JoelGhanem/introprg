// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia;
        System.out.println("Text?");
        String text = Entrada.readLine();
        int check = 0;
        if (Character.isLetter(text.charAt(0))) {
            System.out.print(text.charAt(0));
            check = 1;
        }
        for (int num = 1; num < text.length(); num++) {
            if (Character.isLetter(text.charAt(num))) {
                if (check == 1) {
                    System.out.print(", ");
                }
                System.out.print(text.charAt(num));
            }
        }
    }
}
