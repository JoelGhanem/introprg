/*Afegeix tres nous mètodes: String aixecat(), String seu(), i String estirat() de manera que quan vulguem, per exemple, que en Renat s'aixequi simplement li diguem renat.aixecat();. En cas que el Renat ja estigués en l'estat que se li demana, no fa cap canvi d'estat. Aquestes funcions retornaran un missatge indicant el que ha fet el Renat. Així, els missatges que ens retornarà seran: "m'estiro", "m'assec", "m'aixeco", i "no faig res". Atenció: els nous mètodes no han d'escriure res per sortida estàndard! Fes servir el main() a UsaGatRenat per demostrar el funcionament d'aquests nous mètode*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "";
    private boolean viu = true;
    private boolean dret = false;
    private boolean estirat = false;
    private boolean assegut = false;

    //Strings
    public String estirat() {
        if (estirat) {
            posicio = "no faig res";
            estirat = true;
        } else { posicio = "m'estiro"; estirat = true;}
        return posicio; 
    }
    public String aixecat() {
        if (dret) {
            posicio = "no faig res";
            dret = true;
        } else { posicio = "m'aixeco"; dret = true;}
        return posicio;
    }
    public String seu() {
        if (assegut) {
            posicio = "no faig res";
            assegut = true;
        } else { posicio = "m'assec";assegut = true;}
        return posicio;
    }

    public String getPosicio() { return posicio; }

    //booleans
    public boolean estaViu() { return viu; }

    public boolean estaEstirat() { return estirat; }

    public boolean estaDret() {return dret;}

    public boolean estaAssegut() { return assegut;}


    public void setVides(int novesVides) {
        //if (novesVides <= 0) //viu = false; vides = novesVides;
    }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("assegut")) {
            //posicio = novaPosicio;
            //assegut = true;
            //estirat = false;
        } else if (novaPosicio.equals("dret")){
            posicio = novaPosicio;
            // dret = true;
            //estirat = false;
        }
    }
}
