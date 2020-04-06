import java.util.Arrays;
import java.util.List;
/**Socio verifica se un utente è registrato, è rappresenta una classe del sottosistema */
public class Socio {
    private final List<String> listaSoci = Arrays.asList("Alan", "Dan");
    public boolean verificaID(String name){
        System.out.println("Socio: in verificaID");
        return listaSoci.contains(name);
    }
}