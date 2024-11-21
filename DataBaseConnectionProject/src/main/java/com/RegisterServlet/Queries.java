package com.RegisterServlet;

public interface Queries {
   
	String queries  ="insert into Studentdb(name,fathername,address,rollnumber,email,phonenumber) values(?,?,?,?,?,?)"; 
    String queriesl ="select * from Studentdb where name=? and phonenumber=?";
    

}
