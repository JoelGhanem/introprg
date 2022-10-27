//multiplicaciones 
public class TaulaMultiplicar {
    public static void main(String[] args) {
        System.out.println("El primer argument és " + args[0]);
        int primer = Integer.parseInt(args[0]);
        System.out.println("El segon argument és  " + args[1]);
        int segon = Integer.parseInt(args[1]);
        System.out.println("El tercer argument és " + args[2]);
        int tercer = Integer.parseInt(args[2]);
        System.out.println("El quart argument és  " + args[3]);
        int quart = Integer.parseInt(args[3]);
        if (primer >= segon) {
            if (tercer != quart) {
                for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) { 
                    System.out.println(uno + " x " + tercer + " = " + uno*tercer);
                    System.out.println(uno + " x " + quart + " = " + uno*quart);
                }
            }
            if (tercer == quart) {
                for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) { 
                    System.out.println(uno + " x " + tercer + " = " + uno*tercer);
                }
            }
        }
        else if (!(primer < segon)) {
            for (int dos = Integer.parseInt(args[1]); dos <= primer; dos++) {
                System.out.println(dos + " x " + tercer + " = " + dos*tercer);
                System.out.println(dos + " x " + quart + " = " + dos*quart);
            }
        }
    }
}
