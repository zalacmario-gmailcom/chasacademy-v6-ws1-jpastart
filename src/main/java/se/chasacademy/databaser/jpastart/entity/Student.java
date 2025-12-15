package se.chasacademy.databaser.jpastart.entity;

import jakarta.persistence.*;

import java.util.HashSet;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "students") //Course äger ManyToMany, Student är den inverse sidan
    private Set<Course> courses = new HashSet<>();

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public Set<Course> getCourses() {return courses;}
}
