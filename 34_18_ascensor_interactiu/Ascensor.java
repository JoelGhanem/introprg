//Aquest exercici torna a revisar l'ascensor que hem fet en exercicis anteriors. En aquesta ocasió ampliaràs els mètodes que ofereix l'ascensor de manera que aquest sigui més usable.//
public class Ascensor {
    private boolean abaix = true;
    private boolean amunt = false;
    private boolean aturat = true;
    private boolean movent = false;
    private boolean pujant = false;
    private boolean baixant = false;
    private int pis = -1;
    private String moviment = "aturat";
    //booleans
    public boolean aturat() {
        aturat = true;
        return aturat;
    }
    public boolean arrencaAmunt() {
        baixant = false;
        pujant = true;
        return true;
    }

    public boolean arrencaAbaix() {
        pujant = false;
        baixant = true;
        return true;
    }

    public boolean estaAturat() {
        return aturat;
    }
    public boolean estaPujant() {
        return pujant;
    }
    public boolean estaBaixant() {
        return baixant;
    }
    public boolean estaMovent() {
        return movent;
    }
    public boolean estaAbaix() {
        return abaix;
    }
    public boolean estaAmunt() {
        return amunt;
    }
    //public ints
    public int seguentPis() {
        int nouPis = pis;
        nouPis +=1;
        if (nouPis == 10) {
            nouPis = 9; 
            amunt = false; 
            abaix = true;
            pis = nouPis;
            return pis;
        } else if (nouPis == -1) {
            nouPis = 0;
            amunt = true;
            abaix = false;
            pis = nouPis;
            return pis;
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
