//Programa que te muestra la racha de tu secuencia creciente
public class SequenciaCreixent {
    public static void main(String[] args) {
        int valor = 0;
        int valor1 = 0;
        int sequencia = -1;
        int tmp;
        do {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            tmp = valor;
            sequencia += 1;
            System.out.println("Introdueix un valor");
            valor1 = Integer.parseInt(Entrada.readLine());
            sequencia += 1;
        } 
        while (valor1 > valor);
        System.out.println("Longitud de la següència creixent: " + sequencia);
    }
}
