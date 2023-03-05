// Arxiu que imula un gat que en aquest cas te dos ulls i varies posicions        
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;
    public UllDeGat ullDret = new UllDeGat();
    public UllDeGat ullEsquerre = new UllDeGat();

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
    public UllDeGat getUllDret() {
        UllDeGat dret = new UllDeGat();
        dret = this.ullDret;
        return dret;
    }
    public UllDeGat getUllEsquerre() {
        UllDeGat esquerre = new UllDeGat();
        esquerre = this.ullEsquerre;
        return esquerre;
    }
    public String aixecat() {
        if (getPosicio().equals("dret")) {
            ullDret.estadoOjo = "obert";
            ullDret.obret();
            ullEsquerre.estadoOjo = "obert";
            return "no faig res";
        } else {
            ullDret.estadoOjo = "obert";
            ullDret.obret();
            ullEsquerre.estadoOjo = "obert";
            setPosicio("dret");
            return "m'aixeco";
        }
    }
    public String seu() {
        if (getPosicio().equals("assegut")) {
            ullDret.estadoOjo = "obert";
            ullDret.obret();
            ullEsquerre.estadoOjo = "tancat";
            ullEsquerre.tancat();
            return "no faig res";
        } else {
            ullDret.estadoOjo = "obert";
            ullDret.obret();
            ullEsquerre.estadoOjo = "tancat";
            ullEsquerre.tancat();
            setPosicio("assegut");
            return "m'assec";
        }
    }
    public String estirat() {
        if(getPosicio().equals("estirat")) {
            ullDret.estadoOjo = "tancat";
            ullDret.tancat();
            ullEsquerre.estadoOjo = "tancat";
            ullEsquerre.tancat();
            return "no faig res";
        } else {
            ullDret.estadoOjo = "tancat";
            ullDret.tancat();
            ullEsquerre.estadoOjo = "tancat";
            ullEsquerre.tancat();
            setPosicio("estirat");
            return "estirat";
        }
    }
}

