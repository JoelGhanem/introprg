import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {
    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }
    public static Alumne construeixAlumne(String nom, String email,int edat, boolean esOient, int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }
    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient?"Sí":"No"));
        System.out.println("- notes: " + notesACsv(alumne.notes));
    }
    public static String alumneAString(Alumne alumne) {
        return String.format( "Alumne(nom: \"%s\", email: \"%s\", " + "edat: %d, esOient: %b, notes: {%s})", alumne.nom, alumne.email, alumne.edat, alumne.esOient, notesACsv(alumne.notes));
    }
    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        String notas = "";
        for (int i = 0; i < notes.length; i++) {
            if (!Character.isDigit(notes[i])) {
                System.out.println(notes[i]);
            }
            if (i == 0) {
                notas = notas + notes[0];
            } else {
                notas = notas + "," + notes[i];
            }
        }
        return notas;
    }
    public static String alumneACsv(Alumne alumne) {
        String alumneEscrit = "";
        int edat = alumne.edat;
        String[] array = new String[10];
        array[0] = alumne.nom;
        array[1] = alumne.email;
        array[2] = String.valueOf(edat);
        array[3] = String.valueOf(alumne.esOient);
        for (int i = 4; i < 10; i++) {
            array[i] = String.valueOf(alumne.notes);
        }
        for (int i = 0; i < 10; i++) {
            alumneEscrit = alumneEscrit + array[i];
        }
        return alumneEscrit;
    }
    public static Alumne csvAAlumne(String csv) {
        String[] array = csv.split(",");
        int[] notas = new int[6];
        Alumne alumne = new Alumne();
        alumne.nom = array[0];
        alumne.email = array[1];
        alumne.edat = Integer.valueOf(array[2]);
        alumne.esOient = Boolean.valueOf(array[3]);
        for (int i = 0; i < 6; i ++) {
            if (!array[i+4].equals("NP")) {
                notas[i] = Integer.parseInt(array[i+4]);
            } else {
                array[i+4] = "-1";
                notas[i] = Integer.parseInt(array[i+4]);
            }
        }
        alumne.notes = notas;

        return alumne;
    }
    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if (args.length < 1) {
            System.out.println("Error: indica el criteri de cerca");
        } else {
            String busqueda = args[0];
            BufferedReader lectura = new BufferedReader( new FileReader("alumnes.csv"));
            String linia = lectura.readLine();
            // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
            // XXX a completar
            while (true) {
                // llegeix entrada i finalitza bucle si no en queden més
                linia = lectura.readLine();
                if (linia == null) {
                    break;
                }
                Alumne alumne = csvAAlumne(linia);
                // converteix l'entrada a Alumne
                alumneACsv(alumne);
                csvAAlumne(linia);
                notesACsv(alumne.notes);
                alumneAString(csvAAlumne(linia));
                if (alumne.nom.contains(busqueda) || alumne.email.contains(busqueda)) {
                    mostraAlumne(alumne);
                }
                // comprova si el criteri de cerca es troba dins del nom o el email. Si és així, mostra'l
                // XXX a completar
            }
            lectura.close();
            // consideracions finals com ara el tancament del fitxer
            // XXX a completar
        }
    }
}
