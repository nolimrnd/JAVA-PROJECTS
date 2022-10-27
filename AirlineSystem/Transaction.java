package AirlineSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Transaction {

	//remove private in order to send values from different class
	JFrame frmTransaction;
	JTextField textFieldAmount;
	JLabel lblNameDataTransaction;
	JLabel lblLocationDataTransaction;
	JLabel lblTicketsDataTransaction;
	JLabel lblAirlineTypeDataTransaction;
	JLabel lblTravelInsuranceDataTransaction;
	JLabel lblTransactionNoDataTransaction;
	JLabel lblTravelDataTransaction;
	JLabel lblDestinationCostDataTransaction;
	JLabel lblTransactionFeeDataTransaction;
	JLabel lblInsuranceFeeDataTransaction;
	JLabel lblTravelTaxDataTransaction;
	JLabel lblBaggageFeeDataTransaction;
	JLabel lblSeniorDiscountDataTransaction;
	JLabel lblTotalCostDataTransaction;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction window = new Transaction();
					window.frmTransaction.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transaction() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTransaction = new JFrame();
		frmTransaction.setTitle("Transaction");
		frmTransaction.setBounds(100, 100, 484, 477);
		frmTransaction.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTransaction.getContentPane().setLayout(null);
		
		JLabel lblTransaction = new JLabel("TRANSACTION");
		lblTransaction.setFont(new Font("HP Simplified", Font.BOLD, 18));
		lblTransaction.setBounds(186, 7, 121, 24);
		frmTransaction.getContentPane().add(lblTransaction);
		
		JLabel lblNameTransaction = new JLabel("NAME:");
		lblNameTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNameTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblNameTransaction.setBounds(80, 65, 60, 24);
		frmTransaction.getContentPane().add(lblNameTransaction);
		
		JLabel lblTravelTypeTransaction = new JLabel("TRAVEL TYPE:");
		lblTravelTypeTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTravelTypeTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelTypeTransaction.setBounds(10, 90, 130, 22);
		frmTransaction.getContentPane().add(lblTravelTypeTransaction);
		
		JLabel lblDestinationTransaction = new JLabel("DESTINATION:");
		lblDestinationTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestinationTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblDestinationTransaction.setBounds(10, 115, 131, 22);
		frmTransaction.getContentPane().add(lblDestinationTransaction);
		
		JLabel lblNoOfTicketsTransaction = new JLabel("NO. OF TICKETS:");
		lblNoOfTicketsTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNoOfTicketsTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblNoOfTicketsTransaction.setBounds(10, 140, 130, 24);
		frmTransaction.getContentPane().add(lblNoOfTicketsTransaction);
		
		JLabel lblAirlineTypeTransaction = new JLabel("AIRLINE TYPE:");
		lblAirlineTypeTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAirlineTypeTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblAirlineTypeTransaction.setBounds(10, 165, 130, 24);
		frmTransaction.getContentPane().add(lblAirlineTypeTransaction);
		
		JLabel lblTravelInsuranceTransactionTransaction = new JLabel("TRAVEL INSURANCE:");
		lblTravelInsuranceTransactionTransaction.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTravelInsuranceTransactionTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelInsuranceTransactionTransaction.setBounds(10, 190, 130, 22);
		frmTransaction.getContentPane().add(lblTravelInsuranceTransactionTransaction);
		
		lblNameDataTransaction = new JLabel("--NAME--");
		lblNameDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblNameDataTransaction.setBounds(150, 66, 226, 22);
		frmTransaction.getContentPane().add(lblNameDataTransaction);
		
		lblTravelDataTransaction = new JLabel("--TRAVEL--");
		lblTravelDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelDataTransaction.setBounds(150, 90, 226, 22);
		frmTransaction.getContentPane().add(lblTravelDataTransaction);
		
		lblLocationDataTransaction = new JLabel("--DESTINATION--");
		lblLocationDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblLocationDataTransaction.setBounds(150, 115, 226, 22);
		frmTransaction.getContentPane().add(lblLocationDataTransaction);
		
		lblTicketsDataTransaction = new JLabel("--TICKETS--");
		lblTicketsDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTicketsDataTransaction.setBounds(150, 141, 122, 22);
		frmTransaction.getContentPane().add(lblTicketsDataTransaction);
		
		lblAirlineTypeDataTransaction = new JLabel("--AIRLINETYPE--");
		lblAirlineTypeDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblAirlineTypeDataTransaction.setBounds(150, 166, 122, 22);
		frmTransaction.getContentPane().add(lblAirlineTypeDataTransaction);
		
		lblTravelInsuranceDataTransaction = new JLabel("--INSURANCE--");
		lblTravelInsuranceDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 13));
		lblTravelInsuranceDataTransaction.setBounds(150, 190, 122, 22);
		frmTransaction.getContentPane().add(lblTravelInsuranceDataTransaction);
		
		JLabel lblDestinationCost = new JLabel("DESTINATION COST:");
		lblDestinationCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestinationCost.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDestinationCost.setBounds(10, 234, 226, 24);
		frmTransaction.getContentPane().add(lblDestinationCost);
		
		lblDestinationCostDataTransaction = new JLabel("---DESTINATIONCOST---");
		lblDestinationCostDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblDestinationCostDataTransaction.setBounds(246, 233, 167, 24);
		frmTransaction.getContentPane().add(lblDestinationCostDataTransaction);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 221, 448, 2);
		frmTransaction.getContentPane().add(separator);
		
		JLabel lblTra = new JLabel("TRAVEL TAX:");
		lblTra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTra.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTra.setBounds(10, 304, 226, 24);
		frmTransaction.getContentPane().add(lblTra);
		
		JLabel lblAdditionalTransactionProcessing = new JLabel("ADDITIONAL TRANSACTION PROCESSING FEE:");
		lblAdditionalTransactionProcessing.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdditionalTransactionProcessing.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblAdditionalTransactionProcessing.setBounds(10, 257, 226, 24);
		frmTransaction.getContentPane().add(lblAdditionalTransactionProcessing);
		
		JLabel lblTravel = new JLabel("TRAVEL INSURANCE FEE:");
		lblTravel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTravel.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravel.setBounds(10, 280, 226, 24);
		frmTransaction.getContentPane().add(lblTravel);
		
		JLabel lblBaggageFee = new JLabel("BAGGAGE FEE:");
		lblBaggageFee.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBaggageFee.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblBaggageFee.setBounds(10, 327, 226, 24);
		frmTransaction.getContentPane().add(lblBaggageFee);
		
		lblTransactionFeeDataTransaction = new JLabel("---TRANSACTIONFEE---");
		lblTransactionFeeDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTransactionFeeDataTransaction.setBounds(246, 257, 167, 24);
		frmTransaction.getContentPane().add(lblTransactionFeeDataTransaction);
		
		lblInsuranceFeeDataTransaction = new JLabel("---INSURANCEFEE---");
		lblInsuranceFeeDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblInsuranceFeeDataTransaction.setBounds(246, 280, 167, 24);
		frmTransaction.getContentPane().add(lblInsuranceFeeDataTransaction);
		
		lblTravelTaxDataTransaction = new JLabel("---TRAVELTAX---");
		lblTravelTaxDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTravelTaxDataTransaction.setBounds(246, 303, 167, 24);
		frmTransaction.getContentPane().add(lblTravelTaxDataTransaction);
		
		lblBaggageFeeDataTransaction = new JLabel("---BAGGAGEFEE---");
		lblBaggageFeeDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblBaggageFeeDataTransaction.setBounds(246, 327, 167, 24);
		frmTransaction.getContentPane().add(lblBaggageFeeDataTransaction);
		
		lblTotalCostDataTransaction = new JLabel("---TOTALCOST---");
		lblTotalCostDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTotalCostDataTransaction.setBounds(246, 374, 167, 24);
		frmTransaction.getContentPane().add(lblTotalCostDataTransaction);
		
		lblSeniorDiscountDataTransaction = new JLabel("---SENIORDISCOUNT---");
		lblSeniorDiscountDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblSeniorDiscountDataTransaction.setBounds(246, 351, 167, 24);
		frmTransaction.getContentPane().add(lblSeniorDiscountDataTransaction);
		
		JLabel lblDiscountifSenior = new JLabel("DISCOUNT (IF SENIOR):");
		lblDiscountifSenior.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiscountifSenior.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDiscountifSenior.setBounds(10, 352, 226, 24);
		frmTransaction.getContentPane().add(lblDiscountifSenior);
		
		JLabel lblTotalCost = new JLabel("TOTAL COST:");
		lblTotalCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalCost.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTotalCost.setBounds(10, 374, 226, 24);
		frmTransaction.getContentPane().add(lblTotalCost);
		
		JLabel lblInputPayment = new JLabel("INPUT PAYMENT:");
		lblInputPayment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblInputPayment.setFont(new Font("HP Simplified", Font.BOLD, 17));
		lblInputPayment.setBounds(10, 403, 226, 24);
		frmTransaction.getContentPane().add(lblInputPayment);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setBounds(246, 403, 167, 24);
		frmTransaction.getContentPane().add(textFieldAmount);
		textFieldAmount.setColumns(10);
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Receipt rcpt = new Receipt(); //to call Receipt.java
					
					// UPPER RECEIPT
					String transcnum = lblTransactionNoDataTransaction.getText();
					rcpt.lblTransactionNoDataReceipt.setText(transcnum);
					
					String nametnsac = lblNameDataTransaction.getText();
					rcpt.lblNameDataReceipt.setText(nametnsac);
					
					String travtnsac = lblTravelDataTransaction.getText();
					rcpt.lblTravelDataReceipt.setText(travtnsac);
									
					String desttnsac = lblLocationDataTransaction.getText(); 
					rcpt.lblLocationDataReceipt.setText(desttnsac); 
					
					String ticktnsac = lblTicketsDataTransaction.getText();
					rcpt.lblTicketsDataReceipt.setText(ticktnsac);
					
					String airttnsac = lblAirlineTypeDataTransaction.getText();
					rcpt.lblAirlineTypeDataReceipt.setText(airttnsac);
					
					String insutnsac = lblTravelInsuranceDataTransaction.getText();	
					rcpt.lblTravelInsuranceDataReceipt.setText(insutnsac);
					
					
					/// LOWER RECEIPT
					String destin = lblDestinationCostDataTransaction.getText(); 
					rcpt.lblDestinationCostDataReceipt.setText(destin);
					
					String trsacfee = lblTransactionFeeDataTransaction.getText();
					rcpt.lblTransactionDataReceipt.setText(trsacfee);
					
					String insrnc = lblInsuranceFeeDataTransaction.getText(); 
					rcpt.lblInsuranceDataReceipt.setText(insrnc);
					
					String tratax = lblTravelTaxDataTransaction.getText();
					rcpt.lbltravelTaxDataReceipt.setText(tratax);
					
					String baggag = lblBaggageFeeDataTransaction.getText();
					rcpt.lblBaggageFeeDataReceipt.setText(baggag);
					
					String snicst = lblSeniorDiscountDataTransaction.getText();
					rcpt.lblSeniorDiscountDataReceipt.setText(snicst);
					
					//Convert NumberFormat to String to Double
					String distot = lblTotalCostDataTransaction.getText(); //to get the values in NumberFormat
					Double totalcost = DecimalFormat.getNumberInstance().parse(distot).doubleValue(); //converting NumberFormat to String 
					//String totalcost = lblTotalCostDataTransaction.getText();
					//Double totds = Double.parseDouble(l);
					String totoff = String.format("%,.2f",totalcost); //converting String to Double
					rcpt.lblTotalCostDataReceipt.setText(totoff); //to set values from the receipt page
					//Double totalcost = Double.parseDouble(l);
					
					String amount = textFieldAmount.getText();
					Double amnt = Double.parseDouble(amount);
					String amnoff = String.format("%,.2f",amnt);
					rcpt.lblCashDataReceipt.setText(amnoff);
										
					Double chnge = Double.parseDouble(amount);
					Double totchnge = chnge - totalcost;
					String change = String.format("%,.2f",totchnge);
					rcpt.lblChangeDataReceipt.setText(change);
					
					/*
					convert double to string
					double d = 3.14;
					String s = String.valueOf(d);
					// s is now "3.14"
					**/
					
					//to validate if the input amount is less than totalcost and it will display using JOptionPane
					if(amnt < totalcost) {
						JOptionPane.showMessageDialog(null, "Invalid Amount", "Error", JOptionPane.ERROR_MESSAGE);	
						textFieldAmount.setText(null); //to set the textfield to null
					}
					/*
					else if(amnt < totalsnr) {
						JOptionPane.showMessageDialog(null, "Invalid Amount", "Error", JOptionPane.ERROR_MESSAGE);	
						textFieldAmount.setText(null);
					}
					*/
					
					//to validate if the input amount is greater or equal than totalcost and it will display and ask confirmation using JOptionPane
					else if (amnt >= totalcost) {
						int result= JOptionPane.showConfirmDialog(null,
								"Your Cash is " + amnoff + " Press OK to continue.", 
								"CONFIRMATION", JOptionPane.YES_NO_CANCEL_OPTION);
						if (result == JOptionPane.YES_OPTION) {
							rcpt.frmReceipt.setVisible(true);
							frmTransaction.dispose(); 
						}
						else if (result == JOptionPane.NO_OPTION) {
							textFieldAmount.setText(null);
						}
					}	
				} catch (Exception c) {
					//to validate if the input amount is invalid and it will display using JOptionPane
					JOptionPane.showMessageDialog(null, "Invalid Input", "Error", JOptionPane.ERROR_MESSAGE);
					textFieldAmount.setText(null);
				}		
			}
		});
		btnProceed.setFont(new Font("HP Simplified", Font.BOLD, 18));
		btnProceed.setBounds(337, 154, 121, 58);
		frmTransaction.getContentPane().add(btnProceed);
		
		JLabel lblTransactionNoTransaction = new JLabel("TRANSACTION NO#");
		lblTransactionNoTransaction.setFont(new Font("HP Simplified", Font.BOLD, 16));
		lblTransactionNoTransaction.setBounds(10, 42, 132, 24);
		frmTransaction.getContentPane().add(lblTransactionNoTransaction);
		
		lblTransactionNoDataTransaction = new JLabel("---TRANSACTION#---");
		lblTransactionNoDataTransaction.setFont(new Font("HP Simplified", Font.BOLD, 16));
		lblTransactionNoDataTransaction.setBounds(140, 42, 146, 24);
		frmTransaction.getContentPane().add(lblTransactionNoDataTransaction);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 37, 448, 2);
		frmTransaction.getContentPane().add(separator_1);
	}
}