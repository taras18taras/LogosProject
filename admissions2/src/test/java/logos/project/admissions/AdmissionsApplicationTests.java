package logos.project.admissions;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import logos.project.admissions.dao.UserRepository;
import logos.project.admissions.domain.User;
import logos.project.admissions.domain.UserRole;
import logos.project.admissions.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmissionsApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Test
	public void testSaveUser() {
		List<User> users = userRepository.findAll();
		int usersSize = users.size();
		assertThat(users, hasSize(usersSize));

		User user = new User();
		user.setEmail("900@gmail.com");
		user.setFirstName("900");
		user.setLastName("900");
		user.setPassword("900");
		user.setPasswordConfirm("900");
		user.setRole(UserRole.ROLE_USER);

		userService.save(user);

		users = userRepository.findAll();
		assertThat(users, hasSize(usersSize+1));

		User userFromDb = users.get(usersSize);
		assertTrue(userFromDb.getEmail().equals(user.getEmail()));
		assertTrue(userFromDb.getFirstName().equals(user.getFirstName()));
		assertTrue(userFromDb.getLastName().equals(user.getLastName()));
		assertTrue(userFromDb.getRole().equals(user.getRole()));
		
		userRepository.delete(user);
		
		users = userRepository.findAll();
		assertThat(users, hasSize(usersSize));
	}



}
