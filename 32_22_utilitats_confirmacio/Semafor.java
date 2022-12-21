//Desenvolupa una versió de l'exercici del Semàfor de manera que abans de donar el consell, se n'asseguri que els usuaris són majors d'edat.//
public class Semafor {
    public static void main(String[] args) {
        System.out.println("Ets major d'edat?");
        String resposta = Entrada.readLine();
        UtilitatsConfirmacio.respostaABoolean(resposta);
        System.out.println("Color?");
        String color = Entrada.readLine();
        colorSemaforo(color);
    }
    public static void colorSemaforo(String color) {
        if (color.equals("groc")) {
            System.out.println("corre!");
        } else if (color.equals("verd")) {
            System.out.println("passa");
        } else if (color.equals("vermell")) {
            System.out.println("espera");
        } else if (color.equals("magenta")) {
            System.out.println("ves a l'oculista");
        }
    }
}

