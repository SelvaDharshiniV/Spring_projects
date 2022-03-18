package com.example.demo.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.example.demo.ifaces.CrudRepository;
import com.example.demo.ifaces.DoctorRepository;
import com.example.demo.model.Doctor;

public class DoctorDao implements CrudRepository<Doctor>,DoctorRepository<Doctor> {
	private Connection con;
	public DoctorDao(Connection con) {
		super();
		this.con=con;
	}
	public DoctorDao() {
		super();	
	}
//	private static DoctorDao instance = new DoctorDao();
//	private static HashSet<Doctor> doc;
//
//	private DoctorDao() {
//		doc = new HashSet<>();
//		doc.add(new Doctor(101, "Kanic", 762138761, "jhgsfjk", "sdzgsd", "sddgy"));
//	}

//	public static DoctorDao getInstance() {
//		return instance;
//	}
//	public List<Doctor> getAll() {
//		return new ArrayList<>(doc);
//	}
	@Override
	public int add(Doctor t) {
		
       String sql = "insert into selva_doctor values(?,?,?,?,?,?)";
		
		int rowAdded=0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,t.getDoctorId());
			pstmt.setString(2, t.getDocytoName());
			pstmt.setLong(3, t.getHandPhone());
			pstmt.setString(4, t.getEmail());
			pstmt.setString(5, t.getspecialiation());
			pstmt.setString(6, t.getCity());
			
			rowAdded = pstmt.executeUpdate();
			      
			} catch (SQLException e) {
			       e.printStackTrace();
			}
       return rowAdded;
	}

	@Override
	public List<Doctor> findAll() {
		String sql="select* from selva_doctor";
		List<Doctor> docList = new ArrayList<Doctor>();
		Doctor found=null;
		try (PreparedStatement pstmt= con.prepareStatement(sql)){
			System.out.println(pstmt.getClass().getName());
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()) {
				found=mapResultSetToDoctor(rs);
				docList.add(found);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return docList;
	}
	@Override
	public Doctor findById(int pkey) {
		String sql="select * from selva_doctor where doctorId=?";
		Doctor found=null;
		try (PreparedStatement pstmt= con.prepareStatement(sql)){
			pstmt.setInt(1, pkey);
			ResultSet rs=pstmt.executeQuery();
		if( rs.next()) {
			 found=mapResultSetToDoctor(rs);
		}
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		return found;
	}
	@Override
	public int update(Doctor t) { //upsert
		int pkey=t.getDoctorId();
		Object rowFount=findById(pkey);
		int rowUpdate=0;
		if (rowFount==null) {
			System.out.println("Element not found Hence adding element");
			add(t);
		} else {
			System.out.println("Element found can be updated");
			String sql="update selva_doctor set docytoName=?,city=?,email=?,specialiation=?,handPhone=? where doctorId=?";
			
			try(PreparedStatement pstmt = con.prepareStatement(sql)) {
				pstmt.setString(1, t.getDocytoName());
				pstmt.setString(2, t.getCity());
				pstmt.setString(3, t.getEmail());
				pstmt.setString(4, t.getspecialiation());
				pstmt.setLong(5, t.getHandPhone());
				pstmt.setInt(6,t.getDoctorId());
				rowUpdate=pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();			}
		}
		return rowUpdate;
	}
	@Override
	public int deleteById(int pkey) {
		String sql="delete from selva_doctor where doctorId=?";
		int rowDeleted=0;
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1,pkey);
			rowDeleted = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		return rowDeleted;
	}
	@Override
	public List<Doctor> findByCity(String cityName){
		String sql="select* from selva_doctor where city=?";
		List<Doctor> docList = new ArrayList<Doctor>();
		Doctor found=null;
		try (PreparedStatement pstmt= con.prepareStatement(sql)){
			pstmt.setString(1, cityName);
			ResultSet rs=pstmt.executeQuery();
		while( rs.next()) {
			 found=mapResultSetToDoctor(rs);
				docList.add(found);
		}
		} catch (SQLException e) {
			e.printStackTrace();		
		}
		return  docList;
}
	
	private Doctor mapResultSetToDoctor(ResultSet rs)throws SQLException {
		int doctorId= rs.getInt("doctorId");
		String docytoName=rs.getString("docytoName");
		long handPhone=rs.getLong("handPhone");
		String city= rs.getString("city");
		String specialiation=rs.getString("specialiation");
		String email= rs.getString("email");
		Doctor found= new Doctor(doctorId, docytoName, handPhone, email, specialiation, city);
		return found;
	}

}
