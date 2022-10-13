/*Programa que actua com un lloro*/
public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();
        while (!paraula.isEmpty()) {
            paraula = Entrada.readLine();
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
        }
        if (paraula.isEmpty()) {
            System.out.println("Adéu");
        }
    }
}
