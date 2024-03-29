//Desenvolupa una nova versió de l'exercici que dibuixava un triangle de lletres invertit.//
public class TriangleLletresInvertit {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        dibuixaTriangleInvertit(text);
    }
    public static void dibuixaTriangleInvertit(String text) {
        int linia = 0;
        for (int i = 0; i < text.length(); i++) {
            dibuixaLiniaInvertida(text, linia);
            linia += 1;
            System.out.println();
        }
    }
    public static void dibuixaLiniaInvertida(String text, int linia) {
        for (int j = text.length()-1; j >= 0; j--) {
            if (j <= text.length()-1-linia) {
                if (j == 0){
                    System.out.print(text.charAt(0));
                } else {
                    System.out.print(text.charAt(j) + ", ");
                }
            }
        }
    }
}
