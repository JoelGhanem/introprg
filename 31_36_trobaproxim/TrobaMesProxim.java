//Programa que te dice el valor mas proximo
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int val;
        int dif;
        int dif1;
        int difPetita = 100000;
        int valorReal;
        int valorReal1;
        System.out.println("Introdueix l'àncora");
        ancora = Integer.parseInt(Entrada.readLine());
        if (ancora >= 0) {
            System.out.println("Introdueix un valor");
            val = Integer.parseInt(Entrada.readLine());
            if (val < 0) {
                System.out.println("No s'ha introduït cap valor positiu");
            }
            if (val >= 0) {
                while (val >= 0) {
                    dif = ancora - val;
                    dif = Math.abs(dif);
                    valorReal = val;
                    difPetita = val;
                    System.out.println("Introdueix un valor");
                    val = Integer.parseInt(Entrada.readLine());
                    difPetita = val;
                    if (val >= 0) {
                        valorReal1 = val;
                        dif1 = ancora - val;
                        dif1 = Math.abs(dif1);
                        if (dif < dif1) {
                            difPetita = dif;
                            difPetita = valorReal;
                        }
                        else if (dif > dif1) {
                            dif = dif1;
                            difPetita = dif;
                            difPetita = valorReal1;
                        }
                    }
                }
                System.out.println("El valor introduït més pròxim a " + ancora + " és " +  difPetita);
            }
        }
        else if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        }
    }
}

