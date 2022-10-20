//Escriu un programa que demani un enter positiu més gran que 0 i "dibuixi" un quadrat amb els nombres del 1 fins el valor de l'entrada.
public class  QuadratNombres {
    public static void main(String[] args) {
        int valorFinal;
        System.out.println("Valor final?");
        valorFinal = Integer.parseInt(Entrada.readLine());
        for (int li =1; li <= valorFinal; li++) {
            for (int co = 1; co <= valorFinal; co++) {
                System.out.print(" " + co);
            }
            System.out.println(" " + li);
        }
    }
}
