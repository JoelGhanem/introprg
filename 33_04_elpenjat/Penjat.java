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
        boolean acaba = false;
        int numero = 0;
        int intents = 11;
        int ganadas = 0;
        int jugadas = 1;
        int perdidas = 0;
        int canceladas = 0;
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
            if (letra == 'ñ') {
                prou(jugadas, ganadas, perdidas, canceladas);
            }
            break;
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
        boolean no = false;
        String letras = "abcdefghijklmnopqrstuvwxyz";
        char letra = '$';
        System.out.println("Introdueix una lletra");
        String paraula = Entrada.readLine();
        if (!paraula.equals("prou")) {
        }else if (!paraula.equals("glups")) {
            for (int i = 0; i < paraula.length(); i++) {
                for ( int j = 0; j < paraula.length(); j++) {
                    if (paraula.charAt(i) != letras.charAt(j)) {
                        no = true;
                    }
                }
            }
            if (no) {
                System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
            }
        }
        letra = paraula.charAt(0);
        if (paraula.equals("prou")) {
            letra = 'ñ';
        }
        if (letra == 'ñ') {
            return letra;
        } 
        return letra;
    }
    public static boolean prou(int jugadas, int ganadas, int perdidas, int canceladas) {
        boolean prou = false;
        canceladas = 1;
        String finalitza = "";
        System.out.println("Vols finalitzar?");
        finalitza = Entrada.readLine();
        if (finalitza.equals("sí")) {
            System.out.println("Paraules jugades: " + jugadas);
            System.out.println("Paraules encertades: " + ganadas);
            System.out.println("Paraules fallades: " + perdidas);
            System.out.println("Paraules cancel·lades: " + canceladas);
            System.out.println("Espero que t'hagis divertit");
            prou = true;
        }
        return prou ;
    }
}
