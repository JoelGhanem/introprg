// Arxiu que imula un gat que en aquest cas te dos ulls i varies posicions que van canviant, cosa que altera els ulls de dit feli virtual
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;
    public UllDeGat ullDret = new UllDeGat();
    public UllDeGat ullEsquerre = new UllDeGat();

    public GatRenat() {
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

    //private GatRenat(int vides) {
    //setVides(vides);
    //getPosicio();
    //}
    public GatRenat(String posicio) {
        getVides();
        setPosicio(posicio);
        if (getPosicio().equals("dret")) {
            ullDret.obret();
            ullEsquerre.obret();
        } else if (getPosicio().equals("assegut")) {
            ullDret.obret();
            ullEsquerre.tancat();
        } else {
            ullDret.tancat();
            ullEsquerre.tancat();
        }
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
        boolean estadoOjo = ullDret.getEstadoOjo();
        UllDeGat dret = new UllDeGat(estadoOjo);
        return dret;
    }
    public UllDeGat getUllEsquerre() {
        boolean estadoOjo = ullEsquerre.getEstadoOjo();
        UllDeGat esquerre = new UllDeGat(estadoOjo);
        return esquerre;
    }
    public String aixecat() {
        if (getPosicio().equals("dret")) {
            ullDret.obret();
            ullEsquerre.obret();
            return "no faig res";
        } else {
            ullDret.obret();
            ullEsquerre.obret();
            setPosicio("dret");
            return "m'aixeco";
        }
    }
    public String seu() {
        if (getPosicio().equals("assegut")) {
            ullDret.obret();
            ullEsquerre.tancat();
            return "no faig res";
        } else {
            ullDret.obret();
            ullEsquerre.tancat();
            setPosicio("assegut");
            return "m'assec";
        }
    }
    public String estirat() {
        if(getPosicio().equals("estirat")) {
            ullDret.tancat();
            ullEsquerre.tancat();
            return "no faig res";
        } else {
            ullDret.tancat();
            ullEsquerre.tancat();
            setPosicio("estirat");
            return "estirat";
        }
    }
}

