//Desenvolupa un programa que demani tres nombres enters, i escrigui els valors entre el primer i el segon saltant d'un al següent amb el tercer.
public class EntersIniciFi {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Valor inicial?");
        a = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        b = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        c = Integer.parseInt(Entrada.readLine());
        for (int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
    }
}
