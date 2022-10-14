/*Programa que et diu nla nota mitja*/
public class NotaMitja {
    public static void main(String[] args) {
        int valor = 0;
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor < 0 || valor > 100) {
            System.out.println("Cap nota vàlida introduïda");
        }   
        int suma = 0;
        int numDeNotes = 0;
        while ((valor >= 0) && (valor <= 100)) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if ((valor < 0 != true) && (valor > 100 != true)) {
                suma = suma + valor;
                numDeNotes = numDeNotes + 1;
            }
        }
        if ((valor < 0 != true) && (valor > 100 != true)) {
            System.out.println("La mitja de les notes vàlides és " + suma /numDeNotes );
        }
        if (valor > 100) {
            valor = 0;
            System.out.println("La mitja de les notes vàlides és " + suma );
        }
    }
}
