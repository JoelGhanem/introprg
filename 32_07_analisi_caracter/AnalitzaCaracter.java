//Desenvolupa una nova versió de l'exercici que analitzava un caràcter.//
public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Posició?");
        int num = Integer.parseInt(Entrada.readLine());
        char caracter = ' ';
        if (num+1 > text.length()) {
            System.out.println("Fora de rang");
        } else if (num < 0) {
            if (num < text.length() *-1) {
                System.out.println("Fora de rang");
            } else {
                caracter = text.charAt(text.length()-Math.abs(num));
            }
        } else {
            caracter = text.charAt(num);
        }
        analitzaCaracter(caracter);
    }

    public static void analitzaCaracter(char caracter) {
        if (Character.isLetter(caracter)) {
            System.out.println("'" + caracter + "' és una lletra");
        } else if (Character.isDigit(caracter)) {
            System.out.println("'" + caracter + "' és un nombre");
        } else {
            System.out.println("'" + caracter + "' és una altra cosa");
        }
    }
}
