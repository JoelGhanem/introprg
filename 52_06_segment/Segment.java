/*Crea la classe Segment que contingui dos instàncies de Punt, amb dos constructors, el per defecte i un que defineixi les coordenades dels dos punts. A banda, inclou accessors i el mètode longitud que torna la longitud del segment segons la fórmula: longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));*/
public class Segment {
		private Punt p1;
		private Punt p2;
	int x1 = 0; 
	int y1 = 0; 
	int x2 = 0; 
	int y2 = 0; 
		//constructor
		public Segment() {
				this(new Punt(), new Punt());
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
		//int x1 = p1.getX();
		//int y1 = p1.getY();
		//int x2 = p2.getX();
		//int y2 = p2.getY();
				double longitud = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
				return longitud;
		}
		@Override
		public String toString() {
				return String.format("(%f,%f)%n",x1,y1);
		}
}
