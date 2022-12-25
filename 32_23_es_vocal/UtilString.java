//Biblioteca que em permet tenir una comprovació de vocals automatica//
public class UtilString {
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
}
