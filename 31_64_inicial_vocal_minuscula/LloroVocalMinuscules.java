//Programa del loro pero mas tiquismiquis
public class LloroVocalMinuscules {
    public static void main(String[] args) {
        System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
        String paraula = Entrada.readLine();
        char primera;
        String paraulaLloro;
        if (paraula.isEmpty() == false){
            primera = paraula.charAt(0);
            if (Character.isLowerCase(primera)){
                while ((paraula.isEmpty() == false)  && (paraula.isBlank() == false))  {
                    paraulaLloro = paraula; 
                    System.out.println("El lloro diu: " + paraulaLloro);
                    System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
                    paraula = Entrada.readLine();
                }
            }
            else {
                System.out.println("El lloro pregunta paraula que comenci amb vocal en minúscules");
            }
        }
        System.out.println("Adéu");
    }
}
