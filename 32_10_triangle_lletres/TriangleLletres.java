//Desenvolupa una nova versió de l'exercici que dibuixava un triangle de lletres.//
public class TriangleLletres {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        dibuixaTriangle(text);
    }
    public static void dibuixaTriangle(String text) {
        int linia = 0;
        for (int i = 1; i < text.length(); i++) {
            dibuixaLinia(text, linia);
            linia += 1;
            System.out.println();
        }
    }
    public static void dibuixaLinia(String text, int linia) {
        for (int j = 0; j <= linia; j++) {
            if (j == linia) {
                System.out.print(text.charAt(j));
            } else {
                System.out.print(text.charAt(j) + ", ");
            }
        }
    }
}


