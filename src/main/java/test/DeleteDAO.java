package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDAO {
	public int k=0;
	public int delete(ProducTBean pb) {
		try {
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from product63 where CODE=? ");
			ps.setString(1, pb.getCode());
			ps.setString(2, pb.getName());
			ps.setDouble(2, pb.getPrice());
			ps.setInt(3,pb.getQty());
			k=ps.executeUpdate();
			
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return k;
		
	}
	

}
