//fem l'ull de gat
public class UllDeGat {
    public String estadoOjo = "tancat";
    public void obret() {
        this.estadoOjo = "obert";
    }
    public void tancat() {
        this.estadoOjo = "tancat";
    }

    public boolean estaObert() {
        return estadoOjo.equals("obert");
    }
}
