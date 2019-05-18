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

import logos.project.admissions.domain.Applicant;
import logos.project.admissions.service.ApplicantsDTO;
import logos.project.admissions.service.ApplicantsService;


@Controller
public class ApplicantsController {

	@Autowired
	ApplicantsService applicantsService;

//	@RequestMapping(value = "/create-applicant", method = RequestMethod.POST)
//	public ModelAndView createApplicant(@Valid @ModelAttribute("applicant") Applicant applicant,
//			BindingResult bindingResult) {
//		applicantsService.save(applicant);
//		return new ModelAndView("redirect:/home");
//	}

	@RequestMapping(value = "/create-applicant", method = RequestMethod.POST)
	public ModelAndView createApplicant(@RequestParam MultipartFile image, @RequestParam String first_name,
			@RequestParam String second_name, @RequestParam String last_name) throws IOException {

		applicantsService.save(ApplicantsDTO.createEntity(image, first_name, second_name, last_name));
		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam int id) {
		Applicant p  = applicantsService.findById(id);
		ModelAndView n = new ModelAndView("updateApplicant");
		n.addObject("applicant", p);
		return n;
	}

//	@RequestMapping(value ="/update-applicant", method = RequestMethod.POST)
//		//public ModelAndView update(@RequestParam int id, HttpServletRequest req) {
//		
//		//req.setAttribute("mode", "PARTICIPANT_EDIT");
//		public ModelAndView updateApplicant(@RequestParam int id,@RequestParam MultipartFile image, @RequestParam String first_name,
//				@RequestParam String second_name, @RequestParam String last_name, HttpServletRequest req) throws IOException {
//			req.setAttribute("applicant", applicantsService.findById(id));
//			applicantsService.save(ApplicantsDTO.updateEntity(id,image, first_name, second_name, last_name));
//			return new ModelAndView("redirect:/home");
//	}

//	@RequestMapping(value = "/update-applicant", method = RequestMethod.POST)
//	public ModelAndView create(
//			@RequestParam String id,
//			@RequestParam MultipartFile image, 
//			@RequestParam String first_name, 
//			@RequestParam String second_name, 
//			@RequestParam String last_name) throws IOException {
//		Applicant applicant = applicantsService.findById(Integer.parseInt(id));
//
//		applicantsService.save(ApplicantsDTO.createEntity(image, first_name, second_name, last_name));
//		return new ModelAndView("redirect:/home");
//	}
	
	
	

}
