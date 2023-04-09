/*Classe hora que incorpora els metodes getHores,minuts i segons a mes de els metodes setHores,minuts,segons i e metode toString*/
public class Hora {
		private int hores; 
		private int minuts;
		private int segons; 
		//Constructors
		public Hora() {
				hores = 0;
				minuts = 0;
				segons = 0;
		}
		public Hora(int hores, int minuts, int segons) throws IllegalArgumentException{
				if (hores > 23 || hores < 0) {
						this.hores = 0;
						throw new IllegalArgumentException("hores fora de rang: " + hores);
				} else {
						this.hores = hores;
				}
				if (minuts > 59 || minuts < 0) {
						this.minuts = 0;
						throw new IllegalArgumentException("minuts fora de rang: " + minuts);
				} else {
						this.minuts = minuts;
				}
				if (segons > 59 || segons < 0) {
						this.segons = 0;
						throw new IllegalArgumentException("segons fora de rang: " + segons);
				} else {
						this.segons = segons;
				}
		}

		//Getters
		public int getHores() { return this.hores; }
		public int getMinuts() { return this.minuts; }
		public int getSegons() { return this.segons; }

		//Setters
		public void setHores(int hores) throws Exception{
				if (hores >= 0 && hores < 24) {
						this.hores = hores;
				} else {
						throw new Exception("hores fora de rang: " + hores);
				}
		}
		public void setMinuts(int minuts) throws Exception{
				if (minuts >= 0 && minuts < 60) {
						this.minuts = minuts;
				} else {
						throw new Exception("minuts fora de rang: " + minuts);
				}
		}
		public void setSegons(int segons) throws Exception{
				if (segons >= 0 && segons < 60) {
						this.segons = segons;
				} else {
						throw new Exception("segons fora de rang: " + segons);
				}
		}
		@Override
		public String toString() {
				return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
		}
}
