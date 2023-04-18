/*Aquest arxiu ens ajuda a aprendre sobre les llistes, primer hem de crear una llista per posteriorment afegir valors a questa, deprès comprovem els valors guardats, comprovem si la lliosta esta bnuida i si no ho esta la buidem */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class UsaList {
    public static void main(String[] args) {
        List<String> llista;
        llista = new ArrayList<String>();
        // TODO: inicialitza la llista amb una instància de  ArrayList
        //       o un LinkedList. Com et vingui de gust
        System.out.println("Obtenim les entrades");
        System.out.println("====================");
        String valor;
        valor = Entrada.readLine();
        // TODO: afegeix valor a la llista
        llista.add(valor);
        valor = Entrada.readLine();
        // TODO: afegeix el valor a l'inici de la llista
        llista.add(0,valor);
        valor = Entrada.readLine();
        // TODO: afegeix el valor al mig de la llista
        llista.add(1,valor);
        System.out.println("Cerquem elements de la llista");
        System.out.println("=============================");
        String text = Entrada.readLine();
        boolean esTroba;
        // TODO: inicialitza esTroba a true si text està a la llista
        if(llista.contains(text)){ esTroba = true;} 
        else { esTroba = false; }
        System.out.printf("El text %s és troba a la llista: %s%n", text, esTroba);
        int indexPrimerOcurrencia;
        // TODO: inicialitza indexPrimerOcurrencia a l'índex on es troba text
        indexPrimerOcurrencia = llista.indexOf(text);
        System.out.printf("Posició de %s a la llista: %s%n", text, indexPrimerOcurrencia);
        System.out.println("Mostrem les entrades introduïdes");
        System.out.println("================================");
        boolean llistaBuida;
        //System.out.println(llista);
        //System.out.println(llista.size());
        // TODO inicialitza llistaBuida de manera que valgui cert si
        // la llista està buida.
        llistaBuida = llista.isEmpty();
        if(!llista.isEmpty()) {
            while (! llista.isEmpty()) {
                String entrada;
                // TODO: inicialitza entrada de manera que contingui el
                // primer element de la llista
                entrada = llista.get(0);
                System.out.println(entrada);
                // TODO: elimina el primer element de la llista
                // TODO: actualitza el valor de llistaBuida
                llista.remove(0);
            }
        }
    }
}
