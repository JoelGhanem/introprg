//Implementa una nova verios del GatRenat, que disposara de funcionalitats com les impleentades a exercicis previs com ara el de Renat ensinistrat

public class GatRenat extends Gat {
   
    public boolean viu = true;

    //Strings
    public String estirat() {
        if (estaEstirat()) {
            return "no faig res";
        } else { 
            setPosicio("estirat");
            return "m'estiro";
        }
    }
    public String aixecat() {
        if (estaDret()) {
            return  "no faig res";
        } else { 
            setPosicio("dret");
            return  "m'aixeco"; 
        }
    }
    public String seu() {
        if (estaAssegut()) {
            return  "no faig res";
        } else { 
            setPosicio("assegut");
            return  "m'assec";
        }
    }



    //booleans
    public boolean estaViu() { return viu; }

    public boolean estaEstirat() { return posicio.equals("estirat"); }

    public boolean estaDret() {return posicio.equals("dret");}

    public boolean estaAssegut() { return posicio.equals("assegut");}


    public void setVides(int novesVides) {
        if (novesVides <= 0) viu = false; vides = novesVides;
    }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("assegut")) {
            posicio = novaPosicio;
        } else if (novaPosicio.equals("dret")){
            posicio = novaPosicio;
        } else {
            posicio = "estirat";
        }
    }
}

