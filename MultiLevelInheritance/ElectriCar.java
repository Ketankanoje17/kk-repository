package MultiLevelInheritance;

public class ElectriCar extends Car{
    void batteryCharge()
    {
        System.out.println("Battery is fully charged");
    }

    @Override
    void start() {
        System.out.println("electri car is started");
    }
}
