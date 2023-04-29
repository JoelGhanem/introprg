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
	public Vi(String ref, String nom, int preu, int estoc, String lloc, String origen, String tipus, String collita) {
		ref = normalitzaString(ref);
		this.ref= ref;
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
	lloc = normalitzaString(lloc);
		this.lloc = lloc;
		origen = normalitzaString(origen);
		this.origen = normalitzaNom(origen);
		this.tipus = normalitzaNom(tipus);
	this.collita = normalitzaNom(collita);
	}

	//getters
	public String getRef() {
		if (this.ref == null) {
			return "";
		}
		return this.ref;
	}

	public String getNom() { 
		if (this.nom == null) {
			return "";
		}
		return this.nom; 
	}

	public int getPreu() {
		return this.preu; 
	}

	public int getEstoc() {
		return this.estoc; 
	}

	public String getLloc() {
		if (this.lloc == null) {
			return "";
		}
		return this.lloc;
	}

	public String getOrigen() { 
		if (this.origen == null) {
			return "";
		}
		return this.origen;
	}

	public String getTipus() { 
		if (this.tipus == null) {
			return "";
		}
		return this.tipus;
	}

	public String getCollita() { 
		if (this.collita == null) {
			return "";
		}
		return this.collita;
	}

	//setters
	public void setRef(String ref) {
		ref = normalitzaString(ref);
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
		if(lloc != null && !lloc.trim().isEmpty()) {
		lloc = normalitzaString(lloc);
			this.lloc = lloc;
		}
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public void setCollita(String collita) {
		this.collita = collita;
	}
	//altres
	public boolean esValid() {
		if (getRef() == null || getRef().isEmpty()) {
			return false;
		}
		if (getPreu() < 0) {
			return false;
		}
		if (getEstoc() < 0) {
			return false;
		}
		if (getNom() == null || getNom().isEmpty()) {
			return false;
		}
		if (getNom().equals("null")) { return false;}
		if (getLloc() == null || getLloc().isEmpty()) {
			return false;
		}
		if (getOrigen() == null || getOrigen().isEmpty()) {
			return false;
		}
		if (getTipus() == null || getTipus().isEmpty()) {
			return false;
		}
		if (getCollita() == null || getCollita().isEmpty()) {
			return false;
		}
		return true;
	}
	public static String normalitzaNom(String nom) {
		String nomBien;
		if (nom == null || nom.isEmpty()||nom.isBlank()) {
			return null;
		}
		nom.trim();
		nomBien = nom.trim().replaceAll("\\s+", " ");
		return nomBien;
	}

	public static String normalitzaString(String nom) {
		String nomBien;
		if (nom == null || nom.isEmpty()||nom.isBlank()) {
			return null;
		}
		nom.trim();
		nomBien = nom.trim().replaceAll("\\s+", " ");
		return nomBien;
	}

	@Override 
	public String toString() {
		String paraula = String.format("%n    Ref: %s%n    Nom: %s%n    Preu: %d%n    Estoc: %d%n    Lloc: %s%n    D.O.: %s%n    Tipus: %s%n    Collita: %s%n" ,this.ref,this.nom,preu,estoc, this.lloc, this.origen, this.tipus, this.collita);
		return paraula;
	}
	public static Vi deArrayString(String[] strings) {
		if(strings.length != 8) {
			//System.out.println("es nulo a la primera");
		return null;}
		if (!UtilString.esEnter(strings[2])) {
			//System.out.println("es nulo a la segunda");
		return null;} 
		if (!UtilString.esEnter(strings[3])) {
			//System.out.println("es nulo a la tercera");
		return null;}
		if(Integer.parseInt(strings[2]) < 0) { return null;}
		if(Integer.parseInt(strings[3]) < 0) { return null;}
		Vi vinito = new Vi(" "," ",-1,-1," "," "," "," ");
		vinito.setRef(normalitzaString(strings[0]));
		//System.out.println(vinito.getRef());
		vinito.setNom(normalitzaString(strings[1]));
//System.out.println(vinito.getNom());
vinito.setPreu(Integer.parseInt(strings[2]));
		//System.out.println(vinito.getPreu());
		vinito.setEstoc(Integer.parseInt(strings[3]));
		//System.out.println(vinito.getEstoc());
		vinito.setLloc(normalitzaString(strings[4]));
		//System.out.println(vinito.getLloc());
		vinito.setOrigen(normalitzaString(strings[5]));
		//System.out.println(vinito.getOrigen());
		vinito.setTipus(normalitzaString(strings[6]));
		//System.out.println(vinito.getTipus());
		vinito.setCollita(normalitzaString(strings[7]));
		//System.out.println(vinito.getCollita());
		if(vinito.esValid()) {
			//System.out.println(vinito.esValid());
			return vinito;
		}
		return null;
	}

public String[] aArrayString() {
		String[] strings = new String[8];
		strings[0] = this.ref;
		strings[1] = this.nom;
	strings[2]= Integer.toString(this.preu);
		strings[3] = Integer.toString(this.estoc);
		strings[4] = this.lloc;
		strings[5] = this.origen;
strings[6] = this.tipus;
		strings[7] = this.collita;
		return strings;
	}
}

