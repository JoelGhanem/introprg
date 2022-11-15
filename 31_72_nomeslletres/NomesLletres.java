// Descripcion de putisima madre
public class NomesLletres {
    public static void main(String[] args) {
        String limpia;
        System.out.println("Text?");
        String text = Entrada.readLine();
        String cadena = "";
        char letra;
        int largo = text.length();
        largo = largo - 2;
        for (int num = 0; num < largo; num++) {
            if (Character.isLetter(text.charAt(num))) {
                letra = text.charAt(num);
                System.out.print(letra + ", ");
                cadena  = cadena + letra;
            }
        }
                System.out.print(cadena.charAt(cadena.length()-1));
    }
}
