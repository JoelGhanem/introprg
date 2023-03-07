class DemoCrides {
    public static void main(String[] args) {
        Feli felix = new Feli();
        Gat gat = new Gat();
        GatRenat renat = new GatRenat();
        felix.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();
        gat.miola();
        renat.miola();
        Menjar menjar = new Menjar("bacallà");
        renat.menja(menjar);
        //No hacen falta los dos de abajo porque una vez llamas al hijo todos los padres salen tambien
        //felix.menja(menjar);
        //gat.menja(menjar);
    }
}
