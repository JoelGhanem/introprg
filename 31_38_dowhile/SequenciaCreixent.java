//Programa que te muestra la racha de tu secuencia creciente
public class SequenciaCreixent {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor = 0;
        int sequencia = 0;
        // El programa te un problema que crec que no es pot solucionar amb els coneixements actuals i es que només funciona bé quan la cuantitad de valors introduits es parella ja que si no el programa no acaba de executar-se i no pot llegir si la seguencia ha sigut correcte
        do {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            System.out.println("Introdueix un valor");
            valor1 = Integer.parseInt(Entrada.readLine());
            sequencia += 1;
        }    while (valor1 > valor);
        System.out.println("Longitud de la següència creixent: " + sequencia);
    }
}
