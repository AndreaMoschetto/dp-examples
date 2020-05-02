import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class Monitor implements Subscriber<Object> {
    private int numOperazioni = 0;

    public int getNumOperazioni() {
        return numOperazioni;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNext(Object saldo) {
        System.out.println("[IN Monitor]: Il Saldo corrisponde a: " + saldo + "euro");
        numOperazioni++;
    }

    @Override
    public void onError(Throwable throwable) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onComplete() {
        // TODO Auto-generated method stub

    }
}