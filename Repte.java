// avionsito de for
public class Repte {
    public static void main(String[] args) {
        // ALA SUPERIOR
        for (int li = 1; li < 7; li++) {
            for (int co = li; co > 0; co--) {
                System.out.print("|");
            }
            //TORRES
            for (int torre = li; torre < 86; torre++) {
                if ( torre < 55) {
                    System.out.print(" ");
                } else if (torre > 55 && torre < 67) { 
                    System.out.print("|");
                } else if (torre >= 67 && torre < 74) {
                    System.out.print(" ");
                } else  {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        //CUERPO
        for (int li = 0; li < 4; li++) {
            for (int col = 30; col > 0; col--) {
                System.out.print("*");
            }
            // CABEZA
            for (int cap = 0; cap < (li * 3); cap++) {  
                System.out.print("*");
            }
            //TORRES
            for (int torre = (li * 3); torre < 56; torre++) {
                if (torre < 25) {
                    System.out.print(" ");
                } else if (torre > 25 && torre < 37) { 
                    System.out.print("|");
                } else if (torre >= 37 && torre < 44) {
                    System.out.print(" ");
                } else  {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        // ALA INFERIOR
        for (int li = 7; li > 0; li--) {
            for (int co = 1; co <= li; co++) {
                System.out.print("|");
            }
            //TORRES
            for (int torre = li; torre < 86; torre++) {
                if ( torre < 55) {
                    System.out.print(" ");
                } else if (torre > 55 && torre < 67) { 
                    System.out.print("|");
                } else if (torre >= 67 && torre < 74) {
                    System.out.print(" ");
                } else  {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
