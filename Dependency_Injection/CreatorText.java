/**ConcreteCreator of TextEditor wich implements a Dependency Injection of SpellingCheck on it*/
public class CreatorText {
    public static TextEditor getEnglishEditor(){
        return new TextEditorA(new SpCheckEnglish());
    }
    public static TextEditor getItalianEditor(){
        return new TextEditorA(new SpCheckItalian());
    }
}