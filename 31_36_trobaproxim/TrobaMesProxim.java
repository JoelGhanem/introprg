/*Programa que et retorna el valor mes proxim a un numero*/
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int valor = 0;
        System.out.println("Introdueix l'àncora");
         while (ancora >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }   
            ancora = Integer.parseInt(Entrada.readLine());
        if (ancora <= 0) {
            System.out.println("Àncora no vàlida");
        }
            valor = Integer.parseInt(Entrada.readLine());
        if (valor <= 0) {
            System.out.println("Àncora no vàlida");
        }
    }
}
