import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JList;

public class HouseMateHome {

	private static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				ArrayList<userDB> data = new ArrayList<userDB>();
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
	public void mainPage(final ArrayList<userDB> data) {
		frame = new JFrame(); 
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("LOOKING FOR HOUSEMATES");
		lblNewLabel.setBounds(69, 230, 200, 16);
		frame.getContentPane().add(lblNewLabel);
		
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
	
	//button - go to TEST page
	JButton mainButton2 = new JButton("Profiles");
	mainButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.lookForMateArray(data);
			
		
		}
	});
	mainButton2.setBounds(360, 378, 190, 25);
	frame.getContentPane().add(mainButton2);
	
	//button - go to SIGN UP
	JButton mainButton3 = new JButton("Sign up");
	mainButton3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.profiles(data);
			
		
		}
	});
	mainButton3.setBounds(69, 378, 190, 25);
	frame.getContentPane().add(mainButton3);
	



		
		frame.setVisible(true);
	}

	//-----------------LOOKING FOR HOUSE
	public void lookForHouse(final ArrayList<userDB> data) {
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
		final JTextField textFieldName = new JTextField();
		textFieldName.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("FULL NAME:");
		lblNewLabel.setBounds(30, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//MAJOR TEXT FIELD
		final JTextField textFieldMajor = new JTextField();
		textFieldMajor.setBounds(30, 120, 150, 25);
		frame.getContentPane().add(textFieldMajor);
		textFieldMajor.setColumns(10);
		//LABEL
		JLabel lblNewLabel1 = new JLabel("MAJOR:");
		lblNewLabel1.setBounds(30, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		//GRAD YEAR
		final JTextField textFieldYear = new JTextField();
		textFieldYear.setBounds(30, 180, 150, 25);
		frame.getContentPane().add(textFieldYear);
		textFieldYear.setColumns(10);
		//LABEL
		JLabel lblNewLabel2 = new JLabel("GRAD YEAR:");
		lblNewLabel2.setBounds(30, 160, 100, 16);
		frame.getContentPane().add(lblNewLabel2);
		
		//STAY
		final JTextField textFieldStay = new JTextField();
		textFieldStay.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldStay);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("LENGTH OF STAY:");
		lblNewLabel3.setBounds(30, 220, 100, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//RENT
		final JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(30, 300, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("RENT");
		lblNewLabel4.setBounds(30, 280, 100, 16);
		frame.getContentPane().add(lblNewLabel4);
		

		
		//Insert into database
		JButton inputPageButton1 = new JButton("Insert");
		inputPageButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userDB newID = new userDB();
				newID.setName(textFieldName.getText());
				newID.setMajor(textFieldMajor.getText());
				newID.setGradYear(textFieldYear.getText());
				newID.setStay(textFieldStay.getText());
				newID.setRent(Integer.parseInt(textFieldRent.getText()));
				
				data.add(newID);
			}
		});
		inputPageButton1.setBounds(500, 350, 80, 25);
		frame.getContentPane().add(inputPageButton1);
		
	
		
		this.frame.setVisible(true);
	}
		
	
//-------------- LOOKING FOR MATE
	public void lookForMate(final ArrayList<userDB> data) {
	
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
		

		

		
		this.frame.setVisible(true);
	}
	
	
	//------------- TEST LOOK FOR MATE ARRAY
	public void lookForMateArray(final ArrayList<userDB> data) {
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BACK TO MAIN BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data);
			}
		});
		inputPageButton0.setBounds(500, 350, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 13, 253, 377);
		frame.getContentPane().add(textPane);
		
		String listArray = "";
		for (int i = 0; i < data.size(); i++) {
		listArray += data.get(i).getName()+ "\n";
		}
		
		textPane.setText(listArray);
		
		this.frame.setVisible(true);
	}
	
	
	//-------------------SIGN IN 
	public void profiles(final ArrayList<userDB> data) {

		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);
		frame.setTitle("Sign Up");
		frame.setForeground(Color.BLACK);

		
		//NAME TEXT FIELD
		JTextField textFieldName = new JTextField();
		textFieldName.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("Full Name: ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(30, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//NAME TEXT FIELD
		JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(230, 60, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel5 = new JLabel("Maximum Rent: ");
		lblNewLabel5.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel5.setBounds(230, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel5);
		
		//MAJOR TEXT FIELD
		JTextField textFieldAge = new JTextField();
		textFieldAge.setBounds(30, 120, 150, 27);
		frame.getContentPane().add(textFieldAge);
		textFieldAge.setColumns(10);
		//LABEL
		JLabel lblNewLabel1 = new JLabel("Age: ");
		lblNewLabel1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel1.setBounds(30, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		//GRAD YEAR
		JTextField textFieldMajor = new JTextField();
		textFieldMajor.setBounds(30, 180, 150, 25);
		frame.getContentPane().add(textFieldMajor);
		textFieldMajor.setColumns(10);
		//LABEL
		JLabel lblNewLabel2 = new JLabel("Major: ");
		lblNewLabel2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel2.setBounds(30, 160, 100, 16);
		frame.getContentPane().add(lblNewLabel2);
		
		//STAY
		JTextField textFieldGrad = new JTextField();
		textFieldGrad.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldGrad);
		textFieldGrad.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("Grad Year: ");
		lblNewLabel3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel3.setBounds(30, 220, 100, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//RENT
		JTextField textFieldPer = new JTextField();
		textFieldPer.setBounds(30, 300, 204, 90);
		frame.getContentPane().add(textFieldPer);
		textFieldPer.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("Personality: ");
		lblNewLabel4.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel4.setBounds(30, 280, 100, 16);
		frame.getContentPane().add(lblNewLabel4);
		
		JButton btnSignUp = new JButton("Enter");
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setForeground(Color.BLACK);
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(455, 365, 97, 25);
		frame.getContentPane().add(btnSignUp);
		
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
		
		this.frame.setVisible(true);
	}
	
	
}
