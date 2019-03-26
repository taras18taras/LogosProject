package logos.project.admissions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.admissions.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer>{
}
