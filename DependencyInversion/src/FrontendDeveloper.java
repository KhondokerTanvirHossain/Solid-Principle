public class FrontendDeveloper implements Developer{
    public void writeJavaScript(){
        System.out.println("Write JavaScript");
    }

    @Override
    public void develop() {
        writeJavaScript();
    }
}
