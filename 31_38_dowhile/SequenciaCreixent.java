//Programa que te muestra la racha de tu secuencia creciente
public class SequenciaCreixent {
    public static void main(String[] args) {
        int valor = 0;
        int sequencia = 0;
        int tmp;
        do {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            tmp = valor;
            sequencia += 1;
        }    while (valor > tmp);
        System.out.println("Longitud de la següència creixent: " + sequencia);
    }
}
