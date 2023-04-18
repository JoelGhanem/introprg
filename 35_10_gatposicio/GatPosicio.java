/*Aquesta classe ens permet a aprendre a tractar amb els enums */
public class GatPosicio {
	enum posicio {
		DRET,
		ASSEGUT,
		ESTIRAT;
	}
	public static GatPosicio fromString(String algo) {
		GatPosicio posicio = new GatPosicio();
		for(posicio position : GatPosicio.posicio.values()) {
			if(position.name().equalsIgnoreCase(algo)) {
				return posicio;
			}
		}
		throw new IllegalArgumentException("nanai de la xina");
	}

}
