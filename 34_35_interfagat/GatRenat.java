/*Gat Renat és una subclasse de Gat que implementa Ensinistrable i  AnimalDeCompayia a part d' extendre la superclasse Gat i fa bastats overrides a molts mètodes de la superclasse gat*/
class GatRenat extends Gat implements Ensinistrable, AnimalDeCompanyia {
		private String posicio = "estirat";
		public GatRenat() {
				super("Renat",7);
		}
		public GatRenat(String posicio) {
				super("Renat",7);
		} 
		public String getPosicio() {
				return this.posicio;
		}
		@Override 
		public String estirat() {
				if (getPosicio().equals("estirat")) {
						return "no faig res";
				} else {
						this.posicio = "estirat";
						return "m'estiro";
				}
		}
		@Override 
		public String seu() {
				if (getPosicio().equals("assegut")) {
						return "no faig res";
				} else {
						this.posicio = "assegut";
						return "m'assec";
				}
		}
		@Override 
		public String aixecat() {
				if (getPosicio().equals("dret")) {
						return "no faig res";
				} else {
						this.posicio = "dret";
						return "m'aixeco";
				}
		}
		@Override 
		public boolean estaEstirat() {
				return this.posicio.equals("estirat");
		}
		@Override 
		public boolean estaAssegut() {
				return this.posicio.equals("assegut");
		}
		@Override 
		public boolean estaDret() {
				return this.posicio.equals("dret");
		}
		@Override
		public String deixatEstimar() {
				return "em deixo estimar";
		}
}
