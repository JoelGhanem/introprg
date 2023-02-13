/*Exercici en el que aprenem a executar programes amb el main d'un altre arxiu*/
public class UsaAscensor { 
    public static Ascensor[] creaAscensors(int quants) {
        Ascensor[] ascensor = new Ascensor[quants];
        ascensor[0] = new Ascensor();
        ascensor[0].pis -=1;
        return ascensor;
    }
    public static void main(String[] args) {
        Ascensor[] ascensors = creaAscensors(1);
        System.out.println("L'ascensor creat des de fora está al pis " + ascensors[0].pis);
    }
}
