/*Programa que et diu nla nota mitja*/
public class NotaMitja {
    public static void main(String[] args) {
        int valor = 0;
        int suma = 0;
        int numDeNotes = 1;
        System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        while (valor >= 0 && valor <= 100) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            suma = suma + valor;
            numDeNotes = numDeNotes + 1;
        }
        System.out.println("La mitja de les notes vàlides és " + suma /numDeNotes );
        if (valor <= 0) {
            System.out.println("Cap nota vàlida introduïda");
        }
    }
}

