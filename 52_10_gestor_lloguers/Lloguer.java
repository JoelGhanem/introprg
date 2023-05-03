/*Aquest arxiu ens representas el nostre lloguer, conte els dies i un constructor especific*/
public class Lloguer {
    private int dies;
    private Vehicle vehicle;
    public Lloguer(int dies, Vehicle vehicle) {
        this.dies = dies;
        this.vehicle = vehicle;
    }
    //getters
    public int getDies() {return this.dies;}
}
