/*En aquest exercici consisteix en fer un programa que analitzi els texts que es passen per la línia de comandes i distingeixi si són o no enters.*/
public class Arguments {
    public static void main(String[] args){
        for (int k = 0; k < args.length; k++) {
            String text = args[k];
            if (text.isEmpty()){
                System.out.println("Cap argument");
            } else {
                String part = "";
                for (int i = 0; i < text.length(); i++) {
                    if (Character.isWhiteSpace(text.charAt(i))) {
                        for (int j = i + 1; j < text.length(); j++) {
                            if (Character.isWhiteSpace(text.charAt(j))) {
                                int inici = text.charAt(i);
                                int fi = text.charAt(j);
                                UtilString.intervalString(text, inici, fi);
                                String interval = UtilString.intervalString(text, inici, fi);
                                UtilString.esEnter(interval);
                                int contador = 0;
                                if (UtilString.esEnter(interval)) {
                                    System.out.println("[" + contador + "] \"" + interval + "\": és enter");
                                } else {
                                    System.out.println("[" + contador + "] \"" + interval + "\": no és enter");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
