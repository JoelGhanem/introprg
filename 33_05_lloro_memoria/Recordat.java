/*En aquesta ocasió hauràs d'implementar una versió del lloro amb memòria. És a dir, el lloro serà capaç de guardar totes les frases que rebi per entrada estàndard en un fitxer anomenat records.txt.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Recordat {
    public static void main(String[] args)throws IOException{
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }
    public static void processaEntrada(String cami) {
        try {
            FileWriter fileWriter = new FileWriter(cami);
            BufferedWriter sortida = new BufferedWriter((fileWriter));
            int numerito = 0;
            while (true) {
                System.out.println("El lloro pregunta paraula:");
                String paraula = Entrada.readLine();
                if (paraula.isEmpty()) {
                    if (numerito == 0) {
                        System.out.println("El lloro no recorda res");
                    }
                    break;
                } else {
                    numerito = numerito + 1;
                }
                System.out.println("El lloro registra: " + paraula);
                sortida.write(paraula);
                sortida.newLine();
            }
            sortida.close();
        } catch (IOException e) {
            System.out.println("problemo" + e.getMessage());
        }
    }
    public static void mostraRecords(String cami) {
        try {
            FileReader fileReader = new FileReader(cami);
            BufferedReader input = new BufferedReader(fileReader);
            while (true) {
                String linia = input.readLine();
                if (null == linia) break;
                System.out.println("El lloro recorda: " + linia);
            }
            System.out.println("Adéu");
            input.close();
        } catch (IOException e) {
            System.out.println("problemo" + e.getMessage());
        }
    }
}
