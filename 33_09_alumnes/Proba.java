public class Proba {
    public static void main(String[] args) throws IOException {
        Alumne alumne = CercaAlumnes.construeixAlumne("Joel", "joel@hoel", 1, true, new int[] {1,2,3,4,5,6});
    System.out.println(CercaAlumnes.alumneACSV(alumne));
    }
}
