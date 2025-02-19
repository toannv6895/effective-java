package org.toannguyen.item2.nobuilder;

public class Person {
    private final int age;
    private final int weight;
    private final String name;
    private final String firstName;

    public Person(String name, String firstName) {
        this(0,0,name,firstName);
    }

    public Person(int weight, String name, String firstName) {
        this(0,weight,name,firstName);
    }

    public Person(int age, int weight, String name, String firstName) {
        this.age = age ;
        this.weight = weight ;
        this.name = name ;
        this.firstName = firstName ;
    }
}
