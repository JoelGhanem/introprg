/*El màxim és*/
/*Programa que et iu quin es el numero mes gran*/ 
public class TrobaMaxim {
    public static void main(String[] args) {
    int valor = 0;
    int valorMax = 0;
    while (valor >= 0) {
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
        if (valorMax < valor) {
            valorMax = valor;
    
        System.out.println("El màxim és " + valorMax);
        }
        }
    }
}
