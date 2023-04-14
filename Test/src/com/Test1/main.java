package com.Test1;

/**
 * ClassName: main
 * Package: com.Test1
 * Description:
 *
 * @Author 郭宜超
 * @Create 2023/4/6 13:36
 * @Version 1.0
 */
public class main {
    public static void main(String[] args) {
        /** Dog dog=new Dog();
         System.out.println(dog.name);
         dog.display();

         Pet pet=dog;
         System.out.println(pet==dog);
         System.out.println(pet.name);
         pet.display();
         */

        InstanceTest instanceTest = new InstanceTest();
        Graduate graduate=new Graduate();
        System.out.println(instanceTest.method(graduate));
        System.out.println(graduate.getClass().getName());
    }
}

class InstanceTest {
    public String method(Person e) {
        switch (e.getClass().getName()) {
            case "Person":
                return new Person().getInfo();
            case "Student":
                return new Student().getInfo();
            case "Graduate":
                return new Graduate().getInfo();
        }
        return "";
    }

}

class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}