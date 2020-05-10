public class Monitor implements Observer {
    private int numOperazioni = 0;
    
    @Override
    public void update(Object obj){
        System.out.println("[IN Monitor]: Il Saldo corrisponde a: " + obj + "euro");
        numOperazioni++;
    }

    public int getNumOperazioni(){
        return numOperazioni;
    }
}