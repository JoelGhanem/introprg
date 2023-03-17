/*La classe Garfield es una subclasse de la calsse Gat, en aquest cas la utilitzem per fer experiments, encara que estiguio buida la fem servir per veure com afecta a l'execucio del programa*/
class Garfield extends Gat {
		private String nom = "Garfield";
		private String posicio = "estirat";
		private int vides = 9;
		//		public Garfield() {
		//				super();
		//		}
		//		public Garfield(String nom, int vides) {
		//				super(nom, vides);
		//		}
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
				//System.out.println(this.posicio);
				if (this.posicio.equals("assegut")) {
						setPosicio("dret");
						return "m'aixeco";
				} else if (estaDret()) {
						return "no faig res";
				} else {
						return "Bai Maitea, bai";
				}
		}
		@Override
		public String estirat() {	
				//System.out.println(this.posicio);
				if (this.posicio.equals("assegut")) {
						setPosicio("estirat");
						return "m'estiro";
				} else if (estaEstirat()) {
						return "no faig res";
				} else if(this.posicio.equals("dret")){
						return "Bai Maitea, bai";
				} else {
						return "a ver";
				}
		}
		@Override
		public String setPosicio(String posicio) {
				this.posicio = posicio;
				return posicio;
		}
		@Override 
		public boolean estaDret() {
				return this.posicio.equals("dret");
		}
		@Override
		public boolean estaAssegut() {
				return this.posicio.equals("assegut");
		}
		@Override
		public boolean estaEstirat() {
				return this.posicio.equals("estirat");
		}
}


