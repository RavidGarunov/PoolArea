package Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Ravid");

        person.setLastName("Garunov");

        person.setAge(18);

        System.out.println("Full name: " + person.getFullName());
        System.out.println("Teen : " + person.isTeen());

    }

}
