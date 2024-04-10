package ordlist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentOrder {

  public static class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
      this.name = name;
      this.grade = grade;
    }

    public String getName() {
      return name;
    }

    public int getGrade() {
      return grade;
    }
  }

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 90));
    students.add(new Student("Bob", 85));
    students.add(new Student("Charlie", 95));
    students.add(new Student("David", 80));

    Collections.sort(students, (student1, student2) -> student1.getName().compareTo(student2.getName()));

    Collections.sort(students, (student1, student2) -> Integer.compare(student2.getGrade(), student1.getGrade()));

    for (Student student : students) {
      System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrade());
    }
  }
}

