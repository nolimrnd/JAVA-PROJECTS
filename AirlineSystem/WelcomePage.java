package AirlineSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class WelcomePage {

	JFrame frmMercAirlineTicketing;
	JTextField textFieldName;
	JTextField textFieldAge;
	JTextField textFieldTickets;
	JComboBox comboBoxDestination;
	JFrame Exitframe;
	JRadioButton rdbtnPrivate;
	JRadioButton rdbtnYes;
	JRadioButton rdbtnBusiness;
	JRadioButton rdbtnRegular;
	JRadioButton rdbtnNo;
	ButtonGroup Insrnc;
	ButtonGroup airtype;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.frmMercAirlineTicketing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		initialize();
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMercAirlineTicketing = new JFrame();
		frmMercAirlineTicketing.setTitle("MERC AIRLINE TICKETING SYTEM");
		frmMercAirlineTicketing.setBounds(100, 100, 655, 718);
		frmMercAirlineTicketing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMercAirlineTicketing.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToMerc = new JLabel("WELCOME TO MERC AIRLINE TICKETING SYSTEM");
		lblWelcomeToMerc.setFont(new Font("HP Simplified", Font.BOLD, 24));
		lblWelcomeToMerc.setBounds(87, 24, 490, 24);
		frmMercAirlineTicketing.getContentPane().add(lblWelcomeToMerc);
		
		JLabel lblPleaseInputPassenger = new JLabel("PLEASE INPUT PASSENGER DETAILS");
		lblPleaseInputPassenger.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblPleaseInputPassenger.setBounds(10, 68, 296, 24);
		frmMercAirlineTicketing.getContentPane().add(lblPleaseInputPassenger);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblName.setBounds(10, 103, 60, 24);
		frmMercAirlineTicketing.getContentPane().add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		textFieldName.setBounds(70, 103, 182, 24);
		frmMercAirlineTicketing.getContentPane().add(textFieldName);
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblAge.setBounds(262, 103, 43, 24);
		frmMercAirlineTicketing.getContentPane().add(lblAge);
		
		textFieldAge = new JTextField();
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(315, 103, 52, 24);
		frmMercAirlineTicketing.getContentPane().add(textFieldAge);
		
		JLabel lblNoOfPassenger = new JLabel("NO. OF TICKETS:");
		lblNoOfPassenger.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblNoOfPassenger.setBounds(380, 103, 116, 24);
		frmMercAirlineTicketing.getContentPane().add(lblNoOfPassenger);
		
		textFieldTickets = new JTextField();
		textFieldTickets.setColumns(10);
		textFieldTickets.setBounds(495, 105, 67, 24);
		frmMercAirlineTicketing.getContentPane().add(textFieldTickets);
		
		JLabel lblToChooseAirline = new JLabel("CHOOSE A DESTINATION:");
		lblToChooseAirline.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblToChooseAirline.setBounds(10, 206, 176, 22);
		frmMercAirlineTicketing.getContentPane().add(lblToChooseAirline);
		
		JLabel lblTravelInsurance = new JLabel("TRAVEL INSURANCE?");
		lblTravelInsurance.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTravelInsurance.setBounds(10, 138, 152, 22);
		frmMercAirlineTicketing.getContentPane().add(lblTravelInsurance);
		
		rdbtnYes = new JRadioButton("YES");
		rdbtnYes.setActionCommand(rdbtnYes.getText());
		rdbtnYes.setFont(new Font("HP Simplified", Font.BOLD, 15));
		rdbtnYes.setBounds(168, 138, 70, 23);
		frmMercAirlineTicketing.getContentPane().add(rdbtnYes);
		
		rdbtnNo = new JRadioButton("NO");
		rdbtnNo.setActionCommand(rdbtnNo.getText());
		rdbtnNo.setFont(new Font("HP Simplified", Font.BOLD, 15));
		rdbtnNo.setBounds(240, 138, 70, 23);
		frmMercAirlineTicketing.getContentPane().add(rdbtnNo);
		
		JLabel lblAirlineType = new JLabel("AIRLINE TYPE:");
		lblAirlineType.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblAirlineType.setBounds(10, 171, 132, 24);
		frmMercAirlineTicketing.getContentPane().add(lblAirlineType);
		
		rdbtnPrivate = new JRadioButton("PRIVATE");
		rdbtnPrivate.setActionCommand(rdbtnPrivate.getText());
		rdbtnPrivate.setFont(new Font("HP Simplified", Font.BOLD, 15));
		rdbtnPrivate.setBounds(143, 167, 100, 32);
		frmMercAirlineTicketing.getContentPane().add(rdbtnPrivate);
		
		rdbtnBusiness = new JRadioButton("BUSINESS");
		rdbtnBusiness.setActionCommand(rdbtnBusiness.getText());
		rdbtnBusiness.setFont(new Font("HP Simplified", Font.BOLD, 15));
		rdbtnBusiness.setBounds(245, 167, 109, 33);
		frmMercAirlineTicketing.getContentPane().add(rdbtnBusiness);
		
		rdbtnRegular = new JRadioButton("REGULAR FARE");
		rdbtnRegular.setActionCommand(rdbtnRegular.getText());
		rdbtnRegular.setFont(new Font("HP Simplified", Font.BOLD, 15));
		rdbtnRegular.setBounds(356, 166, 140, 34);
		frmMercAirlineTicketing.getContentPane().add(rdbtnRegular);
		
		airtype = new ButtonGroup();
		airtype.add(rdbtnPrivate);
		airtype.add(rdbtnBusiness);
		airtype.add(rdbtnRegular);
		
		Insrnc = new ButtonGroup(); 
		Insrnc.add(rdbtnYes); 
		Insrnc.add(rdbtnNo);
		
		comboBoxDestination = new JComboBox();
		comboBoxDestination.setModel(new DefaultComboBoxModel(new String[] {"DESTINATION", "FROM MANILA TO BATANES", "FROM BATANES TO MANILA", "FROM MANILA TO PALAWAN", "FROM PALAWAN TO MANILA", "FROM MANILA TO SOUTH KOREA", "FROM SOUTH KOREA TO MANILA", "FROM MANILA TO JAPAN", "FROM JAPAN TO MANILA", "FROM MANILA TO VIETNAM", "FROM VIETNAM TO MANILA"}));
		comboBoxDestination.setFont(new Font("HP Simplified", Font.BOLD, 15));
		comboBoxDestination.setBounds(196, 203, 331, 28);
		frmMercAirlineTicketing.getContentPane().add(comboBoxDestination);
		
		JButton btnProceedTransaction = new JButton("PROCEED TO TRANSACTION");
		btnProceedTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Transaction transac = new Transaction(); // to call Transaction.java
					
					//TextFields to set variables and get values
					String names = textFieldName.getText(); 
					String agemainpage = textFieldAge.getText();
					String passmainpage = textFieldTickets.getText();
					
					//to convert strings to integer
					int tickets = Integer.parseInt(passmainpage);
					int agetxt = Integer.parseInt(agemainpage);
								
					//ComboBox
					String dest = comboBoxDestination.getSelectedItem().toString();
							
					//variable for senior and minor
					int senior = 60;
					int minor = 19;
					
					//to send values from welcome page to transaction page
					transac.lblNameDataTransaction.setText(names);
					transac.lblLocationDataTransaction.setText(dest);
					transac.lblTicketsDataTransaction.setText(passmainpage);
					
					//to set the text coming from the values selected in welcome page 
					if (rdbtnPrivate.isSelected()) {
						transac.lblAirlineTypeDataTransaction.setText("PRIVATE CLASS");
					}
					
					if (rdbtnBusiness.isSelected()) {
						transac.lblAirlineTypeDataTransaction.setText("BUSINESS CLASS");
					}
					
					if (rdbtnRegular.isSelected()) {
						transac.lblAirlineTypeDataTransaction.setText("REGULAR CLASS");
					}
					
					if (rdbtnYes.isSelected()) {
						transac.lblTravelInsuranceDataTransaction.setText("YES");
					}
					
					if (rdbtnNo.isSelected()) {
						transac.lblTravelInsuranceDataTransaction.setText("NO");
					}
					
					//if either of the buttongroup is not selected
					if (airtype.getSelection() == null || Insrnc.getSelection()  == null) {
						JOptionPane.showMessageDialog(null, "Please Complete the details", "Invalid Details", JOptionPane.ERROR_MESSAGE);
					}
					
					//===================AUTO-GENERATED TRANSACTION / CONTROL NUMBER=======================
					int num1;
					String q1 = "";
					num1 = 1325 + (int) (Math.random()*4238);
					q1 += num1 + 1325;
					transac.lblTransactionNoDataTransaction.setText(q1);
					//=======================================================================
					
					//Buttons to set variables and get values for airline type
					String prv = transac.lblAirlineTypeDataTransaction.getText();
					String bus = transac.lblAirlineTypeDataTransaction.getText();
					String reg = transac.lblAirlineTypeDataTransaction.getText();
					
					//LOCAL FLIGHT
					if(dest == "FROM MANILA TO BATANES" || dest == "FROM BATANES TO MANILA" || dest == "FROM MANILA TO PALAWAN" || dest == "FROM PALAWAN TO MANILA") {
						transac.lblTravelDataTransaction.setText("LOCAL FLIGHT");
						
						if(dest == "FROM MANILA TO BATANES") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 8000; //destination cost
								double ticketcost = opA * tickets; //depending on how many tickets
								double transfee = 550;	//transaction fee						
								double tax = 4260 * tickets; //travel tax
								double baggage = 1250 * tickets; //baggage fee
								double insurance = 4500 * tickets; //insurance fee (if No it will be 0)
								double total = ticketcost + transfee + insurance + tax + baggage; //calculate the total cost 
								double discount = total * 0.20; //to calculate discount 
								double totalcostdicnt = total - discount; //total cost for senior 
								
								// to validate if the input name is empty
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								
								//to validate if tickets exceeded per class
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//Using string format to display values in formal
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									//if the input age is greater of equal than 60 it will proceed to receipt 
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true); //to proceed to transaction page
										frmMercAirlineTicketing.dispose(); //to dispose welcome page copying data to transaction page
									}
									
									//to validate if the input age is less than 19 and it will display error message using JOptionPane
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									//to validate if the input age is over than 19
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00"); //set to 0 because age input is not senior
										transac.frmTransaction.setVisible(true); //to proceed to transaction page
										frmMercAirlineTicketing.dispose();  //to dispose welcome page copying data to transaction page
									}
									else {
										//display error message using JOptionPane
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							else if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ){						
								double opA = 8000;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260  * tickets;
								double baggage = 1250  * tickets;
								double insurance = 0  * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 12500;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 12500;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 3500;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 3500;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}			
						}
						
						else if(dest == "FROM BATANES TO MANILA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 9800;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 9800;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 12950;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 12950;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 3900;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 3900;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM MANILA TO PALAWAN") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 9100;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 9100;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 10500;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 10500;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 3200;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 3200;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM PALAWAN TO MANILA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 9850;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 9850;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 10975;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 10975;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 3575;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 3575;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}								
					}
					
					//INTERNATIONAL FLIGHT
					else if(dest == "FROM MANILA TO SOUTH KOREA" || dest == "FROM SOUTH KOREA TO MANILA" || dest == "FROM MANILA TO JAPAN" || dest == "FROM JAPAN TO MANILA" || dest == "FROM MANILA TO VIETNAM" || dest == "FROM VIETNAM TO MANILA") {
						transac.lblTravelDataTransaction.setText("INTERNATIONAL FLIGHT");
						
						if(dest == "FROM MANILA TO SOUTH KOREA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 27450;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 27450;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 37390;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 37390;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 12055;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 12055;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM SOUTH KOREA TO MANILA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 30890;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 30890;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 39650;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 39650;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 13100;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 13100;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM MANILA TO JAPAN") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 40450;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 40450;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 45355;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850* tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 45355;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 27800;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500  * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 27800;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500  * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM JAPAN TO MANILA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 43855;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 43855;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 49780;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 49780;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 29400;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 29400;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM MANILA TO VIETNAM") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 8505;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 8505;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 12345;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 12345;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 3200;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 3200;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}
						
						else if(dest == "FROM VIETNAM TO MANILA") {
							
							//PRIVATE CLASS W/ INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnYes.isSelected() ) {
								double opA = 14300;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 4500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//PRIVATE CLASS W/O INSURANCE
							if(prv == "PRIVATE CLASS" && rdbtnNo.isSelected() ) {
								double opA = 14300;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 4260 * tickets;
								double baggage = 1250 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 14) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/ INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnYes.isSelected()) {
								double opA = 16320;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 6500 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//BUSINESS CLASS W/O INSURANCE
							else if(bus == "BUSINESS CLASS" && rdbtnNo.isSelected()) {
								double opA = 16320;
								double ticketcost = opA * tickets;
								double transfee = 550;							
								double tax = 5700 * tickets;
								double baggage = 2850 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 24) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/ INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnYes.isSelected()) {
								double opA = 4600;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 950 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}
							
							//REGULAR CLASS W/O INSURANCE
							else if(reg == "REGULAR CLASS" && rdbtnNo.isSelected()) {
								double opA = 4600;
								double ticketcost = opA * tickets;
								double transfee = 255;							
								double tax = 2500 * tickets;
								double baggage = 950 * tickets;
								double insurance = 0 * tickets;
								double total = ticketcost + transfee + insurance + tax + baggage;
								double discount = total * 0.20;
								double totalcostdicnt = total - discount;
								
								if (textFieldName.getText().equals("")) {
									JOptionPane.showMessageDialog(null, "Please Input Name", "Please Input Name", JOptionPane.ERROR_MESSAGE);
								}
								else if (tickets >= 52) {
									JOptionPane.showMessageDialog(null, "Sorry! You have exceeded the number of passengers required", "EXCEEDED NUMBER OF PASSENGERS", JOptionPane.INFORMATION_MESSAGE);
									textFieldName.setText(null);
									textFieldAge.setText(null);
									textFieldTickets.setText(null);
									comboBoxDestination.setSelectedIndex(0);
								}
								else {
									//transac.lblTotalCostDataTransaction.setText(String.valueOf(total));
									transac.lblTotalCostDataTransaction.setText(String.format("%,.2f",total));
									transac.lblBaggageFeeDataTransaction.setText(String.format("%,.2f", baggage));
									transac.lblTravelTaxDataTransaction.setText(String.format("%,.2f", tax));
									transac.lblInsuranceFeeDataTransaction.setText(String.format("%,.2f", insurance));
									transac.lblTransactionFeeDataTransaction.setText(String.format("%,.2f", transfee));
									transac.lblDestinationCostDataTransaction.setText(String.format("%,.2f", ticketcost));
									
									if (agetxt >= senior) {
										transac.lblSeniorDiscountDataTransaction.setText(String.format("-%,.2f", discount));
										transac.lblTotalCostDataTransaction.setText(String.format("%,.2f", totalcostdicnt));
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									
									else if (agetxt <= minor) {
										JOptionPane.showMessageDialog(null, "Cannot travel alone and must be accompanied by at least one (1) Adult and/or Senior Citizen", "AGE RESTRICTION", JOptionPane.ERROR_MESSAGE);
									}
									
									else if (agetxt >= minor && agetxt <= senior){
										transac.lblSeniorDiscountDataTransaction.setText("0.00");
										transac.frmTransaction.setVisible(true);
										frmMercAirlineTicketing.dispose(); 
									}
									else {
										JOptionPane.showMessageDialog(null, "Invalid Age", "Invalid Age", JOptionPane.ERROR_MESSAGE);
									}
								}
							}	
						}	
					}
					
					else if(dest == "DESTINATION") {
						JOptionPane.showMessageDialog(null, "Input Travel Destination", "No Travel Destination Accepted", JOptionPane.ERROR_MESSAGE);
					}		
				}	
				catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Invalid Input or Incomplete Details", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnProceedTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		btnProceedTransaction.setBounds(420, 253, 209, 56);
		frmMercAirlineTicketing.getContentPane().add(btnProceedTransaction);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnYes.setSelected(false);
				rdbtnNo.setSelected(false);
				rdbtnPrivate.setSelected(false);
				rdbtnBusiness.setSelected(false);
				rdbtnRegular.setSelected(false);
				textFieldName.setText(null);
				textFieldAge.setText(null);
				textFieldTickets.setText(null);
				comboBoxDestination.setSelectedIndex(0);
				Insrnc.clearSelection(); 
				airtype.clearSelection(); 
			}
		});
		btnClear.setFont(new Font("HP Simplified", Font.BOLD, 15));
		btnClear.setBounds(278, 264, 89, 34);
		frmMercAirlineTicketing.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,
				        "Are you sure you want to quit?",
				        "Confirm Quit", JOptionPane.YES_NO_CANCEL_OPTION);
				if (result == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
		btnExit.setFont(new Font("HP Simplified", Font.BOLD, 15));
		btnExit.setBounds(153, 264, 89, 34);
		frmMercAirlineTicketing.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 59, 619, 2);
		frmMercAirlineTicketing.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 245, 619, 2);
		frmMercAirlineTicketing.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 320, 619, 2);
		frmMercAirlineTicketing.getContentPane().add(separator_1_1);
		
		table = new JTable();
		table.setFont(new Font("HP Simplified", Font.BOLD, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"FROM", "TO", "TRAVEL TYPE", "PRIVATE CLASS", "BUSINESS CLASS", "REGULAR CLASS"},
				{"MANILA", "BATANES", "LOCAL FLIGHT", "8,000.00", "12,500.00", "3,500.00"},
				{"BATANES", "MANILA", "LOCAL FLIGHT", "9,800.00", "12,950.00", "3,900.00"},
				{"MANILA", "PALAWAN", "LOCAL FLIGHT", "9,100.00", "10,500.00", "3,200.00"},
				{"PALAWAN ", "MANILA", "LOCAL FLIGHT", "9,850.00", "10,975.00", "3,575.00"},
				{"MANILA", "SOUTH KOREA", "INTL FLIGHT", "27,450.00", "37,390.00", "12,055.00"},
				{"SOUTH KOREA", "MANILA", "INTL FLIGHT", "30,890.00", "39,650.00", "13,100.00"},
				{"MANILA ", "JAPAN", "INTL FLIGHT", "40,450.00", "45,355.00", "27,800.00"},
				{"JAPAN", "MANILA", "INTL FLIGHT", "43,855.00", "49,780.00", "29,400.00"},
				{"MANILA", "VIETNAM", "INTL FLIGHT", "8,505.00", "12,345.00", "3,200.00"},
				{"VIETNAM", "MANILA", "INTL FLIGHT", "14,300.00", "16,320.00", "4,600.00"},
			},
			new String[] {
				"FROM", "TO", "TRAVEL TYPE", "PRIVATE CLASS", "BUSINESS CLASS", "REGULAR CLASS"
			}
		));
		table.setBounds(10, 362, 619, 176);
		frmMercAirlineTicketing.getContentPane().add(table);
		
		JLabel lblDestinationTable = new JLabel("COST PER DESTINATION FLIGHTS");
		lblDestinationTable.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestinationTable.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblDestinationTable.setBounds(222, 333, 209, 22);
		frmMercAirlineTicketing.getContentPane().add(lblDestinationTable);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"FLIGHT TYPE", "CHARGE"},
				{"PRIVATE CLASS", "4,260.00 "},
				{"BUSINESS CLASS", "5,700.00 "},
				{"REGULAR CLASS", "2,500.00 "},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.setFont(new Font("HP Simplified", Font.BOLD, 12));
		table_1.setBounds(10, 570, 176, 64);
		frmMercAirlineTicketing.getContentPane().add(table_1);
		
		JLabel lblTravelTaxCost = new JLabel("TRAVEL TAX COST (Per Person)");
		lblTravelTaxCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblTravelTaxCost.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelTaxCost.setBounds(10, 551, 176, 22);
		frmMercAirlineTicketing.getContentPane().add(lblTravelTaxCost);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"FLIGHT TYPE", "BAGGAGE FEE"},
				{"PRIVATE CLASS ", "1,250.00"},
				{"BUSINESS CLASS", "2,850.00"},
				{"REGULAR CLASS", "950.00"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_2.setFont(new Font("HP Simplified", Font.BOLD, 12));
		table_2.setBounds(222, 570, 176, 64);
		frmMercAirlineTicketing.getContentPane().add(table_2);
		
		JLabel lblBaggageFeeper = new JLabel("BAGGAGE FEE (Per Person)");
		lblBaggageFeeper.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaggageFeeper.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblBaggageFeeper.setBounds(222, 549, 176, 22);
		frmMercAirlineTicketing.getContentPane().add(lblBaggageFeeper);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"FLIGHT TYPE", "INSURANCE COST"},
				{"PRIVATE CLASS", "4,500.00"},
				{"BUSINESS CLASS", "6,500.00"},
				{"REGULAR CLASS", "950.00"},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_3.setFont(new Font("HP Simplified", Font.BOLD, 12));
		table_3.setBounds(432, 571, 176, 64);
		frmMercAirlineTicketing.getContentPane().add(table_3);
		
		JLabel lblTravelInsuranceFee = new JLabel("TRAVEL INSURANCE FEE (Per Person)");
		lblTravelInsuranceFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblTravelInsuranceFee.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelInsuranceFee.setBounds(420, 551, 209, 22);
		frmMercAirlineTicketing.getContentPane().add(lblTravelInsuranceFee);
		
		JButton btnDeveloper = new JButton("DEVELOPER");
		btnDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SystemInfo sys = new SystemInfo();
				sys.frmSystemInformation.setVisible(true);
				frmMercAirlineTicketing.dispose();
			}
		});
		btnDeveloper.setFont(new Font("HP Simplified", Font.BOLD, 12));
		btnDeveloper.setBounds(20, 265, 100, 34);
		frmMercAirlineTicketing.getContentPane().add(btnDeveloper);
		
		JLabel lblTransactionFeeOn = new JLabel("NOTE: Transaction Fee for Private & Business is 550.00 and For Regular class is 255.00");
		lblTransactionFeeOn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransactionFeeOn.setFont(new Font("HP Simplified", Font.BOLD | Font.ITALIC, 14));
		lblTransactionFeeOn.setBounds(50, 646, 527, 22);
		frmMercAirlineTicketing.getContentPane().add(lblTransactionFeeOn);
	}
}