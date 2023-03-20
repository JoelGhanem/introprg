/*Aquesta es la classe Garfield que implementa AnimalDeCompanyia i extends la superclasse Gat Garfield té 9 vides i no es deixa estimar mass*/
public class Garfield extends Gat implements AnimalDeCompanyia {
		public Garfield() {
				super("Garfield",9);
		}
		@Override 
		public String deixatEstimar() {
				return "em deixo estimar, però només una mica";
		}
}
