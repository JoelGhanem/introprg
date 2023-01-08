/*Una nova versió del programa enters entre comes On els valors son escollits pels usuaris i l array sera sempre de 5*/
public class EntersEntreComes {
    public static void main (String[] args) {
        int valors[];
        valors = new int[5];
        int valor; 
        for (int i = 0; i < valors.length; i++) {
            System.out.println("Valor " + (i + 1) + "?");
            valor = Integer.parseInt(Entrada.readLine());
            valors [i] = valor;
            if (i == valors.length-1) {
                for (int j = 0; j < valors.length; j++){
                    if ( j == 0) {
                        System.out.print(valors[j]);
                    } else {
                        System.out.print(", " + valors[j]);
                    }
                }
            }
        }
    }
}



