package logos.project.admissions.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import logos.project.admissions.dao.ApplicantRepository;
import logos.project.admissions.dao.RegisterRepository;
import logos.project.admissions.domain.Applicant;
import logos.project.admissions.domain.Register;
import logos.project.admissions.service.StudentService;
;

@Service
public class StudentService {
	
	private Logger logger = LoggerFactory.getLogger(StudentService.class);

	
	@Autowired
	private RegisterRepository registerRepository;
	
	
	public Register save(Register register) {
		logger.info("Create register item {} : " + register);
		return registerRepository.save(register);
	}
	
	public List<Register> getAllRegisteredApplicants(){
		logger.info("Get all registeration of points items");
		return registerRepository.findAll();
	}
	
	public Register findById(Integer id) {
		logger.info("Get applicant item by id: " + id);
		return registerRepository.findById(id).get();
	}
	
	
}
