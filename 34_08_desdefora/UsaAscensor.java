/*Exercici en el que aprenem a executar programes amb el main d'un altre arxiu*/
public class UsaAscensor { 
    public static void main(String[] args) {
        Ascensor ascensor;
        ascensor = new Ascensor();
        System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
    }
}
