package logos.project.admissions.service;

import java.io.IOException;
import org.springframework.stereotype.Service;
import logos.project.admissions.domain.Applicant;
import logos.project.admissions.domain.Register;

import java.util.Base64;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StudentDTO {
	static RegisterService registerService;
	

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
