/*Classe hora que incorpora els metodes getHores,minuts i segons a mes de els metodes setHores,minuts,segons i e metode toString*/
public class Hora {
		private int hores;
		private int minuts;
		private int segons;
		public Hora() {
				hores = this.hores;
				minuts = this.minuts;
				segons = this.segons;
		}
		public int getHores() { return this.hores; }
		public int getMinuts() { return this.minuts; }
		public int getSegons() { return this.segons; }

		public boolean setHores(int hores) {
				if (hores >= 0 && hores <= 24) {
						this.hores = hores;
						return true;
				}
				return false;
		}
		public boolean setMinuts(int minuts) {
				if( minuts >=0 && minuts <60) {
						this.minuts = minuts;
						return true;
				}
				return false;
		}
		public boolean setSegons(int segons) {
				if (segons >= 0 && segons <60) {
						this.segons = segons;
						return true;
				}
				return false;
		}
}
