import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Penjat {
    private static int intents = 10;
    private static int jugadas = 0;
    private static int ganadas = 0;
    private static int falladas = 0;
    private static int canceladas = 0;
    public static void main(String[] args) throws IOException {
        String cami = "paraules.txt";
        BufferedReader input = new BufferedReader(new FileReader(cami));
        String paraulaEnJoc = input.readLine();
        if(paraulaEnJoc == null) {
            System.out.println("No tinc paraules per jugar");
            return;
        }
        System.out.printf("Comencem a jugar%n");
        while (true) {
            jugadas++;
            if(!jugaParaula(paraulaEnJoc)) break;
            paraulaEnJoc = input.readLine();
            if(paraulaEnJoc == null) {
                System.out.println("No queden més paraules");
                break;
            }
        }
        resumPartida();
    }
    public static boolean jugaParaula(String paraula) throws IOException {
        boolean paraulaEncertada = false;
        paraula = paraula.toLowerCase();
        int longitud = paraula.length();
        char[] paraulaXifrada = paraula.toCharArray();
        String utilitzades = "";
        for (int i = 0; i < longitud; i++) {
            paraulaXifrada[i] = '*';
        }
        while(!paraulaEncertada) {
            System.out.println("Paraula: " + String.valueOf(paraulaXifrada));
            System.out.println("Utilitzades: cap");
            System.out.println("Intents disponibles: " + intents);
            System.out.println("Introdueix una lletra");
            String entrada = Entrada.readLine().toLowerCase();
            if(entrada.equals("prou")) {
                System.out.println("Vols finalitzar?");
                String resposta = Entrada.readLine();
                if(respostaABoolean(resposta)) {
                    canceladas++;
                    return false;
                }
            }
            if(entrada.equals("glups")) {
                System.out.println("Vols passar a la següent paraula?");
                String resposta = Entrada.readLine();
                if(respostaABoolean(resposta)) {
                    canceladas++;
                    break;
                }
            }
            if (entrada.length() > 1) {
                System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
                continue;
            }
            char lletra = entrada.charAt(0);
            if (!Character.isLetter(lletra)) {
                System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
                continue;
            }
            utilitzades += Character.toUpperCase(lletra);
            boolean encert = false;
            for (int i=0; i < longitud; i++) {
                if(paraula.charAt(i) == lletra) {
                    encert = true;
                    paraulaXifrada[i] = lletra;                }
            }
            if(!encert) {
                intents--;
                mostraFigura(intents);
            }
            if(String.valueOf(paraulaXifrada).contains("*")) {
                System.out.println("Paraula: " + String.valueOf(paraulaXifrada));
                System.out.println("Utlitzades: " + utilitzades);
                System.out.println("Intents disponibles: " + intents);
                continue;
            } else {
                System.out.println("Has encertat la paraula era: " + paraula);
                intents = 10;
                ganadas++;
                paraulaEncertada = true;
            }
        }
        return true;
    }
    public static void mostraFigura(int intentsDisponibles) throws IOException {
        int fitxer = 9 - intentsDisponibles;
        String cami = "recursos/figura" + fitxer + ".txt";
        BufferedReader figura = new BufferedReader(new FileReader(cami));
        while(true) {
            String linia = figura.readLine();
            if (linia == null) break;
            System.out.println(linia);
        }
        figura.close();
    }
    public static void resumPartida() {
        System.out.println("Paraules jugades: " + jugadas);
        System.out.println("Paraules encertades: " + ganadas);
        System.out.println("Paraules fallades: " + falladas);
        System.out.println("Paraules cancel·lades: " + canceladas);
        System.out.println("Espero que t'hagis divertit");
    }
    /*
     * Donada una resposta textual, aquesta funció tradueix la resposta a
     * un booleà.
     * Considera true quan la resposta és, independentment de majúscules i
     * sense considerar espais a l'inici ni al final,
     * "sí", "s", "yes" o "y", i algunes variants amb errors ortogràfics.
     * Altrament considera false.
     */
    public static boolean respostaABoolean(String resposta) {
        if (null == resposta) {     // si la resposta és null, la donem com a false
            return false;
        }
        resposta = resposta.toLowerCase();
        if (resposta.equals("s") || resposta.equals("y")) {
            return true;
        }
        if (resposta.equals("sí") || resposta.equals("yes")) {
            return true;
        }
        if (resposta.equals("si") || resposta.equals("vale") || resposta.equals("yeah")) {
            return true;
        }
        return false;
    }
}
