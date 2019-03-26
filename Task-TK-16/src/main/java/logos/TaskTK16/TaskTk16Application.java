package logos.TaskTK16;

import logos.dao.impl.StudentDaoSimulation;
import logos.model.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TaskTk16Application {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(TaskTk16Application.class, args);

		Student student = (Student) cac.getBean("student");
		StudentDaoSimulation<Student> studentsDao = (StudentDaoSimulation<Student>) cac.getBean("userDao");
		System.out.println("Simulation of work with the base! Start!");
		
		student.setName("Ivan");
		student.setAge(100);
		studentsDao.create(student.getId(), student);
		studentsDao.readAll();
		
		student.setName("Taras");
		student.setAge(25);
		studentsDao.update(student.getId(), student);
		studentsDao.readAll();

		studentsDao.delete(student.getId());
		studentsDao.readAll();
		//System.out.println(studentsDao.read(student.getId()));
		System.out.println("Simulation of work with the base! End!");
	}

}

