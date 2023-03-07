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
        felix.menja(menjar);
        //gat.menja(menjar);
    }
}
