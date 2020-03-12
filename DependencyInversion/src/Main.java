import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList<>();
        list.add(new FrontendDeveloper());
        list.add(new BackendDeveloper());
        Project project = new Project(list);
        project.implement();
    }
}
