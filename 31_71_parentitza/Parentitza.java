//cabecera descriptiva pq no para de joder el prgtest, (insertar descripcion guap'isdima)
public class Parentitza {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        for (int parentesis = 0; parentesis <= text.length(); parentesis ++){
        System.out.print("(" + text.charAt(parentesis) + ")");
        }
    }
}
