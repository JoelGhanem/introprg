//Programa que et demana tres nombres enters, i escriu els valor entre el primer i el segon tenin en compte el tercer
public class EntersIniciFi {
    public static void main(String[] args) {
        int valorInicial = 0;
        int valorFinal = 0;
        int salt = 0;
        System.out.println("Valor inicial?");
        valorInicial = Integer.parseInt(Entrada.readLine());
        System.out.println("Valor final?");
        valorFinal = Integer.parseInt(Entrada.readLine());
        System.out.println("Salt?");
        salt = Integer.parseInt(Entrada.readLine());
        while (valorInicial < valorFinal) {
            System.out.println(valorInicial);
            valorInicial = valorInicial + salt;
        }
    }
}

