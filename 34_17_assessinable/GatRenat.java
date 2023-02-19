//Afegeix al gat Renat els següents mètodes: String mor(): li treu una vida si encara és viu i retorna el lamentable lament "auch" quan, un cop perduda una vida, encara és viu. En canvi, si en treure-li la vida ja no li queden més, retorna el més definitiu "ximpún". Finalment, si ja estava mort del tot, retornarà un silenci en forma de punts suspensius "...". String resuscita(): quan en Renat està mort, li afegeix una vida i retorna un crit d'alegria "guai!". Si no estava mort, però, retorna el típic silenci de punts suspensius "...". String resuscita(int): fa el mateix que resuscita() però en aquesta ocasió se li pot indicar el nombre de vides amb les que torna a la vida. Si el nombre de vides indicat és menor que un, retornarà el silenci típic. //
public class GatRenat {
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
        return "guai!";
    }
    public String resuscita(int numVides) {
        if (viu) { return "..."; }
        viu = true;
        vides = vides + numVides;
        return "guai!";
    }
}
