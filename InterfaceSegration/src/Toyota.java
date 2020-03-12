public class Toyota implements Car,Race,CarCleaner {
    @Override
    public String getCarCompany() {
        return "Toyota";
    }

    @Override
    public String getRaceCarVersion() {
        return "Corolla";
    }

    @Override
    public String carCleaner() {
        return "Clean Car";
    }
}
