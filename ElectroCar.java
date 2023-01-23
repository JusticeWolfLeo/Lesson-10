public class ElectroCar extends Car{
    private int timeRecharge;
    public ElectroCar(String model, int maxSpeed, int yearOfManufacture) {
        super("Sovershenstvo", maxSpeed, yearOfManufacture);
        this.timeRecharge = 128;
    }
    public void ElectroFuel() {
    }

    @Override
    public void brake() {
        System.out.println("За одну секунду");
    }
}
