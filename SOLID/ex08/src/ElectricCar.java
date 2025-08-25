public class ElectricCar implements IMotorized, IElectric {
    @Override
    public void startEngine() {
        System.out.println("Electric motor started");
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Recharged " + kWh + " kWh");
    }
}