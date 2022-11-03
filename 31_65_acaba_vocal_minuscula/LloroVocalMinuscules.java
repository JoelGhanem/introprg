// loro jodido
public class LloroVocalMinuscules {
    public static void main (String[] args) {
        String paraula;
        char fin;
        String paraulaLloro;
        System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
        paraula = Entrada.readLine();
        if (paraula.isEmpty() == false) {
            fin = paraula.charAt(0);
            if (Character.isLowerCase(fin)) {
                while ((paraula.isEmpty() == false) && (paraula.isBlank() == false)) {
                    paraulaLloro = paraula; 
                    fin = paraula.charAt(paraula.length()-1);
                    if (Character.isLowerCase(fin)) {
                        if (fin == 'a' || fin == 'e' || fin == 'i' || fin == 'o' || fin == 'u') {
                            System.out.println("El lloro diu: " + paraulaLloro);
                        }
                    }
                    System.out.println("El lloro pregunta paraula que finalitzi per vocal en minúscules");
                    paraula = Entrada.readLine();


                }
            }
        }
        System.out.println("Adéu");
    }
}

