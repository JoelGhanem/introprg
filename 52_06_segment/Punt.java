/*Aquesta classe ens restorna els valors dels punts x i y que son 0 */
public class Punt {
		private int x = 0;
		private int y = 0;
		//constructors
		public Punt() {
				}
		public Punt(int x, int y) {
				this.x = x;
				this.y = y;
		}
		//getters
		public int getX() { return this.x;}
		public int getY() { return this.y;}
		//setters
		public void setX(int numero) {
				this.x = numero;
		}
		public void setY(int numero) {
				this.y = numero;
		}
		public void suma(Punt p) { x+=p.x; y+=p.y;}
}
