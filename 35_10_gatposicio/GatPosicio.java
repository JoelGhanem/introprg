/*Aquesta classe ens permet a aprendre a tractar amb els enums */
public class GatPosicio {
		enum posicio {
				DRET,
				ASSEGUT,
				ESTIRAT;
		}
		public static GatPosicio fromString(String algo) {
				GatPosicio posicio = new GatPosicio();
				posicio = "DRET";
				return this.posicio;
				}
}
