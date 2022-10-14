/*Programa que actua com un lloro*/
public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine(); 
        paraula = Entrada.readLine();
        if (paraula.isEmpty() == true) {
            System.out.print("");
        }
        while ((paraula.isEmpty() == false)  && (paraula.isBlank() == false))  {
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
        }
        System.out.println("Adéu");
    }
}
