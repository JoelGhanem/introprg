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
				String nomNormalitzat = Vi.normalitzaString(vins[i].getNom());
				String nomEnMinuscules = nomNormalitzat.toLowerCase();
				/*passem a minuscules els noms dels vins*/
				String nomBuscatEnMinuscules = eliminaNormalitzat.toLowerCase();
				if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
					Vi vinito = new Vi();
					vinito = vins[i];
					if (vinito.getEstoc() > 0) {
						return null;
					}
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
				String nomNormalitzat = Vi.normalitzaString(vins[i].getNom());
				String nomBuscadorNormalitzat = Vi.normalitzaString(nom);
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

	public Vi cerca(Vi plantilla) {
		for (int i = 0; i < vins.length; i++) {
			if (vins[i] != null) {
				String nomNormalitzat = Vi.normalitzaString(vins[i].getNom());
				String nomBuscadorNormalitzat = Vi.normalitzaString(nom);
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
	public int posicion;
	public void iniciaRecorregut() {
		posicion = 0;
	}
	public Vi getSeguent() {
	if (posicion < vins.length) {
		for(int i = posicion; i < vins.length; i++) {
				if(vins[i] == null) {
					posicion++;
					continue;
				}
				posicion++;
				return vins[i];
			}
		}
		return null;
	}
}
