/*Aquest arxiu es el nostrebehicle que te 3 categories, model i marca*/
public class Vehicle {
    public static int BASIC = 1;
    public static int GENERAL = 2;
    public static int LUXE = 3;
    private String marca;
    private String model;
    private int categoria;
    //constructors
    public Vehicle(String marca, String model, int categoria) {
        this.marca = marca;
        this.model = model;
        this.categoria = categoria;
    }
    // getters
    public String getMarca() { return this.marca;}
    public String getModel() { return this.model;}
    public int getCategoria() { return this.categoria;}
    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
