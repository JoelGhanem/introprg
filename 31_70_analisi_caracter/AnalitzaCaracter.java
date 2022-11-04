//analizando caracters
public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        char car = text.charAt(text.length()-posicio);
        if (posicio >= 0) {
            car = text.charAt(posicio);
        } 
        else if (posicio < 0) {
            car = text.charAt(text.length()-posicio);
        }
        else if (posicio > text.length()) {
            System.out.println("Fora de rang");
        }
        else if (posicio < text.length()){
            System.out.println("Fora de rang");
        }
        else if (Character.isLetter(car)) {
            System.out.println("'" + car + "' és una lletra" );
        }
        else if (Character.isDigit(car)) {
            System.out.println("'" + car + "' és un nombre" );
        }
        else if (Character.isLetter(car) == false) {
            System.out.println("'" + car + "' és una altra cosa" );
        }
    }
}
