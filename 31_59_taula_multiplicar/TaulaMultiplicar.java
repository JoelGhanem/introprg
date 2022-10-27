//multiplicaciones 
public class TaulaMultiplicar {
    public static void main(String[] args) {
        int primer = Integer.parseInt(args[0]);
        int segon = Integer.parseInt(args[1]);
        int tercer = Integer.parseInt(args[2]);
        int quart = Integer.parseInt(args[3]);
        if (primer >= segon) {
            if (tercer != quart) {
                for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) { 
                    for (int dos = Integer.parseInt(args[2]); dos <= quart; dos++) {
                        System.out.println(uno + " x " + tercer + " = " + uno*dos);
                    }
                }
            }
        }
        else if (primer < segon) {
            if (tercer > quart) {
                for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) {
                    for (int dos = Integer.parseInt(args[2]); dos >= quart;  dos++) {
                        System.out.println(uno + " x " + tercer + " = " + uno*dos);
                        System.out.println(uno + " x " + quart + " = " + uno*dos);
                    }
                }
            }
        }
    }
}
