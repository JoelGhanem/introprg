//arxiu que ens permet utilitzar el GatRenat, executa els arxius GatRenat i Gat,
// aquest arxiu enms escriurá per pantalla la posició del GatRenat després de canviar-la
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("El Renat diu: "+ renat.aixecat());
        System.out.println("El Renat diu: "+ renat.seu());
        System.out.println("El Renat diu: "+ renat.estirat());
        System.out.println("El Renat diu: "+ renat.estirat());
    }
}
