/*Programa que fa de metge*/
/*Per facilitar-te el treball de comprovació les opcions que hi han són
 * No
 * No i No
 * No i Sí i No
 * No i Sí i Sí
 * Sí
 * Sí i No
 * Sí i Sí
 * un 10 em faría el día la veritat :)*/
public class metge {
    public static void main(String[] args) {
        System.out.println("Bon dia");
        System.out.println("Presenta vostè esternuts i mal de cap");
        String simptomes = Entrada.readLine();
        if (simptomes.equals ("Sí")) {
            System.out.println("Presenta vostè problemes d'estòmac a part dels esternuts i el mal de cap?");
        }   String malDePanxa = Entrada.readLine();
        if (simptomes.equals("Sí") && (malDePanxa.equals("Sí"))) {
            System.out.println("Premi 1gr de paracetamol cada 8 hores i recordi beure molta aigua");
            System.out.println("Ádeu, que vagi molt bé, espero que millori aviat");
        }if (simptomes.equals("Sí") && (malDePanxa.equals("No"))) {
             System.out.println("Premi 500mg d'àcid acetil salicílic (AAS) cada 6 hores i recordi prendre molta aigua");
            System.out.println("Ádeu, que vagi molt bé, espero que millori aviat");
        }   
        if (simptomes.equals("No")) {
            System.out.println("Presenta molta tos?");
        }   String tos = Entrada.readLine();
        if (simptomes.equals("No") && (tos.equals("Sí"))) {
            System.out.println("Es vostè menor de 12 anys?");
        }   String edat = Entrada.readLine();
        if (tos.equals("Sí") && (edat.equals("No"))) {
            System.out.println("Premi un carmel d'eucaliptus cada 2 hores");
            System.out.println("Ádeu, que vagi molt bé, espero que millori aviat");
        }   else if (tos.equals("Sí") && (edat.equals("Sí"))) {
            System.out.println("Prem un carmel de mel cada 2 hores");
            System.out.println("Ádeu, que vagi molt bé, espero que millori aviat");
        }   else if (simptomes.equals("No") && (tos.equals("No"))) {
            System.out.println("Millor vingui el Dilluns a la meva consulta per realitzar un examen");
        }
    }
}

