package AirlineSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt {

	JFrame frmReceipt;
	JLabel lblNameDataReceipt;
	JLabel lblTotalCostDataReceipt;
	JLabel lblCashDataReceipt;
	JLabel lblSeniorDiscountDataReceipt;
	JLabel lblBaggageFeeDataReceipt;
	JLabel lblChangeDataReceipt;
	JLabel lbltravelTaxDataReceipt;
	JLabel lblLocationDataReceipt;
	JLabel lblTicketsDataReceipt;
	JLabel lblTravelInsuranceDataReceipt;
	JLabel lblAirlineTypeDataReceipt;
	JLabel lblTransactionDataReceipt;
	JLabel lblTransactionFeeDataReceipt;
	JLabel lblTransactionNoDataReceipt;
	JLabel lblTravelDataReceipt;
	JLabel lblDestinationCostDataReceipt;
	JLabel lblInsuranceDataReceipt;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt window = new Receipt();
					window.frmReceipt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Receipt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReceipt = new JFrame();
		frmReceipt.getContentPane().setFont(new Font("HP Simplified", Font.BOLD, 12));
		frmReceipt.setTitle("RECEIPT");
		frmReceipt.setBounds(100, 100, 439, 637);
		frmReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReceipt.getContentPane().setLayout(null);
		
		JLabel lblTravelTypeReceipt = new JLabel("TRAVEL TYPE:");
		lblTravelTypeReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravelTypeReceipt.setBounds(10, 107, 113, 22);
		frmReceipt.getContentPane().add(lblTravelTypeReceipt);
		
		lblTravelDataReceipt = new JLabel("--TRAVEL--");
		lblTravelDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravelDataReceipt.setBounds(133, 107, 232, 22);
		frmReceipt.getContentPane().add(lblTravelDataReceipt);
		
		JLabel lblDestinationReceipt = new JLabel("DESTINATION:");
		lblDestinationReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDestinationReceipt.setBounds(10, 135, 113, 22);
		frmReceipt.getContentPane().add(lblDestinationReceipt);
		
		lblLocationDataReceipt = new JLabel("--DESTINATION--");
		lblLocationDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblLocationDataReceipt.setBounds(133, 135, 232, 22);
		frmReceipt.getContentPane().add(lblLocationDataReceipt);
		
		JLabel lblNameReceipt = new JLabel("NAME:");
		lblNameReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblNameReceipt.setBounds(10, 79, 60, 24);
		frmReceipt.getContentPane().add(lblNameReceipt);
		
		lblNameDataReceipt = new JLabel("--NAME--");
		lblNameDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblNameDataReceipt.setBounds(133, 80, 249, 22);
		frmReceipt.getContentPane().add(lblNameDataReceipt);
		
		JLabel lblNoOfTicketsReceipt = new JLabel("NO. OF TICKETS:");
		lblNoOfTicketsReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblNoOfTicketsReceipt.setBounds(10, 162, 113, 24);
		frmReceipt.getContentPane().add(lblNoOfTicketsReceipt);
		
		lblTicketsDataReceipt = new JLabel("--TICKETS--");
		lblTicketsDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTicketsDataReceipt.setBounds(133, 163, 232, 22);
		frmReceipt.getContentPane().add(lblTicketsDataReceipt);
		
		JLabel lblTravelInsuranceReceipt = new JLabel("TRAVEL INSURANCE?");
		lblTravelInsuranceReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravelInsuranceReceipt.setBounds(10, 216, 113, 22);
		frmReceipt.getContentPane().add(lblTravelInsuranceReceipt);
		
		lblTravelInsuranceDataReceipt = new JLabel("--INSURANCE--");
		lblTravelInsuranceDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravelInsuranceDataReceipt.setBounds(133, 215, 232, 22);
		frmReceipt.getContentPane().add(lblTravelInsuranceDataReceipt);
		
		JLabel lblAirlineTypeReceipt = new JLabel("AIRLINE TYPE:");
		lblAirlineTypeReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblAirlineTypeReceipt.setBounds(10, 189, 113, 24);
		frmReceipt.getContentPane().add(lblAirlineTypeReceipt);
		
		lblAirlineTypeDataReceipt = new JLabel("--AIRLINETYPE--");
		lblAirlineTypeDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblAirlineTypeDataReceipt.setBounds(133, 190, 232, 22);
		frmReceipt.getContentPane().add(lblAirlineTypeDataReceipt);
		
		JLabel lblReceipt = new JLabel("RECEIPT");
		lblReceipt.setFont(new Font("HP Simplified", Font.BOLD, 18));
		lblReceipt.setBounds(186, 11, 71, 24);
		frmReceipt.getContentPane().add(lblReceipt);
		
		JLabel lblThankYouFor = new JLabel("THANK YOU FOR FLYING WITH US!");
		lblThankYouFor.setFont(new Font("HP Simplified", Font.BOLD, 17));
		lblThankYouFor.setBounds(98, 491, 249, 24);
		frmReceipt.getContentPane().add(lblThankYouFor);
		
		JLabel lblDestinationCost = new JLabel("DESTINATION COST:");
		lblDestinationCost.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDestinationCost.setBounds(10, 262, 226, 24);
		frmReceipt.getContentPane().add(lblDestinationCost);
		
		JLabel lblAdditionalTransactionProcessing = new JLabel("ADDITIONAL TRANSACTION PROCESSING FEE:");
		lblAdditionalTransactionProcessing.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblAdditionalTransactionProcessing.setBounds(10, 285, 226, 24);
		frmReceipt.getContentPane().add(lblAdditionalTransactionProcessing);
		
		JLabel lblTravel = new JLabel("TRAVEL INSURANCE FEE:");
		lblTravel.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTravel.setBounds(10, 308, 226, 24);
		frmReceipt.getContentPane().add(lblTravel);
		
		JLabel lblTra = new JLabel("TRAVEL TAX:");
		lblTra.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTra.setBounds(10, 332, 226, 24);
		frmReceipt.getContentPane().add(lblTra);
		
		JLabel lblBaggageFee = new JLabel("BAGGAGE FEE:");
		lblBaggageFee.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblBaggageFee.setBounds(10, 355, 226, 24);
		frmReceipt.getContentPane().add(lblBaggageFee);
		
		JLabel lblDiscountifSenior = new JLabel("DISCOUNT (IF SENIOR):");
		lblDiscountifSenior.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDiscountifSenior.setBounds(10, 380, 226, 24);
		frmReceipt.getContentPane().add(lblDiscountifSenior);
		
		JLabel lblTotalCost = new JLabel("TOTAL COST:");
		lblTotalCost.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTotalCost.setBounds(10, 402, 226, 24);
		frmReceipt.getContentPane().add(lblTotalCost);
		
		lblTotalCostDataReceipt = new JLabel("---TOTALCOST---");
		lblTotalCostDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTotalCostDataReceipt.setBounds(246, 402, 136, 24);
		frmReceipt.getContentPane().add(lblTotalCostDataReceipt);
		
		lblSeniorDiscountDataReceipt = new JLabel("---SENIORDISCOUNT---");
		lblSeniorDiscountDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblSeniorDiscountDataReceipt.setBounds(246, 379, 136, 24);
		frmReceipt.getContentPane().add(lblSeniorDiscountDataReceipt);
		
		lblBaggageFeeDataReceipt = new JLabel("---BAGGAGEFEE---");
		lblBaggageFeeDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblBaggageFeeDataReceipt.setBounds(246, 355, 136, 24);
		frmReceipt.getContentPane().add(lblBaggageFeeDataReceipt);
		
		lbltravelTaxDataReceipt = new JLabel("---TRAVELTAX---");
		lbltravelTaxDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lbltravelTaxDataReceipt.setBounds(246, 331, 136, 24);
		frmReceipt.getContentPane().add(lbltravelTaxDataReceipt);
		
		lblInsuranceDataReceipt = new JLabel("---INSURANCEFEE---");
		lblInsuranceDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblInsuranceDataReceipt.setBounds(246, 308, 136, 24);
		frmReceipt.getContentPane().add(lblInsuranceDataReceipt);
		
		lblTransactionDataReceipt = new JLabel("---TRANSACTIONFEE---");
		lblTransactionDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblTransactionDataReceipt.setBounds(246, 285, 132, 24);
		frmReceipt.getContentPane().add(lblTransactionDataReceipt);
		
		lblDestinationCostDataReceipt = new JLabel("---DESTINATIONCOST---");
		lblDestinationCostDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblDestinationCostDataReceipt.setBounds(246, 261, 132, 24);
		frmReceipt.getContentPane().add(lblDestinationCostDataReceipt);
		
		JLabel lblThankYouFor_1 = new JLabel("Thank You For Using Merc Airline Ticketing System!");
		lblThankYouFor_1.setFont(new Font("HP Simplified", Font.BOLD, 11));
		lblThankYouFor_1.setBounds(92, 514, 255, 24);
		frmReceipt.getContentPane().add(lblThankYouFor_1);
		
		JLabel lblTransactionNoReceipt = new JLabel("TRANSACTION NO#");
		lblTransactionNoReceipt.setFont(new Font("HP Simplified", Font.BOLD, 15));
		lblTransactionNoReceipt.setBounds(10, 56, 125, 24);
		frmReceipt.getContentPane().add(lblTransactionNoReceipt);
		
		lblTransactionNoDataReceipt = new JLabel("---TRANSACTIONNO---");
		lblTransactionNoDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 17));
		lblTransactionNoDataReceipt.setBounds(133, 56, 167, 24);
		frmReceipt.getContentPane().add(lblTransactionNoDataReceipt);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 44, 403, 2);
		frmReceipt.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 482, 403, 2);
		frmReceipt.getContentPane().add(separator_1);
		
		JLabel lblCash = new JLabel("CASH:");
		lblCash.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblCash.setBounds(10, 424, 226, 24);
		frmReceipt.getContentPane().add(lblCash);
		
		JLabel lblChange = new JLabel("CHANGE:");
		lblChange.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblChange.setBounds(10, 447, 226, 24);
		frmReceipt.getContentPane().add(lblChange);
		
		lblCashDataReceipt = new JLabel("---CASH---");
		lblCashDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblCashDataReceipt.setBounds(246, 424, 136, 24);
		frmReceipt.getContentPane().add(lblCashDataReceipt);
		
		lblChangeDataReceipt = new JLabel("---CHANGE---");
		lblChangeDataReceipt.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblChangeDataReceipt.setBounds(246, 447, 136, 24);
		frmReceipt.getContentPane().add(lblChangeDataReceipt);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 249, 403, 2);
		frmReceipt.getContentPane().add(separator_1_1);
		
		btnNewButton = new JButton("DO ANOTHER TRANSACTION");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage wlc = new WelcomePage(); //to call WelcomePage.java
				wlc.frmMercAirlineTicketing.setVisible(true);
				frmReceipt.dispose();
			}
		});
		btnNewButton.setFont(new Font("HP Simplified", Font.BOLD, 13));
		btnNewButton.setBounds(186, 549, 195, 37);
		frmReceipt.getContentPane().add(btnNewButton);
		
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
		btnExit.setBounds(56, 549, 89, 37);
		frmReceipt.getContentPane().add(btnExit);
	}
}