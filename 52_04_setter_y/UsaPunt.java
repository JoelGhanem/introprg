/*Aquesta classe ens mostra per pantalla els valors del punt x i y */ 
public class UsaPunt {
		public static void main(String[] args){
				Punt punt = new Punt();
				int x = 0;
				int y = 0;
				if (args.length == 2) {
						if(args[0] != null && !args[0].isEmpty() && UtilString.esEnter(args[0])) {
								x = Integer.parseInt(args[0]);
						}
						if( args[1] != null && !args[1].isEmpty() && UtilString.esEnter(args[1])) {
								y = Integer.parseInt(args[1]);
						}
				}
				punt.setX(x);
				punt.setY(y);
				System.out.printf("punt.getX() -> %d%n", punt.getX());
				System.out.printf("punt.getY() -> %d%n", punt.getY());
		}
}
