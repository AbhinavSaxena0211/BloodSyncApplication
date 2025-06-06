package in.bloodsync.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.bloodsync.dbutil.DBConnection;
import in.bloodsync.pojo.BloodDonorPojo;

public class BloodDonorDao {
	
	private static Connection conn;
	
	public static boolean addDonor(BloodDonorPojo donorPojo)throws SQLException{
		conn = DBConnection.getConnection();
		String query = "INSERT INTO blood_donors (name, blood_type, city, contact) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, donorPojo.getName());
		ps.setString(2, donorPojo.getBloodType());
		ps.setString(3, donorPojo.getCity());
		ps.setString(4, donorPojo.getContact());
		
		int result = ps.executeUpdate();
		ps.close();
		return result > 0;
	}
	
	public static List<BloodDonorPojo> getAllDonors() throws SQLException{
		conn=DBConnection.getConnection();
		String query = "SELECT * from blood_donors";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		List<BloodDonorPojo> donors = new ArrayList<>();
		BloodDonorPojo donor;
		while(rs.next()) {
			donor=new BloodDonorPojo();
			donor.setDonorId(rs.getInt("donor_id"));
			donor.setName(rs.getString("name"));
			donor.setBloodType(rs.getString("blood_type"));
			donor.setCity(rs.getString("city"));
			donor.setContact(rs.getString("contact"));
			donor.setBloodUnit(rs.getInt("blood_unit"));
			donors.add(donor);
		}
		st.close();
		rs.close();
		return donors;
	}
	public static boolean deleteDonor(int id) throws SQLException{
		conn = DBConnection.getConnection();
		String query = "DELETE FROM blood_donors WHERE donor_id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, id);
		
		int executeUpdate = ps.executeUpdate();
		return executeUpdate>0;
	}
	
	public static boolean updateDonor(int id, int units) throws SQLException{
		conn = DBConnection.getConnection();
		String query = "UPDATE blood_donors SET blood_unit=? WHERE donor_id = ?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, units);
		ps.setInt(2, id);
		conn.setAutoCommit(false);
		int ans = ps.executeUpdate();
		System.out.println("Answer from update units : "+ans);
		
		int updateStock = BloodStockDao.updateStock(id, units);
		System.out.println("Answer from update Stock : "+updateStock);
		if(ans>0 && updateStock>0) {
			conn.setAutoCommit(true);
			return true;
		}else {
			conn.rollback();
			return false;
		}
		
	}
}

