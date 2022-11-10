//cabecera descriptiva pq no para de joder el prgtest, (insertar descripcion guapisima)
public class Parentitza {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        for (int num = 0; num < text.length(); num ++){
            System.out.print("(" + text.charAt(num) + ")");
        }
    }
}
