/*Programa que et diu nla nota mitja*/
public class prueba {
    public static void main(String[] args) {
        int nota = -1;
        int notaValida = 0;
        int suma = 0;
        int numDeNotes = 0;
        System.out.println("Introdueix un valor");
        nota = Integer.parseInt(Entrada.readLine());
        if ((nota >= 0) && (nota <= 100)) {
            while (((nota >= 0) == true) && ((nota <= 100) == true)) {
                System.out.println("Introdueix un valor");
                nota = Integer.parseInt(Entrada.readLine());
                suma = suma + nota;
                numDeNotes = numDeNotes + 1;
            }
            int notaMedia = suma/numDeNotes;
            System.out.println("La mitja de les notes vàlides és " + notaMedia);
        }
        else {
            System.out.println("Cap nota vàlida introduïda");
        }
    }
}
