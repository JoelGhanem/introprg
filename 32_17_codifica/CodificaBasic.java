//En aquesta ocasió, desenvoluparem un programa que demani un text i el mostri codificat segons les següents instruccions://
public class CodificaBasic {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (!text.isEmpty()) {
            codifica(text, quants);
        }
    }
    public static void codifica(String text, int quants) {
