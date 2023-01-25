/*En aquest exercici desenvoluparàs un programa que calcularà la nota mitja dels estudiants que apareixen al fitxer de text notes.csv, que presenta el format que apareix a l'exemple anterior, encara que possiblement amb més o menys estudiants i altres notes.*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        int numero = 0;
        int suma = 0;
        while (true) {
            String paraula = input.readLine();
            String [] elements = paraula.split(",");
            for (int i = 0; i < elements.length; i++) {
                if (Character.isDigit(elements[i].charAt(0))) {
                    numero = Integer.parseInt(elements[i]);
                    suma = suma + numero; 
                }
            }
            int mitja = (int) (suma/6.0);
            System.out.println(elements[0] + " (" + mitja + " )");
            if (null == input) break;
        }
        input.close();
    }
}
