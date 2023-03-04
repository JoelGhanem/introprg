//En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.//
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    private static GatRenat instancia() {
        GatRenat renat = new GatRenat();
        int vides = 7;
        String posicio = renat.getPosicio();
        return renat;
    }

    private GatRenat() {
        int vides = 7;
        String posicio = getPosicio(); 
    }

    public static GatRenat getInstancia() {
        if (instancia() == null) {
            GatRenat instancia = new GatRenat(instancia().vides, instancia().posicio);
            return instancia;
        } else {
            return instancia();
        }
    }

    public static GatRenat getInstancia(int vides) {
        if (instancia() == null) {
            GatRenat instancia = new GatRenat(vides, instancia().posicio);
            return instancia;
        } else {
            return instancia();
        }
    }

    public static GatRenat getInstancia(String algo) {
        if (instancia() == null) {
            GatRenat instancia = new GatRenat(instancia().vides, algo);
            return instancia;
        } else {
            return instancia();
        }
    }

    public static GatRenat getInstancia(int vides, String algo) {
        if (instancia() == null) {
            GatRenat instancia = new GatRenat(vides, algo);
            return instancia;
        } else {
            return instancia();
        }
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
