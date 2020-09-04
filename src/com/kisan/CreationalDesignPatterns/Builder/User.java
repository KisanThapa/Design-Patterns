package com.kisan.CreationalDesignPatterns.Builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private double salary;
    private boolean isAdmin;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.salary = builder.salary;
        this.isAdmin = builder.isAdmin;
    }

    //All getter, and NO setter to provide immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private double salary;
        private boolean isAdmin;

        UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public UserBuilder setIsAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        // Return the finally constructed User object
        public User build() {
            var user = new User(this);
            validateUser(user);

            return user;

        }

        private void validateUser(User user) {
            // Do some basic validations to check
            // if user object does not break any assumption of system
        }

    }
}
