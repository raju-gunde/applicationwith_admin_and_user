package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VewproductDAO {
	public ArrayList<ProducTBean> al=new ArrayList<ProducTBean>();
	public ArrayList<ProducTBean> retrieve(){
		try {
			Connection con=DbConnections.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from product63");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				ProducTBean pb=new ProducTBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getLong(3));
				pb.setQty(rs.getInt(4));
				al.add(pb);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return al;
		
	}

}
