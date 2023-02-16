//Fes una nova versió de GatRenat de manera que funcioni el següent main() Fixa't que, com que no en fem res de la instància, a banda de mostrar-la, no cal ni que la assignem a una variable!
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat(int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio = novaPosicio;

    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "estirat"));
    }
}
