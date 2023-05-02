/*Crea la classe Segment que contingui dos instàncies de Punt, amb dos constructors, el per defecte i un que defineixi les coordenades dels dos punts. A banda, inclou accessors i el mètode longitud que torna la longitud del segment segons la fórmula: longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));*/
public class Segment {
		private Punt p1;
		private Punt p2;
		public int x1 = p1.getX();
		public int y1 = p1.getY();
		public int x2 = p2.getX();
		public int y2 = p2.getY();
		//constructor
		public Segment() {
		}
		public Segment(Punt p1, Punt p2) {
				this.p1 = p1;
				this.p2 = p2;
		}
		//getters
		public Punt getP1() { return this.p1;}
		public Punt getP2() { return this.p2;}
		//setters 
		public void setP1(Punt p1) { this.p1 = p1;}
		public void setP2(Punt p2) { this.p2 = p2;}
		//Otros
		public Double longitud() {
				double longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
				return longitud;
		}
		@Override
		public String toString() {
				return "";
		}
}
