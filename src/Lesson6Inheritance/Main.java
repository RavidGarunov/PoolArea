package Lesson6Inheritance;

public class Main {


    public static void main(String[] args) {

        Teacher teacher = new Teacher();

        Student student = new Student();

        teacher.setName("Ravid");
        teacher.setSurName("Garunov");
        teacher.setSalary(2000.0);

        student.setName("Davud");
        student.setSurName("Garunov");
        student.setScholarship(150.0);


    }


}
