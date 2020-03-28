public class TestSingleton{
    private Singleton single;
    public void init_state(){
        single = Singleton.getInstance();
    }
    public void testPrintSomething(){
        init_state();
        if(single.printSomething().equals("Something... XD"))
            System.out.println("test Print something: SUCCESS");
        else 
        System.out.println("test Print something: FAILED");
    }

    public static void main(final String[] args) {
        final TestSingleton test = new TestSingleton();
        test.testPrintSomething();
    }
}