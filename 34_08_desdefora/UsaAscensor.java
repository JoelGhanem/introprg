/*Exercici en el que aprenem a executar programes amb el main d'un altre arxiu*/
public class UsaAscensor { 
    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor = new Ascensor[quants];
        ascensor[0] = new Ascensor();
        if (quants > 0) {
            for (int i = 1; i < quants; i++) {
                ascensor[i] = new Ascensor();
                ascensor[i].pis = ascensor[0].pis+i;
            }
        }
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

    public static void main(String[] args) {
        String cantidad = args[0];
        if (cuantos(cantidad)) {
            int quants = Integer.parseInt(cantidad);
            if (quants > 0) {
                Ascensor[] ascensors = creaAscensors(quants);
                for (int i = 0; i < ascensors.length; i++) {
                    System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
                }
            } else {
                System.out.println("Cap ascensor");
            }
        } else {
            System.out.println("Cap ascensor");
        }
    }
}
