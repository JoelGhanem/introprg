/*Afegeix al repertori de mètodes del Renat els següents:*/
public class GatRenat {

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
