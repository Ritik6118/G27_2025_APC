package g27.springbootg27.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import g27.springbootg27.entity.Student;

@Repository
public interface Student_repository extends JpaRepository<Student, Integer>{

}
