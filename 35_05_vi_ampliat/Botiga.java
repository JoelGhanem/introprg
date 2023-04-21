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
				String nomNormalitzat = Vi.normalitzaString(vins[i].getRef());
				String nomEnMinuscules = nomNormalitzat.toLowerCase();
				/*passem a minuscules els noms dels vins*/
				String nomBuscatEnMinuscules = eliminaNormalitzat.toLowerCase();
				if(nomEnMinuscules.equals(nomBuscatEnMinuscules)) {
					Vi vinito = new Vi("algo","algo",1,1,"algo","algo","algo","algo");
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
        if (! plantilla.getRef().isEmpty() && ! plantilla.getRef().equalsIgnoreCase(vi.getRef())) continue;
		//System.out.println(plantilla.getRef() + " || + " + vi.getRef());
        if (! plantilla.getNom().isEmpty() && ! plantilla.getNom().equalsIgnoreCase(vi.getNom())) continue;
		//System.out.println(plantilla.getNom() + " || + " + vi.getNom());
        if (plantilla.getPreu() >= 0 && plantilla.getPreu() <= vi.getPreu()) continue;
		//System.out.println(plantilla.getPreu() + " || + " + vi.getPreu());
		if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() < vi.getEstoc()) continue;
		//System.out.println(plantilla.getEstoc() + " || + " + vi.getEstoc());
        if (! plantilla.getLloc().isEmpty() && ! plantilla.getLloc().equalsIgnoreCase(vi.getLloc())) continue;
		//System.out.println(plantilla.getLloc() + " || + " + vi.getLloc());
        if (! plantilla.getOrigen().isEmpty() && ! plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen())) continue;
		//System.out.println(plantilla.getOrigen() + " || + " + vi.getOrigen());
        if (! plantilla.getTipus().isEmpty() && ! plantilla.getTipus().equalsIgnoreCase(vi.getTipus())) continue;
		//System.out.println(plantilla.getTipus() + " || + " + vi.getTipus());
        if (! plantilla.getCollita().isEmpty() && ! plantilla.getCollita().equalsIgnoreCase(vi.getCollita())) continue;
		//System.out.println(plantilla.getCollita() + " || + " + vi.getCollita());
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
					continue;
				}
				posicion++;
				return vins[i];
			}
		}
		return null;
	}
}
