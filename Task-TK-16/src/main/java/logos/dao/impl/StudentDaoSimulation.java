package logos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import logos.dao.CrudOperation;

public class StudentDaoSimulation<Student> implements CrudOperation<Student> {

	private List<Student> students = new ArrayList<Student>();

	@Override
	public Student create(int id, Student user) {
		students.add(id, user);
		return user;
	}

	@Override
	public Student read(int id) {
		return students.get(id);
	}

	@Override
	public Student update(int id, Student user) {
		students.set(id, user);
		return students.get(id);
	}

	@Override
	public void delete(int id) {
		students.remove(id);
	}

	@Override
	public void readAll() {
		if (students.size() == 0)
			System.out.println(0);
		else
			System.out.println(this.students);
	}

}
