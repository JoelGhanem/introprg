//Programa que ens permet veure els argss de la linia de comandes com si fossin els camins del sistema de fitxerimport java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
public class Inspecciona {
    public static void main(String[] args) {
        for (String arg : args) {
            procesaArgument(arg);
        }
    }
    public static void procesaArgument(String arg) {
        System.out.println();
        System.out.println("Processant argument: " + arg);
        System.out.println("=============================");
        System.out.println();
        File file = new File(arg);
        if (!file.exists()) {
            System.out.println("No trobat");
            return;
        }
        String resultado = "";
        if (file.canRead()) resultado += "r";
        else resultado += "-";
        if (file.canWrite()) resultado += "w";
        else resultado += "-";
        if (file.canExecute()) resultado += "x";
        else resultado += "-";
        if (file.isDirectory()) {
            resultado += " directori ";
            String[] contenido = file.list();
            if (contenido == null || contenido.length == 0) resultado += "buit";
            else {
                resultado += "que conté: ";
                Arrays.sort(contenido);
                for (int i = 0; i < contenido.length; i++) {
                    String caracter = contenido[i];
                    if (i == 0) resultado += caracter;
                    else resultado += ", " + caracter;
                }
            }
        } else {
            resultado += " fitxer";
        }
        System.out.println(resultado);
    }
}
