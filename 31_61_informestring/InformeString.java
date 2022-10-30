// Programa que te ayuda con los strings
public class InformeString {
    public static void main(String[] args) {
        System.out.println("Text principal?");
        String primer = Entrada.readLine();
        System.out.println("Text secundari?");
        String segon = Entrada.readLine();
        System.out.println("Número positiu?");
        int num = Integer.parseInt(Entrada.readLine());
        System.out.println("\"" + primer + "\".length(): " + primer.length());
        System.out.println("\"" + primer + "\".startsWith(\"" + segon + "\"): " + primer.startsWith(segon));
        System.out.println("\"" + primer + "\".endsWith(\"" + segon + "\"): " + primer.endsWith(segon));
        System.out.println("\"" + primer + "\".equals(\"" + segon + "\"): " + primer.equals(segon));
        System.out.println("\"" + primer + "\".equalsIgnoreCase(\"" + segon + "\"): " + primer.equalsIgnoreCase(segon));
        System.out.println("\"" + primer + "\".isBlank(): " + primer.isBlank());
        System.out.println("\"" + primer + "\".isEmpty(): " + primer.isEmpty());
        System.out.println("\"" + primer + "\".charAt(" + num + "): " + primer.charAt(num));
        System.out.println("\"" + primer + "\".concat(\"" + segon + "\"): " + primer.concat(segon));
        System.out.println("\"" + primer + "\".repeat(" + num + "): " + primer.repeat(num));
        System.out.println("\"" + primer + "\".toUpperCase(): "  + primer.toUpperCase());
        System.out.println("\"" + primer + "\".toLowerCase(): "  + primer.toLowerCase());
    }
}

