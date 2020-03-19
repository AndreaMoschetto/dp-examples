import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * This class performs operations on a payment list stored in a file
 * */
public class Pagamenti {
	private List<Float> importi= new ArrayList<>();; //Attributo per lista valori
	private File file;
	private static List<Pagamenti> instance = new ArrayList<>();
	private static int countInstances = 0;
	
	private Pagamenti() {}
	
	public static Pagamenti getInstance() {
		for(Pagamenti x : instance) {
			
		}
		
		if(instance.get(arg0) <= 2) {
			countInstances++;
			return instance;
		}
		return null;
	}
	
	public void leggiFile(String c, String n) throws IOException {
		file = new File(c,n);
		final LineNumberReader fileReader = new LineNumberReader(new FileReader(file));
		String line;
		while(true) {
			line = fileReader.readLine();
			if(null == line) break;
			inserisci(Float.parseFloat(line));
		}
		fileReader.close();
	}
	
	public void inserisci(float x) {
		if(!importi.contains(x))importi.add(x);
	}
	
	public float calcolaSomma() {
		float somma = 0;
		for(float x : importi) {
			somma += x;
		}
		return somma;
	}
	
	public float calcolaMassimo() {
		float max = 0;
		for(float x : importi) {
			if(max < x) max = x;
		}
		return max;
	}
	
	public void svuota() {
		importi = new ArrayList<>();
	}
}
