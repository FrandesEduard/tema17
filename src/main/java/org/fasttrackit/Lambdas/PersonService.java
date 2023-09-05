package org.fasttrackit.Lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons;

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    public List<String> allPersonsNames() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }

    public List<Person> allPersonsThatAreMajor() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

    public List<Person> personsFromOradea() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea"))
                .collect(Collectors.toList());
    }

    public List<Person> personsFromOradeaOrCluj() {
        return persons.stream()
                .filter(person -> person.getCity().equals("Oradea") || person.getCity().equals("Cluj"))
                .collect(Collectors.toList());
    }

    public List<String> capitalizedFirstName() {
        return persons.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> firstNameFirstLetterFromLastName() {
        return persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());
    }

    public List<Person> personsBetween18And60() {
        return persons.stream()
                .filter(person -> person.getAge() >= 18 && person.getAge() <= 60)
                .collect(Collectors.toList());
    }

    public List<Person> personsStartingWithA() {
        return persons.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .collect(Collectors.toList());
    }
    public List<String> allFirstNameUniquely() {
        return persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<Person> personsByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
    }
    public List<Person> personsByLastName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }
    public List<Person> personsByNameAndAge() {
        return persons.stream()
                .sorted(Comparator
                        .comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(Collectors.toList());
    }


}
