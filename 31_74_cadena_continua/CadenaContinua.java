//Desenvolupa un programa que demani un text i un nombre enter, i mostri tants caràcters del text com indiqui el nombre enters, començant pel primer. En cas que en faltin, el programa tornarà a mostrar el text a partir del primer caràcter fins que hagi aconseguit tots els caràcters demanats.
public class CadenaContinua {
    public static void main(String[] args) {
        System.out.println("Text?");
        int numero = 1;
        String text = Entrada.readLine();
        if (text.isEmpty()) {
            System.out.println("error");
        }
        System.out.println("Nombre?");
        if (!text.isEmpty()) {
            System.out.println("Nombre?");
            numero = Integer.parseInt(Entrada.readLine());
        }
        for (int num = 0; num <= numero; num ++) {
            if (num > numero) {
                num = 0;
                System.out.println(text.charAt(num));
            }
        }
    }
}
