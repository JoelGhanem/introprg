public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;

    private GatRenat() {
        int vides = 7;
        String posicio = getPosicio(); 
    }

    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides) {
        if (instancia== null) {
            instancia = new GatRenat();
            return instancia;
        }
        instancia.setVides(vides);
        return instancia;
    }

    public static GatRenat getInstancia(String algo) {
        if (instancia== null) {
            instancia = new GatRenat();
            return instancia;
        }
        instancia.setPosicio(algo);
        return instancia;
    }

    public static GatRenat getInstancia(int vides, String algo) {
        if (instancia== null) {
            instancia = new GatRenat(vides, algo);
            return instancia;
        }
        instancia.setVides(vides);
        instancia.setPosicio(algo);
        return instancia;
    }

    private GatRenat(int vides) {
        setVides(vides);
        getPosicio();
    }
    private GatRenat(String posicio) {
        getVides();
        setPosicio(posicio);
    }
    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public void setVides(int vides) {
        if (vides >= 0)  {
            this.vides = vides;
        }
    }
    public String getPosicio() {return this.posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("assegut") || posicio.equals("estirat")) { this.posicio = posicio;}
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().estaObert(),
                renat.getUllEsquerre().estaObert());
    }
    //Novedades
    public UllDeGat getUllDret(){
        UllDeGat dret = new UllDeGat();
        if (getPosicio().equals("dret")|| getPosicio().equals("assegut")) { 
            dret.posicio = "obert";
        } else {
            dret.posicio = "tancat";
        }
        return dret;
    }
    public UllDeGat getUllEsquerre() {
        UllDeGat esquerra = new UllDeGat();
        if (getPosicio().equals("dret")){ 
            esquerra.posicio = "obert";
        } else {
            esquerra.posicio = "tancat";
        }
        return esquerra;
    }
    public String aixecat() {
        return "dret";
    }
    public String seu() {
        return "assegut";
    }
    public String estirat() {
        return "estirat";
    }
}

