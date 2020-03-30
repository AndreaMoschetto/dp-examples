import java.util.Random;
/**Platea è un ConcreteProduct */
public class Platea implements Posto{
    private String[] nomi = {"A", "B", "C", "D", "E", "F"};
    private int numero;
    private int riga;

    public Platea(){
        numero = new Random().nextInt(10) + 1;
        riga = new Random().nextInt(5); 
    }
    @Override
    public int getCosto(){
        if(numero > 5 && rigaMax()) return 100;
        if(numero > 5 && rigaMin()) return 80;
        return 60;
    }
    @Override
    public String getPosizione(){
        return nomi[riga].concat(Integer.toString(numero));
    }
    @Override
    public String getSettore(){
        if(riga == 0) return "Riservato";
        return "Normale";
    }

    private boolean rigaMax(){
        return (riga >= 1 && riga <= 4);
    }
    
    private boolean rigaMin(){
        return (0 == riga || 5 == riga);
    }
}