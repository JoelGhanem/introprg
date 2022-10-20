//Programa que t arruina la vida
public class TrobaMesProxim {
    public static void maion(String[] args) {
        int ancora;
        int valor1;
        int valor2;
        int diferencia1;
        int diferencia2;
        int diferenciaPetita;
        System.out.println("introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            valor1 = Integer.parseInt(Entrada.readLine());
            if (valor1 >= 0) {
                while (valor1 >= 0) {
                    System.out.println("Introdueix un valor");
                    valor1 = Integer.parseInt(Entrada.readLine());
                    diferencia1 = ancora - valor1;
                    Math.abs(diferencia1);
                    System.out.println("Introdueix un valor");
                    valor2= Integer.parseInt(Entrada.readLine());
                    diferencia2 = ancora - valor2;
                    Math.abs(diferencia2);
                    if (diferencia1 > diferencia2); {
                        diferencia1 = diferencia2;
                        diferenciaPetita = diferencia1;
                    }
                    if (diferencia1 < diferencia2) {
                        diferenciaPetita = diferencia1;
                    }

                }
            }
            if (valor1 < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
        }
        if (ancora < 0) {
            System.out.println("Àncora no vàlida");

        }
    }

}
