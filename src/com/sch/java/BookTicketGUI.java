package com.sch.java;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import com.sch.model.*;

public class BookTicketGUI extends JFrame  implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JFrame fDisplay;
	private static JPanel contentPane;
	private static JTextField txtRowNumber;
	private static JTextField txtColLetter;
	private static JLabel lblRowNumber;
	private static JLabel lblColLetter;
	
	//new JTextField[63];
	
	private static JTextField txt0A;
	private static JTextField txt0B;
	private static JTextField txt0C;
	private static JTextField txt0D;
	private static JTextField txt0E;
	private static JTextField txt0F;
	private static JTextField txt0G;
	
	private static JTextField txt1A;
	private static JTextField txt1B;
	private static JTextField txt1C;
	private static JTextField txt1D;
	private static JTextField txt1E;
	private static JTextField txt1F;
	private static JTextField txt1G;
	
	private static JTextField txt2A;
	private static JTextField txt2B;
	private static JTextField txt2C;
	private static JTextField txt2D;
	private static JTextField txt2E;
	private static JTextField txt2F;
	private static JTextField txt2G;
	
	private static JTextField txt4A;
	private static JTextField txt4B;
	private static JTextField txt4C;
	private static JTextField txt4D;
	private static JTextField txt4E;
	private static JTextField txt4F;
	private static JTextField txt4G;
	
	private static JTextField txt5A;
	private static JTextField txt5B;
	private static JTextField txt5C;
	private static JTextField txt5D;
	private static JTextField txt5E;
	private static JTextField txt5F;
	private static JTextField txt5G;
	
	private static JTextField txt6A;
	private static JTextField txt6B;
	private static JTextField txt6C;
	private static JTextField txt6D;
	private static JTextField txt6E;
	private static JTextField txt6F;
	private static JTextField txt6G;
	
	private static JTextField txt8A;
	private static JTextField txt8B;
	private static JTextField txt8C;
	private static JTextField txt8D;
	private static JTextField txt8E;
	private static JTextField txt8F;
	private static JTextField txt8G;
	
	private static JTextField txt9A;
	private static JTextField txt9B;
	private static JTextField txt9C;
	private static JTextField txt9D;
	private static JTextField txt9E;
	private static JTextField txt9F;
	private static JTextField txt9G;
	
	private static JTextField txt10A;
	private static JTextField txt10B;
	private static JTextField txt10C;
	private static JTextField txt10D;
	private static JTextField txt10E;
	private static JTextField txt10F;
	private static JTextField txt10G;
	
	private static JTextField txtBoxes[] = {txt0A,txt0B,txt0C,txt0D,txt0E,txt0F,txt0G,
			txt1A,txt1B,txt1C,txt1D,txt1E,txt1F,txt1G,
			txt2A,txt2B,txt2C,txt2D,txt2E,txt2F,txt2G,
			txt4A,txt4B,txt4C,txt4D,txt4E,txt4F,txt4G,
			txt5A,txt5B,txt5C,txt5D,txt5E,txt5F,txt5G,
			txt6A,txt6B,txt6C,txt6D,txt6E,txt6F,txt6G,
			txt8A,txt8B,txt8C,txt8D,txt8E,txt8F,txt8G,
			txt9A,txt9B,txt9C,txt9D,txt9E,txt9F,txt9G,
			txt10A,txt10B,txt10C,txt10D,txt10E,txt10F,txt10G};
	
	public BookTicketGUI() {
		
	}

	/**
	 * Launch the application.
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		fDisplay = new JFrame("Solwezi Cinemas");

		try {
			// set look and feel
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		 BookTicketGUI bookTicket = new BookTicketGUI();
		 

			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			
			JPanel pnlCRUD = new JPanel();
			pnlCRUD.setBounds(5, 5, 140, 301);
			contentPane.add(pnlCRUD);
			pnlCRUD.setLayout(null);
			
			txtRowNumber = new JTextField();
			txtRowNumber.setBounds(10, 32, 120, 29);
			pnlCRUD.add(txtRowNumber);
			txtRowNumber.setColumns(10);
			
			txtColLetter = new JTextField();
			txtColLetter.setBounds(10, 108, 120, 29);
			pnlCRUD.add(txtColLetter);
			txtColLetter.setColumns(10);
			
			lblRowNumber = new JLabel("Row Number");
			lblRowNumber.setBounds(10, 8, 120, 20);
			pnlCRUD.add(lblRowNumber);
			
			lblColLetter = new JLabel("Column Letter");
			lblColLetter.setBounds(10, 83, 120, 20);
			pnlCRUD.add(lblColLetter);
			
			JButton btnBookTicket = new JButton("Book Seat");
			btnBookTicket.setBounds(10, 166, 120, 34);
			pnlCRUD.add(btnBookTicket);
			btnBookTicket.addActionListener(bookTicket);
			
		/*
		 * JButton btnUpdateTicket = new JButton("Update Booking");
		 * btnUpdateTicket.setBounds(10, 211, 120, 34); pnlCRUD.add(btnUpdateTicket);
		 * btnUpdateTicket.addActionListener(bookTicket);
		 */
			
			JButton btnDeleteBooking = new JButton("Delete Booking");
			btnDeleteBooking.setBounds(10, 256, 120, 34);
			pnlCRUD.add(btnDeleteBooking);
			btnDeleteBooking.addActionListener(bookTicket);
			
			JPanel pnlCinemaDisplay = new JPanel();
			pnlCinemaDisplay.setBackground(Color.WHITE);
			pnlCinemaDisplay.setBounds(144, 5, 320, 301);
			contentPane.add(pnlCinemaDisplay);
			pnlCinemaDisplay.setLayout(null);
			
			JLabel lbl10 = new JLabel("10");
			lbl10.setBackground(Color.GRAY);
			lbl10.setForeground(Color.BLUE);
			lbl10.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl10.setHorizontalAlignment(SwingConstants.CENTER);
			lbl10.setBounds(10, 267, 39, 23);
			pnlCinemaDisplay.add(lbl10);
			
			JLabel lbl9 = new JLabel("9");
			lbl9.setForeground(Color.BLUE);
			lbl9.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl9.setHorizontalAlignment(SwingConstants.CENTER);
			lbl9.setBounds(10, 243, 39, 23);
			pnlCinemaDisplay.add(lbl9);
			
			JLabel lbl8 = new JLabel("8");
			lbl8.setForeground(Color.BLUE);
			lbl8.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl8.setHorizontalAlignment(SwingConstants.CENTER);
			lbl8.setBounds(10, 219, 39, 23);
			pnlCinemaDisplay.add(lbl8);
			
			JLabel lbl7 = new JLabel("7");
			lbl7.setForeground(Color.BLUE);
			lbl7.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl7.setHorizontalAlignment(SwingConstants.CENTER);
			lbl7.setBounds(10, 195, 39, 23);
			pnlCinemaDisplay.add(lbl7);
			
			JLabel lbl6 = new JLabel("6");
			lbl6.setForeground(Color.BLUE);
			lbl6.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl6.setHorizontalAlignment(SwingConstants.CENTER);
			lbl6.setBounds(10, 173, 39, 23);
			pnlCinemaDisplay.add(lbl6);
			
			JLabel lbl5 = new JLabel("5");
			lbl5.setForeground(Color.BLUE);
			lbl5.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl5.setHorizontalAlignment(SwingConstants.CENTER);
			lbl5.setBounds(10, 151, 39, 23);
			pnlCinemaDisplay.add(lbl5);
			
			JLabel lbl4 = new JLabel("4");
			lbl4.setForeground(Color.BLUE);
			lbl4.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl4.setHorizontalAlignment(SwingConstants.CENTER);
			lbl4.setBounds(10, 129, 39, 23);
			pnlCinemaDisplay.add(lbl4);
			
			JLabel lbl3 = new JLabel("3");
			lbl3.setForeground(Color.BLUE);
			lbl3.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl3.setHorizontalAlignment(SwingConstants.CENTER);
			lbl3.setBounds(10, 105, 39, 23);
			pnlCinemaDisplay.add(lbl3);
			
			JLabel lbl2 = new JLabel("2");
			lbl2.setForeground(Color.BLUE);
			lbl2.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			lbl2.setBounds(10, 81, 39, 23);
			pnlCinemaDisplay.add(lbl2);
			
			JLabel lbl1 = new JLabel("1");
			lbl1.setForeground(Color.BLUE);
			lbl1.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl1.setBounds(10, 59, 39, 23);
			pnlCinemaDisplay.add(lbl1);
			
			JLabel lbl0 = new JLabel("0");
			lbl0.setBackground(Color.LIGHT_GRAY);
			lbl0.setForeground(Color.BLUE);
			lbl0.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lbl0.setHorizontalAlignment(SwingConstants.CENTER);
			lbl0.setBounds(10, 37, 39, 23);
			pnlCinemaDisplay.add(lbl0);
			
			JLabel lblA = new JLabel("A");
			lblA.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblA.setHorizontalAlignment(SwingConstants.CENTER);
			lblA.setBounds(52, 11, 39, 23);
			pnlCinemaDisplay.add(lblA);
			
			JLabel lblB = new JLabel("B");
			lblB.setHorizontalAlignment(SwingConstants.CENTER);
			lblB.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblB.setBounds(89, 11, 39, 23);
			pnlCinemaDisplay.add(lblB);
			
			JLabel lblC = new JLabel("C");
			lblC.setHorizontalAlignment(SwingConstants.CENTER);
			lblC.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblC.setBounds(126, 11, 39, 23);
			pnlCinemaDisplay.add(lblC);
			
			JLabel lblD = new JLabel("D");
			lblD.setHorizontalAlignment(SwingConstants.CENTER);
			lblD.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblD.setBounds(163, 11, 39, 23);
			pnlCinemaDisplay.add(lblD);
			
			JLabel lblE = new JLabel("E");
			lblE.setHorizontalAlignment(SwingConstants.CENTER);
			lblE.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblE.setBounds(200, 11, 39, 23);
			pnlCinemaDisplay.add(lblE);
			
			JLabel lblF = new JLabel("F");
			lblF.setHorizontalAlignment(SwingConstants.CENTER);
			lblF.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblF.setBounds(237, 11, 39, 23);
			pnlCinemaDisplay.add(lblF);
			
			JLabel lblG = new JLabel("G");
			lblG.setHorizontalAlignment(SwingConstants.CENTER);
			lblG.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblG.setBounds(274, 11, 39, 23);
			pnlCinemaDisplay.add(lblG);
			
	/*		JLabel lblH = new JLabel("H");
			lblH.setHorizontalAlignment(SwingConstants.CENTER);
			lblH.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblH.setBounds(365, 11, 39, 23);
			pnlCinemaDisplay.add(lblH);
			
			JLabel lblI = new JLabel("I");
			lblI.setHorizontalAlignment(SwingConstants.CENTER);
			lblI.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblI.setBounds(402, 11, 39, 23);
			pnlCinemaDisplay.add(lblI);
			
			JLabel lblJ = new JLabel("J");
			lblJ.setHorizontalAlignment(SwingConstants.CENTER);
			lblJ.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblJ.setBounds(439, 11, 39, 23);
			pnlCinemaDisplay.add(lblJ);
			
			JLabel lblK = new JLabel("K");
			lblK.setHorizontalAlignment(SwingConstants.CENTER);
			lblK.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblK.setBounds(481, 11, 39, 23);
			pnlCinemaDisplay.add(lblK);
			
			JLabel lblL = new JLabel("L");
			lblL.setHorizontalAlignment(SwingConstants.CENTER);
			lblL.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblL.setBounds(519, 11, 39, 23);
			pnlCinemaDisplay.add(lblL);
			
			JLabel lblM = new JLabel("M");
			lblM.setHorizontalAlignment(SwingConstants.CENTER);
			lblM.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblM.setBounds(556, 11, 39, 23);
			pnlCinemaDisplay.add(lblM);
			
			JLabel lblN = new JLabel("N");
			lblN.setHorizontalAlignment(SwingConstants.CENTER);
			lblN.setFont(new Font("Times New Roman", Font.BOLD, 14));
			lblN.setBounds(593, 11, 39, 23);
			pnlCinemaDisplay.add(lblN);*/
			
			
			
			
			/*
			 * Row 0
			 * 
			 * */
			
			txt0A = new JTextField("");
			txt0A.setEditable(false);
			txt0A.setBackground(Color.GREEN);
			txt0A.setBounds(59, 37, 24, 20);
			pnlCinemaDisplay.add(txt0A);
			
			txt0B = new JTextField("");
			txt0B.setEditable(false);
			txt0B.setBackground(Color.GREEN);
			txt0B.setBounds(95, 37, 24, 20);
			pnlCinemaDisplay.add(txt0B);
			
			txt0C = new JTextField("");
			txt0C.setEditable(false);
			txt0C.setBackground(Color.GREEN);
			txt0C.setBounds(131, 37, 24, 20);
			pnlCinemaDisplay.add(txt0C);
			
			txt0D = new JTextField("");
			txt0D.setEditable(false);
			txt0D.setBackground(Color.GREEN);
			txt0D.setBounds(167, 37, 24, 20);
			pnlCinemaDisplay.add(txt0D);
			
			txt0E = new JTextField("");
			txt0E.setEditable(false);
			txt0E.setBackground(Color.GREEN);
			txt0E.setBounds(203, 37, 24, 20);
			pnlCinemaDisplay.add(txt0E);
			
			txt0F = new JTextField("");
			txt0F.setEditable(false);
			txt0F.setBackground(Color.GREEN);
			txt0F.setBounds(239, 37, 24, 20);
			pnlCinemaDisplay.add(txt0F);
			
			txt0G = new JTextField("");
			txt0G.setEditable(false);
			txt0G.setBackground(Color.GREEN);
			txt0G.setBounds(275, 37, 24, 20);
			pnlCinemaDisplay.add(txt0G);
			


			/*
			 * Row 1
			 * 
			 * */
			txt1A = new JTextField("");
			txt1A.setEditable(false);
			txt1A.setBackground(Color.GREEN);
			txt1A.setBounds(59, 60, 24, 20);
			pnlCinemaDisplay.add(txt1A);
			
			txt1B = new JTextField("");
			txt1B.setEditable(false);
			txt1B.setBackground(Color.GREEN);
			txt1B.setBounds(95, 60, 24, 20);
			pnlCinemaDisplay.add(txt1B);
			
			txt1C = new JTextField("");
			txt1C.setEditable(false);
			txt1C.setBackground(Color.GREEN);
			txt1C.setBounds(131, 60, 24, 20);
			pnlCinemaDisplay.add(txt1C);
			
			txt1D = new JTextField("");
			txt1D.setBackground(Color.GREEN);
			txt1D.setEditable(false);
			txt1D.setBounds(167, 60, 24, 20);
			pnlCinemaDisplay.add(txt1D);
			
			txt1E = new JTextField("");
			txt1E.setEditable(false);
			txt1E.setBackground(Color.GREEN);
			txt1E.setBounds(203, 60, 24, 20);
			pnlCinemaDisplay.add(txt1E);
			
			txt1F = new JTextField("");
			txt1F.setEditable(false);
			txt1F.setBackground(Color.GREEN);
			txt1F.setBounds(239, 60, 24, 20);
			pnlCinemaDisplay.add(txt1F);
			
			txt1G = new JTextField("");
			txt1G.setEditable(false);
			txt1G.setBackground(Color.GREEN);
			txt1G.setBounds(275, 60, 24, 20);
			pnlCinemaDisplay.add(txt1G);
			
		
			
			/*
			 * Row 2
			 * 
			 * */
			txt2A = new JTextField("");
			txt2A.setEditable(false);
			txt2A.setBackground(Color.GREEN);
			txt2A.setBounds(59, 83, 24, 20);
			pnlCinemaDisplay.add(txt2A);
			
			txt2B = new JTextField("");
			txt2B.setEditable(false);
			txt2B.setBackground(Color.GREEN);
			txt2B.setBounds(95, 83, 24, 20);
			pnlCinemaDisplay.add(txt2B);
			
			txt2C = new JTextField("");
			txt2C.setEditable(false);
			txt2C.setBackground(Color.GREEN);
			txt2C.setBounds(131, 83, 24, 20);
			pnlCinemaDisplay.add(txt2C);
			
			txt2D = new JTextField("");
			txt2D.setBackground(Color.GREEN);
			txt2D.setEditable(false);
			txt2D.setBounds(167, 83, 24, 20);
			pnlCinemaDisplay.add(txt2D);
			
			txt2E = new JTextField("");
			txt2E.setEditable(false);
			txt2E.setBackground(Color.GREEN);
			txt2E.setBounds(203, 83, 24, 20);
			pnlCinemaDisplay.add(txt2E);
			
			txt2F = new JTextField("");
			txt2F.setEditable(false);
			txt2F.setBackground(Color.GREEN);
			txt2F.setBounds(239, 83, 24, 20);
			pnlCinemaDisplay.add(txt2F);
			
			txt2G = new JTextField("");
			txt2G.setEditable(false);
			txt2G.setBackground(Color.GREEN);
			txt2G.setBounds(275, 83, 24, 20);
			pnlCinemaDisplay.add(txt2G);
			
			
			/*
			 * Row 4
			 * 
			 * */
			txt4A = new JTextField("");
			txt4A.setEditable(false);
			txt4A.setBackground(Color.GREEN);
			txt4A.setBounds(59, 130, 24, 20);
			pnlCinemaDisplay.add(txt4A);
			
			txt4B = new JTextField("");
			txt4B.setEditable(false);
			txt4B.setBackground(Color.GREEN);
			txt4B.setBounds(95, 130, 24, 20);
			pnlCinemaDisplay.add(txt4B);
			
			txt4C = new JTextField("");
			txt4C.setEditable(false);
			txt4C.setBackground(Color.GREEN);
			txt4C.setBounds(131, 130, 24, 20);
			pnlCinemaDisplay.add(txt4C);
			
			txt4D = new JTextField("");
			txt4D.setBackground(Color.GREEN);
			txt4D.setEditable(false);
			txt4D.setBounds(167, 130, 24, 20);
			pnlCinemaDisplay.add(txt4D);
			
			txt4E = new JTextField("");
			txt4E.setEditable(false);
			txt4E.setBackground(Color.GREEN);
			txt4E.setBounds(203, 130, 24, 20);
			pnlCinemaDisplay.add(txt4E);
			
			txt4F = new JTextField("");
			txt4F.setEditable(false);
			txt4F.setBackground(Color.GREEN);
			txt4F.setBounds(239, 130, 24, 20);
			pnlCinemaDisplay.add(txt4F);
			
			txt4G = new JTextField("");
			txt4G.setEditable(false);
			txt4G.setBackground(Color.GREEN);
			txt4G.setBounds(275, 130, 24, 20);
			pnlCinemaDisplay.add(txt4G);
			
			
			/*
			 * Row 5
			 * 
			 * */			
			txt5A = new JTextField("");
			txt5A.setEditable(false);
			txt5A.setBackground(Color.GREEN);
			txt5A.setBounds(59, 153, 24, 20);
			pnlCinemaDisplay.add(txt5A);
			
			txt5B = new JTextField("");
			txt5B.setEditable(false);
			txt5B.setBackground(Color.GREEN);
			txt5B.setBounds(95, 153, 24, 20);
			pnlCinemaDisplay.add(txt5B);
			
			txt5C = new JTextField("");
			txt5C.setEditable(false);
			txt5C.setBackground(Color.GREEN);
			txt5C.setBounds(131, 153, 24, 20);
			pnlCinemaDisplay.add(txt5C);
			
			txt5D = new JTextField("");
			txt5D.setBackground(Color.GREEN);
			txt5D.setEditable(false);
			txt5D.setBounds(167, 153, 24, 20);
			pnlCinemaDisplay.add(txt5D);
			
			txt5E = new JTextField("");
			txt5E.setEditable(false);
			txt5E.setBackground(Color.GREEN);
			txt5E.setBounds(203, 153, 24, 20);
			pnlCinemaDisplay.add(txt5E);
			
			txt5F = new JTextField("");
			txt5F.setEditable(false);
			txt5F.setBackground(Color.GREEN);
			txt5F.setBounds(239, 153, 24, 20);
			pnlCinemaDisplay.add(txt5F);
			
			txt5G = new JTextField("");
			txt5G.setEditable(false);
			txt5G.setBackground(Color.GREEN);
			txt5G.setBounds(275, 153, 24, 20);
			pnlCinemaDisplay.add(txt5G);
			
			
					
			
			/*
			 * Row 6
			 * 
			 * */			
			txt6A = new JTextField("");
			txt6A.setEditable(false);
			txt6A.setBackground(Color.GREEN);
			txt6A.setBounds(59, 176, 24, 20);
			pnlCinemaDisplay.add(txt6A);
			
			txt6B = new JTextField("");
			txt6B.setEditable(false);
			txt6B.setBackground(Color.GREEN);
			txt6B.setBounds(95, 176, 24, 20);
			pnlCinemaDisplay.add(txt6B);
			
			txt6C = new JTextField("");
			txt6C.setEditable(false);
			txt6C.setBackground(Color.GREEN);
			txt6C.setBounds(131, 176, 24, 20);
			pnlCinemaDisplay.add(txt6C);
			
			txt6D = new JTextField("");
			txt6D.setBackground(Color.GREEN);
			txt6D.setEditable(false);
			txt6D.setBounds(167, 176, 24, 20);
			pnlCinemaDisplay.add(txt6D);
			
			txt6E = new JTextField("");
			txt6E.setEditable(false);
			txt6E.setBackground(Color.GREEN);
			txt6E.setBounds(203, 176, 24, 20);
			pnlCinemaDisplay.add(txt6E);
			
			txt6F = new JTextField("");
			txt6F.setEditable(false);
			txt6F.setBackground(Color.GREEN);
			txt6F.setBounds(239, 176, 24, 20);
			pnlCinemaDisplay.add(txt6F);
			
			txt6G = new JTextField("");
			txt6G.setEditable(false);
			txt6G.setBackground(Color.GREEN);
			txt6G.setBounds(275, 176, 24, 20);
			pnlCinemaDisplay.add(txt6G);

			
			
			
			/*
			 * Row 8
			 * 
			 * */	
			txt8A = new JTextField("");
			txt8A.setEditable(false);
			txt8A.setBackground(Color.GREEN);
			txt8A.setBounds(59, 220, 24, 20);
			pnlCinemaDisplay.add(txt8A);
			
			txt8B = new JTextField("");
			txt8B.setEditable(false);
			txt8B.setBackground(Color.GREEN);
			txt8B.setBounds(95, 220, 24, 20);
			pnlCinemaDisplay.add(txt8B);
			
			txt8C = new JTextField("");
			txt8C.setEditable(false);
			txt8C.setBackground(Color.GREEN);
			txt8C.setBounds(131, 220, 24, 20);
			pnlCinemaDisplay.add(txt8C);
			
			txt8D = new JTextField("");
			txt8D.setBackground(Color.GREEN);
			txt8D.setEditable(false);
			txt8D.setBounds(167, 220, 24, 20);
			pnlCinemaDisplay.add(txt8D);
			
			txt8E = new JTextField("");
			txt8E.setEditable(false);
			txt8E.setBackground(Color.GREEN);
			txt8E.setBounds(203, 220, 24, 20);
			pnlCinemaDisplay.add(txt8E);
			
			txt8F = new JTextField("");
			txt8F.setEditable(false);
			txt8F.setBackground(Color.GREEN);
			txt8F.setBounds(239, 220, 24, 20);
			pnlCinemaDisplay.add(txt8F);
			
			txt8G = new JTextField("");
			txt8G.setEditable(false);
			txt8G.setBackground(Color.GREEN);
			txt8G.setBounds(275, 220, 24, 20);
			pnlCinemaDisplay.add(txt8G);
			
			
			
			

			/*
			 * Row 9
			 * 
			 * */	
			txt9A = new JTextField("");
			txt9A.setEditable(false);
			txt9A.setBackground(Color.GREEN);
			txt9A.setBounds(59, 243, 24, 20);
			pnlCinemaDisplay.add(txt9A);
			
			txt9B = new JTextField("");
			txt9B.setEditable(false);
			txt9B.setBackground(Color.GREEN);
			txt9B.setBounds(95, 243, 24, 20);
			pnlCinemaDisplay.add(txt9B);
			
			txt9C = new JTextField("");
			txt9C.setEditable(false);
			txt9C.setBackground(Color.GREEN);
			txt9C.setBounds(131, 243, 24, 20);
			pnlCinemaDisplay.add(txt9C);
			
			txt9D = new JTextField("");
			txt9D.setBackground(Color.GREEN);
			txt9D.setEditable(false);
			txt9D.setBounds(167, 243, 24, 20);
			pnlCinemaDisplay.add(txt9D);
			
			txt9E = new JTextField("");
			txt9E.setEditable(false);
			txt9E.setBackground(Color.GREEN);
			txt9E.setBounds(203, 243, 24, 20);
			pnlCinemaDisplay.add(txt9E);
			
			txt9F = new JTextField("");
			txt9F.setEditable(false);
			txt9F.setBackground(Color.GREEN);
			txt9F.setBounds(239, 243, 24, 20);
			pnlCinemaDisplay.add(txt9F);
			
			txt9G = new JTextField("");
			txt9G.setEditable(false);
			txt9G.setBackground(Color.GREEN);
			txt9G.setBounds(275, 243, 24, 20);
			pnlCinemaDisplay.add(txt9G);
			
			
			
			

			/*
			 * Row 10
			 * 
			 * */	
			txt10A = new JTextField("");
			txt10A.setEditable(false);
			txt10A.setBackground(Color.GREEN);
			txt10A.setBounds(59, 266, 24, 20);
			pnlCinemaDisplay.add(txt10A);
			
			txt10B = new JTextField("");
			txt10B.setEditable(false);
			txt10B.setBackground(Color.GREEN);
			txt10B.setBounds(95, 266, 24, 20);
			pnlCinemaDisplay.add(txt10B);
			
			txt10C = new JTextField("");
			txt10C.setEditable(false);
			txt10C.setBackground(Color.GREEN);
			txt10C.setBounds(131, 266, 24, 20);
			pnlCinemaDisplay.add(txt10C);
			
			txt10D = new JTextField("");
			txt10D.setBackground(Color.GREEN);
			txt10D.setEditable(false);
			txt10D.setBounds(167, 266, 24, 20);
			pnlCinemaDisplay.add(txt10D);
			
			txt10E = new JTextField("");
			txt10E.setEditable(false);
			txt10E.setBackground(Color.GREEN);
			txt10E.setBounds(203, 266, 24, 20);
			pnlCinemaDisplay.add(txt10E);
			
			txt10F = new JTextField("");
			txt10F.setEditable(false);
			txt10F.setBackground(Color.GREEN);
			txt10F.setBounds(239, 266, 24, 20);
			pnlCinemaDisplay.add(txt10F);
			
			txt10G = new JTextField("");
			txt10G.setEditable(false);
			txt10G.setBackground(Color.GREEN);
			txt10G.setBounds(275, 266, 24, 20);
			pnlCinemaDisplay.add(txt10G);
			
		/*	txtBoxes[0] = txt0A;
			txtBoxes[1] = txt0B;
			txtBoxes[2] = txt0C;
			txtBoxes[3] = txt0D;
			txtBoxes[4] = txt0E;
			txtBoxes[5] = txt0F;
			txtBoxes[6] = txt0G;
			
			txtBoxes[7] = txt1A;
			txtBoxes[8] = txt1B;
			txtBoxes[9] = txt1C;
			txtBoxes[10] = txt1D;
			txtBoxes[11] = txt1E;
			txtBoxes[12] = txt1F;
			txtBoxes[13] = txt1G;
			
			txtBoxes[14] = txt2A;
			txtBoxes[15] = txt2B;
			txtBoxes[16] = txt2C;
			txtBoxes[17] = txt2D;
			txtBoxes[18] = txt2E;
			txtBoxes[19] = txt2F;
			txtBoxes[20] = txt2G;
			
			txtBoxes[21] = txt4A;
			txtBoxes[22] = txt4B;
			txtBoxes[23] = txt4C;
			txtBoxes[24] = txt4D;
			txtBoxes[25] = txt4E;
			txtBoxes[26] = txt4F;
			txtBoxes[27] = txt4G;
			
			txtBoxes[28] = txt5A;
			txtBoxes[29] = txt5B;
			txtBoxes[30] = txt5C;
			txtBoxes[31] = txt5D;
			txtBoxes[32] = txt5E;
			txtBoxes[33] = txt5F;
			txtBoxes[34] = txt5G;
			
			txtBoxes[35] = txt6A;
			txtBoxes[36] = txt6B;
			txtBoxes[37] = txt6C;
			txtBoxes[38] = txt6D;
			txtBoxes[39] = txt6E;
			txtBoxes[40] = txt6F;
			txtBoxes[41] = txt6G;
			
			txtBoxes[42] = txt8A;
			txtBoxes[43] = txt8B;
			txtBoxes[44] = txt8C;
			txtBoxes[45] = txt8D;
			txtBoxes[46] = txt8E;
			txtBoxes[47] = txt8F;
			txtBoxes[48] = txt8G;
			
			txtBoxes[49] = txt9A;
			txtBoxes[50] = txt9B;
			txtBoxes[51] = txt9C;
			txtBoxes[52] = txt9D;
			txtBoxes[53] = txt9E;
			txtBoxes[54] = txt9F;
			txtBoxes[55] = txt9G;
			
			txtBoxes[56] = txt10A;
			txtBoxes[57] = txt10B;
			txtBoxes[58] = txt10C;
			txtBoxes[59] = txt10D;
			txtBoxes[60] = txt10E;
			txtBoxes[61] = txt10F;
			txtBoxes[62] = txt10G;*/
			
		/*
		 * TicketBean ticketBean = new TicketBean();
		 * 
		 * for(int i = 0; i < ticketBean.mTickets.size(); i++) { for(int j = 0; j <
		 * txtBoxes.length; j++) { if(ticketBean.mTickets.get(i).getIsBooked() == 1) {
		 * String txtName = "txt" + ticketBean.mTickets.get(i).getRowNumber() +
		 * ticketBean.mTickets.get(i).getColumnLetter();
		 * if(txtBoxes[j].getName().contains(txtName)) {
		 * txtBoxes[j].setBackground(Color.RED); } } } }
		 */
			
			
			fDisplay.add(contentPane);
			fDisplay.setSize(490, 360);
			fDisplay.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		TicketBean ticketBean = new TicketBean();

		/*
		 * for(int i = 0; i < ticketBean.mTickets.size(); i++) { for(int j = 0; j <
		 * txtBoxes.length; j++) { if(ticketBean.mTickets.get(i).getIsBooked() == 1) {
		 * String txtName = "txt" + ticketBean.mTickets.get(i).getRowNumber() +
		 * ticketBean.mTickets.get(i).getColumnLetter();
		 * if(txtBoxes[j].getName().contains(txtName)) {
		 * txtBoxes[j].setBackground(Color.RED); } } } }
		 */
		
		if(s.contains("Book Seat")) {			
			Ticket pTicket = new Ticket(txtRowNumber.getText().toString(),txtColLetter.getText().toString(),1);
			if(ticketBean.createBooking(pTicket)) {
				for(int j = 0; j < txtBoxes.length; j++) {
					String txtName = "txt" + txtRowNumber.getText().toString() + txtColLetter.getText().toString();
					if(txtBoxes[j].getName().contains(txtName)) {
						txtBoxes[j].setBackground(Color.RED);
					}
				}
				System.console().readLine("Seat booked successfully.");
			}else {
				System.console().readLine("Error with booking seat.");
			}
		}else if(s.contains("Delete Booking")) {
			Ticket pTicket = ticketBean.getBooking(txtRowNumber.getText().toString(),txtColLetter.getText().toString());
			if(pTicket.getIsBooked() == 1) {
				if(ticketBean.delete(pTicket.getTicketID())) {
					for(int j = 0; j < txtBoxes.length; j++) {
						String txtName = "txt" + txtRowNumber.getText().toString() + txtColLetter.getText().toString();
						if(txtBoxes[j].getName().contains(txtName)) {
							txtBoxes[j].setBackground(Color.GREEN);
						}
					}
					System.console().readLine("Booking deleted successfully.");
				}else {
					System.console().readLine("Error with deleting booking.");
				}
			}else {
				System.console().readLine("Selected seat was not booked!");
			}
		}
		
	}


}
