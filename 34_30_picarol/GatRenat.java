//En aquest exercici li posarem un picarol al gat Renat
public class GatRenat {
    public GatRenat() {
        int vides = 7;
        String posicio = "estirat";
    }
    private Picarol picarol;
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
    public void setPosicio(String posicio) {
        if (posicio.equals("dret")) { 
            this.posicio = posicio;
        } else if(posicio.equals("assegut")) {
            this.posicio = posicio;
        }
    }
    public void aixecat() {
        setPosicio("dret");
    }
    public void seu() {
        setPosicio("assegut");
    }
    public void estirat() {
        setPosicio("estirat");
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    //nuevo

    public Picarol posaPicarol(Picarol picarol) {
        if (picarol != null) {
            Picarol picarol2 = new Picarol();
            return picarol;
        } else {
            return null;
        }
    }
    public Picarol treuPicarol() {
        picarol = null;
        return picarol;
    } 
    public boolean tePicarol() {
        if(picarol == null) {
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
