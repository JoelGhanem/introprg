
/*Aquest arxiu ens representas el nostre lloguer, conte els dies i un constructor especific*/
public class Lloguer {
		private int dies;
		private Vehicle vehicle;
		public Lloguer(Vehicle vehicle, int dies) {
				this.vehicle = vehicle;
				this.dies = dies;
		}
		//getters
		public int getDies() {return this.dies;}
		public Vehicle getVehicle() {return this.vehicle;}
		public Double preu() {
				final double COST_BASIC = 3.0;
				final double COST_GENERAL = 4.0;
				final double COST_LUXE_PER_DIA = 6.0;
				final int DIAS_INICIAL_BASIC = 3;
				final double COST_EXTRA_BASIC_PER_DIA = 1.5;
				final int DIAS_INICIAL_GENERAL = 2;
				final double COST_EXTRA_GENERAL_PER_DIA = 2.5; 
				double preu = 0;
				switch (getVehicle().getCategoria()) {
						case BASIC:
								preu += COST_BASIC;
								if (getDies() > COST_BASIC) {
										preu += (getDies() - COST_BASIC) * COST_EXTRA_BASIC_PER_DIA;
								}
								break;
						case GENERAL:
								preu += COST_GENERAL;
								if (getDies() > DIAS_INICIAL_GENERAL) {
										preu += (getDies() - DIAS_INICIAL_GENERAL) * COST_EXTRA_GENERAL_PER_DIA;
								}
								break;
						case LUXE:
								preu += getDies() * COST_LUXE_PER_DIA;
								break;
				}
				return preu;
		}
		public double bonificacionsDeLloguer(Lloguer lloguer) {
				if(getVehicle().getCategoria() == Vehicle.Categoria.LUXE && getDies()>1) {
						return 2.0;
				}
				return 1.0;
		}

}

