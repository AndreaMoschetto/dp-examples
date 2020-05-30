public class Libro implements Prodotto{

    private String titolo;
    private float prezzo;
    private int peso;

    public Libro(String titolo, float prezzo, int peso){
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.peso = peso;
    }

    @Override
    public void print() {
        System.out.println("Libro: " + titolo + "\tPrezzo: " + getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return prezzo;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    /**It should be called only in Composite Objects */
    @Override
    public void add(Prodotto prodotto) {
    }

    /**It should be called only in Composite Object */
    @Override
    public void remove(Prodotto prodotto) {
    }
    
}