package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.chasacademy.databaser.jpastart.entity.Course;
import org.springframework.context.annotation.Bean;
import se.chasacademy.databaser.jpastart.entity.Teacher;
import se.chasacademy.databaser.jpastart.repositories.CourseRepository;
import se.chasacademy.databaser.jpastart.repositories.StudentRepository;
import se.chasacademy.databaser.jpastart.repositories.TeacherRepository;

import java.util.List;

@SpringBootApplication
public class JPAStartApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(JPAStartApplication.class, args);
	}

    @Override
    public void run(String... args) {


    @Bean
    CommandLineRunner run(
                TeacherRepository teacherRepo,
                CourseRepository courseRepo,
                StudentRepository studentRepo
    ) {
        return args -> {
            Teacher t1 = new Teacher();
            t1.setName("Anna Andersson");
            t1.setEmail("anna@email.com");

            Teacher t2 = new Teacher();
            t2.setName("Björn Borg");
            t2.setEmail("bjorn@email.com");

            teacherRepo.saveAll(List.of(t1, t2));

            //create course
            Course course1 = new Course("Math", "MATH101");
            Course course2 = new Course("English", "ENG101");
            Course course3 = new Course("History", "HIS101");

            //add teacher
            course1.setTeacher(Teacher);
            course2.setTeacher(Teacher);
            course3.setTeacher(Teacher);

            //add student
            course1.getStudents().add(student1);
            course2.getStudents().add(student2);
            course3.getStudents().add(student3);

            //save course
            courseRepository.save(course1);
            courseRepository.save(course2);
            courseRepository.save(course3);
        };
        }
	}

    }
}
