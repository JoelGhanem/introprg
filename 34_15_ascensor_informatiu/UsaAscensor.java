/*Afegeix al repertori de mètodes de Ascensor els següents: estaAbaix() i estaAmunt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament. estaMovent() retorna cert quan està pujant o baixant. comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.*/
public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String nuevoPiso = Entrada.readLine();
        if (Character.isDigit(nuevoPiso.charAt(0))) {
            ascensor.setPis(Integer.parseInt(nuevoPiso));
        }
        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}
