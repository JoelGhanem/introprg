/*Aquest arxiu és amb el que la senyora Estrella podrá fer servir per interaccionar amb la botiga que tenen les classes Vi i Botiga*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Entorn {
		//public static boolean despedida = true;
		public static int numerito = 0;
		public static int escritas = 0;
		private static final Botiga botiga = new Botiga();
		public static void main(String[] args) throws IOException {
				String cami = "botiga.csv";
				BufferedWriter creando = new BufferedWriter(new FileWriter(cami,true));
				creando.close();
				Entorn entorn = new Entorn();
				mostraBenvinguda();
				boolean llegides = true;
				BufferedReader input = new BufferedReader(new FileReader(cami));
				String linia = input.readLine();
				while(true) {
						Vi vi = new Vi("","",0,0,"","","","");
						if (linia == null) { input.close(); break; }
						//System.out.println(linia);
						String[] liniaArray = linia.split(";"); 
						vi = vi.deArrayString(liniaArray);
						if(vi!=null) { 
								botiga.afegeix(vi);
								//System.out.println("llega al numerito");
								numerito++;
						}
						linia = input.readLine();
						//System.out.println("el numero es " + numerito);
				}
				if (llegides) { System.out.println("Referències llegides: " + numerito);}
				llegides = false;
				while (true) {

						mostraPrompt();
						String comanda = Entrada.readLine().strip();
						if (comanda != null) {
								if(comanda.equals("surt")) {
										//despedida = false;
								}
						}
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
				   botiga.iniciaRecorregut();
				   BufferedWriter bw = new BufferedWriter(new FileWriter(cami));
				   Vi vinoNuevo = new Vi("algo","algo",1,2,"algo","algo","algo","algo");
				   while(true) {
				   vinoNuevo = botiga.getSeguent();
				   if (vinoNuevo == null) {
				   break;
				   }
				   String [] texto = vinoNuevo.aArrayString();
				   String linea = String.join(";", texto);
				//System.out.println(linea);
				bw.write(linea);
				bw.write("\n");
				escritas++;
				   }
				   bw.close();
				//if(despedida) {
				//System.out.println("Referències guardades: " + escritas);
				//}
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
				//System.out.println("afegeix");
				//System.out.println("modifica");
				//System.out.println("elimina");
				System.out.println("surt");
				return null;
		}
		public Entorn processaAfegeix() {
		System.out.println("Comanda temporalment no disponible");
		return null;
	}
	
		public Entorn processaCerca() {
				//System.out.println("Comanda temporalment no disponible");
				Vi vino = new Vi("","",-1,-1,"","","","");
				System.out.print("ref> ");
				String refVino = Entrada.readLine();
				vino.setRef(refVino);
				if (refVino.isEmpty()) {
						while(true) {
								System.out.print("nom> ");
								String nomVino = Entrada.readLine();
								if(!nomVino.equals("!")) {
										vino.setNom(nomVino);
								} else {
										break;
								}
								System.out.print("preu max.> ");
								String vinoPreu = Entrada.readLine();
								if(!vinoPreu.equals("!")) {
										if (vinoPreu != null) {
												if(!vinoPreu.isEmpty()) {
														if (UtilString.esEnter(vinoPreu)) {
																int precio = Integer.parseInt(vinoPreu);
																System.out.println(vinoPreu);
																vino.setPreu(precio);
														} else {
																break;
														}
												}
										}
								} else {
										break;
								}
								System.out.print("estoc min.> ");
								String vinoEstoc = Entrada.readLine();
								if(!vinoEstoc.equals("!")) {
										if(!vinoEstoc.isEmpty()) {
										if(UtilString.esEnter(vinoEstoc)) {
												int stok = Integer.parseInt(vinoEstoc);
												vino.setEstoc(stok);
										} else {
												break;
										}
										}
								} else {
										break;
								}
								System.out.print("lloc> ");
								String vinoLloc = Entrada.readLine();
								if(!vinoLloc.equals("!")) {
										vino.setLloc(vinoLloc);
								} else {
										break;
								}
								System.out.print("D.O.> ");
								String vinoOrigen = Entrada.readLine();
								if(!vinoOrigen.equals("!")) {
										vino.setOrigen(vinoOrigen);
								} else {
										break;
								}
								System.out.print("tipus> ");
								String vinoTipus = Entrada.readLine();
								if(!vinoTipus.equals("!")) {
										vino.setTipus(vinoTipus);
								} else {
										break;
								}
								System.out.print("collita> ");
								String vinoCollita = Entrada.readLine();
								if(!vinoCollita.equals("!")) {
										vino.setCollita(vinoCollita);
								} else {
										break;
								}
								break;
						}
						System.out.println(vino.toString());
						if(botiga.cerca(vino) != null) {
								System.out.print("Trobat:") ;
								System.out.println(botiga.cerca(vino).toString());
						} else {
								System.out.println("ERROR: el valor ha de ser un enter positiu");
						}
				} else if(refVino.equals("!")) {
						return null;
				}else {
						vino.setRef(refVino);
						if (botiga.cerca(vino.getRef())!= null)  {
								vino = botiga.cerca(vino.getRef());
								System.out.print("Trobat:");
								System.out.println(vino.toString());
						} else {
								System.out.println("No trobat");
								return null;
						}
						return null;
				}
				return null;
		}
		public Entorn processaModifica() {
		System.out.println("Comanda temporalment no disponible");
		return null;
		}
		public Entorn processaElimina() {
		System.out.println("Comanda temporalment no disponible");
		return null;
		}
		public static Entorn mostraErrorComandaDesconeguda() {
				System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
				return null;
		}

}
