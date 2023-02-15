/* En aquest exercici implementarem un ascensor.  De moment del nostre ascensor només ens interessarà saber en quin pis es troba.  Codificarem els pisos amb un enter i inicialment l'ascensor es trobarà a la planta -1 que correspondria al soterrani de l'edifici.*/
public class GatRenat {
    public int vides = 7;
    public static void main(String[]args) {
        GatRenat renat;
        renat = new GatRenat();
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    }
}
