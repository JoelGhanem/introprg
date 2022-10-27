//multiplicaciones 
public class TaulaMultiplicar {
    public static void main(String[] args) {
        int primer = Integer.parseInt(args[0]);
        int segon = Integer.parseInt(args[1]);
        int tercer = Integer.parseInt(args[2]);
        int quart = Integer.parseInt(args[3]);
        if (primer >= segon) {
            for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) { 
                if (tercer <= quart) {
                    for (int dos = Integer.parseInt(args[2]); dos <= quart; dos++) {
                        System.out.println(uno + " x " + dos + " = " + uno*dos);
                    }
                }
                if (tercer > quart) {
                    for (int dos = Integer.parseInt(args[3]); dos >= quart; dos--) {
                        System.out.println(uno + " x " + dos + " = " + uno*dos);
                    }
                }
            }
        }
        if (primer < segon) {
            for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) {
                if (tercer <= quart) {
                    for (int dos = Integer.parseInt(args[2]); dos <= quart; dos++) {
                        System.out.println(uno + " x " + dos + " = " + uno*dos);
                    }
                }
            }
        }
    }
}
