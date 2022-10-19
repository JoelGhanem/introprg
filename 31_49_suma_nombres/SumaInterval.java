//En aquest exercici demanaràs dos valors enters i sumaràs tots els nombres que hi hagin entre el més petit i el més gran d'ells.
public class SumaInterval {
    public static void main (String[] args) {
        int inici;
        int final1;
        int suma = 0;
        System.out.println("inici?");
        inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        final1 = Integer.parseInt(Entrada.readLine());
        for (int i = inici; i <= final1; i = i + 1) {
            suma = suma + i;
        }
            System.out.println(suma);
    }
}

