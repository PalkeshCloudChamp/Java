package com.formsExpress.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formsExpress.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
//	C:\blazeclan\FormsExpress\DB-testing\Tables\231
	String filePath = "C:/blazeclan/FormsExpress/DB-testing/Tables/";
//	SELECT * FROM student_course.users where userid = 103 INTO OUTFILE '",@file_path,"' FIELDS TERMINATED BY ','"
//	@Query(value = "Select * from User where Customer_Id = :cid INTO OUTFILE '"+filePath+":cid' FIELDS TERMINATED BY ',';", nativeQuery = true)
//	@Query(value="LOAD data infile '"+filePath+":cid' into table user field terminated by ',';",nativeQuery = true)
	@Query(value="Select * from user where customer_id=:cid",nativeQuery = true)
	public List<User> getAllUsers(@Param("cid") int Customer_Id);
	
}

//
//LOAD DATA INFILE 
//'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/users' 
//INTO TABLE student_course.users
//FIELDS TERMINATED BY ',';