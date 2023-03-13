/**/
public class Gat {
    private String nom;
    public Gat(String nom) {
        private String this.nom = nom;
    }
    public Gat(int vides) {
        private int this.vides = vides;
    }
    public Gat(String nom, String posicio) {
        private String this.nom = nom;
        private String this.posicio = posicio;
    }
    public Gat(String nom, int vides, String posicio) {
        private String this.nom = nom;
        private int this.vides = vides;
        private String this.posicio = posicio;
    }
    public String getNom() {
        return this.nom;
    }
    public int getVides() {
        return this.vides;
    }
    public int setVides(int vides) {
        this.vides = vides;
    }
    public String getPosicio() {
        return this.posicio;
    }
    public String setPosicio(String posicio) {
        this.posicio = posicio;
    }
    public boolean estaViu() {
        return getVides(>0);
    }
    public boolean estaDret() {
        return this.posicio.equals("dret");
    }
    public boolean estaAssegut() {
        return this.posicio.equals("assegut");
    }
    public boolean estaEstirat() {
        return this.posicio.equals("estirat");
    }
    public String aixecat() {
        if (estaDret()) {
            return  "no faig res";
        } else { 
            setPosicio("dret");
            return  "m'aixeco"; 
        }
    }
    public String seu() {
        if (estaAssegut()) {
            return  "no faig res";
        } else { 
            setPosicio("assegut");
            return  "m'assec";
        }
    }
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        } else { 
            setPosicio("estirat");
            return "m'estiro";
        }
    }
}
