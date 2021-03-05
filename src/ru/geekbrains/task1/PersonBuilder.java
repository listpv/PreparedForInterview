package ru.geekbrains.task1;

public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder setFirstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder setLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }

    public  PersonBuilder setMiddleName(String middleName){
        person.setMiddleName(middleName);
        return this;
    }

    public PersonBuilder setCountry(String country){
        person.setCountry(country);
        return this;
    }

    public PersonBuilder setAddress(String address){
        person.setAddress(address);
        return this;
    }

    public PersonBuilder setPhone(String phone){
        person.setPhone(phone);
        return this;
    }

    public PersonBuilder setAge(int age){
        person.setAge(age);
        return this;
    }

    public PersonBuilder setGender(String gender){
        person.setGender(gender);
        return this;
    }

    public Person build(){
        return person;
    }

}
