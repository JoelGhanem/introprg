//Desenvolupa un programa que demani un text i mostri una versió transformada segons les següents regles:
public class TransformaText {
    public static void main (String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String vocalsCatalanes = ("aeiouàèéíïòóúü");
        String numero = ("1234567890");
        String cadena = "";
        String vocales = "";
        char vocal;
        char letra;
        boolean check = false;
        boolean hayNum = false;
        text.toLowerCase();
        // un for  que recorre todo el text
        for (int i = 0; i < text.length(); i++) {
            // un for que recorre vocalsCatalanes para comprobar si aparecen
            for (int j = 0; j < vocalsCatalanes.length(); j++) {
                if (text.charAt(i) == vocalsCatalanes.charAt(j)) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (check) {
                vocal = text.charAt(i);
                cadena = cadena + vocal;
            } 
            for (int j = 0; j < numero.length(); j++) {
                if (text.charAt(i) == numero.charAt(j)) {
                    hayNum = true;
                } else {
                    hayNum = false;
                }
            }
            if (hayNum) {
                cadena = "(" + numero + ")";
            } 
            if (Character.isLetter(text.charAt(i)) || Character.isDigit(text.charAt(i))) {
                letra = text.charAt(i);
                cadena = cadena + letra;
            }
        }
        System.out.println(cadena);
    }
}
