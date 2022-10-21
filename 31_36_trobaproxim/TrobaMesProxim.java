//Programa que te dice el valor mas proximo
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int val = 0;
        int dif = 0;
        int dif1 = 0;
        int difPetita = 0;
        System.out.println("Introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            val = Integer.parseInt(Entrada.readLine());
             if (val < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
            while (val >= 0) {
                dif = ancora - val;
                Math.abs(dif);
                System.out.println("Introdueix un valor");
                val = Integer.parseInt(Entrada.readLine());
                dif1 = ancora - val;
                Math.abs(dif1);
                if (dif < dif1) {
                    difPetita = dif;
                    Math.abs(difPetita);
                }
                    else if (dif > dif1) {
                        dif = dif1;
                        difPetita = dif;
                        Math.abs(difPetita);
                    }
            }
            System.out.println("El valor introduït més pròxim a " + ancora + " és " +  difPetita);


        }
        else if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        }
    }
}

