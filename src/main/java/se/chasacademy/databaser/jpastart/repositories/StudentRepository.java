package se.chasacademy.databaser.jpastart.repositories;

import se.chasacademy.databaser.jpastart.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}