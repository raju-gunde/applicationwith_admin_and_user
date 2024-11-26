package test;

import java.sql.Connection;
import java.sql.DriverManager;



public class DbConnections {
	private static Connection con = null;

	public DbConnections() {
		super();

	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(DbInfos.dburl, DbInfos.dbuname, DbInfos.dbpass);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public static Connection getConnection() {
		return con;
	}
}
