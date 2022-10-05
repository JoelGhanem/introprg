/*Programa que et diu si pots passar o no a un semafor*/
/*public class serveix per comencar el programa*/
public class Semafor {
/*te permite hacer las variables muy faciles*/
    public static void main(String[] args) {
    System.out.println("Color?"); 
    String color = Entrada.readLine();
    if (color.equals("groc")) {
        System.out.println("corre!");
    } else if (color.equals("verd")) {
        System.out.println("passa");
    } else if (color.equals("vermell")) {
        System.out.println("espera");
    } else if (color.equals("magenta")) {
        System.out.println("ves a l'oculista");

        }
    }
}
