/*En aquest exercici desenvoluparàs un programa que calcularà la nota mitja dels estudiants que apareixen al fitxer de text notes.csv, que presenta el format que apareix a l'exemple anterior, encara que possiblement amb més o menys estudiants i altres notes.*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        String primera = input.readLine();
        while (true) {
            double numero = 0;
            double suma = 0;
            int numerito = 0;
            String paraula = input.readLine();
            numerito = numerito + 1;
            System.out.println(numerito);
            if (paraula == null) {
                if (numerito == 1) {
                    System.out.println("Cap entrada");
                }
                break;
            }
            String [] elements = paraula.split(",");
            for (int i = 0; i < elements.length; i++) {
                if (Character.isDigit(elements[i].charAt(0))) {
                    numero = Double.parseDouble(elements[i]);
                    suma = suma + numero; 
                }
            }
            double mitja = (suma/6.00);
            System.out.printf("%s (%.02f)%n",elements[0], mitja);
        }
        input.close();
    }
}
