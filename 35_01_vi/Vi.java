/*Una botiga de vi sense vi no és res. Així que començarem implementant aquesta classe tant important.*/
public class Vi {
    private String nom;
    private int preu;
    private int estoc = 0;

    //constructors
    public Vi(String nom, int preu) {
        this.estoc = 0;
        this.nom = nom;
        if (preu > 0) {
            this.preu = preu;
        } else {
            this.preu = -1;
        }
    }
    public Vi(String nom, int preu, int estoc) {
        this.nom = nom;

        if (preu > 0) {
            this.preu = preu;
        } else {
            this.preu = -1;
        }

        if (estoc > 0) {
            this.estoc = estoc;
        } else {
            this.estoc = -1;
        }
    }

    //getters
    public String getNom() { return this.nom; }

    public int getPreu() { return this.preu; }

    public int getEstoc() { return this.estoc; }

    //setters
    public void setPreu(int preu) {
        if (preu > 0) {
            this.preu = preu;
        }
    }

    public void setEstoc(int estoc) {
        if (estoc > 0) {
            this.estoc = estoc;
        }
    }
    //altres
    public boolean esValid() {
        if (getPreu() < 0) {
            return false;
        }
        if (getEstoc() < 0) {
            return false;
        }
        //nom
        return true;
    }

    public static String normalitzaNom(String nom) {
        nom.trim();
        if (nom.length() < 0) {
            return nom;
        }
        return nom;
    }

    @Override 
    public String toString() {
        return nom;
    }
}
