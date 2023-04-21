package net.javaguidessms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguidessms.entity.Student;

//StudentRepository gets all the cruds to interact to the db 
public interface StudentRepository extends JpaRepository<Student, Long> {

}
