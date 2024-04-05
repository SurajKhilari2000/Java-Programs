package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManagementSystem {
	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public StudentManagementSystem() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get open ");
	}

	public void insertRecordsStudent(int rollNo, String name, String dob, float percent, String city, String email_id,
			String phone_no) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into StudentManagement values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, rollNo);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, dob);
		preparedStatement.setFloat(4, percent);
		preparedStatement.setString(5, city);
		preparedStatement.setString(6, email_id);
		preparedStatement.setString(7, phone_no);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " record is updated");
	}

	public void viewStudentDetails() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from StudentManagement");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_n0") + "\t");
			System.out.println();
		}
	}
	public void  getStudentByCity(String city) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from StudentManagement where city = ? ");
		preparedStatement.setString(1, city);

		resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("rollNo") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("dob") + "\t");
			System.out.print(resultSet.getFloat("percent") + "\t");
			System.out.print(resultSet.getString("city") + "\t");
			System.out.print(resultSet.getString("email_id") + "\t");
			System.out.print(resultSet.getString("phone_n0") + "\t");
			System.out.println();
	}
}
	public void StudentByRollNo(int rollNo, String name, String dob, float percent, String city, String email_id,
			String phone_no) throws SQLException {
		preparedStatement = connection.prepareStatement("update StudentManagement set name=?, dob = ?, percent =?, city=?, email_id=?,phone_no=? where  rollNo=?");
        preparedStatement.setString(1, phone_no);
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentManagementSystem obj = new StudentManagementSystem();
		//obj.insertRecordsStudent(9, "Pranali", "1985-05-04", 99, "Pune", "pranali@gmail.com", "723672356985");
	//	obj.viewStudentDetails();
        obj.getStudentByCity("Mumbai");
	}

}
