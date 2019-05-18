package logos.project.admissions.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import logos.project.admissions.dao.UserRepository;
import logos.project.admissions.domain.User;
import logos.project.admissions.domain.UserRole;

@Service
public class UserService{
    
	private Logger logger = LoggerFactory.getLogger(ApplicantsService.class);

	@Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;


    public void save(User user) {
    	logger.info("Register new user {} : " + user);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPasswordConfirm()));
        user.setRole(UserRole.ROLE_USER);
        userRepository.save(user);
    }

}

