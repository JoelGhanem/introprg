/*
    Comparació de l'operació remove() en ArrayList i LinkedList
    eliminant per l'inici, pel final i pel mig.
    Els resultats obtinguts han estat:
    Primera execució:
    =================
Comparant l'eficiència de les llistes
Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     14859 
test remove(0) ArrayList:      1392
Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 1901
test remove(últim) ArrayList:  1106
Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   1683
test remove(mig) ArrayList:    991
        Segona execució:
        ================
Comparant l'eficiència de les llistes
Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     8241
test remove(0) ArrayList:      1220
Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 2095
test remove(últim) ArrayList:  1188
Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   1373
test remove(mig) ArrayList:    1059
        Tercera execució:
        =================
Comparant l'eficiència de les llistes
Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:     8177
test remove(0) ArrayList:      1526
Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 2577
test remove(últim) ArrayList:  1427
Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   1911
test remove(mig) ArrayList:    1473
        Resultats
        =========
========== ================== ================== ======================================================
**prova**  **linkedList**      **ArrayList**      **resultat**
---------- ------------------ ------------------ ------------------------------------------------------
inici       10426                 1379              L'ArrayList és un 87% més rápid que el linkedList
final       2191                  1240              L'ArrayList és un 45% més rápid que el linkedList
mig         1656                  1174              L'ArrayList és un 29% més rápid que el linkedList
========== ================== ================== ======================================================
    Per calcular cada columna:
    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList eliminant des de l'inici
      Es calcula sumant els valors obtinguts a les tres execucions i dividint-los per 3
    * el resultat per la fila inici indica quantes vegades és més ràpid un que l'altre. Per fer-ho, dividim
      el valor més petit pel més gran i arrodonim a l'enter.
    Conclusions
    ===========
    En vistes als resultats, en cas que hagi de fer servir una List per eliminar molts valors, escolliré l'ArrayList
     */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ComparaRemove {
    private static final int LONGITUD = 100000;
    private static List<Integer> emplena(List<Integer> llista) {
        // XXX codi que emplena la llista amb enters del 0 a LONGITUD - 1
        for(int i = 0; i < LONGITUD; i++) {
            llista.add(i,i);
        }
        return llista;
    }
    private static long testRemove0(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició 0
        while(!llista.isEmpty()) {
        llista.remove(0);
        }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemove(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la darrera posició
        while(!llista.isEmpty()) {
            llista.remove(llista.size()-1);
        }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemoveMig(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        // XXX codi que elimina un a un tots els elements de la llista per la posició mig
        while(!llista.isEmpty()) {
            llista.remove(llista.size()/2);
        }
        return System.nanoTime() - tempsInicial;
    }
    public static void main(String[] args) {
        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();
        System.out.println("Comparació quan eliminem sempre de l'inici");
        System.out.printf("test remove(0) LinkedList:     %10d%n", testRemove0(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(0) ArrayList:      %10d%n", testRemove0(emplena(new ArrayList<Integer>())));
        System.out.println();
        System.out.println("Comparació quan eliminem sempre del final");
        System.out.printf("test remove(últim) LinkedList: %10d%n", testRemove(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(últim) ArrayList:  %10d%n", testRemove(emplena(new ArrayList<Integer>())));
        System.out.println();
        System.out.println("Comparació quan eliminem sempre del mig");
        System.out.printf("test remove(mig) LinkedList:   %10d%n", testRemoveMig(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(mig) ArrayList:    %10d%n", testRemoveMig(emplena(new ArrayList<Integer>())));
        System.out.println();
    }
}
