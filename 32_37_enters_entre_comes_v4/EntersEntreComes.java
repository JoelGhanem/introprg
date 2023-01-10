/*Programa que he fet 3 vegades i se m'ha esborrat 2 on he de fer una nova versió de l'exercici EntersEntreComes. En aquesta ocasió l'usuari escull el caràcter separatori*/
public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        String quantsString = Entrada.readLine();
        UtilString.esEnter(quantsString);
        while (!UtilString.esEnter(quantsString)) {
            System.out.println("Per favor, un valor enter");
            UtilString.esEnter(quantsString);
        } 
        int quants = Integer.parseInt(quantsString);
        if (quants <= 0) {
            System.out.println("Res a fer");
        } else {
            System.out.println("Separador?");
            String separador = Entrada.readLine();
            char caracter = separador.charAt(0);
            /*Creo un array para poder mostrar los valores despues*/
            int valors[];
            valors = new int[quants];
            int valor;
            String valorString = "";
            for (int i = 0; i < valors.length; i++) {
                System.out.println("Valor " + (i + 1) + "?");
                valorString = Entrada.readLine();
                UtilString.esEnter(valorString);
                while (!UtilString.esEnter(valorString)) {
                    System.out.println("Per favor, un valor enter");
                    UtilString.esEnter(valorString);
                }
                valor = Integer.parseInt(Entrada.readLine());
                valors[i] = valor;
            }
            UtilString.entreComes(valors, caracter);
            String resultat = UtilString.entreComes(valors, caracter);
            System.out.println(resultat);
        }
    }
}
