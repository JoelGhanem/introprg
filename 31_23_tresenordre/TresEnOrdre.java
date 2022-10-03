public class TresEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segonr?");
        int segon = Integer.parseInt(Entrada.readLine());

        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());

    if (primer > segon && segon > tercer) {
        System.out.println(tercer + "," + segon + " i " + primer);

        }

    else if (primer > tercer && tercer > segon) {
        System.out.println(segon + "," + tercer + " i " + primer);

        }


    else if (segon > primer && primer > tercer) {
        System.out.println(tercer + "," + primer + " i " + segon);

        }
    else if (segon > tercer && tercer > primer) {
        System.out.println(primer + "," + tercer + " i " + segon);

        }

    else if (tercer > primer && primer > segon) {
        System.out.println(segon + "," + primer + " i " + tercer);

        }  
    else if (tercer > segon && segon > primer) {
        System.out.println(primer + "," + segon + " i " + tercer);
        }
    }
}
