package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ByePRoductDAO {
	public int k=0;
	public int priceproduct(ProducTBean code) {
		try{
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from where CODE=?");
			ps.setString(1, code.getCode());
			ps.setString(2, code.getName());
			ps.setDouble(3, code.getPrice());
			ps.setInt(4,code.getQty());
			
			k=ps.executeUpdate();
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return k;
	}

}
