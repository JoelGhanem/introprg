//analizando caracters
public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        char car = text.charAt(0);
        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        int largo = text.length();
        int largoNegativo = (text.length() *-1);
        if (posicio+1 > text.length()) {
            System.out.println("Fora de rang");
        }
        if (posicio >= 0) {
            if (largo > posicio) { 
                car = text.charAt(posicio);
            }
            if ((largo > posicio) && Character.isLetter(car)) {
                System.out.println("'" + car + "' és una lletra" );
            }
            if (Character.isDigit(car)) {
                System.out.println("'" + car + "' és un nombre" );
            }
            if (Character.isLetter(car) == false && Character.isDigit(car) == false) {
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
