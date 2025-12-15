package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.chasacademy.databaser.jpastart.entity.Course;

@SpringBootApplication
public class JPAStartApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(JPAStartApplication.class, args);
    }

    @Override
    public void run(String... args) {
        //create course
        Course course1 = new Course("Math", "MATH101");
        Course course2 = new Course("English", "ENG101");
        Course course3 = new Course("History", "HIS101");

        //add teacher
        course1.setTeacher(teacher);
        course2.setTeacher(teacher);
        course3.setTeacher(teacher);

        //add student
        course1.getStudents().add(student1);
        course2.getStudents().add(student2);
        course3.getStudents().add(student3);

        //save course
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);
    }
}
