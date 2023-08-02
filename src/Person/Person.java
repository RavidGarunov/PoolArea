package Person;

import javax.swing.*;

public class Person {

    public String firstName ;
    public String lastName;
    public Integer age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age < 0 || age>100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen () {

        if (age>12 && age< 20){
            return true;
        }
        else {
            return false;
        }

    }

    public String getFullName () {

        if (this.firstName == null) {

            return this.lastName;
        }


        if ( this.lastName == null) {
            return this.firstName;
        }

        if (this.firstName!=null && this.lastName!=null){

            return this.firstName + " " + this.lastName;
        }
        return null;
    }



}
