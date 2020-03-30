import java.util.Random;
/**Palco è un ConcreteProduct */
public class Palco implements Posto{
    private final int numero;
    
    public Palco(){
        numero = new Random().nextInt(20) + 1;
    }

    @Override
    public int getCosto(){
        if(numero > 10) return 50;
        return 40;
    }
    @Override
    public String getPosizione(){
        return Integer.toString(numero);
    }
    @Override
    public String getSettore(){
        if(20 == numero) return "Centrale";
        if(numero > 10) return "Verde";
        return "Blu";
    }
}