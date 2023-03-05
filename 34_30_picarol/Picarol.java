//En aquest exercici li posarem un picarol al gat Renat
public class Picarol {
    private int cops = 0;
    public void sona() {
        //String posicio
        System.out.println("clink-clink");
        this.cops++;
    }
    public int quantsCops() {
        return this.cops;
    }
}
