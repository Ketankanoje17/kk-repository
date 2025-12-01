package singleinheritance;

public class College {
    private String collegeName="VIT";
   private String city="Pune";

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    void voidShowCollegeDetails()
    {
        System.out.println("College Details: "+collegeName);
        System.out.println("City: "+city);
    }
}
