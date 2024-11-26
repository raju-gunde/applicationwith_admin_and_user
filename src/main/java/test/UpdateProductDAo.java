package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAo {
	public int k=0;
	public int update(ProducTBean pb) {
		try {
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("update  product63 set PRICE=?, QTY=? where CODE=?");
			ps.setDouble(1, pb.getPrice());
			ps.setInt(2, pb.getQty());
			ps.setString(3, pb.getCode());
			k=ps.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}

}
