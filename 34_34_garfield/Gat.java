/*Classe Gat que es la classe mare de GAtRenat i Garfield, en aquest exercici aprenem a utilitzar el polimorfisme, que es una de les bases de la POO.*/
class Gat {
		private String nom = "gat";
		private int vides = 7;
		private String posicio = "estirat";
		public Gat() {
		}
		public Gat(String nom) {
				this.nom = nom;
		}
		public Gat(int vides) {
				this.vides = vides;
		}
		public Gat(String nom, String posicio) {
				this.nom = nom;
				this.posicio = posicio;
		}
		public Gat (String nom, int vides) {
				this.nom = nom;
				this.vides = vides;
		}
		public Gat(String nom, int vides, String posicio) {
				this.nom = nom;
				this.vides = vides;
				this.posicio = posicio;
		}
		public String getNom() {
				return this.nom;
		}
		public int getVides() {
				return this.vides;
		}
		public void setVides(int vides) {
				this.vides = vides;
		}
		public String getPosicio() {
				return this.posicio;
		}
		public String setPosicio(String posicio) {
				this.posicio = posicio;
				return posicio;
		}
		public boolean estaViu() {
				return getVides() > 0;
		}
		public boolean estaDret() {
				return this.posicio.equals("dret");
		}
		public boolean estaAssegut() {
				return this.posicio.equals("assegut");
		}
		public boolean estaEstirat() {
				return this.posicio.equals("estirat");
		}
		public String aixecat() {
				if (estaDret()) {
						return  "no faig res";
				} else { 
						setPosicio("dret");
						return  "m'aixeco"; 
				}
		}
		public String seu() {
				if (estaAssegut()) {
						return  "no faig res";
				} else { 
						setPosicio("assegut");
						return  "m'assec";
				}
		}
		public String estirat() {
				if (estaEstirat()) {
						return "no faig res";
				} else { 
						setPosicio("estirat");
						return "m'estiro";
				}
		}
}