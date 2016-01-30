import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class HouseMateHome {

	private static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				ArrayList<String> data = new ArrayList<String>();
				final HouseMateHome window = new HouseMateHome();
		//		final HouseMate1 window1 = new HouseMate1();
		//		final HouseMate window2 = new HouseMate(data);
				window.mainPage(data);
				
				try {

					

					

					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public HouseMateHome() {
		
	}
	

	/**
	 * mainPage the contents of the frame.
	 */
	
	//------------- MAIN PAGE-------------------------
	public void mainPage(final ArrayList<String> data) {
		frame = new JFrame(); 
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//button - go to user input page
		JButton mainButton0 = new JButton("Look for House");
		mainButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.lookForHouse(data);
				
				
			}
		});
		mainButton0.setBounds(360, 252, 190, 25);
		frame.getContentPane().add(mainButton0);
	
	//button - go to home input page
	JButton mainButton1 = new JButton("Look for Housemate");
	mainButton1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.lookForMate(data);
			
		
		}
	});
	mainButton1.setBounds(69, 252, 190, 25);
	frame.getContentPane().add(mainButton1);
	

	

		
		frame.setVisible(true);
		

		
	}

	//-----------------LOOKING FOR HOUSE
	public void lookForHouse(final ArrayList<String> data) {
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);
		
		//BACK TO MAIN BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data);
				
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		//NAME TEXT FIELD
		textField = new JTextField();
		textField.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("FULL NAME:");
		lblNewLabel.setBounds(30, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//MAJOR TEXT FIELD
		textField = new JTextField();
		textField.setBounds(30, 120, 150, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//LABEL
		JLabel lblNewLabel1 = new JLabel("MAJOR:");
		lblNewLabel1.setBounds(30, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		//GRAD YEAR
		textField = new JTextField();
		textField.setBounds(30, 180, 150, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//LABEL
		JLabel lblNewLabel2 = new JLabel("GRAD YEAR:");
		lblNewLabel2.setBounds(30, 160, 100, 16);
		frame.getContentPane().add(lblNewLabel2);
		
		//STAY
		textField = new JTextField();
		textField.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("LENGTH OF STAY:");
		lblNewLabel3.setBounds(30, 220, 100, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		this.frame.setVisible(true);
	}
		
	
//-------------- LOOKING FOR MATE
	public void lookForMate(final ArrayList<String> data) {
	
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BACK BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data);
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		

		
		//Insert into database
		JButton inputPageButton1 = new JButton("Insert");
		inputPageButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userDB newID = new userDB();
				
				
			
			}
		});
		inputPageButton1.setBounds(500, 350, 80, 25);
		frame.getContentPane().add(inputPageButton1);
		
		this.frame.setVisible(true);
	}
}