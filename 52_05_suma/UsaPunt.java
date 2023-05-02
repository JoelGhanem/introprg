/*Aquesta classe ens mostra per pantalla els valors del punt x i y */ 
public class UsaPunt {
		public static void main(String[] args){
				int x1 = 0;
				int y1 = 0;
				int x2 = 0;
				int y2 = 0;
				if (args.length == 1) {
						if(args[0] != null && !args[0].isEmpty() && UtilString.esEnter(args[0])) {
								x1 = Integer.parseInt(args[0]);
						}
				} 
				if (args.length == 2) {
						if( args[1] != null && !args[1].isEmpty() && UtilString.esEnter(args[1])) {
								y1 = Integer.parseInt(args[1]);
						}
				}
				if (args.length == 3) {
						if( args[3] != null && !args[3].isEmpty() && UtilString.esEnter(args[3])) {
								x2 = Integer.parseInt(args[3]);
						}
				}
				if (args.length == 4) {
						if( args[4] != null && !args[4].isEmpty() && UtilString.esEnter(args[4])) {
								y2 = Integer.parseInt(args[4]);
						}
				}
				Punt p1 = new Punt(x1,y1);
				Punt p2 = new Punt(x2,y2);
				p1.setX(x1);
				p1.setY(y1);
				p2.setX(x2);
				p2.setY(y2);
				System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
				System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
				p1.suma(p2);
				System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
		}
}
