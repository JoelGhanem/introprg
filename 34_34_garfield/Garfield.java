/*La classe Garfield es una subclasse de la calsse Gat, en aquest cas la utilitzem per fer experiments, encara que estiguio buida la fem servir per veure com afecta a l'execucio del programa*/
class Garfield extends Gat {
		private String nom;
		private String posicio;
		private int vides;
				public Garfield() {
						super("Garfield",9,"estirat");
			}
		//		public Garfield(String nom, int vides) {
		//				super(nom, vides);
		//		}
		public String getNom() {
				return this.nom;
		}
		@Override 
		public String getPosicio() {
				return this.posicio;
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
				if (estaAssegut()){
						//boolean algo = estaDret();
						//System.out.println("algo dret " +algo);
						setPosicio("dret");
				//System.out.println("despues del setter de aixecat "  +this.posicio);
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
				if (estaAssegut()) {
						setPosicio("estirat");
						//boolean algo = estaDret();
						//System.out.println("algo estirat " +algo);
				//System.out.println("despues del setter de estirat " + this.posicio);
						return "m'estiro";
				} else if (estaEstirat()) {
						return "no faig res";
				} else {
						return "Bai Maitea, bai";
				}
		}
		@Override
		public String seu() {
				//System.out.println(this.posicio);
				if (estaAssegut()) {
						//boolean algo = estaDret();
						//System.out.println("algo sentat " +algo);
						return "no faig res";
				} else {
						setPosicio("assegut");
				//System.out.println("despues del setter de seu " +this.posicio);
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
						//System.out.println("estaDret " + true);
						return true;
				} return false;
		}
		@Override
		public boolean estaAssegut() {
				if (this.posicio.equals("assegut")){
						//System.out.println("estaAssegut " + true);
						return true;
				} return false;
		}
		@Override
		public boolean estaEstirat() {
				if(this.posicio.equals("estirat")) {
						//System.out.println("estaEstirat " + true);
						return true;
				}
				return false;
		}
}


