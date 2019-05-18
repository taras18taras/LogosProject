package logos.project.admissions.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import logos.project.admissions.domain.Register;
import logos.project.admissions.service.RegisterDTO;
import logos.project.admissions.service.RegisterService;


@Controller
public class RegisterController {

	@Autowired
	RegisterService registerService;


	
	@RequestMapping(value = "/create-register", method = RequestMethod.POST)
	public ModelAndView createRegister(@RequestParam int student_id,
			@RequestParam int  english_score, @RequestParam int math_score,@RequestParam int history_score) throws IOException {

		registerService.save(RegisterDTO.createEntity(student_id, english_score, math_score, history_score,english_score+history_score+math_score));
		return new ModelAndView("redirect:/home");
	}
	

}
