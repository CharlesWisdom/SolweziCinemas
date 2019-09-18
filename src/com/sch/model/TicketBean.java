/**
 * 
 */
package com.sch.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Temwani
 *
 */
public class TicketBean {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	   static final String DB_URL = "jdbc:mysql://localhost:3306/ticketdatabase";
	   static final String DB_USER = "root";
	   static final String DB_PASS = "Temwan!25";
	   public List<Ticket> mTickets = new ArrayList<Ticket>();
	  // private JdbcRowSet rowSet = null;
	   
	   public TicketBean() {

			   try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS)) {
			        String sqlQuery = "SELECT * FROM ticketdatabase.t_reservation";
			        Statement statement = con.createStatement();
			        ResultSet result = statement.executeQuery(sqlQuery);
			        
			        while(result.next()) {
			        	Ticket pTicket = new Ticket(result.getInt("TicketID"),String.valueOf(result.getInt("RowNumber")),result.getString("ColumnLetter"),result.getInt("isBooked"));
			        	mTickets.add(pTicket);
			        }
			   } catch (SQLException ex) {
			         
			         ex.printStackTrace();
			      } 

 
	   }
	   
	   public Ticket getBooking(String pRowNumer, String pColumnLetter) {
		   Ticket pTicket = null;
			try {
				Class.forName("com.msql.jdbc.Driver");
				   try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS)) {
				        String sqlQuery = "SELECT * FROM ticketdatabase.t_reservation WHERE RowNumber = ?, ColumnLetter = ?";
				        Statement statement = con.createStatement();
				        ResultSet result = statement.executeQuery(sqlQuery);
				        
				        while(result.next()) {
				        	pTicket = new Ticket(result.getInt(0),String.valueOf(result.getInt(1)),result.getString(2),result.getInt(3));
				        	mTickets.add(pTicket);
				        }
				   } catch (SQLException ex) {
				         
				         ex.printStackTrace();
				      } 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
		   
		   return pTicket;
	   }
	   
	   public Boolean createBooking (Ticket pTicket) {
		      try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS)) {
		        String sqlQuery = "INSERT INTO ticketdatabase.t_reservation (RowNumber,ColumnLetter,isBooked) VALUES (?,?,?)";
		       
		        PreparedStatement statement = con.prepareStatement(sqlQuery);
		        statement.setInt(1, Integer.parseInt(pTicket.getRowNumber()));
		        statement.setString(2, pTicket.getColumnLetter());
		        statement.setInt(3, pTicket.getIsBooked());
		        
		        int rowsInserted = statement.executeUpdate();
		        if(rowsInserted > 0) {
		        	return true;
		        }
		      } catch (SQLException ex) {
		         
		         ex.printStackTrace();
		      }
		      return false;
		   }
	   
	   
	   public Boolean update (Ticket pTicket) {
		      try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS)) {
		    	  String sqlQuery = "UPDATE ticketdatabase.t_reservation SET RowNumber = ?, ColumnLetter = ?, isBooked = ? WHERE TicketID = ?";
		    	  
		    	  PreparedStatement statement = con.prepareStatement(sqlQuery);
		    	  statement.setString(1, pTicket.getRowNumber());
		    	  statement.setString(2, pTicket.getColumnLetter());
		    	  statement.setInt(3, pTicket.getIsBooked());
		    	  
		    	  int rowsInserted = statement.executeUpdate();
			        if(rowsInserted > 0) {
			        	return true;
			        }
			    } catch (SQLException ex) {
			         
			         ex.printStackTrace();
			      }
			      return false;
		   }	
	   
	   public Boolean delete(int pTicketID) {
		      try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS)) {
		    	  String sqlQuery = "DELETE FROM ticketdatabase.t_reservation WHERE TicketID = ?";
		    	  
		    	  PreparedStatement statement = con.prepareStatement(sqlQuery);
		    	  statement.setInt(3, pTicketID);
		    	  
		    	  int rowsInserted = statement.executeUpdate();
			        if(rowsInserted > 0) {
			        	return true;
			        }
			    } catch (SQLException ex) {
			         
			         ex.printStackTrace();
			      }
			      return false;
		   }	   
}
