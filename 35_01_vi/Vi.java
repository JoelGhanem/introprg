/*Una botiga de vi sense vi no és res. Així que començarem implementant aquesta classe tant important.*/
public class Vi {
		private String nom;
		private int preu;
		private int estoc = 0;

		//constructors
		public Vi(String nom, int preu) {
				this.nom = normalitzaNom(nom);
				//System.out.println("nom despues del normaliza " + nom);
				//System.out.println("nom despues del normaliza " + this.nom);
				if (preu > 0) {
						this.preu = preu;
				} else {
						this.preu = -1;
				}
		}
		public Vi(String nom, int preu, int estoc) {
				String nombreBien;
				nombreBien = normalitzaNom(nom);
				//System.out.println("nom despues del normaliza " + nom);
				this.nom = nombreBien;
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
		}

		//getters
		public String getNom() { return this.nom; }

		public int getPreu() { return this.preu; }

		public int getEstoc() { return this.estoc; }

		//setters
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
		//altres
		public boolean esValid() {
				if (getPreu() < 0) {
						return false;
				}
				if (getEstoc() < 0) {
						return false;
				}
				if (nom.equals("NOM NO VÀLID!")) {
						return false;
				}
				return true;
		}

		public static String normalitzaNom(String nom) {
				String nomBien;
				nom.trim();
				if (nom.isEmpty()) {
						nom = "NOM NO VÀLID!";
						return nom;
				}
				if (nom.isBlank()) {
						nom = "NOM NO VÀLID!";
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
}
