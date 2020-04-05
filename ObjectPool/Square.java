/**ConcreteProduct di Shape */
public class Square implements Shape{
    private double lato;

    public Square(double lato){
        this.lato = lato;
    }


    @Override
    public double getPerimetro(){
        return lato * 4;
    }
    @Override
    public double getArea(){
        return lato * lato ;
    }
}