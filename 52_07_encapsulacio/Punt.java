/*Aquesta classe ens restorna els valors dels punts x i y que son 0 */

public class Punt {
		private int[] coord = new int[2];
		//constructors
		public Punt() {
}
		public Punt(int punto1, int punto2) {
				this.coord[0] = punto1;
				this.coord[1] = punto2;
		}
		//getters
		public int getX() { return this.coord[0];}
		public int getY() { return this.coord[1];}
		//setters
		public void setX(int numero) {
				this.coord[0] = numero; 
		}
		public void setY(int numero) {
				this.coord[1] = numero; 
		}
		public void suma(Punt p) {
				coord[0] += p.coord[0];
				coord[1] += p.coord[1];
		}

		@Override
		public boolean equals(Object obj) {
				if (obj == this) {
						return true;
				}
				if (!(obj instanceof Punt)) {
						return false;
				}
				Punt otro = (Punt) obj;
				return this.coord[0] ==  otro.coord[0] && this.coord[1] == otro.coord[1];
		}
}
