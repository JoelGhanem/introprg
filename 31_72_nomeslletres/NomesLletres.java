// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia;
        System.out.println("Text?");
        String text = Entrada.readLine();
        String cadena = "";
        char letra;
        int largo = text.length();
        for (int num = 0; num < largo; num++) {
            if (Character.isLetter(text.charAt(num))) {
                letra = text.charAt(num);
                cadena  = cadena + letra;
                System.out.print(letra + ", ");
            }
        }
                System.out.print(cadena.charAt(cadena.length()-1));
    }
}
