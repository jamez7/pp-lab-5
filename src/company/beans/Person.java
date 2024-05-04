package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;


    public void SetNameAndAge(String name, int age) throws InvalidAgeException {

        if (age < 0 || age > 125) {
            throw new InvalidAgeException("InvalidAgeException");

        }
        this.age = age;
        this.name = name;
    }


    public void SetName(String name) {

        this.name = name;
    }

    public String GetName() {

        return name;
    }

    public void SetAge(int age) {

        this.age = age;
    }

    public int GetAge() {

        return age;
    }

}



