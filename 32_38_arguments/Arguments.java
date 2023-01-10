/*En aquest exercici consisteix en fer un programa que analitzi els texts que es passen per la línia de comandes i distingeixi si són o no enters.*/
public class Arguments {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Cap argument");
        } else {
            String enter = "";
            for (int i = 0; i < args.length; i++) {
                if (UtilString.esEnter(args[i])) {
                    System.out.println("[" + i + "] \"" + args[i] + "\": és enter");
                } else {
                    System.out.println("[" + i + "] \"" + args[i] + "\": no és enter");
                }
            }
        }
    }
}
