/*La classe UsaGats ens serveix per utilitzar la classe Gat, GatRenat i Garfield, en aquest cas ens mostra el nom del gat i ens mostra que es poden fer servir tots els metodes de la superclasse a les subclasse*/
public class UsaGats {
		public static void main(String[] args) {
				Gat[] gats = new Gat[] {
						new Gat("Misifú"),
							new GatRenat(),
							new Garfield()
				};
				for (Gat gat: gats) {
						System.out.println("Entrenant el gat " + gat.getNom());
						System.out.println(gat.getNom() + " diu: "+ gat.seu());
						System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
						System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
						System.out.println(gat.getNom() + " diu: "+ gat.estirat());
						System.out.println();
				}
		}
}
