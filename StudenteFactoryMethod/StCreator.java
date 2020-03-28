/**
 * interface wich implements "ConcreteCreator" role of Factory Method design pattern
 */
public class StCreator{
    /**
     * this is the factory method wich returns a IStudente ConcreteProduct
     */
    public static IStudente getStudente(int media){
        if(media == 0) return new Studente();
        else return new Sospeso(media);
    }
}