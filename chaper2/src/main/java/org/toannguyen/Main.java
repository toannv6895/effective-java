package org.toannguyen;

import org.toannguyen.item2.builder.Person;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person(30,90,"name","fistName");
        Person.PersonBuilder builderPerson = new Person.PersonBuilder("name", "fistName").age(10).weight(15);
        Person person = builderPerson.build();
        System.out.println(builderPerson.toString());
        System.out.println(person.toString());
    }
}