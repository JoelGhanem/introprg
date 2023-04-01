/*Aquest arxiu és amb el que la senyora Estrella podrá fer servir per interaccionar amb la botiga que tenen les classes Vi i Botiga*/
public class Entorn {
		private final Botiga botiga = new Botiga();
		public static void main(String[] args) {
				Entorn entorn = new Entorn();
				mostraBenvinguda();
				while (true) {
						mostraPrompt();
						String comanda = Entrada.readLine().strip();
						if (comanda.isEmpty()) continue;
						if (comanda.equals("surt")) break;
						switch (comanda) {
								case "ajuda": mostraAjuda();
											  break;
								case "afegeix": entorn.processaAfegeix();
												break;
								case "cerca": entorn.processaCerca();
											  break;
								case "modifica": entorn.processaModifica();
												 break;
								case "elimina": entorn.processaElimina();
												break;
								default: mostraErrorComandaDesconeguda();
						}
				}
				mostraComiat();
		}
		public static Entorn mostraBenvinguda() {
				System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
				return null;
		}
		public static Entorn mostraComiat() {
				System.out.println("adéu");
				return null;
		}
		public static Entorn mostraPrompt() {
				System.out.print("botiga> ");
				return null;
		}
		public static Entorn mostraAjuda() {
				System.out.println("Comandes disponibles:");
				System.out.println("ajuda");
				System.out.println("cerca");
				System.out.println("afegeix");
				System.out.println("modifica");
				System.out.println("elimina");
				System.out.println("surt");
				return null;
		}
		public Entorn processaAfegeix() {
				/*Afegeix*/
				int precioInt;
				int estocInt;
				Vi vino = new Vi();
				/*Pone el nombre*/
				System.out.print("nom (enter cancel·la)> ");
				String nombreVino = Entrada.readLine();
				/*Mira si el nombre esta vacio, si lo esta sale del metodo afegint*/
				if (nombreVino.isBlank()) {
						return null;
				}
				vino.setNom(nombreVino);
				/*Coge el precio del vino*/
				System.out.print("preu (en cèntims)> ");
				String precio = Entrada.readLine();
				/*Checks if price is empty and sets the price to 0*/
				if (precio.isEmpty()) {
						vino.setPreu(0);
				} else {
						/*Checks if the price is an integer*/
						if (UtilString.esEnter(precio)) {
								precioInt = Integer.parseInt(precio);
								/*If the price is a negative number you skip the procedure and prints an error*/
								if (precioInt < 0) {
										System.out.println("ERROR: el valor ha de ser un enter positiu");
										return null;
								} else {
										vino.setPreu(precioInt);
								}
						} else {
								System.out.println("ERROR: ha de ser un enter");
						}
				}
				System.out.print("estoc (enter sense estoc)> ");
				String estoc = Entrada.readLine();
				if (estoc.equals("surt")) {
						mostraComiat();
						return null;
				}
				/*Checks if stock is empty and sets the price to 0*/
				if (estoc.isEmpty()) {
						vino.setEstoc(0);
				} else {
						/*Checks if the price is integer*/
						if (UtilString.esEnter(estoc)) {
								estocInt = Integer.parseInt(estoc);
								/*If the stock is a negativ number you skip the procedure and prints an error*/
								if (estocInt <0) {
										System.out.println("ERROR: el valor ha de ser un enter positiu");
										return null;
								} else {
										vino.setEstoc(estocInt);
								}
						} else {
								System.out.println("ERROR: ha de ser un enter");
						}
				}
				if (botiga.afegeix(vino) == null) {
						System.out.println("ERROR: no s'ha pogut afegir");
						return null;
				}
				System.out.println("Introduït:");
				System.out.println(vino.toString());
				return null;
		}
		public Entorn processaCerca() {
				Vi vino = new Vi();
				System.out.print("nom (enter cancel·la)> ");
				String nombreVino = Entrada.readLine();
				if (nombreVino.isEmpty()) {
						return null;
				} else {
						vino.setNom(nombreVino);
						if (botiga.cerca(vino.getNom())!= null)  {
								vino = botiga.cerca(vino.getNom());
								System.out.print("Trobat:");
								System.out.println(vino.toString());
						} else {
								System.out.println("No trobat");
								return null;
						}
				}
				return null;
		}
		public Entorn processaModifica() {
				Vi vino = new Vi();
				System.out.print("nom (enter cancel·la)> ");
				String nombreVino = Entrada.readLine();
				if (nombreVino.isEmpty()){
						return null;
				} else {
						vino.setNom(nombreVino);
						vino = botiga.cerca(vino.getNom());
						if (vino == null) {
								System.out.println("No trobat");
								return null;
						} else {
								System.out.println(vino.toString());
						}
				}
				return null;
		}
		public Entorn processaElimina() {
				return null;
		}
		public static Entorn mostraErrorComandaDesconeguda() {
				return null;
		}
}
