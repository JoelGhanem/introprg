//Programa pa mirar documentacion oficial
public class ManipulaString {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String  paraula = Entrada.readLine();
        System.out.println("La longitud és " + paraula.length());
        System.out.println("La segona lletra és '" + paraula.charAt(1) + "'");
        System.out.println("La darrera lletra és '" + paraula.charAt(paraula.length()-1) + "'");
        System.out.println("La penúltima lletra és '" + paraula.charAt(paraula.length()-2) + "'");
        System.out.println("La paraula en majúscules és \"" + paraula.toUpperCase() + "\"");
        System.out.println("La composició de quatre primeres és \"" + paraula.substring(0,4) + "\"");
        System.out.println("La composició de quatre és \"" + paraula.charAt(paraula.length()-1) + paraula.substring(0,3) + "\"");
        String minus = paraula.substring(0,3);
        System.out.println("La composició de quatre corregint majúscules és \"" + minus.toLowerCase());
    }
}
