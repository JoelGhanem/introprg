/*Programa que actua com un lloro*/
public class Lloro {
    public static void main(String[] args) {
        String paraula = Entrada.readLine(); 
        String paraulaLloro = "";
        System.out.println("El lloro espera paraula:");
        paraula = Entrada.readLine();
        while ((paraula.isEmpty() == false)  && (paraula.isBlank() == false))  {
            paraulaLloro = paraula; 
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();
        }
        System.out.println("Adéu");
    }
}
