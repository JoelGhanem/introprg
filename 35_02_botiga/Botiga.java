/**/
public class Botiga {
		private int DEFAULT_MAX_VINS = 10;
		private Vi[] vins;
		public Botiga() {
		}
		public Botiga(int maxVins) {
		}
		public Vi afegeix(Vi vi){
				for (int i = 0; i < vins.length; i++) {
						if (vins[i].equals(vi)) {
								return null;
						}
				}
				for(int i = 0; i < vins.length; i++) {
						if(vins[i] == null) {
								vins[i] = vi;
						}
				}
				return null;
		}
		public Vi elimina(String elimina) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i].equals(elimina)) {
								vins[i] = null;
						}
				}
				return null;
		}
		public Vi cerca(String nom) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i].equals(nom)) {
								return vins[i];
						}
				}
				return null;
		}
}
