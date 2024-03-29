//Posem en pràctica la possibilitat d'afegir més d'un constructor al nostre amic Renat. En concret, ens interessarà permetre crear instàncies de les següents maneresVols fer-ho molt modulat? Implementa-ho de manera que tots els constructors excepte un facin ús de this(), i que el que no fa ús de this(), fa us dels setters.:
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat() {
        getVides();
        getPosicio();
    }
    public GatRenat(int vides) {
        setVides(vides);
        getPosicio();
    }
    public GatRenat(String posicio) {
        getVides();
        setPosicio(posicio);
    }
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public void setVides(int vides) {
        if (vides >= 0)  {
            this.vides = vides;
        }
    }
    public String getPosicio() {return posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("assegut")) { this.posicio = posicio;}
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posició dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret
        };
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
    }
}
