//Biblioteca que em permet tenir una comprovació de vocals automatica//
public class UtilString {
    public static boolean esVocal(String text) {
        if (null == text) {
            return false;
        }
        text = text.toLowerCase();
        String vocals = ("aàáeèéiíìoóòòïuúùü");
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 || i == (text.length()-1)) {
                for (int j = 0; j < vocals.length(); j++) {
                    if (text.charAt(i) == (vocals.charAt(j))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
