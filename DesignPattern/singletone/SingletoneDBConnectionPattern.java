package DesignPattern.singletone;

import java.sql.Connection;

public class SingletoneDBConnectionPattern {

    private static SingletoneDBConnectionPattern dbConnectionPattern;
    private Connection connection;
    String url="abc.mydb.com";
    String userName="ketan";
    String password="ketan123";

   private SingletoneDBConnectionPattern()
    {
        System.out.println("Connection established");
        try{
//            Class.forName("abc.mydb.com");
//            connection=DriverManager.getConnection(url,userName,password);
            System.out.println("connection estatblished");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static SingletoneDBConnectionPattern getDbConnectionPattern()
    {
        if(dbConnectionPattern ==  null)
        {
            dbConnectionPattern=new SingletoneDBConnectionPattern();
        }
        return dbConnectionPattern;
    }

    public Connection getConnection()
    {
        return  connection;
    }


}
