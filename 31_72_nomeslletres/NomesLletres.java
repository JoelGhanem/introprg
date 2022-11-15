// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia;
        System.out.println("Text?");
        String text = Entrada.readLine();
        String cadena;
        char letra;
        char letra1;
        for (int num = 0; num < text.length(); num++) {
            if (Character.isLetter(text.charAt(num))) {
                letra = text.charAt(num);
                System.out.println(letra);
            }
        }
    }
}
