// martriculacion validada, tira de esta bb
public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        char i = 'I';
        char o = 'O';
        char u = 'U';
        char q = 'Q';
        char cero = matricula.charAt(0);
        char uno = matricula.charAt(1);
        char dos = matricula.charAt(2);
        char tres = matricula.charAt(3);
        char cuatro = matricula.charAt(4);
        char cinco = matricula.charAt(5);
        char seis = matricula.charAt(6);
        if (Character.isUpperCase(cero)) {
            if (Character.isUpperCase(uno)) {
                if (Character.isDigit(dos)) {
                    if (Character.isDigit(tres)) {
                        if (Character.isDigit(cuatro)) {
                            if (Character.isUpperCase(cinco)) {
                                if (Character.isUpperCase(seis)) {
                                    System.out.println("És una matrícula italiana vàlida");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
