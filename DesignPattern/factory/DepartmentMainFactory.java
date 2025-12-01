package DesignPattern.factory;

public class DepartmentMainFactory {

    public static DepartmentFactory getSubject(String subType)
    {
        if(subType.trim().equalsIgnoreCase("IT"))
        {
            return new DepIT();
        } else if (subType.trim().equalsIgnoreCase("Mechanical")) {
              return  new DepMech();
        }else{
            return null;

        }
    }
}
