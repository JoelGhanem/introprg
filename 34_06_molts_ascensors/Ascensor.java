/* Desenvolupa una nova versió de Ascensor
   En aquesta ocasió disposarà d'una funció anomenada creaAscensorsEnEscala() que rebrà un nombre d'ascensors i retornarà un array amb el nombre d'ascensors especificat
   de manera que cada ascensor estarà en el pis indicat per la seva posició a l'array.
   El main() decidirà a partir del valor que rebi en el primer argument de línia de comandes, quants ascensors crea, cridarà a creaAscensorsEnEscala() i mostrarà els pisos de tots els ascensors creats. */
public class Ascensor {
    public int pis = 0;
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
    public static void main(String[] args){
        if (args[0].isEmpty()) {
            System.out.println("Cap ascensor");
        } else {
            String cantidad = args[0];
            if (cuantos(cantidad)) {
                int quants = Integer.parseInt(cantidad);
                Ascensor[] ascensors = creaAscensors(quants);
                for (int i = 0; i < ascensors.length; i++) {
                    System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
                }
            } else {
                System.out.println("Cap ascensor");
            }
        }
    }
}
