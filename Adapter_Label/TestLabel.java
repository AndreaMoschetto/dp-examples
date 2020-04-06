
public class TestLabel {
    public static void main(String[] args){
        testGetLabel();
		testChangeLabel1();
		testChangeLabel2();
		testUsed();
    }

    private static void testGetLabel(){
        ILabel s = new Label("LAB");
        if(s.getNextLabel().equals("LAB1")) System.out.println("OK Test get next label");
        else System.out.println("FAILED Test get next label");
    }

    private static void testChangeLabel1() {
        ILabel s = new Label("LAB");
        s.insertTag("cat");
        if (s.getNextLabel().equals("cat1")) System.out.println("OK Test change label 1");
        else System.out.println("FAILED Test change label 1");
    }

    private static void testChangeLabel2() {
        ILabel s = new Label("LAB");
        s.insertTag("zebra");
        if (s.getNextLabel().equals("LAB1")) System.out.println("OK Test change label 2");
        else System.out.println("FAILED Test change label 2");
    }

    private static void testUsed() {
        ILabel s = new Label("LAB");
        if (s.checkUsed(1) && !s.checkUsed(2)) System.out.println("OK Test used");
        else System.out.println("FAILED Test used");
        s.getNextLabel();
        if (s.checkUsed(2) && !s.checkUsed(3)) System.out.println("OK Test used 2");
        else System.out.println("FAILED Test used 2");
    }
}