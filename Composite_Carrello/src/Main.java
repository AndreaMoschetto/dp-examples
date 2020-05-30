public class Main{
    private static final Prodotto cart = Creator.getCarrello();
    private static final Prodotto libro = Creator.getLibro();
    private static final Prodotto eBook = Creator.getEBook();

    public static void main(String[] args){
        System.out.println("\nChiama print su libro");
        libro.print();
        System.out.println("Peso di libro: " + libro.getPeso());

        System.out.println("\nInserimento di libro e eBook in cart");
        cart.add(libro);
        cart.add(eBook);
        
        System.out.println("\n");
        cart.print();

        System.out.println("Peso del carrello: " + cart.getPeso());
    }
}