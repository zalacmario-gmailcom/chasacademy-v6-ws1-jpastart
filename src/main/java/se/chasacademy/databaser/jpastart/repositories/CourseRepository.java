package se.chasacademy.databaser.jpastart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course, Long> {
}
