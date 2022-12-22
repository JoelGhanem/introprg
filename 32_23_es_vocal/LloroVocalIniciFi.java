//En diferents exercicis ens hem trobat la necessitat de distingir si un caràcter és o no una vocal. Ara que ja coneixem les funcions, podem definir la nostra funció esVocal() que rebi un caràcter i retorni un booleà indicant si el caràcter correspon o no amb una vocal.//
public class LloroVocalIniciFi {
    public static void main(String[] args) {
        System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        String text = Entrada.readLine();
        LloroVocalIniciFi(text);
    }
    public static void LloroVocalIniciFi(String text) {
        UtilitatsConfirmacio.textABoolean(text);
        boolean checkConfirmacio = UtilitatsConfirmacio.textABoolean(text);
        UtilString.esVocal(text);
        boolean checkVocal = UtilString.esVocal(text);
        while (checkConfirmacio == false) {
            if (checkVocal != false) {
                System.out.println("El lloro diu: " + text);
            } else if (checkVocal == false) {
            }else {
                System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
            }
            System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
        }
    }
}
