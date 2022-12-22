//Biblioteca que em permet tenir una comprovació de vocals automatica//
public class UtilString {
    public static boolean esVocal(String entrada) {
        if (null == text) {
            return false;
        }
        text = text.toLowerCase();
        String vocals = ("aàáeèéiíìoóòòïuúùü");
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vocals.length(); j++) {
                if (text.charAt(i).equals(vocals.charAt(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
