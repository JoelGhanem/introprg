//Programa que t arruina la vida
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora;
        int valor1;
        int valor2;
        int dif1;
        int dif2;
        int difPetita;
        System.out.println("Introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            valor1 = Integer.parseInt(Entrada.readLine());
            if (valor1 >= 0) {
                while (valor1 >= 0) {
                    System.out.println("Introdueix un valor");
                    valor1 = Integer.parseInt(Entrada.readLine());
                    dif1 = ancora - valor1;
                    Math.abs(dif1);
                    System.out.println("Introdueix un valor");
                    valor2 = Integer.parseInt(Entrada.readLine());
                    dif2 = ancora - valor2;
                    Math.abs(dif2);
                    if (dif1 > dif2); {
                        dif1 = dif2;
                        difPetita = dif1;
                    }
                    if (dif1 < dif2) {
                        difPetita = dif1;
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
