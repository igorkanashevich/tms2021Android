package model;

import java.util.Random;
import java.util.Scanner;

public class Person {
    private Address address;
    private int age;
    private int height;
    private String name;
    private String gender;

    public Person(Address address, int age, int height, String name, String gender) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age\t");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name\t");
        this.name = scanner.nextLine();
        System.out.print("Enter height\t");
        this.height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender\t");
        this.gender = scanner.nextLine();
        this.address = new Address();
    }

    public Person(int age, String name,  String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person(Address address, int age, String name , String gender) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person() {

    }

    public void info() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}