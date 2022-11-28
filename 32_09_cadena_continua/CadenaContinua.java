//Desenvolupa una nova versió de l'exercici que mostrava una cadena contínua.//
public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        if (text.isEmpty()) {
            System.out.println("error");
        } else {
            System.out.println("Nombre?");
            int longitud = Integer.parseInt(Entrada.readLine());
            mostraCadenaContinua(text, longitud);
        }
    }
    public static void mostraCadenaContinua(String text, int longitud) {
        int contador = -1;
        for (int i = 0; i < longitud; i++) {
            contador = contador + 1;
            if (contador == text.length()) {
                contador = 0; 
            }
            System.out.print(text.charAt(contador));
        }
    }
}

