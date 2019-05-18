package logos.project.admissions.service;

import java.io.IOException;
import org.springframework.stereotype.Service;
import logos.project.admissions.domain.Applicant;
import logos.project.admissions.domain.Register;

import java.util.Base64;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ApplicantsDTO {
	static ApplicantsService applicantsService;
	
	public static Applicant createEntity(MultipartFile file, String first_name, String second_name, String last_name) throws IOException {
		Applicant applicant = new Applicant();
		applicant.setFirst_name(first_name);
		applicant.setSecond_name(second_name);
		applicant.setLast_name(last_name);
		applicant.setEncodedImage(Base64.getEncoder().encodeToString(file.getBytes()));
		
		return applicant;
	}
	
	
	
	
	public static Applicant updateEntity( Integer id, MultipartFile file, String first_name, String second_name, String last_name) throws IOException {
		Applicant applicant  = applicantsService.findById(id);
		//Applicant applicant = new Applicant();
		//applicant.setId(id);
		applicant.setFirst_name(first_name);
		applicant.setSecond_name(second_name);
		applicant.setLast_name(last_name);
		applicant.setEncodedImage(Base64.getEncoder().encodeToString(file.getBytes()));
		
		return applicant;
	}
	
	public static Register createEntity(@RequestParam int student_id,
			@RequestParam int  english_score, @RequestParam int math_score,@RequestParam int history_score) throws IOException {
		Register register = new Register();
		register.setStudent_id(student_id);
		register.setEnglish_score(english_score);
		register.setMath_score(math_score);
		register.setHistory_score(history_score);
		
		return register;
	}




	
	
}
