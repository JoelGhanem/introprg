/*Aquesta classe implementa la classe Hora fent que s'executi, en aquest cas agadfa un Illegal Argument Exception*/
public class UsaHora {
    public static void main(String[] args) {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}
