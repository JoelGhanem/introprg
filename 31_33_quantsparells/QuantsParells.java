/*Programa que demana enters positius i que para al rebre un negatiu*/
public class QuantsParells { 
    public static void main(String[] args) {

        int valor = 0;
        int valorSenar = 0;
        int valorParell = 0;
        int numValorParell = 0;
        while (valor >= 0) {
        System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        if (valor % 2 == 0) {
            valor = valorParell;
            numValorParell = numValorParell + 1;
        if (valor % 2 == 0) {
            valor = valorSenar;
        }
        }
        }
        System.out.println("Nombre de parells introduïts: " +  numValorParell);
    }
}

