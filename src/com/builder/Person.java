package com.builder;

public class Person {

    private final String lastName;
    private final String firstName;

    public Person(final String newLastName, final String newFirstName) {
        this.lastName = newLastName;
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static Person.Builder builder(){
        return new Person.Builder();
    }

    public static class Builder {

        private String lastName;
        private String firstName;

        public Builder() {
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Person build() {
            return new Person(this.lastName, this.firstName);
        }

    }

}
