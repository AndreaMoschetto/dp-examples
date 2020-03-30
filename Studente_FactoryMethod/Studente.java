import java.util.ArrayList;
import java.util.List;

/**
 * Class wich implements the "ConcreteProduct" role in the Factory Method design
 * parttern
 */
public class Studente implements IStudente{
    private List<Esame> exams = new ArrayList<>(); 

    @Override
    public float getMedia(){
        if(exams.size() == 0) return 0;
        float sum = 0;
        for(Esame e : exams)
            sum += e.getVoto();
        return sum/exams.size();
    }
    
    @Override
    public void nuovoEsame(String materia, int voto){
        exams.add(new Esame(materia, voto));
    }
}