package com.backend.practice.Student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name = "Student_sequence", 
        sequenceName= "Student_sequence", 
        allocationSize=1
        )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator="Student_sequence"
    )
    private long id;
    private String name;
    private String email;
    private LocalDate Date_of_Birth; 
    private Integer age;

    public Student() {
    }
    

    public Student (long id, String name, String email, LocalDate Data_of_Birth, Integer age){

        this.id = id;
        this.name = name;
        this.email = email;
        this.Date_of_Birth = Data_of_Birth;
        this.age = age;
    }

    public Student (String name, String email, LocalDate Date_of_Birth, Integer age){
        
        this.name = name;
        this.email = email;
        this.Date_of_Birth = Date_of_Birth;
        this.age = age;
    }

    public long getId(){
        return id;
    }

    public void setId (long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getDate_of_Birth (){
        return Date_of_Birth;
    }

    public void setDate_of_Birth(LocalDate Date_of_Birth){
        this.Date_of_Birth = Date_of_Birth;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student{" + "id =" + id + 
               ", name ='" + name + '\'' + 
               ", email= '" + email + '\'' +
               ", Date_of_Birth =" + Date_of_Birth +
               ", age=" + age +
               '}';
    }
}
