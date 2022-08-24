package objects;

import java.util.ArrayList;
import java.util.List;

public class StudentChallenge1 {

    public static class Student {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));

        System.out.println("---------------------------------------------");
//        students.stream().forEach(student -> System.out.println(student));

//         printing student name whose age is greater than 8 years
        for (Student student : students) {
            if (student.age > 8)
                System.out.println(student.name);
        }
    }
}
