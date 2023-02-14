/*Afegeix al repertori de mètodes de Ascensor els següents: estaAbaix() i estaAmunt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament. estaMovent() retorna cert quan està pujant o baixant. comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.*/
public class Ascensor {
    private boolean abaix = true;
    private boolean amunt = true;
    private boolean aturat = true;
    private boolean movent = false;
    private boolean pujant = false;
    private boolean baixant = false;
    private int pis = -1;
    private String moviment = "aturat";
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
    public int getPis() {
        return pis;
    }
    public String getMoviment() {
        return moviment;
    }
    public void setPis(int nouPis) {
        if (nouPis >= -1 && nouPis <= 10) {
            if (nouPis == 10) amunt = true; abaix = false;
            if (nouPis == -1) abaix = true; amunt = false;
            if (nouPis > -1 && nouPis < 10) abaix = false; amunt = false;
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
