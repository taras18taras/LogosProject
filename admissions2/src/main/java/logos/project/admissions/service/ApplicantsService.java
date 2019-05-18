package logos.project.admissions.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logos.project.admissions.dao.ApplicantRepository;
import logos.project.admissions.domain.Applicant;
import logos.project.admissions.service.ApplicantsService;
;

@Service
public class ApplicantsService {
	
	private Logger logger = LoggerFactory.getLogger(ApplicantsService.class);

	@Autowired
	private ApplicantRepository applicantRepository;
		
	public Applicant save(Applicant applicant) {
		logger.info("Create applicant item {} : " + applicant);
		return applicantRepository.save(applicant);
	}
	
		
	public List<Applicant> getAllApplicants(){
		logger.info("Get all applicants items");
		return applicantRepository.findAll();
	}
	
	public Applicant findById(Integer id) {
		logger.info("Get applicant item by id: " + id);
		return applicantRepository.findById(id).get();
	}
	
	
}
