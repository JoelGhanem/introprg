/*Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.*/
public class SumaEnters {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            UtilString.esEnter(args[i]);
            int contador = 0;
            if (UtilString.esEnter(args[i])) {
                contador += 1;

