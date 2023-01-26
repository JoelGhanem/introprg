/*Joc del penjat en java*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Penjat {
    public static void main(String[] args) throws IOException {
        char letra = '$'; 
        String cami = "paraules.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        System.out.printf("Comencem a jugar%n");
        String paraulaEnJoc = input.readLine();
        while (true) {
            //Función que imprime la palabra en juego 
            paraulaEnJocJoc(paraulaEnJoc);
            //Función que imprime las letras utilizadas
            if (letra == '$') {
                System.out.println("Utilitzades: cap");
            } else {
                lletresUtilitzades(letra);
            }
            //Función que imprime los intentos disponibles
            intentsDisponibles();
            //Función que pide la letra, mira si es prou o no y la devuelve para que siga en juego
            letra = introdueixLletra();
        }
    }
    public static void paraulaEnJocJoc(String paraulaEnJoc, char letra) {
        boolean encertat = false;
        String oculto = ""; 
        for (int i = 0; i < paraulaEnJoc.length(); i++) {
            oculto = oculto + "*";
        }
        System.out.println("Paraula: " + oculto);
    }
    public static void lletresUtilitzades(char letra) {
    }
    public static void intentsDisponibles(boolean error) {
        int intents = 10;
    }
    public static void introdueixLletra() {
        System.out.println("Introdueix una lletra");
        String paraula = Entrada.readLine();
        if (paraula.equals("prou")) {
            prou();
            break;
        }
        if (paraula.length() == 0) {
            char letra = paraula.charAt(0);
            return letra;
        }
    }
    public static void prou() {
        System.out.println("Vols finalitzar?");
        System.out.println("Sí");
        System.out.println("Paraules jugades: ");
        System.out.println("Paraules encertades: ");
        System.out.println("Paraules fallades: ");
        System.out.println("Paraules cancel·lades: ");
        System.out.println("Espero que t'hagis divertit");
        break;
    }
}
