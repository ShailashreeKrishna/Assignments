package com.example.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;

public class ProductService {
	
	private Connection con;
	

	public ProductService(Connection con) {
		super();
		this.con = con;
	}
	public int update(String productName,double newPrice) {
		
		int rowsUpdated=0;
		String sql="Update  SHREE_PRODUCT1 set price=? where product_Name=?";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
		pstmt.setString(2,productName);
		pstmt.setDouble(1,newPrice);
			
			
		rowsUpdated=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		return rowsUpdated;
	}
	public int deleteById(int id) {
		int rowsDeleted=0;
		
		String sql="delete from SHREE_PRODUCT1 where product_Id=?";
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setInt(1, id);
			rowsDeleted=pstmt.executeUpdate();			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return rowsDeleted;
		
		
	}
	public Optional<Product> findById(int id){
		String sql="select *from SHREE_PRODUCT1 where product_Id=?";
		
	Optional<Product> obj=Optional.empty();
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setInt(1, id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int productId=rs.getInt("PRODUCT_ID");
				String productName=rs.getString("PRODUCT_NAME");
				Double price=rs.getDouble("PRICE");
				
				Product prod=new Product(productId,productName,price);
				
				obj=Optional.of(prod);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	public int addProduct(Product product) {
		
		int rowAdded =0;
		
		String sql="insert into SHREE_PRODUCT1 values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setDouble(3, product.getPrice());
			
			 rowAdded=pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}

public List<Product> findAll(){
	
	List<Product> productList=new ArrayList<Product>();
	
	String sql="select * from SHREE_PRODUCT1";
	try(PreparedStatement pstmt=con.prepareStatement(sql)){
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next()) {
			
			int productId=rs.getInt("PRODUCT_ID");
			String productName=rs.getString("PRODUCT_NAME");
			Double price=rs.getDouble("PRICE");
			
			Product prod=new Product(productId, productName, price);
			 
			productList.add(prod);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
	
	
	return productList;
	
}

//28.04.2022

public void usingTxn(Product prd1,Invoice invoice) {
	
	String addProductsql="insert into SHREE_PRODUCT1 VALUES (?,?,?)";
	String addInvoicesql="insert into SHREE_INVOICE1 VALUES (?,?,?,?)";
	
	try(PreparedStatement pstmt=con.prepareStatement(addProductsql);
			PreparedStatement instat=con.prepareStatement(addInvoicesql)){
		
		con.setAutoCommit(false);
		
		pstmt.setInt(1, prd1.getProductId());
		pstmt.setString(2, prd1.getProductName());
		pstmt.setDouble(3, prd1.getPrice());
	
		
		int rowAdded=pstmt.executeUpdate();
		
		//pstmt.setInt(1, prd2.getProductId());
		//pstmt.setString(2, prd2.getProductName());
		//pstmt.setDouble(3, prd2.getPrice());
		//int rowAdded1=pstmt.executeUpdate();
		
//		if(prd2.getPrice()>prd1.getPrice()) {
//			con.commit();
//		}else {
//			con.rollback();
//		}
		
		//con.commit();
		System.out.println("row added:"+rowAdded);
	
		instat.setInt(1, invoice.getInvoiceNumber());
		instat.setString(2, invoice.getCustomerNumber());
		instat.setInt(3, invoice.getQuantity());
		instat.setInt(4, invoice.getProductRef());
		
		int rowAdded1=instat.executeUpdate();
		
		if(prd1.getProductId()!=invoice.getProductRef()) {
			con.rollback();
		}else {
		
		con.commit();
	}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
	
	

}
