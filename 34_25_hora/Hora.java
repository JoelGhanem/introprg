//Implementa la classe Hora amb les propietats (privades) hora, minut i segon de tipus enter, i els accessors (públics) que assegurin que l'hora és sempre vàlida.Per defecte, l'hora correspondrà a 0:00:00, però la classe oferirà els mecanismes necessaris per a inicialitzar una hora amb algun altre valor vàlid. És a dir, oferirà un constructor específic amb la signatura Hora(int hores, int minuts, int segons) que, en cas de que els valors rebuts no corresponguin amb una hora vàlida, inicialitzarà l'hora amb el valor per defecte
public class Hora {
    private int hores;
    private int minuts;
    private int segons;
    public Hora() {
        hores = 0;
        minuts = 0;
        segons = 0;
    }
    public Hora(int hores, int minuts, int segons) {
        this.hores = hores;
        this.minuts = minuts;
        this.segons = segons;
    }
    public int getHores() { return hores;}

    public int getMinuts() { return minuts; }

    public int getSegons() { return segons; }

    public int setHores(int hores) {
        this.hores = hores;
        return this.hores;
    }
    public int setMinuts(int minuts) {
        if (minuts >= 60) {

            setHores(1);
        }
        this.minuts = minuts;
        return this.minuts;
    }
    public int setSegons(int segons) {
        this.segons = segons;
        return this.segons;
    }
    public void incrementa() {
        this.segons++;
    }
    public void incrementa(int segons) {
        this.segons = this.segons + segons;
    }
    public void decrementa() {
        this.segons--;
    }
    public void decrementa(int segons) {
        this.segons = this.segons - segons;
    }
    public int compareTo(Hora hora2) {
        if (this.hores > hora2.hores) return 1;
        if (this.hores < hora2.hores) return -1;
        if (this.minuts > hora2.minuts) return 1;
        if (this.minuts < hora2.minuts) return -1;
        if (this.segons > hora2.segons) return 1;
        if (this.segons < hora2.segons) return -1;
        return 0;
    }
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", this.hores, this.minuts, this.segons);
    }
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }
    public static void main (String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0,0,2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",hora1, composaOperadorComparacio(hora1, hora2),hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",hora1, composaOperadorComparacio(hora1,hora2),hora2);
    }
}
