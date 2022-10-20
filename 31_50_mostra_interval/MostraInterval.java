//Desenvolupa un programa que demani dos valors enters i mostri tots els enters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.
public class MostraInterval {
    public static void main(String[] args) {
        int inici;
        int final1;
        System.out.println("inici?");
        inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        final1 = Integer.parseInt(Entrada.readLine());
        if (inici < final1) {
            for (int i = inici; i <= final1; i++) {
                System.out.println(i);
            }
        }
        if (inici > final1) {
            for (int i = final1; i <= inici; i--) {
                System.out.println(i);
            }
        }
    }
}
