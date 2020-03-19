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
	private List<Float> importi = new ArrayList<>(); //Attributo per lista valori
	
	public void leggiFile(String c, String n) throws IOException {
		final LineNumberReader file = new LineNumberReader(new FileReader(new File(c,n)));
		String line;
		while(true) {
			line = file.readLine();
			if(null == line) break;
			inserisci(Float.parseFloat(line));
		}
		file.close();
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
