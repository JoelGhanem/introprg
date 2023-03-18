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
				System.out.println(this.posicio);
				if (estaAssegut()){
						setPosicio("dret");
				System.out.println("despues del setter de aixecat "  +this.posicio);
						return "m'aixeco";
				} else if (estaDret()) {
						return "no faig res";
				} else {
						return "Bai Maitea, bai";
				}
		}
		@Override
		public String estirat() {	
				System.out.println(this.posicio);
				if (this.posicio.equals("assegut")) {
						this.posicio = "estirat";
				System.out.println("despues del setter de estirat " + this.posicio);
						return "m'estiro";
				} else if (estaEstirat()) {
						return "no faig res";
				} else {
						return "Bai Maitea, bai";
				}
		}
		@Override
		public String seu() {
				System.out.println(this.posicio);
				if (estaAssegut()) {
						return "no faig res";
				} else {
						setPosicio("assegut");
				System.out.println("despues del setter de seu " +this.posicio);
						return "m'assec";
				}
		}
		@Override
		public void setPosicio(String posicio) {
				this.posicio = posicio;
		}
		@Override 
		public boolean estaDret() {
				if(this.posicio.equals("dret")) {
						return true;
				} return false;
		}
		@Override
		public boolean estaAssegut() {
				if (this.posicio.equals("assegut")){
						return true;
				} return false;
		}
		@Override
		public boolean estaEstirat() {
				if(this.posicio.equals("estirat")) {
						return true;
				}
				return false;
		}
}


