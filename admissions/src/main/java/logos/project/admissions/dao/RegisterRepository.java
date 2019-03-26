package logos.project.admissions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.admissions.domain.Register;

public interface RegisterRepository extends JpaRepository<Register, Integer>{
}
