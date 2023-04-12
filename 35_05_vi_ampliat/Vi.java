/*Una botiga de vi sense vi no és res. Així que començarem implementant aquesta classe tant important. Aquesta classe es la classe Vi on veiem els noms, els preus i la quantitat d'estoc segones el vi*/
public class Vi {
		private String ref;
		private String nom;
		private int preu;
		private int estoc = 0;
		private String lloc;
		private String origen;
		private String tipus;
		private String collita;

		//constructors
		public Vi(String referencia, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
				this.referencia = referencia;
				this.nom = normalitzaString(nom);
				if (preu > 0) {
						this.preu = preu;
				} else {
						this.preu = -1;
				}
				if (estoc > 0) {
						this.estoc = estoc;
				} else {
						this.estoc = -1;
				}
				this.lloc = lloc;
				this.origen = origen;
				this.tipus = tipus;
				this.collita = collita;
		}

		//getters
		public String getRef() {return this.ref;}

		public String getNom() { return this.nom; }

		public int getPreu() { return this.preu; }

		public int getEstoc() { return this.estoc; }

		public String getLloc() {return this.lloc;}

		public String getOrigen() { return this.origen;}

		public String getTipus() { return this.tipus;}

		public String collita() { return this.collita;}

		//setters
		public void setRef(String ref) {
				this.ref = ref;
		}

		public void setNom(String nom){
				this.nom = nom;
		}
		public void setPreu(int preu) {
				if (preu > 0) {
						this.preu = preu;
				}
		}

		public void setEstoc(int estoc) {
				if (estoc > 0) {
						this.estoc = estoc;
				}
		}

		public void setLloc(String lloc) {
				this.lloc = lloc;
		}
	
		public void 
		//altres
		public boolean esValid() {
				if (getPreu() < 0) {
						return false;
				}
				if (getEstoc() < 0) {
						return false;
				}
				if (nom.equals("null")) {
						return false;
				}
				return true;
		}

		public static String normalitzaString(String nom) {
				String nomBien;
				nom.trim();
				if (nom.isEmpty()) {
						nom = "null";
						return nom;
				}
				if (nom.isBlank()) {
						nom = "null";
						return nom;
				}
				nomBien = nom.trim().replaceAll("\\s+", " ");
				return nomBien;
		}

		@Override 
		public String toString() {
				String paraula = String.format("%n    Vi: %s%n    Preu: %d%n    Estoc: %d%n" ,this.nom,preu,estoc);
				return paraula;
		}
		public static Vi deArrayString(String[] strings) {
				if(strings.length != 7 || !UtilString.esEnter(strings[1]) || !UtilString.esEnter(strings[2])) { return null; }
				if(Integer.parseInt(strings[1]) < 0) { return null;}
				if(Integer.parseInt(strings[2]) < 0) { return null;}
				Vi vinito = new Vi();
				vinito.setNom(normalitzaString(strings[0]));
				vinito.setPreu(Integer.parseInt(strings[1]));
				vinito.setEstoc(Integer.parseInt(strings[2]));
				vinito.set
				if(vinito.esValid()) {
						return vinito;
				}
				return null;
		}

		public String[] aArrayString() {
				String[] strings = new String[3];
				strings[0] = this.nom;
				strings[0] = this.nom;
				strings[1]= Integer.toString(this.preu);
				strings[2] = Integer.toString(this.estoc);
				return strings;
		}
}
