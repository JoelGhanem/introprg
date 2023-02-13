/*Exercici en el que aprenem a executar programes amb el main d'un altre arxiu*/
public class Ascensor {
    public int pis = 0;

    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor = new Ascensor[quants];
        ascensor[0] = new Ascensor();
        ascensor[0].pis -=1;
        return ascensor;
    }

    public static boolean cuantos(String cantidad){
        for (int i = 0; i < cantidad.length(); i++) {
            if (!Character.isDigit(cantidad.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
