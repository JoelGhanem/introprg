/*Afegeix tres nous mètodes: String aixecat(), String seu(), i String estirat() de manera que quan vulguem, per exemple, que en Renat s'aixequi simplement li diguem renat.aixecat();. En cas que el Renat ja estigués en l'estat que se li demana, no fa cap canvi d'estat. Aquestes funcions retornaran un missatge indicant el que ha fet el Renat. Així, els missatges que ens retornarà seran: "m'estiro", "m'assec", "m'aixeco", i "no faig res". Atenció: els nous mètodes no han d'escriure res per sortida estàndard! Fes servir el main() a UsaGatRenat per demostrar el funcionament d'aquests nous mètode*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    //Strings
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        } else { 
            setPosicio("estirat");
            return "m'estiro";
        }
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

    public String getPosicio() { return posicio; }

    //booleans
    //public boolean estaViu() { return viu; }

    public boolean estaEstirat() { return posicio.equals("estirat"); }

    public boolean estaDret() {return posicio.equals("dret");}

    public boolean estaAssegut() { return posicio.equals("assegut");}


    public void setVides(int novesVides) {
        //if (novesVides <= 0) //viu = false; vides = novesVides;
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
}
