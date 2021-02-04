package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        List<Person> personsLinks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сколько добавить людей ?\t");
        int countPersons = scanner.nextInt();
        for (int i = 0; i < countPersons; i++) {
            personsLinks.add(new Person());
        }


        PersonRegistry registry = new PersonRegistry(personsLinks);

        RecruitingOffice recruitingOffice = new RecruitingOffice(registry);

        System.out.println("Введите город для поиска годных к службе");
        scanner.nextLine();
        String city = scanner.nextLine();

        List<Person> personList = recruitingOffice.getPeople(new Address("Беларусь", city));

        System.out.println("Годные к службе в городе" + ":" +city);
        for (Person person : personList) {
            System.out.println(person.getName());
        }

    }

}