public class Sospeso implements IStudente{
    private float media;

    Sospeso(float media){
        this.media = media;
    }

    @Override
    public float getMedia() {
        return media;
    }

    @Override
    public void nuovoEsame(String materia, int voto) {
        System.out.println("Non è possibile sostenere esami");
    }

    
}