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
                    System.out.println(uno + " x " + tercer + " = " + uno*tercer);
                    System.out.println(uno + " x " + quart + " = " + uno*quart);
                }
            }
            else if (tercer == quart) {
                for (int uno = Integer.parseInt(args[0]); uno <= segon; uno++) { 
                    System.out.println(uno + " x " + tercer + " = " + uno*tercer);
                }
            }
        }
        else if (primer < segon) {
            for (int dos = Integer.parseInt(args[1]); dos >= primer; dos--) {
                System.out.println(dos + " x " + tercer + " = " + dos*tercer);
                System.out.println(dos + " x " + quart + " = " + dos*quart);
            }
        }
    }
}
