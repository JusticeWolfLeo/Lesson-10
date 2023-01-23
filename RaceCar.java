public class RaceCar  extends  Car{
    protected RaceCar(String model, int maxSpeed, int yearOfManufacture) {
        super(model, 100500, yearOfManufacture);
    }
    protected void pitStop() {
    }

    @Override
    public int getMaxSpeed() {
        System.out.println("Слишком быстро");
        return 0;
    }
}
