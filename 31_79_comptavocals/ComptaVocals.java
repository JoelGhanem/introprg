//Desenvolupa un programa que demani un text i compti quantes vocals conté.
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String vocals = ("aeiouàáéèíïóòúü");
        int numero = 0;
        text = text.toLowerCase();
        for (int i = 0;i < text.length();i++) {
            for (int j = 0;j < vocals.length(); j++) {
                if (text.charAt(i) == vocals.charAt(j)) {
                    numero = numero + 1;
                }
            }
        }
        System.out.println(numero);
    }
}

