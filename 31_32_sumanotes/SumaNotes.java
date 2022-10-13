/*Programa que te suma las notas*/
public class SumaNotes {
    public static void main(String[] args) {
        System.out.println("Introdueix una nota");
        // crea la variable//
        int sumaNota = 0;
        int nota = Integer.parseInt(Entrada.readLine());
        while ((nota >= 0) && (nota <= 100)) {
            sumaNota = sumaNota +  nota;
            System.out.println("Introdueix una nota");
            nota = Integer.parseInt(Entrada.readLine());
        }
        System.out.println("La suma de les notes vàlides és " + sumaNota);

    }
}
