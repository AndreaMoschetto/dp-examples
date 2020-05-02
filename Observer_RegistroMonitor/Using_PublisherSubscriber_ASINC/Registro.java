import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.Flow.Subscriber;

public class Registro{
    //SubmissionPublisher<type> notify all its Subscrivers in an asyncronus way (multi-thread), 
    //sending them a type item passed as parameter
    private SubmissionPublisher<Object> publisher = new SubmissionPublisher<>();

    private double bilancio = 0;

    public void addSubscriber(Subscriber<Object> subscriber){
        publisher.subscribe(subscriber);
    }

    public boolean ritira(double somma){
        System.out.println("Prelievo di " + somma + "euro");
        if(bilancio >= somma){
            bilancio -= somma;
            publisher.submit(bilancio);
            return true;
        }
        System.out.println("Operazione non permessa");
        return false;
    }
    public void deposita(double somma){
        System.out.println("Deposito di " + somma + "euro");
        bilancio += somma;
        publisher.submit(bilancio);
    }
    public double getBilancio(){
        return bilancio;
    }
}