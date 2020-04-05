import java.util.List;
import java.util.LinkedList;

/**ConcreteCreator di Shape che implementa un ObjectPool Singleton*/
public class CreatorPool{
    private static CreatorPool instance;
    private List<Shape> pool = new LinkedList<>();
    private final int MAXSIZE = 2;

    private CreatorPool(){
        pool.add(new Circle(35.0));
        pool.add(new Circle(10.0));
    }

    public static CreatorPool getInstance(){
        if(instance == null) instance = new CreatorPool();
        return instance;
    }

    public Shape getShape(/*double value*/){
        Shape shape = null;
        if(pool.size() > 0)
            shape = pool.remove(0);
        /*else
            shape = new Circle(value);*/
        return shape;
    }
    public void releaseShape(Shape shape){
        if(pool.size() >= MAXSIZE) return;
        pool.add(shape);
        shape = null;
        
        System.out.println("IN CreatorPool: riferimento eliminato");
    }
}