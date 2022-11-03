// loro jodido
public class LloroVocalMinuscules {
    public static void main (String[] args) {
        String paraula;
        char uno;
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o'; 
        char u = 'u';
        String paraulaLloro;
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        paraula = Entrada.readLine();
        if (paraula.isEmpty() == false) {
            uno = paraula.charAt(0);
            if (Character.isLowerCase(uno)) {
                while ((paraula.isEmpty() == false) && (paraula.isBlank() == false)) {
                        paraulaLloro = paraula; 
                        uno = paraula.charAt(0);
                        System.out.println("El lloro diu: " + paraulaLloro);
                    System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                    paraula = Entrada.readLine();
                }
            }
        }
        System.out.println("Adéu");
    }
}
