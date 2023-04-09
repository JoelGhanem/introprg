/*Aquest arxiu és amb el que la senyora Estrella podrá fer servir per interaccionar amb la botiga que tenen les classes Vi i Botiga*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Entorn {
		public static int numerito = 0;
		public static int escritas = 0;
		private final Botiga botiga = new Botiga();
		Vi vi = new Vi();
		public static void main(String[] args) throws IOException {
				String cami = "botiga.csv";
				BufferedWriter output = new BufferedWriter(new FileWriter(cami));
				output.close();
				Entorn entorn = new Entorn();
				mostraBenvinguda();
				while (true) {
						while(true) {
								BufferedReader input = new BufferedReader(new FileReader(cami));
								String linia = input.readLine();
								if (linia == null) {
										break;
								}
								numerito++;
						}
						if (numerito == 0) {System.out.println("Referències llegides: " + numerito);}
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
						System.out.println("Referències guardades: " + escritas);
						//output.write(aArrayString());
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
						}
				} 
				System.out.print("preu (enter " + vino.getPreu() + ")> ");
				String preu = Entrada.readLine();
				if (!preu.isEmpty()) {
						if (!UtilString.esEnter(preu)) {
								System.out.println("ERROR: el valor ha de ser un enter positiu");
								return null;
						} else {
								int	precio = Integer.parseInt(preu);
								if (precio < 0) {
										System.out.println("ERROR: el valor ha de ser un enter positiu");
										return null;
								}
								vino.setPreu(precio);
						}
				}
				System.out.print("estoc (enter " + vino.getEstoc() + ")> ");
				String estoc = Entrada.readLine();
				if (!estoc.isEmpty()) {
						if (!UtilString.esEnter(estoc)) {
								System.out.println("ERROR: el valor ha de ser un enter positiu");
								return null;
						} else {
								int	stock = Integer.parseInt(estoc);
								if (stock < 0) {
										System.out.println("ERROR: el valor ha de ser un enter positiu");
										return null;
								}
								vino.setEstoc(stock);
						}
				}
				System.out.println("Modificat:");
				System.out.println(vino.toString());
				return null;
		}
		public Entorn processaElimina() {
				Vi vino = new Vi();
				System.out.print("nom (enter cancel·la)> ");
				String nom = Entrada.readLine();
				if (nom.isEmpty()) {
						return null;
				}
				vino.setNom(nom);
				vino = botiga.cerca(vino.getNom());
				if (vino == null) {
						System.out.println("No trobat");
						return null;
				}
				System.out.println("A eliminar:");
				System.out.println(vino.toString());
				System.out.print("Segur?> ");
				String resposta = Entrada.readLine();
				if (UtilitatsConfirmacio.respostaABoolean(resposta)) {
						if (botiga.elimina(vino.getNom()) == null) {
								System.out.println("ERROR: no s'ha pogut eliminar");
						} else {
								System.out.println("Eliminat");
						}
				} else {
						System.out.println("No eliminat");
				}
				return null;
		}
		public static Entorn mostraErrorComandaDesconeguda() {
				System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
				return null;
		}
}
