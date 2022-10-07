/*Programa que et demana el pis en el que et trobes i et diu el nou pis*/
public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String onVas = Entrada.readLine();
        if (pis.equals("planta baixa") && (onVas.equals("baixar un"))) {
            System.out.println("error");
        }   else if (pis.equals("planta baixa") && (onVas.equals("pujar un"))) {
                System.out.println("primer pis");
        }   else if (pis.equals("planta baixa") && (onVas.equals("pujar dos"))) {
                System.out.println("segon pis");
        }   else if (pis.equals("primer pis") && (onVas.equals("baixar un"))) {
                System.out.println("planta baixa");
        }   else if (pis.equals("primer pis") && (onVas.equals("pujar un"))) {
                System.out.println("segon pis");
        }   else if (pis.equals("primer pis") && (onVas.equals("pujar dos"))) {
                System.out.println("error");
        }   else if (pis.equals("segon pis") && (onVas.equals("pujar dos"))) {
                System.out.println("error");
        }   else if (pis.equals("segon pis") && (onVas.equals("pujar un"))) {
                System.out.println("error");
        }   else if (pis.equals("segon pis") && (onVas.equals("baixar un"))) {
                System.out.println("primer pis");
        }   else if (pis.equals("segon pis") && (onVas.equals("baixar dos"))) {
                System.out.println("planta baixa");
    
            
            
            
        }
    }
}
