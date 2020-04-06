
public class Client {
    private static Libro l1 = new Libro(1);
    private static Libro l2 = new Libro(2);
    private static String nome  = "Alan";
    private static Registro registro = new Registro();

    public static void main(String[] args){
        presta(l1);
        presta(l2);
        leggi(l1);
    }
    public static void presta(Libro libro){
        if(registro.prestaLibro(nome, libro))
            System.out.println("Prestito Registrato");
    }
    public static void leggi(Libro libro){
        if(registro.leggiLibro(libro))
            System.out.println(nome + " legge " + libro.geTitolo());
    }
}