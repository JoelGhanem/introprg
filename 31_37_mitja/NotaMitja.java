/*Programa que et diu nla nota mitja*/
public class NotaMitja {
    public static void main(String[] args) {
        int nota = -1;
        int nota1 = 0;
        int notaValida;
        System.out.println("Introdueix un valor");
        nota1 = Integer.parseInt(Entrada.readLine());
        //Hago valor 1 para que no me de problemas con el final
        if (((nota1 < 0) == true) || ((nota1 > 100))) {
            System.out.println("Cap nota vàlida introduïda");
        }   
        if (((nota1 >= 0) == true) && ((nota1 < 100))) {
            nota  = nota1;
        }
        int suma = 0;
        int numDeNotes = 0;
        while (((nota >= 0) == true) && ((nota <= 100) == true)) {
            System.out.println("Introdueix un valor");
            nota = Integer.parseInt(Entrada.readLine());
            if (((nota < 0) == false) || ((nota > 100) == false)) {
                suma = suma + nota;
                numDeNotes = numDeNotes + 1;
                if (suma > 100) {
                    suma = 0;
                }
            }
        }
        if (((nota >= 0) ==true) && ((nota <= 100) == true)) {
            System.out.println("La mitja de les notes vàlides és " + suma /numDeNotes );
        }
        if (nota > 100) {
            nota = 0;
            System.out.println("La mitja de les notes vàlides és 0");
        }
    }
}
