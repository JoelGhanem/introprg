/*Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.*/
public class NotaMesAlta {
    public static void main(String[] args) {
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        int nota = Integer.parseInt(Entrada.readLine());
        int a = nota;
        int comptador = 1;
        while (nota > 0) { 
            nota = Integer.parseInt(Entrada.readLine());
            comptador += 1;
            if (nota >= a) {
                a = nota;
            }
        }
        if (comptador > 2) {
            System.out.println("La nota més alta és " + a);
        } else { 
            System.out.println("Com a mínim calen dues notes");
        }
    }
}



