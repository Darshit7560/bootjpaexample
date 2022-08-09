package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepo userrepo = context.getBean(UserRepo.class);
		
		
	/*
		  User user = new User();
		  user.setName("Durgesh Kumar Tiwari");
		  user.setCity("Delhi");
		  user.setStatus("I am a Java Programmer");
		  User user1 = userrepo.save(user); 
		  System.out.println(user1);
	*/  
		
		 
		  
	/* 
		
		 // creat object of user 
		  User user1 = new User(); 
		  user1.setName("Uttam");
		  user1.setCity("City1");
		  user1.setStatus("phthon programmer");
		  
		  User user2 = new User();
		  user2.setName("Ankit");
		  user2.setCity("City2");
		  user2.setStatus("Java programmer");
		  
		  //saving single user //
		  User resultuser = userrepo.save(user2); 
		
		  //save multiple objects
		  List<User>  users=List.of(user1,user2);
		  Iterable<User> result =userrepo.saveAll(users);
		  result.forEach(user->{ System.out.println(user); });
		  System.out.println("saved user"+resultuser);
		  System.out.println("done");
		  
		  
	 */
		
	  
		 

	/*
		  //update the user of id=3 
		  Optional<User> optional=userrepo.findById(5);
		  User user=optional.get(); 
		  user.setName("Ankit Tiwari");
		  User result=userrepo.save(user); 
		  System.out.println(user);
	*/	
		
		
		
		 
   
   /* 
		// how to get the data
		// findbyID() Optional Containing your data
		
     	Iterable<User> itr = userrepo.findAll();
		Iterator<User> iterator =itr.iterator();
		while(iterator.hasNext())
		{
			User user=iterator.next();
			System.out.println(user);
		}
		
		//lamda functions
		itr.forEach(user->System.out.println(user));
  */
		
   	
  /*		
		//deleting the user element.
		userrepo.deleteById(5);
		System.out.println("deleted");
  */		
		
		
  /*		
		Iterable<User> alluser =userrepo.findAll();
		alluser.forEach(user->System.out.println(user));
		userrepo.deleteAll(alluser);
  */		
		
		
  
	 
  /*	
		Optional<User> optional=userrepo.findById(7);
		System.out.println(optional);
		User user =optional.get();
		user.setName("Domo");
	    User  result=userrepo.save(user); 
	    System.out.println(result);
	    
  */	    
	    
	   
		
  /*
		 
	   Iterable<User> itr =userrepo.findAll();
	   itr.forEach(user->System.out.println(user));
	   
  */
		
		
  /*
	   userrepo.deleteById(7);	
	   System.out.println("success");
		
 */
	
		
 /*
		userrepo.deleteAll();
		
 */
		
		
	
  /*
		 
		Iterable<User> iterable =userrepo.findAll();
		
		iterable.forEach(user->System.out.println(user));
		
		userrepo.deleteAll(iterable);
		
  */
		
		
  
   /*	 
		List<User> users =userrepo.findByNameOrCity("","Delhi");
		users.forEach(e->System.out.println(e));
   */	
		
		
		
	/*	
		
		   findByNameStartingWith(String prefix)
		   findByNameEndingWith(String suffic)
		   findByNameContain(String words)
		   findByNameLike(String likepatten)
		   findByAgeLessThan(int age)
		   findByAgeGreterThanEqual(int age)
		   findByAgeIn(collection<Integer> ages)
		   findByNameOrderByName(Stirng name)
	*/	   
		 
		 
		
	/*
		
		List<User> alluser=userrepo.getAlluser();
		alluser.forEach(e->System.out.println(e));
		
		System.out.println("--------------------------------------------------------------");
		
		List<User> user=userrepo.getUerByName("Sahil","Delhi");
		user.forEach(e->System.out.println(e));
		
		System.out.println("--------------------------------------------------------------");
		
		List<User> u=userrepo.getUsers();
		u.forEach(e->System.out.println(e));
	*/	
		
	}

}
