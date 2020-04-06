/**ConcreteProduct of TextEditor */
public class TextEditorA implements TextEditor{
    private SpellingCheck speller;

    public TextEditorA(SpellingCheck sp){
        speller = sp;
    }

    @Override
    public void put(String s){
        if(speller.check(s)){
            //do something
        }
    }
}