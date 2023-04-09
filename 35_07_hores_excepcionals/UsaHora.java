/*Afquesta classe implementa la sortida pel programa Hora.java en el que es comprova si una hora es valida i en el cas de que ho sigui aplica la hora introudida*/
public class UsaHora {
    private static void canviaHora(Hora hora, int hores, int minuts, int segons) throws Exception{
			if (hores >= 0 && hores < 24) {
					hora.setHores(hores);
			} else {
					throw new Exception("hores fora de rang: " + hores);
			}
			if (minuts >= 0 && minuts < 60) {
					hora.setMinuts(minuts);
			} else {
					throw new Exception("minuts fora de rang: " + minuts);
			}
			if (segons >= 0 && segons < 60) {
					hora.setSegons(segons);
			} else {
					throw new Exception("segons fora de rang: " + segons);
			}
    }
    public static void main(String[] args) throws Exception{
        Hora hora = new Hora();
        System.out.println("Inicialment " + hora);
        System.out.println("Si intentem assignar a hores un -1");
        canviaHora(hora, -1, hora.getMinuts(), hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();
        System.out.println("Si intentem assignar a minuts un -1");
        canviaHora(hora, hora.getHores(), -1, hora.getSegons());
        System.out.println("El valor resultant és " + hora);
        System.out.println();
        System.out.println("Si intentem assignar a segons un -1");
        canviaHora(hora, hora.getHores(), hora.getMinuts(), -1);
        System.out.println("El valor resultant és " + hora);
        System.out.println();
    }
}
