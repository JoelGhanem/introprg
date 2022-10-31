//Programa per aprendre chars//
public class InformeCaracter {
    public static void main(String[] args) {
        System.out.println("Caràcter?");
        String palabra = Entrada.readLine();
        char uno = palabra.charAt(0);
        if (palabra.equals("")) {
            System.out.println("Caràcter buit");
        }else {
            System.out.println("Character.getName('" + uno + "'): " + Character.getName(uno));
            
        }
    }
}
