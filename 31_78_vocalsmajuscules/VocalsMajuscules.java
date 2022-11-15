//Desenvolupa un programa que demani un text i mostri totes les lletres en minúscules excepte les vocals, que hauran d'estar en majúscules.
public class VocalsMajuscules {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String arreglao = "";
        char algo;
        for (int num = 0; num < text.length();num++) {
                if(text.charAt(num) == 'a' || text.charAt(num) == 101 || text.charAt(num) == 105 || text.charAt(num) == 111 || text.charAt(num) == 117) {
                    algo = Character.toUpperCase(text.charAt(num));
                    arreglao = arreglao + algo;
            }else if (text.charAt(num) != 'A' || text.charAt(num) != 'E' || text.charAt(num) != 'O' || text.charAt(num) != 'I' || text.charAt(num) != 'U')  {
                algo = Character.toLowerCase(text.charAt(num));
                arreglao = arreglao + algo;
            }
        }
        System.out.print(arreglao);
    }
}

