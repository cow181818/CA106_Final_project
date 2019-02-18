package com.emp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class LanDAO implements LanDAO_interface {

	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/goodhouse");
		}catch(NamingException e) {
			e.printStackTrace();
		}
	}
	
	private static final String INSERT=
			"INSERT INTO LANDLORD  (LAN_ID,MEM_ID,LAN_RECEIPT,LAN_ACCOUNT,LAN_ACCOUNTSTATUS) VALUES ('L'||LPAD(to_char(LAN_SEQ.NEXTVAL), 9, '0'),?,?,?,?) ";
	private static final String GET_ALL=
			"SELECT LAN_ID,MEM_ID,LAN_RECEIPT,LAN_ACCOUNT,LAN_ACCOUNTSTATUS FROM LANDLORD order by LAN_ID ";
	private static final String GET_ONE=
			"SELECT LAN_ID,MEM_ID,LAN_RECEIPT,LAN_ACCOUNT,LAN_ACCOUNTSTATUS FROM LANDLORD where LAN_ID=? ";
	private static final String DELETE=
			"DELETE FROM LANDLORD where LAN_ID=?";
	private static final String UPDATE=
			"UPDATE LANDLORD set LAN_ID=?,MEM_ID=?,LAN_RECEIPT=?,LAN_ACCOUNT=?,LAN_ACCOUNTSTATU=?";
	

	@Override
	public void insert(LanVO lanVo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con= ds.getConnection();
			pstmt=con.prepareStatement(INSERT);
			
			pstmt.setString(1,lanVo.getMEM_ID());
			pstmt.setString(2,lanVo.getLAN_RECEIPT());
			pstmt.setInt(3,lanVo.getLAN_ACCOUNT());
			pstmt.setString(4,lanVo.getLAN_ACCOUNTSTATUS());
			
			pstmt.executeUpdate();
			
		}catch(SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
		}finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void update(LanVO lanVo) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt =null;
		
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(UPDATE);
			
			pstmt.setString(1,lanVo.getMEM_ID());
			pstmt.setString(2,lanVo.getLAN_RECEIPT());
			pstmt.setInt(3,lanVo.getLAN_ACCOUNT());
			pstmt.setString(4,lanVo.getLAN_ACCOUNTSTATUS());
			
			pstmt.executeUpdate();
		}catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
	}

	@Override
	public void delete(String LAN_ID) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con=ds.getConnection();
			pstmt = con.prepareStatement(DELETE);
			pstmt.setString(1, LAN_ID);
			pstmt.executeUpdate();
		
		}catch (SQLException se) {
			throw new RuntimeException("A database error occured. "
					+ se.getMessage());
			// Clean up JDBC resources
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException se) {
					se.printStackTrace(System.err);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}
		
	}

	@Override
	public LanVO findByPrimaryKey(String LAN_ID) {
		// TODO Auto-generated method stub
		
		
		LanVO lanVO = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con= ds.getConnection();
			pstmt = con.prepareStatement(GET_ONE);
			pstmt.setString(1,LAN_ID);
			rs = pstmt.executeQuery();
		    
				while(rs.next()) {
				lanVO =  new LanVO();
				lanVO.setMEM_ID(rs.getString("MEM_ID"));
				lanVO.setLAN_RECEIPT(rs.getString("LAN_RECEIPT"));
				lanVO.setLAN_ACCOUNT(rs.getInt("LAN_ACCOUNT"));
				lanVO.setLAN_ACCOUNTSTATUS(rs.getString("LAN_ACCOUNTSTATUS"));
				} 
			
		    }catch (SQLException se) {
				throw new RuntimeException("A database error occured. "
						+ se.getMessage());
				// Clean up JDBC resources
			} finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException se) {
						se.printStackTrace(System.err);
					}
				}
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException se) {
						se.printStackTrace(System.err);
					}
				}
				if (con != null) {
					try {
						con.close();
					} catch (Exception e) {
						e.printStackTrace(System.err);
					}
				}
			}
			return lanVO;
		}

	@Override
	public List<LanVO> getall() {
		// TODO Auto-generated method stub
	List<LanVO> list = new ArrayList<LanVO>();
	LanVO lanVO = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		
		con = ds.getConnection();
		pstmt = con.prepareStatement(GET_ALL);
		rs = pstmt.executeQuery();
		
	  while(rs.next()) {
		lanVO =  new LanVO();
		lanVO.setMEM_ID(rs.getString("MEM_ID"));
		lanVO.setLAN_RECEIPT(rs.getString("LAN_RECEIPT"));
		lanVO.setLAN_ACCOUNT(rs.getInt("LAN_ACCOUNT"));
		lanVO.setLAN_ACCOUNTSTATUS(rs.getString("LAN_ACCOUNTSTATUS"));
		} 
	} catch (SQLException se) {
		throw new RuntimeException("A database error occured. "
				+ se.getMessage());
		// Clean up JDBC resources
	} finally {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException se) {
				se.printStackTrace(System.err);
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace(System.err);
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}
	}
	return list;
	}
}