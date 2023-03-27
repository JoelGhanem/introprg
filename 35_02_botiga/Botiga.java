/**/
public class Botiga { private int DEFAULT_MAX_VINS = 10;
		private Vi[] vins = new Vi[10];
		public Botiga() {
		}
		public Botiga(int maxVins) {
				this.vins = new Vi[maxVins];
		}
		public Vi afegeix(Vi vi){
				if (vi.getPreu() < 0) {
						return null;
				}
				if (vi.getEstoc() < 0) {
						return null;
				}
				if (vi.getNom().equals("NOM NO VÀLID!")) {
						return null;
				}
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null)  {
								if (vins[i].getNom().equals(vi.getNom())) {
										return null;
								}
						}
				}
				for(int i = 0; i < vins.length; i++) {
						if(vins[i] == null) {
								vins[i] = vi;
								return vins[i];
						}
				}
				return null;
		}
		public Vi elimina(String elimina) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null) {
								String nomEnMinuscules = vins[i].getNom().toLowerCase();
								String nomBuscatEnMinuscules = elimina.toLowerCase();
								if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
										Vi vinito = new Vi();
										vinito = vins[i];
										vins[i] = null;
										return vinito;
								}
						}
				}
				return null;
		}
		public Vi cerca(String nom) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null) {
								String nomNormalitzat = Vi.normalitzaNom(vins[i].getNom());
								String nomBuscadorNormalitzat = Vi.normalitzaNom(nom);
								if (nomNormalitzat.equals(nomBuscadorNormalitzat)) {
										return vins[i];
								}
								String nomEnMinuscules = vins[i].getNom().toLowerCase();
								String nomBuscatEnMinuscules = nom.toLowerCase();
								if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
										return vins[i];
								}
						}
				}
				return null;
		}
}
