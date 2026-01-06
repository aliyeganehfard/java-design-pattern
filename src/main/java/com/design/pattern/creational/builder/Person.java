package com.design.pattern.creational.builder;

public class Person {

    private final Integer id;
    private final String firstName;
    private final String lastName;

    private Integer age;
    private String fatherName;

    private Person(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.fatherName = builder.fatherName;
    }

    public static class Builder {
        private final Integer id;
        private final String firstName;
        private final String lastName;

        private Integer age;
        private String fatherName;

        public Builder(Integer id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Person{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", age=" + age +
               ", fatherName='" + fatherName + '\'' +
               '}';
    }
}
