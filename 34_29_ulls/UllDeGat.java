//fem l'ull de gat
public class UllDeGat {
    public void obert() {
        this.posicio = "obert";

    }
    public void tancat() {
        this.posicio = "tancat";
    }

    public boolean estaObert() {
        return posicio.equals("obert");
    }
}
