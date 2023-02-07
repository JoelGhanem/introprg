//Programa que ens permet veure els argss de la linia de comandes com si fossin els camins del sistema de fitxerimport java.io.File;
import java.io.File;
import java.util.Arrays;

public class Inspecciona {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            procesaArgument(args[i]);
        }
    }

    public static void procesaArgument(String args) {
        System.out.println();
        String resultado = "";
        String procesa = "Processant argument: " + args;
        System.out.println(procesa);
        for (int i = 0; i < procesa.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println();
        File fitxer = new File(args);
        if (!fitxer.exists()) {
            System.out.println("No trobat");
            return;
        }
        if (fitxer.canRead()) resultado += "r";
        else resultado += "-";
        if (fitxer.canWrite()) resultado += "w";
        else resultado += "-";
        if (fitxer.canExecute()) resultado += "x";
        else resultado += "-";
        if (fitxer.isDirectory()) {
            resultado += " directori "; 
            String[] contenido = fitxer.list();
            if (contenido == null) {
                System.out.println("Error al acceder al contenido del directorio");
                return;
            }
            if (contenido.length == 0) resultado += "buit";
            else {
                resultado += "que conté: ";
                Arrays.sort(contenido);
                for (int i = 0; i < contenido.length; i++) {
                    String caracter = contenido[i];
                    if (i == 0) resultado += caracter;
                    else resultado += ", " + caracter;
                }
            }
        }
        System.out.println(resultado);
    }
}
