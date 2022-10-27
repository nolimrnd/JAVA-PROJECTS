package AirlineSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SystemInfo {

	JFrame frmSystemInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemInfo window = new SystemInfo();
					window.frmSystemInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SystemInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSystemInformation = new JFrame();
		frmSystemInformation.setTitle("SYSTEM INFORMATION");
		frmSystemInformation.setBounds(100, 100, 375, 282);
		frmSystemInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSystemInformation.getContentPane().setLayout(null);
		
		JLabel lblNoli = new JLabel("NOLIMAR MIRANDA");
		lblNoli.setHorizontalAlignment(SwingConstants.CENTER);
		lblNoli.setFont(new Font("HP Simplified", Font.BOLD, 21));
		lblNoli.setBounds(65, 76, 223, 24);
		frmSystemInformation.getContentPane().add(lblNoli);
		
		JLabel lblThisSystemIs = new JLabel(" DEVELOPED BY:");
		lblThisSystemIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisSystemIs.setFont(new Font("HP Simplified", Font.BOLD, 18));
		lblThisSystemIs.setBounds(65, 41, 223, 24);
		frmSystemInformation.getContentPane().add(lblThisSystemIs);
		
		JLabel lblThankYouFor = new JLabel("THANK YOU FOR USING MERC AIRLINE TICKETING SYSTEM! ");
		lblThankYouFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblThankYouFor.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblThankYouFor.setBounds(35, 125, 297, 24);
		frmSystemInformation.getContentPane().add(lblThankYouFor);
		
		JLabel lblEnjoyAndHave = new JLabel(" ENJOY AND HAVE A SAFE FLIGHT!");
		lblEnjoyAndHave.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnjoyAndHave.setFont(new Font("HP Simplified", Font.BOLD, 12));
		lblEnjoyAndHave.setBounds(35, 148, 297, 24);
		frmSystemInformation.getContentPane().add(lblEnjoyAndHave);
		
		JButton btnBack = new JButton("GO BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomePage wlc = new WelcomePage();
				wlc.frmMercAirlineTicketing.setVisible(true);
				frmSystemInformation.dispose();
			}
		});
		btnBack.setFont(new Font("HP Simplified", Font.BOLD, 13));
		btnBack.setBounds(122, 195, 108, 37);
		frmSystemInformation.getContentPane().add(btnBack);
	}
}