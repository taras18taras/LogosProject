package logos.project.admissions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logos.project.admissions.dao.ApplicantRepository;
import logos.project.admissions.domain.Applicant;

@Service
public class ApplicantsService {
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	public Applicant save(Applicant applicant) {
		return applicantRepository.save(applicant);
	}
	
	public List<Applicant> getAllApplicants(){
		return applicantRepository.findAll();
	}
	
	
	
}
