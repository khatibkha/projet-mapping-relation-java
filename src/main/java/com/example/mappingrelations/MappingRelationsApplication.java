package com.example.mappingrelations;

import com.example.mappingrelations.entities.Course;
import com.example.mappingrelations.entities.Professor;
import com.example.mappingrelations.entities.Session;
import com.example.mappingrelations.entities.Student;
import com.example.mappingrelations.repositories.CourseRepository;
import com.example.mappingrelations.repositories.ProfessorRepository;
import com.example.mappingrelations.repositories.StudentRepository;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class MappingRelationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MappingRelationsApplication.class, args);
    }

  @Bean
    CommandLineRunner start(
            StudentRepository studentRepository,
            ProfessorRepository professorRepository,
            CourseRepository courseRepository
  ){
        return  args -> {



            Stream.of("souhail","yassine","driss","ilyass").forEach(s ->{
                Course course = new Course();
                course.setDescription("Spring Boot");


                Student student = new Student();
                student.setName(s);
                student.setRegistrationNumber(UUID.randomUUID().toString());
                studentRepository.save(student);

                Professor professor = new Professor();
                professor.setName("Prof : "+s);
                professor.setD_affectation(new Date());
                professorRepository.save(professor);

                course.setProfessor(professor);
                course.setTitle(s+"Title");
                courseRepository.save(course);

            });

            courseRepository.deleteById(1);
            Course course = courseRepository.findById(3).orElseThrow(null);
            course.setTitle("flutter");
            course.setDescription("hill");
            courseRepository.save(course);
        };
    }

}
