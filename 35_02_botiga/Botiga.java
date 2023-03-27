/**/
public class Botiga {
		private int DEFAULT_MAX_VINS = 10;
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
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null)  {
								if (vins[i].equals(vi)) {
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
								if (vins[i].getNom().equals(elimina)) {
										vins[i] = null;
								}
						}
				}
				return null;
		}
		public Vi cerca(String nom) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null) {
								if (vins[i].getNom().equals(nom)) {
										return vins[i];
								}
						}
				}
				return null;
		}
}
