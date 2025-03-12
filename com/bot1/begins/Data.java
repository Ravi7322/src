package com.bot1.begins;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
class student{
	int id;
	String name;
	int age;
	int marks;
	
	public student(int id,String name,int age,int marks) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void printDetails() {
		System.out.println("ID:" +id);
		System.out.println("name:" +name);
		System.out.println("ID:" +age);
		System.out.println("ID:" +marks);
	}
}
public class Data{
	public static void main(String[] args) throws SQLException {
		Scanner scan=new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/schooldetials1";
		String user = "root";
		String password = "root@123";
		System.out.println("Enter the how many detials ");
		int numstudents = scan.nextInt();
		student[] students= new student[numstudents];
		
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO student1 (id, name, age, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            String sql1 = "select * from student1 where id= ? ";
            
		  for (int i=0;i<numstudents;i++) {
			System.out.print("Enter student ID: ");
            int id = scan.nextInt();
            scan.nextLine(); 
            
            System.out.print("Enter student name: ");
            String name = scan.nextLine();

            System.out.print("Enter student age: ");
            int age = scan.nextInt();
            scan.nextLine();  
            
            System.out.println("Enter student marks: ");
            int marks=scan.nextInt();
            scan.nextLine();
            
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setInt(4, marks);
            pstmt.executeUpdate();
            System.out.println("Student details inserted successfully!\n");
            students[i] = new student(id, name, age ,marks);
		  }
            System.out.print("Enter student ID to search: ");
            int a = scan.nextInt();
            scan.nextLine();
            pstmt.setInt(1, a); 
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) { // If student exists, print details
                System.out.println("Student Found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Marks: " + rs.getInt("marks"));
            } else {
                System.out.println("No student found with ID " + a);
            }
            
		}catch (SQLException e) {
			e.printStackTrace();
		}
		scan.close();
	}
}
	

