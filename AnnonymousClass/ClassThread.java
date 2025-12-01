package AnnonymousClass;

public class ClassThread {
    public static void main(String[] args) {

//        Runnable r=new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<=10;i++)
//                {
//                    System.out.println("ketan");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//
//        };

        Runnable r = () -> {
            System.out.println("Hello world");
        };
        Thread t=new Thread(r);

        t.start();
    }


}
