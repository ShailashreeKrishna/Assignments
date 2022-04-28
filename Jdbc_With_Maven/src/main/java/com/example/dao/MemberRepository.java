package com.example.dao;
import com.example.*;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;

public class MemberRepository implements CrudRepository<Member> {
	private Connection con;
	

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		
		int valueadded=0;
		
		String sql="insert into SHMEMBER6 values(?,?,?,?,?,?,?,?)";
		
		try(PreparedStatement memstat=con.prepareStatement(sql)){
			
			memstat.setInt(1, obj.getMemberID());
			memstat.setString(2, obj.getMemberName());
			memstat.setString(3, obj.getMemberAddress());
			java.sql.Date sqlDate = java.sql.Date.valueOf(obj.getAccountOpenDate());
			memstat.setDate(4, sqlDate);
			
			memstat.setString(5,obj.getMemberShipType());
			memstat.setDouble(6,obj.getFeesPaid());
			memstat.setInt(7, obj.getMaxBookAllowed());
			memstat.setDouble(8, obj.getPenaltyAmount());
			
			valueadded=memstat.executeUpdate();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return valueadded;
	}

	public List<Member> findAll() {
		// TODO Auto-generated method stub
		List<Member> memberList=new ArrayList<Member>();
		String sql="select*from SHMEMBER6";		
		
		try(PreparedStatement memstat=con.prepareStatement(sql)){
			
			ResultSet result=memstat.executeQuery();
			
			while(result.next()) {
				
				int memberID=result.getInt("MEMBER_ID");
				 String memberName=result.getString("MEMBER_NAME");
				 String memberAddress=result.getString("MEMBER_ADDRESS");
				
				Date accountOpenDate=result.getDate("ACC_OPEN_DATE");
				 String memberShipType=result.getString("MEMBERSHIP_TYPE");
				 double feesPaid=result.getDouble("FEES_PAID");
				 int maxBookAllowed=result.getInt("MAX_BOOK_ALLOWED");
				 double penaltyAmount=result.getDouble("PENALTY_AMOUNT");
				 
				 Member member=new Member(memberID, memberName, memberAddress, accountOpenDate, memberShipType, feesPaid, maxBookAllowed, penaltyAmount);
				memberList.add(member);
			}	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
