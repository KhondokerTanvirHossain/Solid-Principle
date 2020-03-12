public class Car {
    private String name;
    private int wheel;
    private String company;

    public Car() {
    }

    public Car(String name, int wheel, String company) {
        this.name = name;
        this.wheel = wheel;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
//    private String race;
//
//    public String getRace() {
//        return race;
//    }
//    public int raceRating(){
//        return 12;
//    }
}
