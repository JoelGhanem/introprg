//analizando caracters
public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        char car = text.charAt(0);
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        if (posicio >= 0) {
            if (posicio > text.length()) {
                System.out.println("Fora de rang");
            }
            car = text.charAt(posicio);
            if (Character.isLetter(car)) {
                System.out.println("'" + car + "' és una lletra" );
            }
            else if (Character.isDigit(car)) {
                System.out.println("'" + car + "' és un nombre" );
            }
            else if (Character.isLetter(car) == false) {
                System.out.println("'" + car + "' és una altra cosa" );
            }
        }
        if (posicio < 0) {
            car = text.charAt(text.length()-Math.abs(posicio));
            if (Character.isLetter(car)) {
                System.out.println("'" + car + "' és una lletra" );
            }
            else if (Character.isDigit(car)) {
                System.out.println("'" + car + "' és un nombre" );
            }
            else if (Character.isLetter(car) == false) {
                System.out.println("'" + car + "' és una altra cosa" );
            }
            else if (posicio < text.length()){
                System.out.println("Fora de rang");
            }
        }
    }
}
