/*Programa que genera un especialista en refredats virtual*/
public class metgevirtual {
    public static void main(String[] args) {
        System.out.println("Bon dia, Sr o Sra, en que puc ajudar-li?");
        String charlaInutil = Entrada.readLine();
        System.out.println("Estaré encantat d'ajudar-li amb " + charlaInutil);
        System.out.println("Presenta esternuts i mal de cap?");
        String simptomes = Entrada.readLine();
            /*Declaro la variable simptomes per distingir entre a, b i c*/ 
        if (simptomes.equals("Sí")) {
            System.out.println("A banda del mal de cap i la tos presenta mal d'estómac?");
           /*Declaro la variable malDEstomac per poder treballar la part mes petita del problema*/
        String malDEstomac = Entrada.readLine();
         if (malDEstomac.equals("Sí"))    
            System.out.println("Premi un paracetamol d'un gram cada 8 hores i begui molta aigua");
        } else if (malDEstomac.equals("No")) {
            System.out.println("Premi 500mg d'àcid acetil salicílic (AAS) cada 6 hores");
        } else if (simptomes.equals("No")) {
            System.out.println("Presenta molta tos?");
        String tos = Entrada.readLine();
        } else if (tos.equals("Sí")) {
            /*Declaro la variable edat per distingir entre el menor de 12 i el major*/
            System.out.println("Tens més de 12 anys?");
        String edat = Entrada.readLine();
        } else if (edat.equals("Sí")) {
            System.out.println("Premi un carmel d'eucaliptus");
        } else if (edat.equals("No")) {
            System.out.println("Prem un carmel de mel");
        } else if (tos.equals("No")) {
            System.out.println("Crec que será millor que vingui a la meva consulta per poder fer un exàmen complert");
        }
    }
}
