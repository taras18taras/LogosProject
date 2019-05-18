package logos.project.admissions.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.admissions.domain.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Integer>{
}
