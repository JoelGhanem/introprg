//En aquest exercici li posarem un picarol al gat Renat
public class Picarol {
    private int cops = 0;
    public void sona() {
        System.out.println("clink-clink");
    }
    public int quantsCops() {
        this.cops++;
        return this.cops;
    }
    private int vides = 7;
    private boolean viu = true;
    private String posicio = "estirat";
    //Strings
    public String estirat() {
        if (estaEstirat()) {
            return  "no faig res";
        } else {
            setPosicio("estirat");
            return "m'estiro"; 
        }
    }
    public String aixecat() {
        if (estaDret()) {
            return  "no faig res";
        } else {
            setPosicio("aixecat");
            return "m'aixeco";
        }
    }
    public String seu() {
        if (estaAssegut()) {
            return "no faig res";
        } else {
            setPosicio("assegut");
            return "m'assec";
        }
    }

    public String getPosicio() { return posicio; }

    //booleans
    public boolean estaViu() { return viu; }

    public boolean estaEstirat() { return posicio.equals("estirat"); }

    public boolean estaDret() {return posicio.equals("dret");}

    public boolean estaAssegut() { return posicio.equals("assegut");}

    public int getVides() {
        return vides;
    }
    public void setVides(int novesVides) {
        if (novesVides <= 0) viu = false; vides = novesVides;
    }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        } else if (novaPosicio.equals("dret")){
            posicio = novaPosicio;
        } else {
            posicio = "estirat";
        }
    }
    public String mor() {
        if (vides > 1){
            vides-=1;
            return "auch";
        } else if (vides == 1) {
            vides-=1;
            viu = false;
            return "ximpún";
        } else {
            return "...";
        }
    }
    public String resuscita() {
        vides = 1;
        return "guai!";
    }
    public String resuscita(int numVides) {
        if (viu) { return "..."; }
        if (numVides < 0) { return "..."; }
        viu = true;
        vides = vides + numVides;
        return "guai!";
    }
}
