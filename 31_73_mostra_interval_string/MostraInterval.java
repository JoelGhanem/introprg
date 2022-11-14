//desenvolupa un programa que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        if (fi > text.length()) {
            fi = (text.length()-1);
        }
        if (inici < 0) {
            for (int num = 0; num <= fi; num ++) {
                System.out.println(text.charAt(num));
            }
        }
        else if (inici == fi) {
            System.out.print(text.charAt(fi));
        }
        else if (inici > text.length()) {
            for (int num = (text.length()-1); num >= fi; num --) {
                System.out.println(text.charAt(num));
            }
        }
        else if (inici < fi) {
            for (int num = inici; num <= fi; num ++) {
                System.out.println(text.charAt(num));
            }
        }
        else if (inici > fi) { 
            for (int num = inici; num >= fi; num --) {
                System.out.println(text.charAt(num));
            }
        }
        else if (fi >= text.length()) {
            for (int num = inici; num < text.length(); num ++) {
                System.out.println(text.charAt(num));
            }
        }
        else if (fi < inici) { 
            for (int num = fi; num < inici; num ++) {
                System.out.println(text.charAt(num));
            }
        }
        else if (fi < 0) {
            fi = 0;
        }
    }
}
