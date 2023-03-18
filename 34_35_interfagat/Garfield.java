/*Aquesta es la classe Garfield que implementa AnimalDeCompanyia i extends la superclasse Gat*/
public class Garfield extends Gat implements AnimalDeCompanyia {
		public Garfield() {
				super("Garfield",9);
		}
		@Override 
		public String deixatEstimar() {
				return "em deixo estimar, però només una mica";
		}
}
