package com.emp.model;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemDAO implements MemDAO_interface{
	
	private static DataSource ds = null;
	static {
		try {
			Context ctx= new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/goodhouse");
			
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	private static final String INSERT =
			"INSERT INTO MEMBER VALUES ( 'M'||LPAD(to_char(MEM_SEQ.NEXTVAL), ?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String GET_ALL =
			"SELECT FROM MEMBER order by MEM_ID ";
	private static final String GET_ONE=
			"SELECT FROM MEMBER where MEM_ID";
	private static final String DELETE=
			"DELETE FROM MEMBER where MEM_ID";
	private static final String UPDATE=
			"UPDATE MEMBER set MEM_NAME=?,MEM_BIRTHDAY=?,MEM_PASSWORD=?,MEM_ADDRESS=?,MEM_ZIPCODE=?,MEM_TELEPHONE=?,MEM_PHONE NUMBER=?,MEM_EMAIL =?,MEM_STATUS=?,MEM_PICTURE=?,GOOD_TOTAL=?,MEM_SEX VARCHAR2=?";
	
	@Override
	public void insert(MemVO memVo) {
		// TODO Auto-generated method stub
	
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(INSERT);
			
			pstmt.setString(1, memVo.getMEM_NAME());
			pstmt.setDate(2, memVo.getMEM_BIRTHDAY());
			pstmt.setString(3,memVo.getMEM_PASSWORD());
			pstmt.setString(4,memVo.getMEM_ADDRESS());
			pstmt.setString(5,memVo.getMEM_ZIPCODE());
			pstmt.setInt(6,memVo.getMEM_TELEPHONE());
			pstmt.setInt(7,memVo.getMEM_PHONE());
			pstmt.setString(8,memVo.getMEM_EMAIL());
			pstmt.setString(9,memVo.getMEM_STATUS());
			pstmt.setByte(10,memVo.getMEM_PICTURE());
			pstmt.setInt(11,memVo.getGOOD_TOTAL());
			pstmt.setString(12,memVo.getMEM_SEX());
			
			pstmt.executeUpdate();
		
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured."
					+se.getMessage());
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if(con !=null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public void update(MemVO memVo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ds.getConnection();
			pstmt= con.prepareStatement(UPDATE);
			
			pstmt.setString(1, memVo.getMEM_NAME());
			pstmt.setDate(2, memVo.getMEM_BIRTHDAY());
			pstmt.setString(3,memVo.getMEM_PASSWORD());
			pstmt.setString(4,memVo.getMEM_ADDRESS());
			pstmt.setString(5,memVo.getMEM_ZIPCODE());
			pstmt.setInt(6,memVo.getMEM_TELEPHONE());
			pstmt.setInt(7,memVo.getMEM_PHONE());
			pstmt.setString(8,memVo.getMEM_EMAIL());
			pstmt.setString(9,memVo.getMEM_STATUS());
			pstmt.setByte(10,memVo.getMEM_PICTURE());
			pstmt.setInt(11,memVo.getGOOD_TOTAL());
			pstmt.setString(12,memVo.getMEM_SEX());
			
			pstmt.executeUpdate();
			
			
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured." +se.getMessage());
			
		}finally {
			if(pstmt !=null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if(con !=null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void delete(String MEM_ID) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con= ds.getConnection();
			pstmt = con.prepareStatement(DELETE);
			
			pstmt.setString(1, MEM_ID);
			pstmt.executeUpdate();
			
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured"+ se.getMessage());
			
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public MemVO findByPrimaryKey(String MEM_ID) {
		// TODO Auto-generated method stub
		MemVO memVO =null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ONE);
			
			pstmt.setString(1,MEM_ID);
			
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				memVO = new MemVO();
				memVO.setMEM_NAME(rs.getString("MEM_NAME"));
				memVO.setMEM_BIRTHDAY(rs.getDate("MEM_BIRTHDAY"));
				memVO.setMEM_PASSWORD(rs.getString("MEM_PASSWORD"));
				memVO.setMEM_ADDRESS(rs.getString("MEM_ADDRESS"));
				memVO.setMEM_ZIPCODE(rs.getString("MEM_ZIPCODE"));
				memVO.setMEM_ADDRESS(rs.getString("MEM_ADDRESS"));
				memVO.setMEM_TELEPHONE(rs.getInt("MEM_TELEPHONE"));
				memVO.setMEM_PHONE(rs.getInt("MEM_PHONE"));
				memVO.setMEM_EMAIL(rs.getString("MEM_EMAIL"));
				memVO.setMEM_STATUS(rs.getString("MEM_STATUS"));
			}
			
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured."+se.getMessage());
			
		}finally {
			try {
				rs.close();
			}catch(SQLException se) {
				se.printStackTrace(System.err);
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
		return memVO;
	}

	@Override
	public List<MemVO> getAll() {
		List<MemVO> list = new ArrayList();
		MemVO memVO =null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(GET_ALL);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
			memVO = new MemVO();
			memVO.setMEM_NAME(rs.getString("MEM_NAME"));
			memVO.setMEM_BIRTHDAY(rs.getDate("MEM_BIRTHDAY"));
			memVO.setMEM_PASSWORD(rs.getString("MEM_PASSWORD"));
			memVO.setMEM_ADDRESS(rs.getString("MEM_ADDRESS"));
			memVO.setMEM_ZIPCODE(rs.getString("MEM_ZIPCODE"));
			memVO.setMEM_ADDRESS(rs.getString("MEM_ADDRESS"));
			memVO.setMEM_TELEPHONE(rs.getInt("MEM_TELEPHONE"));
			memVO.setMEM_PHONE(rs.getInt("MEM_PHONE"));
			memVO.setMEM_EMAIL(rs.getString("MEM_EMAIL"));
			memVO.setMEM_STATUS(rs.getString("MEM_STATUS"));
			list.add(memVO);
			}
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured "+se.getMessage());
		}finally {
			try {
				rs.close();
			}catch(SQLException se) {
				se.printStackTrace(System.err);
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		return list;
	}

}
