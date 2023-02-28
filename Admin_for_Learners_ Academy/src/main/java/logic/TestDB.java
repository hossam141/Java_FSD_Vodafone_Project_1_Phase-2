package logic;

import java.sql.SQLException;

import database.ClassDB;
import database.SubjectDB;
import entity.Subject;
import entity.Class;
public class TestDB {

	public static void main(String[] args) {
		SubjectDB db = new SubjectDB();
		ClassDB cb = new ClassDB();
		try {
			
			for(Subject s : db.getAllSubjects()) 
				System.out.println(s);
			
			for(Class c : cb.getAllClasses()) 
				System.out.println(c);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
