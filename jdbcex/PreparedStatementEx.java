package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementEx {

	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}

	public void insertCustomer(int id, String name, String address, String phoneNo) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.setString(4, phoneNo);

		int n = preparedStatement.executeUpdate();
		System.out.println(n + " record is inserted");
	}

	public void getCustomerByCity(String city) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from customer where custAddress = ? ");
		preparedStatement.setString(1, city);

		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("custId") + "\t");
			System.out.print(resultSet.getString("custName") + "\t");
			System.out.print(resultSet.getString("custAddress") + "\t");
			System.out.print(resultSet.getString("phone_No") + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementEx obj = new PreparedStatementEx();
		obj.insertCustomer(199, "Manoj", "Chambal", "7898239389");
		System.out.println("Get by City:  ");
		obj.getCustomerByCity("Pune");

	}

}
