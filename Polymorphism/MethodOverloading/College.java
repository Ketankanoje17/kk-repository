package Polymorphism.MethodOverloading;

public class College {
    private String collegeName;
    private String collegeState;
    private String collegeDepartment;

    private int pinCode;



    public void showCollegeName(String collegeName,String collegeState)
    {
        this.collegeName=collegeName;
        this.collegeState=collegeState;
    }
    public void showCollegeName(String collegeDepartment)
    {
        this.collegeDepartment=collegeDepartment;
    }
    public void showCollegeName(int  pincode)
    {
        this.pinCode=pincode;
    }
    void display()
    {
        System.out.println("collegeName is : "+collegeName+ "and departtment is "+collegeDepartment + "and college state is"+collegeState+ "and pincode is : "+pinCode);
    }

//    void display1()
//    {
//        System.out.println("and college state is "+collegeState);
//    }
}
