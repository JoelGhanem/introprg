/*Desenvolupo un programa que em dona un a secció d'un String segons el text i la posició que li donem*/
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        String interval = UtilString.intervalString(text, inici, fi);
        System.out.println(interval);
    }
}
