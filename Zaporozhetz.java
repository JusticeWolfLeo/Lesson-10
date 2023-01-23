public class Zaporozhetz  extends Car {
    private int repairTime;
    protected Zaporozhetz(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, 1991);
        this.repairTime = 123456789;
    }
    @Override
    public void gas() {
        System.out.println("Нету мощности, все плохо");
    }
}
