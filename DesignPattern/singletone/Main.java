package DesignPattern.singletone;

import DesignPattern.singletone.SingletoneDBConnectionPattern;

public class Main {
    public static void main(String[] args) {
        SingletoneDBConnectionPattern db= SingletoneDBConnectionPattern.getDbConnectionPattern();

        SingletoneDBConnectionPattern db1 = SingletoneDBConnectionPattern.getDbConnectionPattern();
        System.out.println(db.hashCode());
        System.out.println(db1.hashCode());

    }
}
