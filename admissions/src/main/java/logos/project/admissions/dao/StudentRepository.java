package logos.project.admissions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.admissions.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
