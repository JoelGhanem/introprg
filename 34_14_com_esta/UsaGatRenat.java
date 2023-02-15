//Programa que canvia la posicio del gat renat segons la entrada rebuda//
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.estaViu(): " + renat.estaViu());
        System.out.println("Inicialment renat.estaDret(): " + renat.estaDret());
        System.out.println("Inicialment renat.estaAssegut(): " + renat.estaAssegut());
        System.out.println("Inicialment renat.estaEstirat(): " + renat.estaEstirat());
        System.out.println("Introdueix quantes vides:");
        String nuevasVidas = Entrada.readLine();
        if (Character.isDigit(nuevasVidas.charAt(0))) {
            renat.setVides(Integer.parseInt(nuevasVidas));
        g
        System.out.println("Introdueix nova posició:");
        renat.setPosicio((Entrada.readLine()));
        System.out.println("Finalment renat.estaViu(): " + renat.estaViu());
        System.out.println("Finalment renat.estaDret(): " + renat.estaDret());
        System.out.println("Finalment renat.estaAssegut(): " + renat.estaAssegut());
        System.out.println("Finalment renat.estaEstirat(): " + renat.estaEstirat());
    }
}
