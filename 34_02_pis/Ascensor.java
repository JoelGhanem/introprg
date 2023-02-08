/* En aquest exercici implementarem un ascensor.  De moment del nostre ascensor només ens interessarà saber en quin pis es troba.  Codificarem els pisos amb un enter i inicialment l'ascensor es trobarà a la planta -1 que correspondria al soterrani de l'edifici.*/
public class Ascensor {
    public int planta = -1;
    public static void main(String[]args) {
        Ascensor ascensor;
        ascensor = new Ascensor();
        System.out.println("L'ascensor està a la planta " + ascensor.planta);
    }
}
