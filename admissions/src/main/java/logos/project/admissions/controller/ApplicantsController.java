package logos.project.admissions.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import logos.project.admissions.domain.Applicant;
import logos.project.admissions.service.ApplicantsService;

@Controller
public class ApplicantsController {

	@Autowired
	ApplicantsService applicantsService;

	@RequestMapping(value = "/create-applicant", method = RequestMethod.POST)
	public ModelAndView createApplicant(@Valid @ModelAttribute("applicant") Applicant applicant,
			BindingResult bindingResult) {
		applicantsService.save(applicant);
		return new ModelAndView("redirect:/home");
	}

}
