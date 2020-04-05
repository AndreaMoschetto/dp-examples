/**ConcreteProduct di Shape */
public class Circle implements Shape{
    private double raggio;

    public Circle(Double raggio){
        this.raggio = raggio;
    }

    @Override
    public double getPerimetro(){
        return  2 * Math.PI * raggio;
    }
    @Override
    public double getArea(){
        return raggio * raggio * Math.PI;
    }
}