import java.util.ArrayList;
import java.util.List;

public class Carrello implements Prodotto {
    private List<Prodotto> nestedElem = new ArrayList<>();

    @Override
    public void print() {
        System.out.println("Carrello ------- ------- ------- ------- ---");
        for(Prodotto child : nestedElem){
            child.print();
        }
        System.out.println("---------------- ------- ------- ------- ---");
        System.out.println("---------------- ------- Prezzo totale: " + getPrezzo());
    }

    @Override
    public float getPrezzo() {
        return nestedElem.stream()
            .map(e -> e.getPrezzo())
            .reduce(0f, Float::sum);
    }

    @Override
    public int getPeso() {
        return nestedElem.stream()
            .map(e -> e.getPeso())
            .reduce(0, Integer::sum);
    }

    @Override
    public void add(Prodotto prodotto) {
        System.out.println("Carrello: Add");
        nestedElem.add(prodotto);
    }

    @Override
    public void remove(Prodotto prodotto) {
        nestedElem.remove(prodotto);
    }
    
}