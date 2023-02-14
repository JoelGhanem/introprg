/*Afegeix tres nous mètodes: String aixecat(), String seu(), i String estirat() de manera que quan vulguem, per exemple, que en Renat s'aixequi simplement li diguem renat.aixecat();. En cas que el Renat ja estigués en l'estat que se li demana, no fa cap canvi d'estat. Aquestes funcions retornaran un missatge indicant el que ha fet el Renat. Així, els missatges que ens retornarà seran: "m'estiro", "m'assec", "m'aixeco", i "no faig res". Atenció: els nous mètodes no han d'escriure res per sortida estàndard! Fes servir el main() a UsaGatRenat per demostrar el funcionament d'aquests nous mètode*/
public class GatRenat {
    private String aixecat = "m'aixeco";
    private String seu = "m'assec"; 
    private String estiratS = "m'estiro";
    public String aixecat() { return aixecat; }
    public String seu() { return seu; }
    public String estirat() { return estiratS; }
    private boolean viu = true;
    private boolean dret = false;
    private boolean assegut = false;
    private boolean estirat = true;
    private int vides = 7;
    private String posicio = "estirat";
    public boolean estaViu() {
        return viu;
    }
    public boolean estaDret() {
        return dret;
    }
    public boolean estaAssegut() {
        return assegut;
    }
    public boolean estaEstirat() {
        return estirat;
    }
    public String getPosicio() {
        return posicio;
    }
    public void setVides(int novesVides) {
        if (novesVides <= 0) viu = false; vides = novesVides;
    }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
            assegut = true;
            estirat = false;
        } else if (novaPosicio.equals("dret")){
            posicio = novaPosicio;
            dret = true;
            estirat = false;
        }
    }
}
