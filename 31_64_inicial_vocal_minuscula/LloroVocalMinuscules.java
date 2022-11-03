// loro jodido
public class LloroVocalMinuscules {
    public static void main (String[] args) {
        String paraula;
        char uno;
        String paraulaLloro;
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        paraula = Entrada.readLine();
        if (paraula.isEmpty() == false) {
            uno = paraula.charAt(0);
            if (Character.isLowerCase(uno)) {
                while ((paraula.isEmpty() == false) && (paraula.isBlank() == false)) {
                    paraulaLloro = paraula; 
                    uno = paraula.charAt(0);
                    if (Character.isLowerCase(uno)) {
                        System.out.println("El lloro diu: " + paraulaLloro);
                    }
                    System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                    paraula = Entrada.readLine();


                }
            }
        }
    }
}
