import model.Address;
import model.Person;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        Person konstantin = new Person(konstantinsAddress, 20, "Konstantin","м" );

        Address glebsAddress = new Address("Belarus", "Vitebsk");
        Person gleb = new Person(glebsAddress, 25, "Gleb", "м");

        Address olegsAddress = new Address("Belarus", "Braslav");
        Person oleg = new Person(olegsAddress, 23, "Oleg", "м");

        Address vadimsAddress = new Address("Belarus", "Smorgon'");
        Person vadim = new Person(vadimsAddress, 24, "Vadim","м" );

        Address olgasAddress = new Address("Belarus", "Vitebsk'");
        Person olga = new Person(olgasAddress, 20, "Olga","ж" );

        Address igorAddress = new Address("Belarus","Minsk");
        Person igor = new Person(igorAddress, 19, "igor","м");



        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim, olga, igor});
//
//        System.out.println( registry.countPeople(new Address("Belarus", "Vitebsk" )));
//        System.out.println( registry.countPeople(new Address("Belarus", "Braslav" )));
//        System.out.println( registry.countPeople("Belarus"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город для поиска ");
        String city = scanner.nextLine();

        RecruitingOffice n = new RecruitingOffice(registry);
        n.getPeople(new Address("Belarus", city));

        System.out.print("Список годных к службе в городе" + city);
        List<Person> personList = registry.getPeople(new Address("Belarus", city));
        for (Person person : personList) {
            System.out.println(person.getName());
        }

    }


}