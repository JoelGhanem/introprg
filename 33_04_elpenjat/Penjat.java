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
            System.out.println("Introdueix una lletra");
            String entrada = Entrada.readLine();
            letra = entrada.charAt(0);
            //Función que imprime la palabra en juego 
            paraulaEnJocJoc(paraulaEnJoc, letra);
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
            if (prou()) {
                break;
            }
        }
    }
    // hay que hacer 2 strings para que se vaya mostrando la palabrta con y sion censura
    public static void paraulaEnJocJoc(String paraulaEnJoc, char letra) {
        boolean encertat = false;
        int numeroDeTiradas = 0;
        String oculto = ""; 
        String muestra = "";
        for (int i = 0; i < paraulaEnJoc.length(); i++) {
            oculto = oculto + "*";
        }
        System.out.println("Paraula: " + oculto);
        oculto = "";
        numeroDeTiradas = numeroDeTiradas + 1;
        if (numeroDeTiradas != 0) {
            for (int i = 0; i < paraulaEnJoc.length(); i++) {
                if (paraulaEnJoc.charAt(i) == letra) {
                    oculto = oculto +  letra;
                } else { 
                    oculto = oculto + "*";
                }
            }
        }
    }
    public static void lletresUtilitzades(char letra) {
        String utilitzades = "";
        utilitzades = utilitzades + Character.toUpperCase(letra);
        System.out.println("Utilitzades: " + utilitzades);
    }
    public static void intentsDisponibles() {
        int intents = 10;
        System.out.println(intents);
    }
    public static char introdueixLletra() {
        System.out.println("Introdueix una lletra");
        String paraula = Entrada.readLine();
        if (paraula.equals("prou")) {
            prou();
        }
        char letra = paraula.charAt(0);
        return letra;
    }
    public static boolean prou() {
        System.out.println("Vols finalitzar?");
        System.out.println("Sí");
        System.out.println("Paraules jugades: ");
        System.out.println("Paraules encertades: ");
        System.out.println("Paraules fallades: ");
        System.out.println("Paraules cancel·lades: ");
        System.out.println("Espero que t'hagis divertit");
        return true;
    }
}
