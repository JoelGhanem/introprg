/*En aquest exercici, torna a afegir la propietat posicio que vas incorporar a l'exercici Renat té posició. En aquesta ocasió, fes la propietat privada i implementa els accessors de manera que garanteixis que la posició del Renat sigui sempre correcta, a l'hora que pugui ser canviada.*/
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.getVides());
        System.out.println("Posició inicial: " + renat.getPosicio());
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Posició final: " + renat.getPosicio());
    }
}
