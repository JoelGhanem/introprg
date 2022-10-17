/*Programa que et diu nla nota mitja*/
public class NotaMitja {
    public static void main(String[] args) {
        int valor = 0;
        int valor1 = 0;
        System.out.println("Introdueix un valor");
        valor1 = Integer.parseInt(Entrada.readLine());
        //Hago valor 1 para que no me de problemas con el final
        if (((valor1 < 0) == true) || ((valor1 > 100) == true)) {
            System.out.println("Cap nota vàlida introduïda");
        }   
        if  (((valor1 >= 0) == true) && ((valor1 <= 100) == true)) {
            valor1 = valor;
        }
        int suma = 0;
        int numDeNotes = 0;
        while (((valor >= 0) == true) && ((valor <= 100) == true)) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (((valor < 0) == false) || ((valor > 100) == false)) {
                suma = suma + valor;
                numDeNotes = numDeNotes + 1;
            }
        }
        if (((valor < 0) == false) && ((valor > 100) == false)) {
            System.out.println("La mitja de les notes vàlides és " + suma /numDeNotes );
        }
        if (valor > 100) {
            valor = 0;
            System.out.println("La mitja de les notes vàlides és " + suma );
        }
    }
}
