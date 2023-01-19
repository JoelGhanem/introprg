//Desenvolupa un programa que demani un text i mostri només els valors limpioèrics que conté.
public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }
    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        String limpio = "";
        if (text.length() > 0) {
            char primer = text.charAt(0);
            if (Character.isDigit(primer)) {
                limpio = limpio + text.charAt(primer);
            }
            String restaNum = text.substring(1);
            extreuNombres(restaNum);
        }
        return limpio;
    }
}
