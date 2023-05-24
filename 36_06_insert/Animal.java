/*És tracta de la classe que defineix els objectes que manipularem a la nostra demostració. Disposa de dos camps: el nom i la categoria A banda, inclou un identificador de base de dades. Serà un valor que generarà el nostre SGBD i que ens permetrà vincular les instàncies de Animal amb la taula corresponent.*/
public class Animal {
    private int id;
    private String nom;
    private Categoria categoria;
    public Animal(String nom, Categoria categoria) throws IllegalArgumentException {
        if(nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.nom = nom;
        this.categoria = categoria;
    }
    public Animal(int id, String nom, Categoria categoria) throws IllegalArgumentException {
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        if(nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.id = id;
        this.nom = nom;
        this.categoria = categoria;
    }
    //getters
    public int getId() {
        if (!idIndefinit()) {
            return this.id;
        }
        return -1;
    }
    public String getNom() {return this.nom;}
    public Categoria getCategoria() {return this.categoria;}
    public boolean idIndefinit() {
        if (id > 0) {
            return false;
        }
        return true;
    }
}
