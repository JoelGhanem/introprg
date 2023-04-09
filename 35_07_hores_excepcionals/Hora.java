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
		public Hora(int hores, int minuts, int segons) {
				if (hores > 23 || hores < 0 || minuts >= 60 || minuts < 0 || segons >= 60 || segons < 0) {
						this.hores = 0;
						this.minuts = 0;
						this.segons = 0;
				} else {
						this.hores = hores;
						this.minuts = minuts;
						this.segons = segons;
				}
		}

		//Getters
		public int getHores() { return this.hores; }
		public int getMinuts() { return this.minuts; }
		public int getSegons() { return this.segons; }

		//Setters
		public void setHores(int hores) {
				if (hores >= 0 && hores < 24) {
						this.hores = hores;
				}
		}
		public void setMinuts(int minuts) {
				if (minuts >= 0 && minuts < 60) {
						this.minuts = minuts;
				}
		}
		public void setSegons(int segons) {
				if (segons >= 0 && segons < 60) {
						this.segons = segons;
				}
		}
		@Override
		public String toString() {
				return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
		}
}
