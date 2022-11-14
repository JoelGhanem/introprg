//desenvolupa un programa que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());
        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());
        if (inici < 0) {
            inici = 0;
        }
        else if (inici > text.length()) {
            inici = (text.length()-1);
        }
        if (fi < 0) {
            fi = 0;
        }
        else if (fi > text.length()) {
            fi = (text.length()-1);
        }
        //cuando inicio es menor a fi
        if (inici < fi) {
            for (int num = inici; num <= fi; num ++) {
                System.out.println(text.charAt(num)); 
            }
            //cuando inici es igual o mayor a fi
        }else if (inici >= fi) {
            for (int num = inici; num >= fi; num --) {
                System.out.println(text.charAt(num));
            }
        }
    }
}
