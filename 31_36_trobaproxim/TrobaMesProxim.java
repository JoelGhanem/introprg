//Programa que te dice el valor mas proximo
public class TrobaMesProxim {
    public static void main(String[] args) {
        int ancora = 0;
        int val = 0;
        int dif = 0;
        int dif1 = 0;
        int difPetita = 0;
        int valorReal = -1;
        int valorReal1;
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
                dif = Math.abs(dif);
                valorReal = val;
                System.out.println("Introdueix un valor");
                val = Integer.parseInt(Entrada.readLine());
                dif1 = ancora - val;
                dif1 = Math.abs(dif1);
                valorReal1 = val;
                //este if es pq si no lo hago me detecta el valor -1 como un valor aceptable ya que el sistema hace todo el procedimiento antes de comprobar si el valor es positivo.
                if (val >= 0) 
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

            if (valorReal >= 0) {
                System.out.println("El valor introduït més pròxim a " + ancora + " és " +  difPetita);
            }
        }
        else if (ancora < 0) {
            System.out.println("Àncora no vàlida");
        }
    }
}
