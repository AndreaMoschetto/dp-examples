
public class Client{
    static TextEditor italianEditor = CreatorText.getItalianEditor();
    static TextEditor englishEditor = CreatorText.getEnglishEditor();
    public static void main(String[] args){
        italianEditor.put("ciao");
    }
}