package se.chasacademy.databaser.jpastart.repositories;

import se.chasacademy.databaser.jpastart.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpastart.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
