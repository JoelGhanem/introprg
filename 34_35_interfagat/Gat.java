/*Aquesta es la superclasse Gat que implementa EsserViu i que defineix el GatRenat el Garfield i el GatSalvatge*/
class Gat implements EsserViu {

	private int vides = 7;
	private String nom = "anònim";
	public Gat(String nom){
		if (nom==null) {
			this.nom = "anònim";
		} else if (nom.isBlank()) {
			this.nom = "anònim";
		} else if (nom.equals("   ")) {
			this.nom = "anònim";
		} else {
		this.nom = nom;
		}
	}
	public Gat(String nom, int vides) {
		if (nom==null) {
			this.nom = "anònim";
		} else if (nom.isBlank()) {
			this.nom = "anònim";
		} else if (nom.equals("   ")) {
			this.nom = "anònim";
		} else {
		this.nom = nom;
		}
		this.vides = vides;
	}
	public String getNom() {
		return this.nom;
	}
	public int getVides() {
		return this.vides;
	}
	public void setVides(int vides) {
		this.vides = vides;
	}
	@Override
	public boolean estaViu() {
		if (this.vides > 0 ) {
			return true;
		} 
		return false;
	}
	@Override
	public String ressuscita() {
		if (getVides() <= 0) {
			setVides(1);
			return "guai!";
		} 
		return "encara miolo";
	}
	@Override 
	public String mor() {
		if (getVides() <= 0) {
			return "ja l'he espifiada";
		}
		setVides(getVides()-1);
		return "adéu món cruel";
	}

}
