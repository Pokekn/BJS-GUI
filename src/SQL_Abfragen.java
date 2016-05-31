//import java.sql.Array;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL_Abfragen {
	
	public static int jahrgang;
	public static int geschlecht;
	public static String name;
	static SQL_Abfragen abfrage1;

	public static int SQL_Abfrage() throws ClassNotFoundException {
		
		GUIBJS.sname = "Huth";
		String schuelername = GUIBJS.sname;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://10.4.223.209:3306/bjs";
		String username = "java";
		String password = "passwort";
		try (java.sql.Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Verbindung hergestellt!");

			Statement stment = connection.createStatement();
			String qry = "SELECT * FROM schueler WHERE Name = \"" + schuelername + "\"";
			ResultSet rs = stment.executeQuery(qry);

			while (rs.next()) {
				name = rs.getString ("Name");
				//String[] namen = {name};
				jahrgang = rs.getInt("Jahrgang");
				geschlecht = rs.getInt("Geschlecht");
				
			}

		} catch (SQLException e) {
			throw new IllegalStateException("Verbindung konnte nicht hergestellt werden!", e);
		}
		return 0;
	}

}
