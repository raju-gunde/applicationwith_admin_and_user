package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {
	public int k=0;
	public int insert(ProducTBean ab) {
		try {
		Connection con=DbConnections.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into product63 values(?,?,?,?)");
		ps.setString(1, ab.getCode());
		ps.setString(2, ab.getName());
	    ps.setDouble(3, ab.getPrice());
	    ps.setInt(4, ab.getQty());
	    k=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return k;
		
	}

}
