/*Programa que actua com un lloro*/
public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = "0"; 
        String paraulaNoBuida = Entrada.readLine();
        while (!paraula.isEmpty()) {
            paraula = Entrada.readLine();
        if (paraula.isEmpty() && (paraula.isBlank() == false))  {
            paraula.equals(paraulaNoBuida);{
            System.out.println("El lloro repeteix: " + paraulaNoBuida);
            System.out.println("El lloro espera paraula:");
        if (paraula.isBlank() == false)  {
        System.out.println("Adéu");
        }
        }
        }
        }
    }
}
