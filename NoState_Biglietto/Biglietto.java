public class Biglietto {
    private String codice = "XYZ", nome;
    private int prezzo = 100;

    private enum StatoBiglietto {
        DISP, BLOC, VEND
    }

    private StatoBiglietto stato = StatoBiglietto.DISP;

    public void prenota(String s) {
        switch (stato) {
            case DISP:
                System.out.println("Cambia stato da Disponibile a Bloccato");
                nome = s;
                System.out.println("Inserito nuovo intestatario");
                stato = StatoBiglietto.BLOC;
                break;

            case BLOC:
                nome = s;
                System.out.println("Inserito nuovo intestatario");
                break;

            case VEND:
                nome = s;
                System.out.println("Non puo' cambiare il nome di un biglietto venduto");
                break;
        }
    }

    public void cancella() {
        switch (stato) {
            case DISP:
                System.out.println("Lo stato era gia' disponibile");
                break;

            case BLOC:
                nome = "";
                System.out.println("Cambia stato da Bloccato a Disponibile");
                stato = StatoBiglietto.DISP;
                break;

            case VEND:
                System.out.println("Non puo' cambiare lo stato da Venduto a Disponibile");
                break;
        }
    }

    public void compra() {
        switch (stato) {
            case DISP:
                System.out.println("Non si puo’ pagare, bisogna prima intestarlo");
                break;
            case BLOC:
                System.out.println("Cambia stato da Bloccato a Venduto");
                stato = StatoBiglietto.VEND;
                System.out.println("Pagamento effettuato");
                break;
            case VEND:
                System.out.println("Il biglietto era gia' stato venduto");
                break;
        }
    }

    public void mostra() {
        System.out.println("Prezzo: " + prezzo + "  codice: " + codice);
        if (stato == StatoBiglietto.BLOC || stato == StatoBiglietto.VEND)
            System.out.println("Nome: " + nome);
    }

}