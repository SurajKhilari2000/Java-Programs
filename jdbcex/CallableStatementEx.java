package jdbcex;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CallableStatementEx {

	Connection connection;
	CallableStatement callableStatement;
	ResultSet resultSet;
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection get ");
	}

	public void callingProcedure(int id, String name, String city, String phoneNo) throws SQLException {

		callableStatement = connection.prepareCall("{call insertCustomer(?,?,?,?)}");
		callableStatement.setInt(1, id);
		callableStatement.setString(2, name);
		callableStatement.setString(3, city);
		callableStatement.setString(4, phoneNo);
		callableStatement.execute();
		System.out.println("Record is inserted");

	}

	public void close() throws SQLException {

		connection.close();

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		CallableStatementEx obj = new CallableStatementEx();

		obj.callingProcedure(108, "Suraj", "Pune", "7678546788");

		obj.close();

	}

}
