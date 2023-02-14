/*En aquest exercici, torna a afegir la propietat posicio que vas incorporar a l'exercici Renat té posició. En aquesta ocasió, fes la propietat privada i implementa els accessors de manera que garanteixis que la posició del Renat sigui sempre correcta, a l'hora que pugui ser canviada.*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public int getVides() {
        return vides;
    }
    public void setVides(int novesVides) {
        if (novesVides >0) vides = novesVides;
    }
    public String getPosicio() {
        return posicio;
    }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        } else if (novaPosicio.equals("dret")){
            posicio = novaPosicio;
        }
    }
}
