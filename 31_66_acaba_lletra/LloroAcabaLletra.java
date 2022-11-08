// loro que acaba de otra amnera a los otros 4 putos loros
public class LloroAcabaLletra {
    public static void main (String[] args) {
        String paraula;
        char fin;
        String paraulaLloro;
        System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal");
        paraula = Entrada.readLine();
        if (paraula.isEmpty() == false) {
            fin = paraula.charAt(paraula.length()-1);
            if (Character.isLetter(fin)) {
                while ((paraula.isEmpty() == false) && (paraula.isBlank() == false)) {
                    paraulaLloro = paraula; 
                    fin = paraula.charAt(paraula.length()-1);
                    if (Character.isLetter(fin)) {
                        if (fin != 'a' || fin != 'e' || fin != 'i' || fin != 'o' || fin != 'u' || fin != 'A' || fin != 'E' || fin != 'O' || fin != 'U') {
                            System.out.println("El lloro diu: " + paraulaLloro);
                        }
                    }
                    System.out.println("El lloro pregunta paraula que finalitzi per lletra no vocal"); 
                    paraula = Entrada.readLine();
                }
            }
        }
        System.out.println("Adéu");
    }
}


