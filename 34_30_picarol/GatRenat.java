//En aquest exercici li posarem un picarol al gat Renat
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;
    private Picarol picarol = null;

    public GatRenat() {
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
    public String getPosicio() {return this.posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("assegut") || posicio.equals("estirat")) { this.posicio = posicio;}
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

    public String estirat() {
        return "caca";
    }
    public String aixecat() {
        return "caca";
    }
    public String seu() {
        return "caca";
    }

    //nuevo
    public GatRenat(String posicio) {
        getVides();
        setPosicio(posicio);
    }
    public Picarol posaPicarol(Picarol picarol2) {
        if (this.picarol != null) {
            Picarol picarolTmp = new Picarol();
            picarolTmp = picarol;
            this.picarol = picarol2;
            return picarolTmp;
        }
        this.picarol = picarol2;
        return null;
    }
    public Picarol treuPicarol() {
        if (this.picarol == null) {
            return null;
        }
        return this.picarol;
    } 
    public boolean tePicarol() {
        if(this.picarol == null) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Picarol picarol = new Picarol();
        picarol.sona();   // el picarol funciona fins i tot sense gat!
        picarol.sona();
        GatRenat renat = new GatRenat();
        renat.aixecat();
        renat.posaPicarol(picarol);
        renat.seu();      // ha de sonar el picarol
        renat.seu();      // no sona el picarol doncs no es mou!
        renat.treuPicarol();
        renat.estirat();  // no sona el picarol doncs ja no el té
        System.out.println("Nombre de cops que sona el picarol: " + picarol.quantsCops());
    }
}
