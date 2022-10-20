//Programa que t arruina la vida
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int valor1 = 0;
        int valor = 0;
        int dif1 = 0;
        int dif2 = 0;
        int difPetita = 0;
        System.out.println("Introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        }
        else if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            if (valor < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
            else if (valor >= 0) {
                do {
                    System.out.println("Introdueix un valor");
                    valor1 = Integer.parseInt(Entrada.readLine());
                    dif1 = ancora - valor1;
                    Math.abs(dif1);
                    difPetita = dif1;
                }
                while (valor1 >= 0);
            }
        
        System.out.println("El valor introduït més pròxim a " + ancora + " és " + difPetita);
        }
    }
}
