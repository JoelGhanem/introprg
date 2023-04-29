/*Aqui fem una classe per la botiga de vins on afegim vins eliminem vins i cerquem vins per poder tenir un control sobre la quantitat de vins de la botiga*/
public class Botiga { 
		private int DEFAULT_MAX_VINS = 10;
		private Vi[] vins = new Vi[10];
		public Botiga() {
		}
		public Botiga(int maxVins) {
				if(maxVins < 1) {
						throw new IllegalArgumentException("No es pot crear una botiga amb menys d'un vi");
				}
				this.vins = new Vi[maxVins];
		}
		public Vi afegeix(Vi vi) throws BotigaException{
				if(vi == null) {
						throw new IllegalArgumentException("El vi ha de ser vàlid");
				}
				boolean plena = true;
				for (int i = 0; i < vins.length; i++) {
						if(vins[i] == null) {
								plena = false;
						}
				}
				if (plena) {throw new BotigaException();}
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
								if (vins[i].getRef().equals(vi.getRef())) {
										throw new IllegalArgumentException("Referència de vi repetida");
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
				if( elimina == null) {
						throw new IllegalArgumentException("La referència no pot ser null");
						}
				for (int i = 0; i < vins.length; i++) {
						if (vins[i] != null) {
								/*normalitzem els noms dels vins*/
								String eliminaNormalitzat = Vi.normalitzaString(elimina);
								String nomNormalitzat = Vi.normalitzaString(vins[i].getRef());
								/*passem a minuscules els noms dels vins*/
								String nomEnMinuscules = nomNormalitzat.toLowerCase();
								String nomBuscatEnMinuscules = eliminaNormalitzat.toLowerCase();
								if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
										//creo una copia del vino que hay que borrar
										Vi vinito = new Vi("","",-1,-1,"","","","");
										vinito = vins[i];
										if (vinito.getEstoc() > 0) {
												throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc"); 
										}
										//borro el vino del array
										vins[i] = null;
										//devuelvo el vino que he borrado
										return vinito;
								} else {
										throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
								}
						}
				}
				return null;
		}
		public Vi cerca(String nom) {
				if(nom == null) {
						throw new IllegalArgumentException("La referència no pot ser null");
				}
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
				if (plantilla == null) {
						throw new IllegalArgumentException("La plantilla no pot ser null");
				}
				for (Vi vi: vins) {
						if (vi == null) continue;
						if (! plantilla.getRef().isEmpty() && ! plantilla.getRef().equalsIgnoreCase(vi.getRef())) continue;
						if (! plantilla.getNom().isEmpty() && ! plantilla.getNom().equalsIgnoreCase(vi.getNom())) continue;
						if (plantilla.getPreu() >= 0 && plantilla.getPreu() < vi.getPreu()) continue;
						if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc()) continue;
						if (! plantilla.getLloc().isEmpty() && ! plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) continue;
						if (! plantilla.getOrigen().isEmpty() && ! plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) continue;
						if (! plantilla.getTipus().isEmpty() && ! plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) continue;
						if (! plantilla.getCollita().isEmpty() && ! plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) continue;
						return vi;
				}

				return null;

		}
		public int posicion;
		public void iniciaRecorregut() {
				posicion = 0;
		}
		public Vi getSeguent() {
				while(posicion < vins.length && vins[posicion] == null) {
						posicion++;
				}
				return posicion < vins.length ? vins[posicion++] : null;
		}
}
