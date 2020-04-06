import java.util.Arrays;
import java.util.List;

/** Adapter wich implements ILabel interface */
public class Label implements ILabel{
    private List<String> l = Arrays.asList("cat","dog", "sleep");
    private LabelServer ls;
    private String p;
    //Si istanzia subito un adaptee
    public Label(String prefix){
        p = prefix;
        ls = new LabelServer(p);
    }

    //l'adattamento qui consiste nel chiamare un metodo con un nome diverso sull'Adaptee
    @Override
    public String getNextLabel(){
        return ls.serveNextLabel();
    }

    //l'adattamento qui consiste nel fornire una funzionalità diversa rispetto
    //a quella del metodo sull'Adaptee, che implementa solo parzialmente quanto richiesto dal client
    @Override
    public boolean checkUsed(int k){
        return (ls.getCount() >= k);
    }
    

    //Qui oltre che chiamare il corrispondente metodo sull'Adaptee, si verifica una precondizione
    @Override
    public void insertTag(String t){
        if(l.contains(t)) ls.change(t);
    }
}