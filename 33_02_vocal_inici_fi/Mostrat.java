import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Mostrat {
    public static void main(String[] args) throws IOException {
        String cami = "Mostrat.java";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) break;
            System.out.println(linia);
        }
        input.close();
    }
}
