//Afegeix la propietat posicio de tipus String a la definició de GatRenat. Aquesta nova propietat serà inicialitzada des del constructor amb el valor "estirat" de la mateixa manera que ho fa ara amb vides
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s" , vides, posicio);
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio;}
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}
