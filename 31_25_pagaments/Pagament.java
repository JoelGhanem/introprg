/*Programa que et demana el preu i et diu la diferencia de preus entre el que li has donat i el que has de pagar*/

public class Pagament {
    public static void main(String[] args) {
    System.out.println("Preu?");
    int preu = Integer.parseInt(Entrada.readLine());
    System.out.println("Paga?");
    int paga = Integer.parseInt(Entrada.readLine());
    int diferencia = preu - paga;
    boolean diferenciaNegativa = paga < preu;
    if (diferencia == 0) {
        System.out.println("No sobra ni falta res");
    } else if (diferencia > 0) {
        System.out.println("Falten " + diferencia + "€");
    } else if (diferenciaNegativa) {
        System.out.println("sobren " + diferenciaNegativa + "€");
    }
    }   
}




