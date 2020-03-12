public class BackendDeveloper implements Developer {
    public void WriteJava(){
        System.out.println("Write Java");
    }

    @Override
    public void develop() {
        WriteJava();
    }
}
