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

    public void setHores(int hores) {
        //valor Positivo
        if (hores >= 0) {
            if (this.hores == 23) {
                this.hores = 0;
            } else {
                this.hores += hores;
            }
            //valor negativo
        } else {
            if(this.hores - hores <= 0) {
                this.hores = 23;
            }
            if (this.hores == 0) {
                this.hores = 23;
            } else {
                this.hores--;
            }
        }
    }
    public void setMinuts(int minuts) {
        //valor positivo
        if(minuts >= 0) {
            if (this.minuts + minuts >= 60) {
               this.minuts = minuts; 
            } else {
                this.minuts += minuts;
            }
            //valor negativo
        } else {
            if (this.minuts - Math.abs(minuts) <= 0) {
                setHores(-1);
                this.minuts = 60;
            }
            this.minuts -= Math.abs(minuts);
        }
    }
    public void setSegons(int segons) {
        this.segons = segons;
    }
    public void incrementa() {
        if (this.segons == 59) {
            if (this.minuts == 59) {
                setHores(1);
                this.minuts = 0;
                this.segons = 0;
            } else {
                setMinuts(1);
                this.segons = 0;
            }
        } else {
            this.segons++;
        }
    }
    public void incrementa(int segons) {
        //si se aumenta mas de 1 minuto
        if (this.segons + segons > 60) {
            int suma = this.segons + segons;
            //si hay horas
            if (suma >= 3600) {
                int hores = suma / 3600;
                int minuts = (suma/3600) /60;
                setMinuts(minuts);
                setHores(hores);
                this.segons = suma - (3600 * hores);
                //si hay minutos
            } else {
                setMinuts(minuts);
                this.segons = suma - (60 * minuts);
            }
            // si no se aumenta mas de un minuto
        } else if (this.segons + segons == 60) {
            this.segons = 0;
            setMinuts(1);
        } else {
            this.segons += segons;
        }
    }
    public void decrementa() {
        if (this.segons == 0) {
            setMinuts(-1);
            this.segons = 59;
        } else {
            this.segons--;
        }
    }
    public void decrementa(int segons) {
        int tiempo;
        //calcula cuantas horas
        if (segons >= 3600) {
            tiempo = (segons /3600) % 24;
            setHores((segons/3600) *-1);
            // calcula cuantos minutos
        } else if (segons >= 60) {
            tiempo = (segons/60)%60;
        }
        if (this.segons - segons < 0) {
            this.segons = 60 - segons;
        } else {
            this.segons = this.segons - segons;
        }
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
