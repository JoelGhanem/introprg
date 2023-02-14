public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.estaViu(): " + renat.getViu());
        System.out.println("Inicialment renat.estaDret(): " + renat.getDret());
        System.out.println("Inicialment renat.estaAssegut(): " + renat.getAssegut());
        System.out.println("Inicialment renat.estaEstirat(): " + renat.getEstirat());
        System.out.println("Introdueix quantes vides:");
        String nuevasVidas = Entrada.readLine();
        if (Character.isDigit(nuevasVidas.charAt(0))) {
            renat.setVides(Integer.parseInt(nuevasVidas));
        }
        System.out.println("Introdueix nova posició:");
        renat.setPosicio((Entrada.readLine()));
        System.out.println("Finalment renat.estaViu(): " + renat.getViu());
        System.out.println("Finalment renat.estaDret(): " + renat.getDret());
        System.out.println("Finalment renat.estaAssegut(): " + renat.getAssegut());
        System.out.println("Finalment renat.estaEstirat(): " + renat.getEstirat());
    }
}
