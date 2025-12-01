package DesignPattern.example2;

public class CommonAnnouncmentEmployee {

    private static  CommonAnnouncmentEmployee commonAnnouncmentEmployee;

    private CommonAnnouncmentEmployee()
    {
        System.out.println("All Employee Come to Ground Floor");
    }

    public static CommonAnnouncmentEmployee getCommonAnnouncmentEmployee()
    {
        if(commonAnnouncmentEmployee == null)
        {
            commonAnnouncmentEmployee=new CommonAnnouncmentEmployee();
        }
        return commonAnnouncmentEmployee;
    }

    public void message()
    {
        System.out.println("warning please come");
    }
}
