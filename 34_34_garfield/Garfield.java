/*La classe Garfield es una subclasse de la calsse Gat, en aquest cas la utilitzem per fer experiments, encara que estiguio buida la fem servir per veure com afecta a l'execucio del programa*/
class Garfield extends Gat {
		private String nom = "Garfield";
		private String posicio = "estirat";
		private int vides = 9;
		public String getNom() {
				return this.nom;
		}
		@Override 
		public void setVides(int vides) {
				if(vides > 9) {
				} else {
						this.vides = vides;
				}
		}
}

