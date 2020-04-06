
public class Client {

    private static void printShape(Shape shape) {
        if (shape == null)
            System.out.println("la shape è null");
        else
            System.out.println("Area: " + shape.getArea() + "; Perimetro: " + shape.getPerimetro());
    }

    public static void main(String[] args) {
        final CreatorPool pool = CreatorPool.getInstance();

        final Shape s1 = pool.getShape();
        printShape(s1);
        
        final Shape s2 = pool.getShape();
        printShape(s2);

        final Shape s3 = pool.getShape();
        printShape(s3); // questa darà null se il programma funziona bene

        pool.releaseShape(s2); //ora rilascio la s2
        printShape(s2);//Ma la printo lo stesso dopo che l'ho rilasciata
        //purtroppo da lo stesso valore che dava la precedente print quindi l'istanza è ancora qui
        //ma il prof Tramontana mi ha detto che semplicement il pool si fida del client
        //che dopo il release dovrebbe fare un bell s2 = null 
    }
}