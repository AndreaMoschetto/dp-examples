import java.util.Set;
import java.util.TreeSet;
/**GnrPosizioni è un reator */
public abstract class GnrPosizioni{
    private static final int MAXPOSTI = 100;
    private final Set<String> pst = new TreeSet<>(); //set di posti
    //metodo che rimanda alla sottoclasse l'istanziazione della classe
    public Posto prendiNumero(int x){
        if(pst.size() == MAXPOSTI) return null;
        //il chiamante dovrebbe controllare de null
        Posto p;
        do{                  //fino a quando non trova un posto libero
            p = getPosto(x); //chiama il metodo della sottoclasse
        }while(pst.contains(p.getPosizione()));
        pst.add(p.getPosizione());
        return p;
    }

    public void printPostiOccupati(){
        for(String s : pst){
            System.out.println(s + " ");
        }
    }
    //Il metodo Factory è dichiarato ma non implementato
    public abstract Posto getPosto(int tipo);
}