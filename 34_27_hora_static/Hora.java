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
        if (hores > 23 || hores < 0 || minuts >= 60 || minuts < 0 || segons >= 60 || segons < 0) {
            this.hores = 0;
            this.minuts = 0;
            this.segons = 0;
        } else {
            this.hores = hores;
            this.minuts = minuts;
            this.segons = segons;
        }
    }
    public int getHores() { return hores;}

    public int getMinuts() { return minuts; }

    public int getSegons() { return segons; }

    public void setHores(int hores) {
        this.hores = hores;
    }
    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }
    public void setSegons(int segons) {
        this.segons = segons;
    }
    public void incrementa() {
        if (getSegons() == 59) {
            setSegons(0);
            if (getMinuts()== 59) {
                setMinuts(0);
                if(getHores() == 23) {
                    setHores(0);
                } else {
                    setHores(getHores() + 1);
                }
            } else {
                setMinuts(getMinuts() + 1);
            }
        } else {
            setSegons(getSegons() + 1); 
        }
    }
    public void incrementa(int segons) {
        if (segons < 0) {
            segons = segons * -1;
            decrementa(segons);
        } else {
            //si se aumenta mas de 1 minuto
            if (getSegons() + segons > 60) {
                int suma = (getSegons() + segons);
                //si hay horas
                if (suma >= 3600) {
                    int hores = (suma / 3600);
                    suma = (suma - (hores * 3600));
                    int minutsHores = (suma / 60);
                    suma = (suma - (minutsHores * 60));
                    int segonsHores = suma;
                    setMinuts(getMinuts() + minutsHores);
                    setHores(getHores() + hores);
                    if (getMinuts() >= 60){ 
                        setMinuts(getMinuts() % 60); 
                        setHores(getHores() + 1);
                    }
                    if (getHores() >= 24) setHores(getHores() % 24);
                    setSegons( segonsHores);
                    //si hay minutos
                } else {
                    int minutsMinuts = (suma/60);
                    suma = (suma - (minutsMinuts * 60));
                    setMinuts(getMinuts() + minutsMinuts);
                    setSegons(suma);
                }
                // si no se aumenta mas de un minuto
            } else if (getSegons() + segons == 60) {
                setSegons(0); 
                setMinuts(getMinuts() + 1);
            } else {
                setSegons(getSegons() + segons);
            }
        }
    }
    public void decrementa() {
        if (getSegons() == 0) {
            setSegons(59);
            if (getMinuts()== 0) {
                setMinuts(59);
                if(getHores() == 0){
                    setHores(23);
                } else {
                    setHores(getHores() - 1);
                }
            } else {
                setMinuts(getMinuts() - 1);
            }
        } else {
            setSegons(getSegons() - 1); 
        }
    }
    public void decrementa(int segons) {
        if (segons < 0) {
            segons = segons * -1;
            incrementa(segons);
        } else {
            int resta = getSegons() - segons;
            while(resta < 0) {
                setMinuts(getMinuts() - 1);
                resta += 60;
            }
            setSegons(resta);
            while(minuts < 0) {
                setHores(getHores() -1);
                minuts += 60;
            }
            while(hores < 0) {
                hores += 24;
            }
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
    public boolean esValida(int hores, int minuts, int segons) {
        if(hores >23 || hores < 0) return false;
        if(minuts >59 || minuts < 0) return false;
        if(segons >59 || segons < 0) return false;
        return true;
    }
}
