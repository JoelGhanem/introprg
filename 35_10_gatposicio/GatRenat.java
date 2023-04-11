/*Aquesta classe sera el nostre gat renat que conte una posicio i 2 constructors apart d un getter i 2 setter*/
public class GatRenat {
		private GatPosicio posicio;

		//constructors
		public GatRenat(GatPosicio posicio) {
				this.posicio = posicio;
		}
		public GatRenat(String algo) {
				this.posicio = algo;
		}

		//getter
		public GatPosicio getPosicio() { return this.posicio; }

		//setters
		public void setPosicio(GatPosicio posicio) {
				this.posicio = posicio;
		}
		public void setPosicio(String algo) {
				this.posicio = algo;
		}
}
