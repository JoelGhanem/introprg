//Aquest exercici torna a revisar l'ascensor que hem fet en exercicis anteriors. En aquesta ocasió ampliaràs els mètodes que ofereix l'ascensor de manera que aquest sigui més usable.//
public class Ascensor {
    private boolean abaix = false;
    private boolean amunt = false;
    private boolean aturat = true;
    private boolean movent = false;
    private boolean pujant = false;
    private boolean baixant = false;
    private int pis = -1;
    private String moviment = "aturat";
    //booleans
    public boolean aturat() {
        if (aturat) {
            pujant = false;
            baixant = false;
            movent = false;
            return false;
        } else {
            movent = false;
            return true;
        }
    }
    public boolean arrencaAmunt() {
        if(aturat) { 
            moviment = "pujant";
            aturat = false;
            return true;
        } else {
            movent = true;
            return false;
        }
    }

    public boolean arrencaAbaix() {
        if (aturat) {
            moviment = "baixant";
            aturat = false;
            return true;
        } 
        else {
            movent = true;
            return false;
        }
    }

    public boolean estaAturat() {
        if(aturat) { return true;}
        else { return false;}
    }
    public boolean estaPujant() {
        return pujant;
    }
    public boolean estaBaixant() {
        return baixant;
    }
    public boolean estaMovent() {
        if (aturat) { return false; }
        else { return true;}
    }
    public boolean estaAbaix() {
        if (abaix) { moviment = "aturat";}
        return abaix;
    }
    public boolean estaAmunt() {
        return amunt;
    }
    //public ints
    public int seguentPis() {
        int nouPis = pis;
        if (moviment.equals("pujant")) { nouPis ++;}
        else if (moviment.equals("baixant")) { nouPis --;}
        if (nouPis == 11) {
            nouPis = 9; 
            amunt = false; 
            moviment = "baixant";
            pis = nouPis;
        } 
        if (nouPis == -1) {
            abaix = true;
        }
        pis = nouPis;
        return pis;
    }

    public int getPis() {
        return pis;
    }
    public String getMoviment() {
        return moviment;
    }
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            if (nouPis == 10) amunt = true; abaix = false;
            if (nouPis == -1) abaix = true; //amunt = false;
            if (nouPis > -1 && nouPis < 10) abaix = false; 
            if (nouPis > pis) pujant = true;
            if (nouPis < pis) baixant = true;
            if (nouPis == pis) aturat = true;
            pis = nouPis;
        }
    }
    public void setMoviment(String nouMoviment) {
        if (nouMoviment.equals("pujant")) {
            amunt = true;
            pujant = true;
            abaix = false;
            amunt = true;
            aturat = false;
            movent = true;
            moviment = nouMoviment;
        } else if (nouMoviment.equals("baixant")) {
            baixant = true;
            amunt = true;
            movent = true;
            abaix = false;
            aturat = false;
            moviment = nouMoviment;
        }
    } 
    public String comEsta() {
        String esta = moviment + " al pis " + pis;
        return esta;
    }
}
