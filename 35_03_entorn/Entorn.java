/*Aquest arxiu és amb el que la senyora Estrella podrá fer servir per interaccionar amb la botiga que tenen les classes Vi i Botiga*/
public class Entorn {
		public static void main(String[] args) {
				System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
				while(true) {
						String entrada = Entrada.readLine();
						if (entrada.equals("botiga> afegeix")) {
								/*Afegeix*/
								int precioInt;
								int estocInt;
								Vi vino = new Vi();
								/*Pone el nombre*/
								vino.setNom(Entrada.readLine());
								/*Mira si el nombre esta vacio, si lo esta sale del metodo afegint*/
								if (vino.getNom().isEmpty()) {
										continue;
								}
								/*Coge el precio del vino*/
								String precio = Entrada.readLine();
								/*Checks if price is empty and sets the price to 0*/
								if (precio.isEmpty()) {
										vino.setPreu(0);
								} else {
										/*Checks if the price is an integer*/
										if (UtilString.esEnter(precio)) {
												precioInt = Integer.parseInt(precio);
												/*If the stock is a negative number you skip the procedure and prints an error*/
												if (precioInt < 0) {
														System.out.println("ERROR: el valor ha de ser un enter positiu");
														break;
												} else {
														vino.setPreu(precioInt);
												}
										} else {
												System.out.println("ERROR: ha de ser un enter");
												continue;
										}
								}
								/*Checks if the stock is empty and sets the price to 0*/
								String estocTmp = Entrada.readLine();
								if (estocTmp.isEmpty()) {
										vino.setEstoc(0);	
								} else {
										/*Checks if the stock is an integer*/
										if (UtilString.esEnter(estocTmp)) {
												estocInt = Integer.parseInt(estocTmp);
												if (estocInt < 0) {
														/*If the stock is a negative number you skip the procedure and prints an error*/
														System.out.println("ERROR: el valor ha de ser un enter positiu");
														continue;
												} else {
														vino.setEstoc(estocInt);
												}
										}
								}
								Botiga botiga = new Botiga();
								botiga.afegeix(vino);
								//Show the wine you added
								/*If they want to look for a wine*/
						} else if (entrada.equals("botiga> cerca")){
								System.out.printf("nom (enter cancel·la) > %n");
								String nomCerca = Entrada.readLine();
								if (nomCerca.isEmpty()) {continue;}
								else {
								Botiga botiga = new Botiga();
										if(botiga.cerca(nomCerca) != null) {
												//show the results
										} else {
												System.out.println("No trobat");
										}
								}
						//} else if (entrada.equals("botiga> modifica")) {

						} else if (entrada.equals("botiga> surt")) {
								System.out.println("Adéu");
								break;
						}
				}
		}
}

