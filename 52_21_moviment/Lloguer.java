/*Aquest arxiu ens representas el nostre lloguer, conte els dies i un constructor especific*/
public class Lloguer {
    private int dies;
    private Vehicle vehicle;
    public Lloguer(Vehicle vehicle, int dies) {
        this.vehicle = vehicle;
        this.dies = dies;
    }
    //getters
    public int getDies() {return this.dies;}
    public Vehicle getVehicle() {return this.vehicle;}
    public double quantitat() {
        double quantitat = 0;
        switch (getVehicle().getCategoria()) {
            case BASIC:
            quantitat += 3;
            if (getDies() > 3) {
                quantitat += (getDies() - 3) * 1.5;
            }
            break;
            case GENERAL:
            quantitat += 4;
            if (getDies() > 2) {
                quantitat += (getDies() - 2) * 2.5;
            }
            break;
            case LUXE:
            quantitat += getDies() * 6;
            break;
        }
        return quantitat;
    }
    public double bonificacionsDeLloguer() {
        if(this.getVehicle().getCategoria() == Vehicle.Categoria.LUXE && this.getDies()>1) {
            return 2.0;
        }
        return 1.0;
    }

}
