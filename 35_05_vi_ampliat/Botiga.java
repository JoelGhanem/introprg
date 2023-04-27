/*Aqui fem una classe per la botiga de vins on afegim vins eliminem vins i cerquem vins per poder tenir un control sobre la quantitat de vins de la botiga*/
public class Botiga { 
		private int DEFAULT_MAX_VINS = 10;
		private Vi[] vins = new Vi[10];
		public Botiga() {
		}
		public Botiga(int maxVins) {
				this.vins = new Vi[maxVins];
		}
		public Vi afegeix(Vi vi){
				boolean plena = true;
				for (int i = 0; i < 10; i++) {
						if(vins[i] == null) {
								plena = false;
						}
				}
				if (plena) {return null;}
				if (!vi.esValid()) { return null;}
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
								/*normalitzem els noms dels vins*/
								String eliminaNormalitzat = Vi.normalitzaString(elimina);
								String nomNormalitzat = Vi.normalitzaString(vins[i].getRef());
								String nomEnMinuscules = nomNormalitzat.toLowerCase();
								/*passem a minuscules els noms dels vins*/
								String nomBuscatEnMinuscules = eliminaNormalitzat.toLowerCase();
								if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
										//creo una copia del vino que hay que borrar
										Vi vinito = new Vi("","",-1,-1,"","","","");
										vinito = vins[i];
										if (vinito.getEstoc() < 0) {
												return null;
										}
										//borro el vino del array
										vins[i] = null;
										//devuelvo el vino que he borrado
										return vinito;
								}
						}
				}
				return null;
		}
		public Vi cerca(String nom) {
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null) {
								String nomNormalitzat = Vi.normalitzaString(vins[i].getRef());
								String nomBuscadorNormalitzat = Vi.normalitzaString(nom);
								if (nomNormalitzat.equals(nomBuscadorNormalitzat)) {
										return vins[i];
								}
								String nomEnMinuscules = vins[i].getRef().toLowerCase();
								String nomBuscatEnMinuscules = nom.toLowerCase();
								if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
										return vins[i];
								}
						}
				}
				return null;
		}

		public Vi cerca(Vi plantilla) {
				for (Vi vi: vins) {
						if (vi == null) continue;
						if(plantilla.getRef() != null) {
								if (! plantilla.getRef().isEmpty() && ! plantilla.getRef().equalsIgnoreCase(vi.getRef())) continue;
						}
						if(plantilla.getNom() != null) {
								if (! plantilla.getNom().isEmpty() && ! plantilla.getNom().equalsIgnoreCase(vi.getNom())) continue;
						}
						if (plantilla.getPreu() >= 0 && plantilla.getPreu() <= vi.getPreu()) continue;
						if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() >= vi.getEstoc()) continue;
						if(plantilla.getLloc() != null) {
								if (! plantilla.getLloc().isEmpty() && ! plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) continue;
						}
						if(plantilla.getOrigen() != null) {
								if (! plantilla.getOrigen().isEmpty() && ! plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) continue;
						}
						if(plantilla.getTipus() != null) {
								if (! plantilla.getTipus().isEmpty() && ! plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) continue;
						}
						if(plantilla.getCollita() != null) {
								if (! plantilla.getCollita().isEmpty() && ! plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) continue;
						}
						return vi;
				}

				return null;

		}
		public int posicion;
		public void iniciaRecorregut() {
				posicion = 0;
		}
		public Vi getSeguent() {
				if (posicion < vins.length) {
						for(int i = posicion; i < vins.length; i++) {
								if(vins[i] == null) {
										posicion++;
										return vins[i];
								}
								posicion++;
								return vins[i];
						}
				}
				return null;
		}
}
