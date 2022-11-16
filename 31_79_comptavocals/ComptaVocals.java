//Desenvolupa un programa que demani un text i compti quantes vocals conté.
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String vocals = ("aeiouàéèíïóòúü");
        int numero = 0;
        for (int i = 0;i < text.length();i++) {
            if (text.charAt(i) == vocals.charAt(i)) {
            numero +=1;
            System.out.println(numero);
            }
        }
    }
}

