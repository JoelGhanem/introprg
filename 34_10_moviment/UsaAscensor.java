/*Implementa els canvis necessaris per la classe Ascensor segons el següent diagrama UML: Com veus, l'ascensor disposarà de moviment. Inicialment l'ascensor estarà aturat. Altres moviments seran pujant i baixant.*/
public class UsaAscensor {
    public static Ascensor creaAscensor() {
        Ascensor ascensor = new Ascensor();
        return ascensor;
    }

    public static void main(String[] args) {
        Ascensor ascensor = creaAscensor();
        System.out.println("Pis inicial: " + ascensor.pis);
        System.out.println("Moviment inicial: " + ascensor.moviment);
        ascensor.moviment = "pujant";
        System.out.println("Moviment final: " + ascensor.moviment);
    }
}
