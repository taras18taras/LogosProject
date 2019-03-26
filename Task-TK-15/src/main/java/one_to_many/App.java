package one_to_many;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App {

	static Session sessionObj;

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configObj = new Configuration().configure();
		//buildSessionFactory  dont work  on old version 4+  
		// for 5.3.7.Final  is work
		
		sessionObj = configObj.buildSessionFactory().openSession();
		sessionObj.beginTransaction();

		Post post = new Post();
		post.setTitle("Title");

		Comment comm_1 = new Comment("Hi there", post);
		Comment comm_2 = new Comment("Hello! I'm Taras", post);
		
		Set<Comment> comments = post.getComments();
		comments.add(comm_1);
		comments.add(comm_2);
		post.setComments(comments);

		sessionObj.save(post);
		sessionObj.getTransaction().commit();

		post = sessionObj.get(Post.class, 1);
		System.out.println(post);

		sessionObj.close();
	}

}
