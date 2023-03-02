//En aquest exercici li posarem un picarol al gat Renat
public class Picarol {
    private int cops = 0;
    public void sona() {
        System.out.println("clink-clink");
    }
    public int quantsCops() {
        this.cops++;
        return this.cops;
    }
}

