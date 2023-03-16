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
		@Override
		public String aixecat() {	
				if (this.posicio.equals("assegut")) {
						setPosicio("dret");
						return "m'assec";
				} else if (estaDret()) {
						return "no faig res";
				} else {
						return "bai maitea, bai";
				}
		}
		@Override
		public String estirat() {	
				if (this.posicio.equals("assegut")) {
						setPosicio("estirat");
						return "m'estiro";
				} else if (estaEstirat()) {
						return "no faig res";
				} else {
						return "bai maitea, bai";
				}
		}
}


