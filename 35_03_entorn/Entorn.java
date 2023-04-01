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
			mostraPrompt();
			System.out.printf("ajuda%n Comandes disponibles:%n ajuda%n cerca%n afegeix%n modifica%n elimina% surt%n");
			mostraPrompt();
			return null;
	}
	public Entorn processaAfegeix() {
				/*Afegeix*/
				int precioInt;
				int estocInt;
				Vi vino = new Vi();
				/*Pone el nombre*/
				vino.setNom(Entrada.readLine());
				/*Mira si el nombre esta vacio, si lo esta sale del metodo afegint*/
				if (vino.getNom().isEmpty()) {
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
								} else {
										vino.setPreu(precioInt);
								}
						} else {
								System.out.println("ERROR: ha de ser un enter");
						}
				}
				return null;
		}
	public Entorn processaCerca() {
			return null;
	}
	public Entorn processaModifica() {
			return null;
	}
	public Entorn processaElimina() {
			return null;
	}
	public static Entorn mostraErrorComandaDesconeguda() {
			return null;
	}
}
