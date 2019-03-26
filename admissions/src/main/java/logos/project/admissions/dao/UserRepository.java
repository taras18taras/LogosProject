package logos.project.admissions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import logos.project.admissions.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findByEmail(String email);
}
