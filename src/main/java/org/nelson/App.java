package org.nelson;

import org.nelson.dao.StudentDao;
import org.nelson.entity.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("Nelson", "Attah", "nelson.attah@gmail.com");
        studentDao.saveStudent(student);

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
    }
}
