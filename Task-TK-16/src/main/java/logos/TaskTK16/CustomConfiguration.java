package logos.TaskTK16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import logos.dao.impl.StudentDaoSimulation;
import logos.model.Student;

@Configuration
public class CustomConfiguration {

	@Bean(name = "student")
	public Student getStudent() {
		return new Student(0, "Name", 666);
	}

	@Bean(name = "userDao")
	public StudentDaoSimulation<Student> getUserDao() {
		return new StudentDaoSimulation<Student>();
	}

}
