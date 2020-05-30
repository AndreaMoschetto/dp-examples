public class EBook implements Prodotto {
    private String titolo;
    private float prezzo;
    
    public EBook(String titolo, float prezzo){
        this.titolo = titolo;
        this.prezzo = prezzo;
    }
    @Override
    public void print() {
        System.out.println("EBook: " + titolo + "\tPrezzo: " + getPrezzo());

    }

    @Override
    public float getPrezzo() {
        return (prezzo * (1-percSconto() / 100));
    }

    @Override
    public int getPeso() {
        return 0;
    }

    private float percSconto(){
        return 15;
    }

    //**It should be called only in Composite Objects */
    @Override
    public void add(Prodotto prodotto) {
    }

    //**It should be called only in Composite Objects */
    @Override
    public void remove(Prodotto prodotto) {
    }
    
}