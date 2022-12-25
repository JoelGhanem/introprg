//En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal.//
public class LloroVocalIniciFi {
    private static boolean confirmacio = false;
    private static String paraula = "no vocal";
    public static void main(String[] args) {
        loro();
    }
    public static void loro () {
        /*Mientras la confirmacion sea true se ejecuta el loro*/
        while (!confirmacio) {
            while (!paraula.isEmpty()) {
                if (checkIniciFi(paraula)) {
                    System.out.println("El lloro diu: " + paraula);
                }
                System.out.println("El lloro demana paraula amb vocal al inici o/i final");
                paraula = Entrada.readLine();
            }
            System.out.println("El lloro demana confirmació per finalitzar");
            confirmacio = UtilitatsConfirmacio.respostaABoolean(Entrada.readLine());
            paraula = "reset";
        }
        System.out.println("Adéu");
    }
    public static boolean checkIniciFi (String text) {
        text = text.toLowerCase();
        if (UtilString.esVocal(text.charAt(0))) {
            return true;
        } else if (UtilString.esVocal(text.charAt(text.length()-1))) {
            return true;
        } else {
            return false;
        }
    }
}
