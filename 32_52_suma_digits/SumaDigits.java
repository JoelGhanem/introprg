/* Desenvolupa un programa que demani un text i mostri la suma dels dígits que conté. */
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }
    // XXX
    public static int sumaDigits(String text) {
        int num = 0;
        String restaNum = "";
        if (text.length() <= 0) {
            return num;
        } 
        char primer = text.charAt(0);
        if (Character.isDigit(primer)) {
            num = num + Character.getNumericValue(text.charAt(0));
        }
        restaNum = text.substring(1);
        return num + sumaDigits(restaNum);
    }
}
