/*Programa que actua com un lloro*/
public class Lloro {
    public static void main(String[] args) {
        System.out.println("El lloro espera paraula:");
        String paraula = "0"; 
        String paraulaNoBuida = Entrada.readLine();
        while ((paraula.isEmpty() == false)  && (paraula.isBlank() == false))  {
            paraula = Entrada.readLine();
            paraulaNoBuida = paraula;
            System.out.println("El lloro repeteix: " + paraulaNoBuida);
            System.out.println("El lloro espera paraula:");
                if (paraula.isEmpty() != false) {
                        System.out.println("Adéu");
                    }
        }
    }
}

