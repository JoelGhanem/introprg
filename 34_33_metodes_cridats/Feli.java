// En aquest exercici analitzare els metodes que es criden realment quan hi ha una herencia pel mig. Tenim 3 arxius en un, tots son de la mateixa linea d'heritatge, tenim la superclasse Feli, la subclasse Gat i la sub sub classe GatRenat, totes fan el mateix pero una es fuilla de l'altre

class Feli {
    public Feli() {
        System.out.println("Neix Felí");
    }
    public void netejaUrpes() {
        System.out.println("Felí neteja urpes des de " + this.getClass());
    }
    public void menja(Menjar menjar) {
        System.out.println("Felí menja " + menjar + " des de " + this.getClass());
    }
}
class Gat extends Feli {
    public Gat() {
        System.out.println("Neix Gat");
    }
    public void miola() {
        System.out.println("Gat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Gat menja " + menjar + " des de " + this.getClass());
        super.menja(menjar);
    }
}
class GatRenat extends Gat {
    public GatRenat() {
        System.out.println("Neix Renat");
    }
    @Override
    public void miola() {
        System.out.println("Renat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Renat menja " + menjar + " des de " + this.getClass());
        netejaUrpes();
        super.menja(menjar);
    }
}
class Menjar {
    private static final String MENJAR_PER_DEFECTE = "sardines";
    private final String nom;
    public Menjar(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        } else {
            this.nom = MENJAR_PER_DEFECTE;
        }
        System.out.println("Neix Menjar(\"" + this.nom + "\")");
    }
    public String toString() { return nom; }
}

