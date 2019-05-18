package logos.project.admissions.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import logos.project.admissions.service.UserService;
import logos.project.admissions.service.ApplicantsService;
import logos.project.admissions.service.RegisterService;
import logos.project.admissions.dao.UserRepository;

import logos.project.admissions.domain.Applicant;
import logos.project.admissions.domain.Register;
import logos.project.admissions.domain.User;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
    private ApplicantsService applicantsService;
    
    @Autowired
    private RegisterService registerService;

  
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userService.save(userForm);


        return "redirect:/home";
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value ="/home", method = RequestMethod.GET)
    public ModelAndView welcome() {
		ModelAndView map = new ModelAndView("home");
		map.addObject("applicants", applicantsService.getAllApplicants());

		return map;
	}
    
	@RequestMapping(value = "/create-applicant", method = RequestMethod.GET)
	
	public ModelAndView createApplicant() {
		//return "createPeriodical";
		return new ModelAndView("createApplicant","applicant",new Applicant());
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	
	public ModelAndView updateApplicant(@RequestParam int id) {
		//return "createPeriodical";
		//return new ModelAndView("updateApplicant","applicant",new Applicant());
		Applicant p  = applicantsService.findById(id);
		ModelAndView n = new ModelAndView("updateApplicant");
		n.addObject("applicant", p);
		return n;
	}
	
	@RequestMapping(value = "/create-register", method = RequestMethod.GET)
	
	public ModelAndView createRegister() {
		return new ModelAndView("createRegister","register",new Register());
	}
	
	
	 @RequestMapping(value ="/registerList", method = RequestMethod.GET)
	    public ModelAndView ShowRegisterList() {
			ModelAndView map = new ModelAndView("registerList");
			map.addObject("register", registerService.getAllRegisteredApplicants());

			return map;
	 }
	 
	 @RequestMapping(value ="/studentsList", method = RequestMethod.GET)
	    public ModelAndView ShowStudentsList() {
			ModelAndView map = new ModelAndView("studentsList");
			map.addObject("register", registerService.getAllRegisteredApplicants());

			return map;
	 }
	
	
   
}