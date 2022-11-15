//Desenvolupa un programa que demani un text i mostri totes les lletres en minúscules excepte les vocals, que hauran d'estar en majúscules.
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String arreglao = "";
        for (int num = 0; num < text.length();num++) {
        arreglao = text;
            if(text.charAt(num) == 'a' || text.charAt(num) == 101 || text.charAt(num) == 105 || text.charAt(num) == 111 || text.charAt(num) == 117) {
                arreglao = Character.toString(text.charAt(num));
            }else {
                Character.toLowerCase(num);
            }
        }
        System.out.print(arreglao);
    }
}

