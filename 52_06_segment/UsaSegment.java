/*Aquesta classe ens permet veure les longituds dels segments*/ 
public class UsaSegment {
		public static void main(String[] args){
				int x1 = 0;
				int y1 = 0;
				int x2 = 0;
				int y2 = 0;

				if (args.length > 0) {
						if(args[0] != null && !args[0].isEmpty() && UtilString.esEnter(args[0])) {
								x1 = Integer.parseInt(args[0]);
						}
				} 
				if (args.length > 1) {
						if( args[1] != null && !args[1].isEmpty() && UtilString.esEnter(args[1])) {
								y1 = Integer.parseInt(args[1]);
						}
				}
				if (args.length > 2) {
						if( args[2] != null && !args[2].isEmpty() && UtilString.esEnter(args[2])) {
								x2 = Integer.parseInt(args[2]);
						}
				}
				if (args.length > 3) {
						if( args[3] != null && !args[3].isEmpty() && UtilString.esEnter(args[3])) {
								y2 = Integer.parseInt(args[3]);
						}
				}

				Punt punt1 = new Punt(x1, y1);
				Punt punt2 = new Punt(x2, y2);
				Segment segment1 = new Segment(punt1, punt2);
				Segment segment2 = new Segment();
				segment2.setP1(segment1.getP2());
				segment2.setP2(segment1.getP1());
				System.out.printf("p1: Punt(%d, %d)%n", punt1.getX(),punt1.getY());
				System.out.printf("p2: Punt(%d, %d)%n", punt2.getX(),punt2.getY());
				System.out.printf("s1:  s1.longitud: %.02f%n",  segment1.longitud());
				System.out.printf("s2:  s2.longitud: %.02f%n",  segment2.longitud());
		}
}
