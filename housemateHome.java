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
import javax.swing.JScrollPane;

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
				ArrayList<houseDB> houseData = new ArrayList<houseDB>();
				final HouseMateHome window = new HouseMateHome();
		//		final HouseMate1 window1 = new HouseMate1();
		//		final HouseMate window2 = new HouseMate(data);
				window.mainPage(data, houseData);
				
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
	public void mainPage(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
		frame = new JFrame(); 
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//LOOKING FOR HOUSEMATE
		JLabel lblNewLabel = new JLabel("LOOKING FOR HOUSEMATES");
		lblNewLabel.setBounds(69, 230, 200, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//LOOKING FOR HOUSE
		JLabel lblNewLabel1 = new JLabel("LOOKING FOR HOUSE");
		lblNewLabel1.setBounds(360, 230, 200, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		
		
		//button - go to user input page
		JButton mainButton0 = new JButton("Look for House");
		mainButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.lookForHouse(data, houseData);
				
				
			}
		});
		mainButton0.setBounds(360, 252, 190, 25);
		frame.getContentPane().add(mainButton0);
	
	//button - go to home input page
	JButton mainButton1 = new JButton("Look for Housemate");
	mainButton1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.lookForMate(data, houseData);
			
		
		}
	});
	mainButton1.setBounds(69, 252, 190, 25);
	frame.getContentPane().add(mainButton1);
	
	//button - go to PROFILES page
	JButton mainButton2 = new JButton("Profiles");
	mainButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.profiles(data, houseData);
			
		
		}
	});
	mainButton2.setBounds(360, 378, 190, 25);
	frame.getContentPane().add(mainButton2);
	
	//button - go to PROFILESHOUSE page
	JButton mainButton5 = new JButton("Profiles");
	mainButton5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			HouseMateHome temp = new HouseMateHome();
			temp.houseProfile(data, houseData);
		}
	});
	mainButton5.setBounds(69, 378, 190, 25);
	frame.getContentPane().add(mainButton5);
	
	//button - go to SIGN UP USERS
	JButton mainButton3 = new JButton("Sign up");
	mainButton3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			

			HouseMateHome temp = new HouseMateHome();
			temp.signup(data, houseData);
			
		
		}
	});
	mainButton3.setBounds(360, 277, 190, 25);
	frame.getContentPane().add(mainButton3);
	
	//button - go to SIGN UP HOUSE
		JButton mainButton4 = new JButton("Sign up");
		mainButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				HouseMateHome temp = new HouseMateHome();
				temp.signupHouse(data, houseData);
				
			
			}
		});
		mainButton4.setBounds(69, 277, 190, 25);
		frame.getContentPane().add(mainButton4);
	

	



		
		frame.setVisible(true);
	}

	//-----------------LOOKING FOR HOUSE
	public void lookForHouse(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
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
				temp.mainPage(data, houseData);
				
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
	
		
		//STAY
		final JTextField textFieldStay = new JTextField();
		textFieldStay.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldStay);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("LENGTH OF STAY (years):");
		lblNewLabel3.setBounds(30, 220, 200, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//RENT
		final JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(30, 300, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("Maximum Rent");
		lblNewLabel4.setBounds(30, 280, 200, 16);
		frame.getContentPane().add(lblNewLabel4);
		

		final JTextPane textPane = new JTextPane();
		textPane.setBounds(317, 13, 303, 377);
		frame.getContentPane().add(textPane);
		
		//Insert into database
		JButton inputPageButton1 = new JButton("Search");
		inputPageButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String houseInfo = "";
				for (int i = 0; i < houseData.size(); i++) {
					if (Integer.parseInt(textFieldRent.getText()) >= houseData.get(i).getRent() && 
						Integer.parseInt(textFieldStay.getText()) <= houseData.get(i).getStay()) {
						houseInfo += houseData.get(i).getAddress() + ", max stay: " + houseData.get(i).getStay()
						+ ", Required Rent: "+houseData.get(i).getRent() + "\n" + "Contact: " + houseData.get(i).getContact()
						+ "\n" + "\n";
					}
				}
				textPane.setText(houseInfo );
			}
		});
		inputPageButton1.setBounds(30, 350, 80, 25);
		frame.getContentPane().add(inputPageButton1);
		

		
		this.frame.setVisible(true);
	}
		
	
//-------------- LOOKING FOR MATE
	public void lookForMate(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
	
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BACK TO MAIN BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data, houseData);
				
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
	
		
		//
		final JTextField textFieldStay = new JTextField();
		textFieldStay.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldStay);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("LENGTH OF STAY (years):");
		lblNewLabel3.setBounds(30, 220, 200, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//RENT
		final JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(30, 300, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("Required Rent");
		lblNewLabel4.setBounds(30, 280, 200, 16);
		frame.getContentPane().add(lblNewLabel4);
		

		final JTextPane textPane = new JTextPane();
		textPane.setBounds(317, 13, 303, 377);
		frame.getContentPane().add(textPane);
		
		//Insert into database
		JButton inputPageButton1 = new JButton("Search");
		inputPageButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String houseInfo = "";
				for (int i = 0; i < data.size(); i++) {
					if (Integer.parseInt(textFieldRent.getText()) <= data.get(i).getRent() && 
						Integer.parseInt(textFieldStay.getText()) >= data.get(i).getStay()) {
						houseInfo += data.get(i).getName() + ", age " + data.get(i).getAge() + ", wants to stay for: " + data.get(i).getStay()
				        + " years" + "\n" + "\n";
					}
				}
				textPane.setText(houseInfo );
			}
		});
		inputPageButton1.setBounds(30, 350, 80, 25);
		frame.getContentPane().add(inputPageButton1);

		

		
		this.frame.setVisible(true);
	}
	
	
	//------------- USER PROFILES
	public void profiles(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BACK TO MAIN BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data, houseData);
			}
		});
		inputPageButton0.setBounds(500, 350, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 13, 253, 377);
		frame.getContentPane().add(textPane);
		
		String listArray = "";
		for (int i = 0; i < data.size(); i++) {
		listArray += data.get(i).getName()+ "\n" +  "Age: " + data.get(i).getAge() + "\n" + 
		"Major: " + data.get(i).getMajor() + "\n" + "Can pay: " + data.get(i).getRent() + "\n" + 
		"Staying for: " + data.get(i).getStay() + " years" + "\n" + "Personality: " + data.get(i).getPersonality() + "\n" + "\n";
		}
		
		textPane.setText(listArray);
		
		this.frame.setVisible(true);
	}
	
	//------------- HOUSE PROFILES
	public void houseProfile(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
		frame = new JFrame();
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BACK TO MAIN BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data, houseData);
			}
		});
		inputPageButton0.setBounds(500, 350, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 13, 253, 377);
		frame.getContentPane().add(textPane);
		
		
		String listArray = "";
		for (int i = 0; i < houseData.size(); i++) {
		listArray += houseData.get(i).getName()+ ", \n" + houseData.get(i).getAddress()
		+ ", \n"+ "Max stay: " + houseData.get(i).getStay() + ", \n" + "Required Rent: " + houseData.get(i).getRent()
		+ ", \n" +"Contact: " +  houseData.get(i).getContact() + "\n" + "\n";
		}
		
		textPane.setText(listArray);
		
		this.frame.setVisible(true);
	}
	
	
	//-------------------SIGN IN 
	public void signup(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.green);
		
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);
		frame.setTitle("Signup Profile");
		frame.setForeground(Color.BLACK);


		//NAME TEXT FIELD
		final JTextField textFieldName = new JTextField();
		textFieldName.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("Full Name: ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(30, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//Rent
		final JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(230, 60, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel5 = new JLabel("Maximum Rent: ");
		lblNewLabel5.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel5.setBounds(230, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel5);
		
		//Age 
		final JTextField textFieldAge = new JTextField();
		textFieldAge.setBounds(30, 120, 150, 27);
		frame.getContentPane().add(textFieldAge);
		textFieldAge.setColumns(10);
		//LABEL
		JLabel lblNewLabel1 = new JLabel("Age: ");
		lblNewLabel1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel1.setBounds(30, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		//GRAD YEAR
		final JTextField textFieldMajor = new JTextField();
		textFieldMajor.setBounds(30, 180, 150, 25);
		frame.getContentPane().add(textFieldMajor);
		textFieldMajor.setColumns(10);
		//LABEL
		JLabel lblNewLabel2 = new JLabel("Major: ");
		lblNewLabel2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel2.setBounds(30, 160, 100, 16);
		frame.getContentPane().add(lblNewLabel2);
		
		//STAY
		final JTextField textFieldGrad = new JTextField();
		textFieldGrad.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldGrad);
		textFieldGrad.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("Grad Year: ");
		lblNewLabel3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel3.setBounds(30, 220, 100, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//PERSONALITY
		final JTextField textFieldPer = new JTextField();
		textFieldPer.setBounds(30, 300, 204, 90);
		frame.getContentPane().add(textFieldPer);
		textFieldPer.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("Personality: ");
		lblNewLabel4.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel4.setBounds(30, 280, 100, 16);
		frame.getContentPane().add(lblNewLabel4);
		
		//STAY
		final JTextField textFieldStay = new JTextField();
		textFieldStay.setBounds(230, 120, 150, 25);
		frame.getContentPane().add(textFieldStay);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel6 = new JLabel("Length of stay (years): ");
		lblNewLabel6.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel6.setBounds(230, 100, 200, 16);
		frame.getContentPane().add(lblNewLabel6);
		
		
		JButton btnSignUp = new JButton("Enter");
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setForeground(Color.BLACK);
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userDB newID = new userDB();
				newID.setName(textFieldName.getText());
				newID.setMajor(textFieldMajor.getText());
				newID.setGradYear(textFieldGrad.getText());
				newID.setStay(Integer.parseInt(textFieldStay.getText()));
				newID.setAge(Integer.parseInt(textFieldAge.getText()));
				newID.setRent(Integer.parseInt(textFieldRent.getText()));
				newID.setPersonality(textFieldPer.getText());
				
				data.add(newID);
				
				textFieldName.setText("");
				textFieldAge.setText("");
				textFieldMajor.setText("");
				textFieldGrad.setText("");
				textFieldStay.setText("");
				textFieldRent.setText("");
				textFieldPer.setText("");
				
			
				
			}
		});
		btnSignUp.setBounds(455, 365, 97, 25);
		frame.getContentPane().add(btnSignUp);
		
	
		
		//BACK BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data, houseData);
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		this.frame.setVisible(true);
	}
	
	//------------------SIGNUP FOR HOUSE
	public void signupHouse(final ArrayList<userDB> data, final ArrayList<houseDB> houseData) {
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		
		frame.setBounds(500, 300, 650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		this.frame.setVisible(true);
		frame.setTitle("Signup Profile");
		frame.setForeground(Color.BLACK);


		//NAME TEXT FIELD
		final JTextField textFieldName = new JTextField();
		textFieldName.setBounds(30, 60, 150, 25);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel = new JLabel("Full Name: ");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(30, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel);
		
		//Rent
		final JTextField textFieldRent = new JTextField();
		textFieldRent.setBounds(230, 60, 150, 25);
		frame.getContentPane().add(textFieldRent);
		textFieldRent.setColumns(10);
		//NAME TEXT LABEL
		JLabel lblNewLabel5 = new JLabel("Rent Required: ");
		lblNewLabel5.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel5.setBounds(230, 40, 100, 16);
		frame.getContentPane().add(lblNewLabel5);
		
		//Address
		final JTextField textFieldAd = new JTextField();
		textFieldAd.setBounds(30, 120, 150, 27);
		frame.getContentPane().add(textFieldAd);
		textFieldAd.setColumns(10);
		//LABEL
		JLabel lblNewLabel1 = new JLabel("Address: ");
		lblNewLabel1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel1.setBounds(30, 100, 100, 16);
		frame.getContentPane().add(lblNewLabel1);
		
		
		//STAY
		final JTextField textFieldStay = new JTextField();
		textFieldStay.setBounds(30, 180, 150, 25);
		frame.getContentPane().add(textFieldStay);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel3 = new JLabel("Length of Stay(years): ");
		lblNewLabel3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel3.setBounds(30, 160, 200, 16);
		frame.getContentPane().add(lblNewLabel3);
		
		//CONTACT
		final JTextField textFieldContact = new JTextField();
		textFieldContact.setBounds(30, 240, 150, 25);
		frame.getContentPane().add(textFieldContact);
		textFieldStay.setColumns(10);
		//LABEL
		JLabel lblNewLabel4 = new JLabel("Contact: ");
		lblNewLabel4.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel4.setBounds(30, 220, 200, 16);
		frame.getContentPane().add(lblNewLabel4);
		
		JButton btnSignUp = new JButton("Enter");
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setForeground(Color.BLACK);
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				houseDB newID = new houseDB();
				newID.setName(textFieldName.getText());
				newID.setAddress(textFieldAd.getText());
				newID.setRent(Integer.parseInt(textFieldRent.getText()));
				newID.setStay(Integer.parseInt(textFieldStay.getText()));
				newID.setContact(textFieldContact.getText());
				houseData.add(newID);
				
				textFieldName.setText("");
				textFieldAd.setText("");
				textFieldRent.setText("");
				textFieldStay.setText("");
				textFieldContact.setText("");
				
			
				
			}
		});
		btnSignUp.setBounds(455, 365, 97, 25);
		frame.getContentPane().add(btnSignUp);
		
	
		
		//BACK BUTTON
		JButton inputPageButton0 = new JButton("Back");
		inputPageButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				HouseMateHome temp = new HouseMateHome();
				temp.mainPage(data, houseData);
			
			}
		});
		inputPageButton0.setBounds(10, 10, 80, 25);
		frame.getContentPane().add(inputPageButton0);
		
		this.frame.setVisible(true);
	}
}
