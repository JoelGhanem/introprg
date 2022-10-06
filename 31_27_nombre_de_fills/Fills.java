/*Programa que et demana quants fills tens i et respon segons el nombre*/
public class Fills {
    public static void main(String[] args) {
    System.out.println("Quants fills tens?");
    int numFills = Integer.parseInt(Entrada.readLine());
    switch (numFills) {
        case -1:
            System.out.println("No pots tenir menys de 0 fills!");
                break;
        case 0:
            System.out.println("Tot el que t'has estalviat en bolquers!");
                break;
        case 1:
            System.out.println("Compte de no mimar-lo massa!");
                break;
        case 2:
            System.out.println("No t'avorreixes a casa, eh?");
                break;
        case 4: 
            System.out.println("No t'avorreixes a casa, eh?");
                break;
        case 5: 
            System.out.println("Tu sí fas país!");
                break;
}    
}
}
