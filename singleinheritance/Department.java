package singleinheritance;

public class Department extends College{
   private String departMentId="computer engineering";
   private String departmentCode="111";

    @Override
    void voidShowCollegeDetails() {
        System.out.println("department name is : "+departMentId);
        System.out.println("department code is : "+departmentCode);
        System.out.println("department code is : "+getCollegeName());
        System.out.println("department code is : "+getCity());
        super.voidShowCollegeDetails();


    }

    void data() {
        System.out.println("department name kk is : "+departMentId);
        System.out.println("department code  kk is : "+departmentCode);
    }
}
