/*Programa que fa de metge*/
public class metge {
    public static void main(String args[]) {
        System.out.println("Bon dia, en què puc ajudar-li?");
        String charla = Entrada.readLine();
        System.out.println("Presenta esternuts i mal de cap");
        String simptomes = Entrada.readLine();
        boolean si = true;
        si.toString();
        boolean no = false;
        no.toString();
        switch (simptomes) {
        case (simptomes.equal(si)): 
            System.out.println("Presenta vostè problemes d'estòmac a part dels esternuts i el mal de cap?");
                break;
            String malDePanxa = Entrada.readLine();
        case (malDePanxa.equals(si)): 
            System.out.println("Premi 1gr de paracetamol cada 8 hores i recordi beure molta aigua");
                break;  
        case (malDePanxa.equals(no)): 
            System.out.println("Premi 500mg d'àcid acetil salicílic (AAS) cada 6 horesi recordi prendre molta aigua");
                break;
        case (simptomes.equals(no)):
            System.out.println("Presenta molta tos?");
                break;
           String tos = Entrada.readLine();
        case (tos.equals(no)):
            System.out.println("Es vostè menor de 12 anys?");
                break;
            String edat = Entrada.readLine();
        case (edat.equals(no)):
            System.out.println("Premi un carmel d'eucaliptus cada 2 hores");
                break;
        case (edat.equals(si)):
            System.out.println("Prem un carmel de mel cada 2 hores");
                break;
        case (tos.equals(no)):
            System.out.println("Millor vingui el Dilluns a la meva consulta per realitzar un examen");
                break;
        }
    }
}
