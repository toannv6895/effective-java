package org.toannguyen.item2.builder;

public class Person {

    private final String name ;
    private final String firstName ;
    private final int age ;
    private final int weight ;

    private Person(int age, int weight, String name, String firstName) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.firstName = firstName;
    }

    public static class PersonBuilder {
        private int age = 0; // Optional
        private int weight = 0; // Optional
        private final String name;
        private final String firstName;

        public PersonBuilder(String name, String firstName) {
            this.name = name;
            this.firstName = firstName;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Person build() {
            return new Person(age, weight, name, firstName);
        }

        public String toString() {
            return "Person.PersonBuilder(age=" + this.age + ", weight=" + this.weight + ", name=" + this.name + ", firstName=" + this.firstName + ")";
        }
    }
}
