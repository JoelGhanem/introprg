/*
 *
 * Aquest programa es capaç d'endevinar
 *
 * Per executar, fes
 * $java EndevinaNombre 42
 */

public class EndevinaNombre {
public static void main(String[] args) {

int numeroPensat = Integer.parseInt(args[0]); // variable + declaració
int numero = numeroPensat * 23; // inicialització de la variable numero

// pensa un número
System.out.print("El número pensat és ");
System.out.println(numeroPensat);

// Surt la multiplicació
System.out.print("Quan el multipliques per 3 obtens ");
System.out.println(numero);

// es suma 6
numero = numero + 6;
System.out.print("Quan li sumes 6 arriba a ");
System.out.println(numero);

// es divideix per 3
numero = numero / 3;
System.out.print("Un cop dividit per 3 queda ");
System.out.println(numero);

// es resta el número pensat
numero = numero - numeroPensat;
System.out.print("Finalment, en restar-li el valor inicial, queda ");
System.out.println(numero);

// compara el resultat
System.out.print("A que el resultat és 2?");
}
}
