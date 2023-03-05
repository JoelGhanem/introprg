//fem l'ull de gat
public class UllDeGat {
    private boolean estadoOjo = false;
    public UllDeGat() {
    }
    public UllDeGat(boolean estadoOjo) {
        this.estadoOjo = estadoOjo;
    }
    public void obret() {
        setEstadoOjo(true);
    }
    public void tancat() {
        setEstadoOjo(false);
    }
    public boolean estaObert() {
        return getEstadoOjo();
    }
    public boolean getEstadoOjo() {
        return estadoOjo;
    }
    public void setEstadoOjo(boolean estadoOjo) {
        this.estadoOjo = estadoOjo;
    }
}
