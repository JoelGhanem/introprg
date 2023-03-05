//clase pare de GatRenat que defineix els accesors de vida i posicio
public class Gat {
    private int vides = 7;
    private String posicio = "estirat";
    public boolean viu = true;

    public int getVides() {
        return vides;
    }
    public void setVides(int vides) {
        if (vides <= 0) viu = false; this.vides = vides;
    }
    public String getPosicio() { 
        return posicio;
    }
    public void setPosicio(String posicio) {
        if (posicio.equals("assegut")) {
            this.posicio = posicio;
        } else if (posicio.equals("dret")) {
            this.posicio = posicio;
        } else {
            this.posicio = "estirat";
        }
    }
}
