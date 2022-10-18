/*Programa que et retorna el valor mes proxim a un numero*/
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int valor = 0;
        System.out.println("Introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
            while (valor >= 0) {
                System.out.println("Introdueix un valor");
                valor = Integer.parseInt(Entrada.readLine());
            }   

            if (valor <= 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
        }
        if (ancora <= 0) {
            System.out.println("Àncora no vàlida");
        }
    }
}
