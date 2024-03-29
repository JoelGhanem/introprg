//Implementa una nova versió que ofereixi la inicialització del gat Renat amb la posició indicada. En cas que la posició que rebi el constructor no sigui vàlida, el gat Renat resultant estarà en la seva posició favorita, estirat.
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public String getPosicio() {return posicio; }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("dret")) { posicio = novaPosicio;}
        else if (novaPosicio.equals("assegut")) { posicio = novaPosicio;}
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}
