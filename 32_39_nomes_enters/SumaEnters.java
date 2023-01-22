/*Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.*/
public class SumaEnters {

    public static void main(String[] args) {
        int[] enters = filtraEnters(args);
        int suma = sumaEnters(enters);
        System.out.println(suma);
    }
    public static int quantsEnters(String[] valors) {
        int contador = 0;
        for(int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                contador++;
            }
        }
        return contador;
    }
    public static int[] filtraEnters(String[] valors) {
        int[] enters = new int[quantsEnters(valors)];
        int contador = 0;
        for(int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                enters[contador++] += Integer.parseInt(valors[i]);
            }
        }
        return enters;
    }

    public static int sumaEnters(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return suma;
    }
}
