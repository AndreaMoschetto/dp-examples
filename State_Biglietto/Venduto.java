import java.time.LocalDateTime;

public class Venduto implements StatoBiglietto {

    private final String nome;
    private LocalDateTime dataPagam;

    public Venduto(String n){this.nome = n;}
    
    @Override
    public void mostra() {
        System.out.println("VEND Nome: " + nome);
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("VEND Non puo' cambiare il nome dello stato Venduto");
        return this;
    }

    @Override
    public StatoBiglietto paga() {
        if(null == dataPagam){
            dataPagam = LocalDateTime.now();
            System.out.println("VEND Pagamento effettuato");
        }
        else{
            System.out.println("VEND Il biglietto era gia' stato pagato");
        }
        return this;
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("VEND Non puo' cambiare stato da Venduto a Disponibile");
        return this;
    }

}