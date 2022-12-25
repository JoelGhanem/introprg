//Biblioteca que em permet tenir a ma moltes funcions per resoldrre exercicis//
public class UtilString {

    /*Funció que em permet detectar si un caràcter és una lletra*/
    public static boolean esVocal(char lletra) {
        String vocals = ("aàáeèéiíìoóòòïuúùü");
        vocals = vocals + vocals.toUpperCase();
        for (int j = 0; j < vocals.length(); j++) {
            if (lletra == vocals.charAt(j)) {
                return true;
            }
        }
        return false;
    }
    /*Funció que em deixa només les lletres*/
    public static String nomesLletres(String text) {
        String nomesLletres = "";
        for (int i = 0; i< text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                nomesLletres = nomesLletres + text.charAt(i);
            }
        }
        return nomesLletres;
    }
    /*Funció que em separa les lletres per espais i comes*/
    public static String lletresSeparades(String nomesLletres) {
        String separades = "";
        for (int i = 0; i < nomesLletres.length(); i++) {
            if (i == 0) {
                separades = separades + nomesLletres.charAt(0);
            } else {
                separades = separades + ", " + nomesLletres.charAt(i);
            }
        }
        return separades;
    }
    /*Funció que em separa intervals d'un String*/
    public static String intervalString (String text, int inici, int fi) {
        String interval = "";
        if (inici < 0) {
            inici = 0;
        }
        if (inici >= text.length()) {
            inici = (text.length()-1);
        }
        if (fi < 0) {
            fi = 0;
        }
        if (fi >= text.length()) {
            fi = (text.length()-1);
        }
        /*Cuando inci es menor a fi*/
        if (inici < fi) {
            for (int i = inici; i <= fi; i++) {
                interval = interval + text.charAt(i);
            }
        } else if (inici > fi) {
            for (int i = inici; i >= fi; i--) {
                interval = interval + text.charAt(i);
            }
        }
        return interval;
    }
}
