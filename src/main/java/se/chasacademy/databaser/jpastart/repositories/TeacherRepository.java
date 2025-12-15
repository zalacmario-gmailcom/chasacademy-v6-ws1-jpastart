package se.chasacademy.databaser.jpastart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}