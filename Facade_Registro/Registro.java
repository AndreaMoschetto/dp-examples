/**
 * Registro implementa il riolo Facade per il sottosistema formato da
 * Prestiti, Registro e Socio. Registro verifica se una certa azione su libro (leggi o presta)
 * è autorizzata e registra i dati rilevati
 */
public class Registro {
    private final Permessi permessi = new Permessi();
    private final Socio socio = new Socio();
    private final Prestiti prestiti = new Prestiti();

    //Notare che prestaLibro() chiama i metodi del sottosistema
    public boolean prestaLibro(String nome, Libro libro){
        System.out.println("Registro: presta");
        if(socio.verificaID(nome) && permessi.sePrestabile(nome)){
            System.out.println("Registro: prestabile");
            prestiti.registra(nome, libro.getTitolo());
            return true;
        }
        return false;
    }

    public boolean leggiLibro(Libro libro){
        System.out.println("Registro: leggi");
        final String nomePersona = prestiti.trovaPersona(libro.getTitolo());

        System.out.println("Registro: persona che ha in prestito il libro " + nomePersona);
        return (socio.verificaID(nomePersona) && permessi.seLeggibile(nomePersona));
    }
}