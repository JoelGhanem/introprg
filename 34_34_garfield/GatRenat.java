/*La classe GatRenat es una subclasse de la classe Gat, En aquest cas te metodes que varien segons els arguments que rebin, ens serveix per vbeure com funciona el polimorfisme*/
class GatRenat extends Gat{
		private int vides = 7;
		private String posicio = "estirat";
		private String nom = "Renat";
		public GatRenat() {
		}
		public GatRenat(int vides) {
				this.vides = vides;
		}
		public GatRenat(String posicio) {
				this.posicio = posicio;
		}
		public GatRenat(int vides, String posicio) {
				this.vides = vides;
				this.posicio = posicio;
		}
		@Override
		public String getNom() {
				return this.nom;
		}
}
