//Programa pa mirar documentacion oficial
public class ManipulaString {
    public static void main(String[] args) {
        System.out.println("Paraula?");
        String  paraula = Entrada.readLine();
        System.out.println("La longitud és " + paraula.length());
        System.out.println("La segona lletra és " + paraula.charAt(1));
        System.out.println("La darrera és " + paraula.charAt(paraula.length()-1));
        //la penultima
        System.out.println("La paraula en majúscules és " + paraula.toUpperCase());

    }
}
