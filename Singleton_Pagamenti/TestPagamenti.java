import java.io.IOException;

public class TestPagamenti {
	private Pagamenti pgm = Pagamenti.getInstance();
	
	private void initLista() {
		pgm.svuota();
		pgm.inserisci(2.4f);
		pgm.inserisci(1.1f);
		pgm.inserisci(0.9f);
		pgm.inserisci(1.1f);
	}
	public void testSommaValori() {
		initLista();
		if(pgm.calcolaSomma() == 4.4f) {
			System.out.println("test somma valori: SUCCESS");
		}
		else {
			System.out.println("test somma valori: FAILED");
		}
	}
	public void testMaxValore() {
		initLista();
		if(pgm.calcolaMassimo() == 2.4f) {
			System.out.println("test calcola massimo: SUCCESS");
		}
		else {
			System.out.println("test calcola massimo: FAILED");
		}
	}
	public void testLeggiFile() {
		pgm.svuota();
		try {
			pgm.leggiFile("src/files","input.txt");
			System.out.println("test leggi file: SUCCESS");
			
		}catch(IOException e) {
			System.out.println("test leggi file: FAILED");
		}
	}
	
	public static void main(String[] args) {
		TestPagamenti test = new TestPagamenti();
		
		test.testLeggiFile();
		test.testSommaValori();
		test.testMaxValore();
	}
	
}
