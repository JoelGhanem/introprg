/*Programa que et retorna tres numeros en ordre ascendent */
public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int a = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon?");
        int b = Integer.parseInt(Entrada.readLine());
        System.out.println("Tercer?");
        int c = Integer.parseInt(Entrada.readLine());
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c < b) {
            int temp = c;
            c = b;
            b = temp;
        }
        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }
         System.out.println(a + ", " + b +" i " + c);
    }
}



