/*programa que et diu quin dia de la setmana es segons el numero que escriguis
*/

public class DiaSetmana {
    public static void main(String[] args) { 
        int numero = Integer.parseInt(args[0]);
            if (numero == 1) {
            System.out.println("Dilluns");
        }   else if (numero == 2) {
                System.out.println("Dimarts");
        }   else if (numero == 3) {
                System.out.println("Dimecres");
        }   else if (numero == 4) {
                System.out.println("Dijous");
        }   else if (numero == 5) {
                System.out.println("Divendres");
        }   else if (numero == 6) {
                System.out.println("Dissabte");
        }   else if (numero == 7) {
                System.out.println("Diumenge");
        }   else if (numero > 7) { 
                System.out.println("Error");
        }   else if (numero < 1) {               
                System.out.println("Error");
        }
    }          
}
