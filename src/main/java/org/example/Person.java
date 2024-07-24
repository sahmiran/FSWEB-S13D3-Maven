package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;

    String city;
    String phone;
    boolean isWorking;

    public Person(String firstname, String lastName, int age){
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstname, String lastName, int age, String city, String phone, boolean isWorking){
        this(firstname,lastName,age);
        this.city=city;
        this.phone=phone;
        this.isWorking=isWorking;
    }

    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
         return (this.age >=13 && this.age <= 19);

    }
}
