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
        String utilitzades = "";
        int numero = 0;
        int intents = 11;
        while (true) {
            //Función que imprime la palabra en juego 
            numero = paraulaEnJocJoc(numero, paraulaEnJoc, letra);
            //Función que imprime las letras utilizadas
            if (letra == '$') {
                System.out.println("Utilitzades: cap");
            } else {
                utilitzades = lletresUtilitzades(utilitzades, letra);
            }
            //Función que imprime los intentos disponibles
            intents = intentsDisponibles(intents);
            //Función que pide la letra, mira si es prou o no y la devuelve para que siga en juego
            letra = introdueixLletra();
            System.out.println("la letra es " + letra);
        }
    }
    // hay que hacer 2 strings para que se vaya mostrando la palabrta con y sion censura
    public static int paraulaEnJocJoc(int numero, String paraulaEnJoc, char letra) {
        boolean encertat = false;
        String oculto = ""; 
        String muestra = "";
        for (int i = 0; i < paraulaEnJoc.length(); i++) {
            oculto = oculto + "*";
        }
        System.out.println("Paraula: " + oculto);
        oculto = "";
        numero = numero + 1;
        if (numero != 0) {
            for (int i = 0; i < paraulaEnJoc.length(); i++) {
                if (paraulaEnJoc.charAt(i) == letra) {
                    oculto = oculto +  letra;
                } else { 
                    oculto = oculto + "*";
                }
            }
        }
        return numero;
    }
    public static String lletresUtilitzades(String utilitzades, char letra) {
        char mayus = '$';
        mayus = Character.toUpperCase(letra);
        utilitzades = utilitzades + mayus;
        // primera letra
        if (utilitzades.length() == 1) {
            System.out.println("Utilitzades: " + utilitzades);
        } else if (utilitzades.length() == 2) {
            // 2 letras
            System.out.println("Utilitzades: " + utilitzades.charAt(0) + " i " + utilitzades.charAt(1));
            // si hay mas de 2 letras
        } else if (utilitzades.length() > 2) {
            for (int i = 0; i < utilitzades.length(); i++) {
                if (i == 0) {
                    System.out.print("Utilitzades: " + utilitzades.charAt(0));
                } else if (i == utilitzades.length()-2)  {
                    System.out.print(utilitzades.charAt(utilitzades.length()-2) + " i " + utilitzades.charAt(utilitzades.length()-1));
                    break;
                } else { 
                    System.out.print(", " + utilitzades.charAt(i));
                }
            }
        }
        return utilitzades;
    }
    public static int intentsDisponibles(int intents) {
        int tiradas = intents;
        tiradas -=1;
        System.out.println("Intents disponibles: " + tiradas);
        return tiradas;
    }
    public static char introdueixLletra() {
        char letra = '$';
        System.out.println("Introdueix una lletra");
        String paraula = Entrada.readLine();
        letra = paraula.charAt(0);
        return letra;
    }
    public static boolean prou() {
        System.out.println("Vols finalitzar?");
        System.out.println("Paraules jugades: ");
        System.out.println("Paraules encertades: ");
        System.out.println("Paraules fallades: ");
        System.out.println("Paraules cancel·lades: ");
        System.out.println("Espero que t'hagis divertit");
        return true;
    }
}
