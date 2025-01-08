package com.Mehedi.springbootjdbc;

import com.Mehedi.springbootjdbc.dao.Dao;
import com.Mehedi.springbootjdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootjdbcApplication  implements CommandLineRunner {
	@Autowired
	private Dao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user1=new User("Mehedi","Mehedi@gmail.com","Male","Dhaka");
		//User user2= new User("Rakib","rakib@gmail.com","male","Dhaka");

		//alter native way when i not create constructor on User class
//		user1.setName("Mehedi Hasan");
//		user1.setEmail(("m@gmail.com"));
//		user1.setGender("Male");
//		user1.setCity("Chandpur");

//
//		boolean status=  dao.insertUser(user2);
//		if (status){
//			System.out.println("user inserted Successfully");
//		}
//		else {
//			System.out.println("user not be inserted due to some error");
//		}

//		User user1 = new User("Mehedi","rakib@gmail.com","male","Barishal");
//	boolean status=dao.updateUser(user1);
//
//	if (status){
//		System.out.println("Updation is succesfull");
//	}
//
//	else {
//
//		System.out.println("updation Faield");
//	}
		boolean status= dao.deleteUserByEmail("Mehedi@gmail.com");

		if(status){
			System.out.println("deletation success");
		}
		else {

			System.out.println("deletation not  success");
		}






	}






}
