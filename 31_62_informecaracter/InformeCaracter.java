//Programa per aprendre chars//
public class InformeCaracter {
    public static void main(String[] args) {
        String palabra = Entrada.readLine();
        char uno = palabra.charAt(0);
        if (palabra.equals("")) {
            System.out.println("Caràcter buit");
        }else {
            System.out.println("Character.getName('H'): " + Character.getName(uno));
            
        }
    }
}
