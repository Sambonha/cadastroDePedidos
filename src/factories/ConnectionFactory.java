package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {

		var host = "jdbc:postgresql://localhost:5433/bdpedidos";
		var user = "postgres";
		var pass = "coti";

		try {

			return DriverManager.getConnection(host, user, pass);

		} catch (Exception e) {

			System.out.println("\nFalha ao conectar com o PostgreSQL: " + e.getMessage());
			return null;
		}

	}

}
