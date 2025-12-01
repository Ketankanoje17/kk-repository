package MultiLevelInheritance;

public class VehicleMain {

    public static void main(String[] args) {
        ElectriCar c=new ElectriCar();
        c.start();
        c.batteryCharge();
        c.playMusic();

        Vehicle v1=new Vehicle();
        v1.start();

    }
}
