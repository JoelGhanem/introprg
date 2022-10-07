/*Programa que et demana el pis en el que et trobes i et diu el nou pis*/
public class Ascensor {
    public static void main(String[] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String onVas = Entrada.readLine();
        if (pis.equals("planta baixa") && (onVas.equals("baixar un"))) {
            System.out.println("error");
            
/*            (onVas.equals("pujar un")) {
            }*/
        }
    }
}
