/*Aquest arxiu es el nostrebehicle que te 3 categories, model i marca*/

public class Vehicle {
    public enum Categoria {
        BASIC,
        GENERAL,
        LUXE
    }
    
    private String marca;
    private String model;
    private Categoria categoria;
    
    public Vehicle(String marca, String model, int categoria) {
        this.marca = marca;
        this.model = model;
        setCategoria(categoria);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModel() {
        return model;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setCategoria(int categoria) {
        switch (categoria) {
            case 1:
                this.categoria = Categoria.BASIC;
                break;
            case 2:
                this.categoria = Categoria.GENERAL;
                break;
            case 3:
                this.categoria = Categoria.LUXE;
                break;
            default:
				this.categoria = Categoria.BASIC;
        }
    }
}

