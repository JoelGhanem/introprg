//Programa que ens permet veure els argss de la linia de comandes com si fossin els camins del sistema de fitxerimport java.io.File;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
public class Inspecciona {
    public static void main(String[] args) throws IOException{
        boolean noResultado = false;
        for (String arg : args) {
            procesaArgument(arg);
        }
    }
    public static void procesaArgument(String arg) throws IOException{
        int contador = 0;
        System.out.println();
        String proceso = "Processant argument: " + arg;
        System.out.println(proceso);
        for (int i = 0; i < proceso.length(); i++) {
            System.out.print("=");
        }
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
            if (contenido == null || contenido.length == 0) {
                resultado += "buit" ;
            } else {
                resultado += "que conté: ";
                Arrays.sort(contenido);
                for (int i = 0; i < contenido.length; i++) {
                    String caracter = contenido[i];
                    if (i == 0) resultado += caracter;
                    else resultado += ", " + caracter;
                }
            }
        } else {
            resultado += " fitxer ";
            BufferedReader llegida = new BufferedReader(new FileReader(arg));
            long bytes = file.length(); 
            if (bytes == 0) {
                resultado += "buit";
            } else {
                resultado += "de mida en bytes: " + bytes;
                System.out.println(resultado);
                contador++;
                String[] tipo = new String[1];
                tipo = arg.split("\\.");
                if (tipo[1].equals("txt") || tipo[1].equals("java")) {
                    System.out.println("Amb els continguts:");
                    while (true) {
                        String linia = llegida.readLine();
                        if (linia == null) {
                            break;
                        }
                        System.out.println("|" + linia + "|");
                        contador++;
                    }
                }
            }
        }
        if (contador == 0) {
            System.out.println(resultado);
        }
    }
}
