
public class Client {
    private static Biglietto b = new Biglietto();

    public static void main(String[] args) {
        usaBiglietto();
        nonUsaOk();
    }

    private static void usaBiglietto() { b.prenota("Mario Tokoro"); b.mostra(); b.compra(); b.mostra(); }

    private static void nonUsaOk() {
        b.compra();
        b.cancella();
        b.prenota("Mario Biondi");
    }
}