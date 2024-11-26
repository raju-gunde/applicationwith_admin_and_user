package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO {
	public Customebean cb=null;
	public  Customebean login(String un,String pw) {
		try {
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from customer63 where UNAME=? and PWORD=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				cb=new Customebean();
				cb.setUname(rs.getString(1));
				cb.setPword(rs.getString(2));
				cb.setFname(rs.getString(3));
				cb.setLname(rs.getString(4));
				cb.setAddr(rs.getString(5));
				cb.setMid(rs.getString(6));
				cb.setPhno(rs.getLong(7));
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return cb;
	}

}
