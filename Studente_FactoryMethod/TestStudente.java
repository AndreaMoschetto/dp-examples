public class TestStudente{
    private final int SOSPESO = 1;
    private final int ATTIVO = 0;
    private IStudente stud = StCreator.getStudente(ATTIVO);
    private IStudente sosp = StCreator.getStudente(SOSPESO);
    private void INIT_STATE(){
        stud.nuovoEsame("Softwere Engineering", 30);
        stud.nuovoEsame("Sistemi Operativi", 30);
        stud.nuovoEsame("Reti di calcolatori", 27);
    }
    public void test_getMedia(){
        INIT_STATE();
        if(stud.getMedia() == 29) System.out.println("test getMedia: SUCCESS");
        else System.out.println("test getMedia: FAILED");
    }

    public static void main(String[] args){
        TestStudente test = new TestStudente();
        test.test_getMedia();
    } 
    
}