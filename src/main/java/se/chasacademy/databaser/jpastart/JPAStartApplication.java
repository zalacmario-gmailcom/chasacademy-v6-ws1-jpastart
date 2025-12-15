package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.chasacademy.databaser.jpastart.entity.Course;
import se.chasacademy.databaser.jpastart.entity.Student;
import se.chasacademy.databaser.jpastart.entity.Teacher;
import se.chasacademy.databaser.jpastart.repositories.CourseRepository;
import se.chasacademy.databaser.jpastart.repositories.StudentRepository;
import se.chasacademy.databaser.jpastart.repositories.TeacherRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class JPAStartApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JPAStartApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}

    CommandLineRunner initData(TeacherRepository teacherRepo,
                               CourseRepository courseRepo,
                               StudentRepository studentRepo) {
        return args -> {

            Student s1 = new Student(null, "Rasha", "rasha@student.se", new HashSet<>());
            Student s2 = new Student(null, "Mario", "mario@student.se",new HashSet<>());
            Student s3 = new Student(null, "Robin", "maria@student.se",new HashSet<>());
            studentRepo.saveAll(List.of(s1, s2, s3));

        };
    }
}
