//Desenvolupa un programa que demani el nom d'una persona, la seva edat i l'any actual, i escrigui l'edat que tenia aquella persona cada any des del seu naixement.
public class HistoricEdats {
    public static void main(String[] args) {
        String nom;
        int edat;
        int any;
        int n = 0;
        System.out.println("El vostre nom?");
        nom = Entrada.readLine();
        System.out.println("La vostra edat?");
        edat = Integer.parseInt(Entrada.readLine());
        System.out.println("L'any actual?");
        any = Integer.parseInt(Entrada.readLine());
        int anyNaix = any - edat;
        System.out.println("El " + anyNaix + " vau néixer");
        
        for (int i = any; i <= any; ++i); n = n + 1; {

        }
    }
}


        
