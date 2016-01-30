import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
public class HouseMate {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseMate window = new HouseMate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HouseMate() {
		ArrayList<String> list1 = new ArrayList<String>();
		initialize();
		
		startObject(list1);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

	
	}
	public void startObject(final ArrayList<String> array) {

		//show array 
		JButton btnSwag1 = new JButton("Show Entry");
		btnSwag1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(array.get(Integer.parseInt(textField_1.getText())));
			}
		});
		btnSwag1.setBounds(47,195,116,23);
		frame.getContentPane().add(btnSwag1);
		
		
		//Insert object to array button
		JButton btnSwag = new JButton("Insert Array");
		btnSwag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				array.add(textField.getText());
				lblNewLabel.setText("added: " + array.get(array.size()-1));
				
				String objectName = "";
				for (int i = 0; i<array.size(); i++) {
					objectName += array.get(i) + "\n";
					}
				textPane_1.setText(objectName);
			}
		});
		btnSwag.setBounds(161, 29, 116, 25);
		frame.getContentPane().add(btnSwag);
		
		//text
		textField = new JTextField();
		textField.setBounds(47, 30, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//text
		textField_1 = new JTextField();
		textField_1.setBounds(161, 195, 45, 23);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		//text
		textPane = new JTextPane();
		textPane.setBounds(47, 157, 261, 25);
		frame.getContentPane().add(textPane);
		
		//text
		textPane_1 = new JTextPane();
		textPane_1.setBounds(514, 29, 234, 321);
		frame.getContentPane().add(textPane_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(514, 369, 234, 25);
		frame.getContentPane().add(lblNewLabel);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(panel);
	}
}