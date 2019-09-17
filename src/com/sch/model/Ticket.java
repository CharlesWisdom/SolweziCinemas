/**
 * 
 */
package com.sch.model;

/**
 * @author Temwani
 *
 */
public class Ticket {
	private int TicketID;
	private String RowNumber;
	private String ColumnLetter;
	private int isBooked;
	
	public Ticket(){}
	
	public Ticket(int pTicketID, String pRowNumber, String pColumnLetter, int pisBooked){
		TicketID = pTicketID;
		RowNumber = pRowNumber;
		ColumnLetter = pColumnLetter;
		isBooked = pisBooked;
	}
	
	public Ticket(String pRowNumber, String pColumnLetter, int pisBooked){
		RowNumber = pRowNumber;
		ColumnLetter = pColumnLetter;
		isBooked = pisBooked;
	}

	public int getTicketID() {
		return TicketID;
	}
	public void setTicketID(int ticketID) {
		TicketID = ticketID;
	}
	
	public String getRowNumber() {
		return RowNumber;
	}
	public void setRowNumber(String rowNumber) {
		RowNumber = rowNumber;
	}
	
	public String getColumnLetter() {
		return ColumnLetter;
	}
	public void setColumnLetter(String columnLetter) {
		ColumnLetter = columnLetter;
	}
	
	public int getIsBooked() {
		return isBooked;
	}
	public void setIsBooked(int isBooked) {
		this.isBooked = isBooked;
	}
}
