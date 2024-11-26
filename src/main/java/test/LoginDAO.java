package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public AdminBean ab=null;
	public AdminBean login(String un,String pw) {
		try {
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from admin63 where UNAME=? and PWORD=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs=ps.executeQuery();
		 if(rs.next()) {
			 ab=new AdminBean();
			 ab.setAname(rs.getString(1));
			 ab.setPword(rs.getString(2));
			 ab.setFname(rs.getString(3));
			 ab.setLname(rs.getString(4));
			 ab.setAddr(rs.getString(5));
			 ab.setMid(rs.getString(6));
			 ab.setPhno(rs.getLong(7));
		 }
			
			
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ab;
	}

}
