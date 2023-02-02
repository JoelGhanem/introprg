/*Programa que revisa les matricules i diu si son italianes o no segons el fitxer on les escriu*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class ClassificaMatricules{ 
    public static void main (String[] args) throws IOException{
        String cami = "llegides.txt";
        BufferedReader lectura = new BufferedReader(new FileReader(cami));
        while (true) {
            String leido = lectura.readLine();
            if (leido == null) {
                break;
            }
            if (italiana(leido)) {
                System.out.println("És una matrícula italiana vàlida");
                matriculesItalianes(leido);
            } else {
                System.out.println("No és una matrícula italiana vàlida");
                matriculesDesconegudes(leido);
            }
        }
    }
    public static boolean italiana(String matricula) throws IOException{
        boolean italiana = false;
        String confuses = "IOQU";
        if (matricula.length() == 7) {
            for (int i = 0; i < matricula.length(); i++) {
                if ( i == 0 || i == 1) {
                    if (!Character.isUpperCase(matricula.charAt(i))) {
                        for (int j = 0; j < confuses.length(); j++) {
                            if (matricula.charAt(i) == matricula.charAt(j)) {
                                return italiana;
                            }
                        }
                        return italiana;
                    }
                }
                if (i == 2 || i == 3 || i == 4) {
                    if (!Character.isDigit(matricula.charAt(i))) {
                        return italiana;
                    }
                }
                if (i == 5 || i == 6) {
                    if (!Character.isUpperCase(matricula.charAt(i))) {
                        for (int j = 0; j < confuses.length(); j++) {
                            if (matricula.charAt(i) == matricula.charAt(j)) {
                                return italiana;
                            }
                        }
                        return italiana;
                    }
                }
            }
        }
        italiana = true;
        return italiana;
    }
    public static void matriculesItalianes(String text) throws IOException{
        String italianes = "italianes.txt";
        BufferedWriter eItalianes = new BufferedWriter(new FileWriter(italianes));
        eItalianes.write(text);
        eItalianes.newLine();
        eItalianes.close();
    }
    public static void matriculesDesconegudes(String text) throws IOException{
        String desconegudes = "desconegudes.txt";
        BufferedWriter eDesconegudes = new BufferedWriter(new FileWriter(desconegudes));
        eDesconegudes.write(text);
        eDesconegudes.newLine();
        eDesconegudes.close();
    }
}
