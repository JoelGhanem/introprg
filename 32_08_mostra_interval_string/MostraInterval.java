//Desenvolupa una nova versió de l'exercici que mostrava la secció d'un String.  La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul anomenat mostraInterval() que serà qui realitzi realment la feina de mostrar l'interval.//
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("fi?");
        int fi = Integer.parseInt(Entrada.readLine());
        if (fi >= text.length()) {
            fi = (text.length()-1);
        }
        mostraInterval(text, inici, fi);
    }
    public static void mostraInterval(String text, int inici, int fi) {
        if (inici > fi) {
            for (int i = inici; i >= fi; i--) {
                System.out.println(i);
            }
        } else if (inici <= fi) {
            for (int i = inici; inici <= fi; i++){
                System.out.println(i);
            }
        }
    }
}

