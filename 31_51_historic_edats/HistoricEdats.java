//Desenvolupa un programa que demani el nom d'una persona, la seva edat i l'any actual, i escrigui l'edat que tenia aquella persona cada any des del seu naixement.
public class HistoricEdats {
    public static void main(String[] args) {
        String nom;
        int edat;
        int any;
        int i;
        System.out.println("El vostre nom?");
        nom = Entrada.readLine();
        System.out.println("La vostra edat?");
        edat = Integer.parseInt(Entrada.readLine());
        System.out.println("L'any actual?");
        any = Integer.parseInt(Entrada.readLine());
        int anyNaix = (any - edat);
        if (nom.isBlank()== false) {
            if (any >= 1971) {
            if (edat >= 0) {
                if (edat != 0) {
                    System.out.println("El " + anyNaix + " vau néixer");
                    int n = 1;
                    anyNaix = anyNaix + 1;
                    if (edat != 1) {
                        System.out.println("El " + anyNaix + " teníeu 1 any");
                    }
                    anyNaix = anyNaix + 1;
                    for (i = anyNaix; i < any; ++i) {
                        n = n + 1;
                        System.out.println("El " + i + " teníeu " + n + " anys");
                    }
                }
                System.out.println("Adéu " + nom);
            }
            else if (edat <=0) {
                System.out.println("Entrada incorrecta");
            }
        }
        else if (any < 1971) {
            System.out.println("Entrada incorrecta");
        }
        }
        else if(nom.isBlank()) {
            System.out.println("Entrada incorrecta");
        }
    }
}



