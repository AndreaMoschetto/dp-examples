/**
 * This class implements an Exam
 */
public class Esame{
    private String materia;
    private int voto;
    Esame(String materia, int voto){
        this.materia = materia;
        this.voto = voto;
    }

    public String getMateria(){
        return materia;
    }
    public int getVoto(){
        return voto;
    }
}