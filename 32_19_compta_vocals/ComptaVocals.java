//Considera la següent versió simplificada del programa ComptaAiEs en la que comptem les ocurrències de 'a' i 'e' però no les comparem://
public class ComptaVocals {
    public static void main (String[] args) {
        System.out.println("Introdueix un text");
        String text = Entrada.readLine();
        String vocals = ("aàeèéiíïoóòuúü");
        for (int j = 0; j < vocals.length(); j++) {
            int num = quantesOcurrencies(text, vocals.charAt(j));
            mostraOcurrencies(vocals.charAt(j), num);
        }
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}

