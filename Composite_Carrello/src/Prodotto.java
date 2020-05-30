public interface Prodotto {
    public void print();
    public float getPrezzo();
    public int getPeso();

    /**It should be called only in Composite Objects */
    public void add(Prodotto prodotto);

    /**It should be called only in Composite Objects */
    public void remove(Prodotto prodotto);
}