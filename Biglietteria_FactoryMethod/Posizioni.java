/**Posizioni è un ConcreteCreator con un metodo Factory*/
public class Posizioni extends GnrPosizioni{
    //Metodo Factory che ritorna una istanza
    @Override
    public Posto getPosto(int tipo){
        //crea l'istanza di un ConcreteProduct
        if(1 == tipo) return new Palco();
        return new Platea();
    }
}