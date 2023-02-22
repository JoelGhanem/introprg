//Biblioteca que ens permet fer proves sobre els Strings en un arxiu java//
public class UtilString {
    public static boolean esVocal(char lletra) {
        String vocals = "aàeèéiíïoòóuúü";
        for (int i = 0; i < vocals.length(); i++) {
            if (vocals.charAt(i) == lletra) {
                return true;
            }
        }
        return false;
    }
    public static String nomesLletres(String text) {
        String textLletres = "";
        for (int posicio = 0; posicio < text.length(); posicio++) {
            if (Character.isLetter(text.charAt(posicio))) {
                textLletres =  textLletres + (text.charAt(posicio));
            }
        }
        return textLletres;
    }
    public static String lletresSeparades(String text) {
        String textComas = "";
        for (int i = 0; i < text.length(); i++) {
            if (i != text.length() - 1) {
                textComas = textComas + (text.charAt(i) + ", ");
            } else {
                textComas = textComas + (text.charAt(i));
            }
        }
        return textComas;
    }

    public static String intervalString(String text, int inici, int fi) {
        String interval = "";
        if (inici > fi) {
            if (inici >= text.length()) {
                inici = text.length() - 1;
            }
            if (fi < 0) {
                fi = 0;
            }
            if (inici < 0) {
                inici = 0;
            }
            for (int i = inici; i >= fi; i = i - 1) {
                interval = interval + (text.charAt(i));
            }	
        } else {
            if (inici < 0) {
                inici = 0;
            }
            if (fi < 0) {
                fi = 0;
            }
            if (fi >= text.length()) {
                fi = text.length() - 1;
            }
            for (int i = inici; i <= fi; i = i + 1) {
                interval = interval + (text.charAt(i));
            }
        }
        return interval;
    }

    public static boolean esEnter(String text) {
        boolean esEnter = true;
        int i = 1;
        if(text.charAt(0) == '+' || text.charAt(0) == '-' || Character.isDigit(text.charAt(0))) {

            while(esEnter && i < text.length()) { 
                if (Character.isDigit(text.charAt(i))) {
                    esEnter = true;
                } else {
                    esEnter = false;
                }
                i++;
            }
            if (esEnter) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }	
    }
    public static boolean esEnter(String text, boolean estricte) {
        if (estricte) {
            return esEnter(text);
        } else {
            String textStrip = text.strip();
            return esEnter(textStrip);
        }
    }
    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            int enter = Integer.parseInt(text);
            return enter;
        } else {
            String textStrip = text.strip();
            int enter = Integer.parseInt(textStrip);
            return enter;

        }
    }
    public static String cadenaContinua (String text, int nombre) {
        int paraulaCops = nombre / text.length();
        String cadena = "";
        int modul = nombre % text.length();
        if (nombre > text.length()) {

            for (int i = 0; i < paraulaCops; i++) {
                for(int j = 0; j < text.length(); j++) {
                    cadena = cadena + (text.charAt(j));
                }
            }
            for (int i = 0; i < modul; i++) {
                cadena = cadena + (text.charAt(i));
            }
        } else {
            for (int i = 0; i < nombre; i++) {
                cadena = cadena + (text.charAt(i));
            }
        }
        return cadena;
    }
}


