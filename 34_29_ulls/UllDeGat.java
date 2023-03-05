//fem l'ull de gat
public class UllDeGat {
    public static String estadoOjo = "obert";
    public static  void obert() {
        estadoOjo = "obert";
    }
    public static void tancat() {
        estadoOjo = "tancat";
    }

    public boolean estaObert() {
        return estadoOjo.equals("obert");
    }
}
