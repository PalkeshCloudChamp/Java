package com.StudentCourseRepo.StudentApi;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentCourseRepo.Entity.Users;
import com.StudentCourseRepo.Repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	private String baseDir = "C:\\blazeclan\\FormsExpress\\DB-testing\\Tables\\";
	@GetMapping("/users")
	public String getAllUsers() {
		System.out.println(studentRepo.findAll());
		return studentRepo.findAll().toString();
	}
	
	@GetMapping("/student/{userid}")
	public List<Users> OneUser(@PathVariable("userid") int userid) {
		List<Users> obj = studentRepo.getOneUser(userid);
		return obj;
	}
	
	@GetMapping("/user/{status}")
	public List<Users> GetUserByStatus(@PathVariable("status") String status) {
		List<Users> obj = studentRepo.getUserByStatus(status);
		try {
			String dirPath = baseDir + "Users";
			File dirObj = new File(dirPath);
			if(!dirObj.exists()) {
				dirObj.mkdirs();
			}
			else {
				System.out.println("File Already Exist");
			}
			String filePath = dirPath+"\\"+status;
			File fileObj = new File(filePath);
			if(!fileObj.exists()) {
				fileObj.createNewFile();
			}else {
				System.out.println("File Already Exists.");
			}
			
			obj.forEach(e->{
				System.out.println(e.getClass().getName());
			});
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return obj;
	}
	
	
	
	@PostMapping("/student")
	public void AddUser(@RequestBody Users user) {
		System.out.println("The user body:-"+user);	
		Users us = new Users();
		Users us2 = new Users(user);
		us.setuserid(102);
		us.setusername("Monu");
		us.setPasword("Sarcastic");
		us.setRole("Student");
		us.setStatus("Active");
//		studentRepo.save(us);	
		System.out.println(us.getPasword() + us.getStatus() + us.getRole());
		System.out.println(us);
//		studentRepo.save(us);
		System.out.println(us2);
	}
}