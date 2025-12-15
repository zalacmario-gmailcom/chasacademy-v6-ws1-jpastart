package se.chasacademy.databaser.jpastart.repositories;

import se.chasacademy.databaser.jpastart.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpastart.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}