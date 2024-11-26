package test;

import java.sql.*;

public class AddAdminDAO {
	public int k = 0;

	public int inserts(AdminBean ab) {
		try {
			Connection con = DbConnections.getConnection();
			PreparedStatement ps1 = con.prepareStatement("insert into admin63 values(?,?,?,?,?,?,?)");
            ps1.setString(1, ab.getAname());
			ps1.setString(2, ab.getPword());
			ps1.setString(3, ab.getFname());
			ps1.setString(4, ab.getLname());
			ps1.setString(5, ab.getAddr());
			ps1.setString(6, ab.getMid());
			ps1.setLong(7, ab.getPhno());
			k = ps1.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;

	}

}
