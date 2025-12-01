package MultiLevelInheritance;

public class Car extends Vehicle{
    void playMusic()
    {
        System.out.println("Started Music......");
    }

    @Override
    void start() {
        super.start();
    }
}
