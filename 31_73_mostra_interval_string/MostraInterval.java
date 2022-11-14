//desenvolupa un programa que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        if (inici <= 0) {
            if (fi > text.length()) {
                fi = text.length();
                for (int num = 0; num <= fi; num ++) {
                    System.out.println(text.charAt(num));
                }
            }
        }
        else if (inici < fi) {
            if (inici > 0) {
                for (int num = inici; num <= fi; num ++) {
                    System.out.println(text.charAt(num));
                }
            }
        }
        else {
            if (inici > text.length()) {
                inici = (text.length()-1);
            }
            for (int num = inici; num >= fi; num --) {
                System.out.println(text.charAt(num));
            }
        }
    }
}   
