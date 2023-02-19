//Crea una nova versió de l'exercici anterior, de manera que el constructor i el setter de posició defineixin el mateix nom pel paràmetre que especifica la posició que per la propietat.
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        this.setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public String getPosicio() {return this.posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret")) { 
            System.out.println(posicio);
            System.out.println(this.posicio);
            posicio = this.posicio;
        }
    }
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}
