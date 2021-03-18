package com.cruds.EmployeeDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.cruds.EmployeeEntity.Employee;

public class EmployeeDAO {
	
	private String jdbcURL="jdbc:mysql://localhost:3306/empdb";
	private String jdbcUsername="root";
	private String jdbcpassword="sabarehan";
	private String dbdriver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try{
			
		Class.forName(dbdriver);
		}
		
		catch(ClassNotFoundException e)
		
		{
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection connection=null;
		
		
		
		
		try{
			connection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcpassword);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public String insert(Employee employee)
	{
		loadDriver (dbdriver);
		Connection connection=getConnection();
		String result="DATA ENTERED SUCCESSFULLY";
		String sql= "insert into empdb.employee values(?, ?, ?, ?, ?,?,?)";
		
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, employee.getFirstName());
            preparedStatement.setString(3, employee.getLastName());
            preparedStatement.setString(4, employee.getUsername());
            preparedStatement.setString(5, employee.getPassword());
            preparedStatement.setString(6, employee.getAddress());
            preparedStatement.setString(7, employee.getContact());
            preparedStatement.executeUpdate();

			
		}catch(SQLException e)
		{
			e.printStackTrace();
			result="DATA NOT ENTERED";
		}
		return null;
	}
	 
}