/* Utilitats de confirmació
 *
 * Aquest mòdul conté diferents utilitats per gestionar les confirmacions
 * Bé, de moment només en tenim una però potser anirem ampliant-ho
 */
public class UtilitatsConfirmacio {
    /*
     * Donada una text textual, aquesta funció tradueix la text a
     * un booleà.
     * Considera true quan la text és, independentment de majúscules i
     * sense considerar espais a l'inici ni al final,
     * "sí", "s", "yes" o "y", i algunes variants amb errors ortogràfics.
     * Altrament considera false.
     */
    public static boolean textABoolean(String text) {
        if (null == text) {     // si la text és null, la donem com a false
            return false;
        }
        text = text.toLowerCase();
        if (text.equals("s") || text.equals("y")) {
            return true;
        }
        if (text.equals("sí") || text.equals("yes")) {
            return true;
        }
        if (text.equals("si") || text.equals("vale") || text.equals("yeah")) {
            return true;
        }
        return false;
    }
}
