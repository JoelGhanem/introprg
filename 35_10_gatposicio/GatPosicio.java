/*Aquesta classe ens permet a aprendre a tractar amb els enums */
public enum GatPosicio {
	DRET, ASSEGUT, ESTIRAT;
	public static GatPosicio fromString(String algo) {
		try{
			return valueOf(algo.toUpperCase());
		} catch (IllegalArgumentException e){
			throw new IllegalArgumentException("nanai de la xina");
		}
	}
}
