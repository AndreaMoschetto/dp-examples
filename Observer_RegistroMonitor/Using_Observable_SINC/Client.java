public class Client {
    private Registro registro = new Registro();
    private Monitor monitor = new Monitor();

    public static void main(String[] args){
        Client client = new Client();
        client.test();
    }

    private void test(){
        registro.addObserver(monitor);

        registro.ritira(500);

        registro.deposita(1200);
        System.out.println("Saldo attuale: " + registro.getBilancio() + "euro");
        System.out.println("Il subject ha effettuato " + monitor.getNumOperazioni() + " operazioni");
    }
}