 /*Programa que et demana el pis en el que et trobes i et diu el nou pis*/
public class Ascensor {
    public static void main(String[] args) {
        System.out.println("Bon dia");
        System.out.println("Presenta mal de cap i esternuts?");
        String simptomes = Entrada.readLine();
        if (simptomes.equals("Sí")) {
            System.out.println("Presenta vostè problemes d'estòmac a part del mal de cap i els esternuts");
        String malDePanxa = Entrada.readLine;
        }   else if (simptomes.equals("Sí") && (malDePanxa.equals("Sí"))) {
                System.out.println("Premi 1gr de Paracetamol cada 8 hores i recordi beure molta aigua");
        }   else if (simptomes.equals("Sí") && (malDePanxa.equals("No"))) {
                System.out.println("Premi 500mg d'àcid acetil salicílic (AAS) cada 6 hores     i recordi prendre molta aigua");
        }   else if (simptomes.equals("No")) {
                System.out.println("Presenta molta tos");
        String tos = Entrada.readLine;
        }   else if (simptomes.equals("No") && (tos.equals("Sí"))) {
                System.out.println("Es vostè menor de 12 anys?");
        String edat = Entrada.readLine;
        }   else if (edat.equals("No") && (tos.equals("Sí"))) {
                System.out.println("Premi un carmel d'eucaliptus cada 2 hores");
        }   else if (edat.equals("Sí") && (tos.equals("Sí"))) {
                System.out.println("Prem un carmel de mel cada 2 hores");
        }   else if (simptomes.equals("No") && (tos.equals("No"))) {
                System.out.println("Millor vingui el Dilluns a la meva consulta per realit    zar un examen");
        }
    }
}
