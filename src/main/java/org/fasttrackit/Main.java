package org.fasttrackit;

import org.fasttrackit.Lambdas.Person;
import org.fasttrackit.Lambdas.PersonService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person Mihai = new Person("Radu", "Mihai", 33, "Cluj");
        Person Laur = new Person("Istrate", "Laur", 23, "Oradea");
        Person Cristi = new Person("Radu", "Cristi", 35, "Cluj");
        Person Nicole = new Person("Isko", "Nicole", 16, "Mures");
        Person Mihaela = new Person("Fernea", "Mihaela", 25, "Bistrita");
        Person Dobre = new Person("Farcas", "Dobre", 56, "Mures");
        personList.add(Mihaela);
        personList.add(Mihai);
        personList.add(Laur);
        personList.add(Cristi);
        personList.add(Nicole);
        personList.add(Dobre);

        PersonService personService = new PersonService(personList);

    }
}
