import java.util.List;

public class Project {
    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontDeveloper = new FrontendDeveloper();
//    public void implement(){
//        backendDeveloper.WriteJava();
//        frontDeveloper.writeJavaScript();
//    }
    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;

    }

    public void implement() {

        developers.forEach(d->d.develop());

    }


}
