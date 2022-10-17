/*Programa que et diu nla nota mitja*/
public class prueba {
    public static void main(String[] args) {
        int nota = -1;
        int nota1 = 0;
        int notaValida = 0;
        int notaNoValida = 0;
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
            if (((nota >= 0) == true) && ((nota <= 100) == true)) {
                notaValida = nota;
                suma =suma + notaValida;
                numDeNotes++;
            }
        }
        int sumaNotes = suma + numDeNotes;
        if (nota != notaValida) {
            nota = notaNoValida;
        }
        if ((notaNoValida == nota)) {
            System.out.println("La mitja de les notes vàlides és " + suma);
        }
        int notaMedia = sumaNotes;
        System.out.println("La mitja de les notes vàlides és " + notaMedia);
    }
}
