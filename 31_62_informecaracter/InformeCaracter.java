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
            System.out.println("Character.isDigit('" + uno + "'): " + Character.isDigit(uno));
            System.out.println("Character.isJavaIdentifierStart('" + uno + "'): " + Character.isJavaIdentifierStart(uno));
            System.out.println("Character.isJavaIdentifierPart('" + uno + "'): " + Character.isJavaIdentifierPart(uno));
            System.out.println("Character.isLetter('" + uno + "'): " + Character.isLetter(uno));
            System.out.println("Character.isLowerCase('" + uno + "'): " + Character.isLowerCase(uno));
            System.out.println("Character.isUpperCase('" + uno + "'): " + Character.isUpperCase(uno));
            System.out.println("Character.isWhitespace('" + uno + "'): " + Character.isWhitespace(uno));
            System.out.println("Character.toLowerCase('" + uno + "'): " + Character.toLowerCase(uno));
            System.out.println("Character.toUpperCase('" + uno + "'): " + Character.toUpperCase(uno));
        }
    }
}
