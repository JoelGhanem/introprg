/*La classe GatRenat es una subclasse de la classe Gat, En aquest cas te metodes que varien segons els arguments que rebin, ens serveix per vbeure com funciona el polimorfisme*/
class GatRenat extends Gat{
		private int vides = 7;
		private String posicio = "estirat";
		private String nom = "Renat";
		public GatRenat() {
				super("Renat",7,"estirat");
		}
		public GatRenat(int vides) {
				super(7);
		}
		public GatRenat(String posicio) {
				super("estirat");
		}
		//public GatRenat(int vides, String posicio) {
				//super(7,"estirat");
		//}
		@Override
		public String getNom() {
				return this.nom;
		}
}
