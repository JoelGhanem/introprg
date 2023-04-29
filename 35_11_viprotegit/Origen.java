/*Aixo es un enum on es determinen els possibles origens dels nosteres vins*/
public enum Origen {
		ALELLA ("Alella"),
				CATALUNYA ("Catalunya"),
				CONCA_DE_BARBERA ("Conca De Barbera"),
				COSTES_DEL_SEGRE ("Costes Del Segre"),
				EMPORDA ("Emporda"),
				MONTSANT ("Montsant"),
				PENEDES  ("Penedes"),
				PLA_DE_BAGES ("Pla De Bages"),
				PRIORAT ("Priorat"),
				TARRAGONA ("Tarragona"),
				TERRA_ALTA ("Terra Alta"),
				ALTRE ("altre");
		private final String descr;
		Origen(String descr){
				this.descr = descr;
		}
		@Override 
		public String toString() {
				return descr;
		}
}
