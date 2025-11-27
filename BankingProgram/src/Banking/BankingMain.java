package Banking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class BankingMain {

	private JFrame frmMainProgram;
	private JTextField edtID_login;
	private JTextField edtCreate_FirstName;
	private JTextField edtCreate_Surname;
	private JTextField edtCreate_ID;
	private JTextField edtClient_Withdraw;
	private JTextField edtClient_Deposit;
	private JPasswordField pwfLogin_Password;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankingMain window = new BankingMain();
					window.frmMainProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BankingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainProgram = new JFrame();
		frmMainProgram.setTitle("Unnamed Bank");
		frmMainProgram.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmMainProgram.setBounds(100, 100, 450, 300);
		frmMainProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainProgram.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JTabbedPane tbMenu = new JTabbedPane(JTabbedPane.TOP);
		tbMenu.setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmMainProgram.getContentPane().add(tbMenu);
		
		JPanel tsWelcome = new JPanel();
		tbMenu.addTab("Welcome Page", null, tsWelcome, null);
		tsWelcome.setLayout(null);
		
		JButton btnWelcomeCreate = new JButton("Create Account");
		btnWelcomeCreate.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWelcomeCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				tbMenu.setSelectedIndex(2);
			}
		});
		btnWelcomeCreate.setBounds(230, 89, 150, 23);
		tsWelcome.add(btnWelcomeCreate);
		
		JPanel tsLogin = new JPanel();
		tbMenu.addTab("Log in page", null, tsLogin, null);
		tbMenu.setEnabledAt(1, true);
		tsLogin.setLayout(null);		// The 3 lines from the automatic creation have been put in the btnWelcome section to make this work
									   // Not sure if I need to do this for EVERY button that goes to tsLogin page
									  // We need to keep this here for it to show in  the Design page
		// WELCOME BUTTON
		JButton btnWelcome_Login = new JButton("Log in");
		btnWelcome_Login.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnWelcome_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// BtnLogIn, Redirect to Log In page
				tbMenu.add(tsLogin);
				
				// Stole this from the automatic creation
				tbMenu.addTab("Log in page", null, tsLogin, null);
				tbMenu.setEnabledAt(1, true);
				tsLogin.setLayout(null);
				// now this doesnt show up in design
				
				tbMenu.setSelectedIndex(1);
				tbMenu.remove(0);
			}
		});
		btnWelcome_Login.setBounds(45, 89, 150, 23);
		tsWelcome.add(btnWelcome_Login);
		// END WELCOME BUTTON
		
		JLabel lblID_login = new JLabel("Enter ID");
		lblID_login.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblID_login.setBounds(10, 11, 55, 14);
		tsLogin.add(lblID_login);
		
		edtID_login = new JTextField();
		edtID_login.setText("0006142555084");
		edtID_login.setBounds(10, 36, 120, 20);
		tsLogin.add(edtID_login);
		edtID_login.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 67, 86, 14);
		tsLogin.add(lblNewLabel);
		
		JButton btnLogin_login = new JButton("Log in");
		btnLogin_login.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLogin_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				tbMenu.setSelectedIndex(3);
			}
		});
		btnLogin_login.setBounds(10, 145, 120, 28);
		tsLogin.add(btnLogin_login);
		
		pwfLogin_Password = new JPasswordField();
		pwfLogin_Password.setBounds(10, 92, 120, 20);
		tsLogin.add(pwfLogin_Password);
		
		JPanel tsCreate = new JPanel();
		tbMenu.addTab("Account Creation", null, tsCreate, null);
		tsCreate.setLayout(null);
		
		JLabel lblCreate_FirstName = new JLabel("First Name");
		lblCreate_FirstName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCreate_FirstName.setBounds(10, 11, 64, 14);
		tsCreate.add(lblCreate_FirstName);
		
		edtCreate_FirstName = new JTextField();
		edtCreate_FirstName.setBounds(10, 36, 120, 20);
		tsCreate.add(edtCreate_FirstName);
		edtCreate_FirstName.setColumns(10);
		
		JLabel lblCreate_Surname = new JLabel("Surname");
		lblCreate_Surname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCreate_Surname.setBounds(10, 67, 64, 14);
		tsCreate.add(lblCreate_Surname);
		
		edtCreate_Surname = new JTextField();
		edtCreate_Surname.setBounds(10, 92, 120, 20);
		tsCreate.add(edtCreate_Surname);
		edtCreate_Surname.setColumns(10);
		
		JLabel lblCreate_ID = new JLabel("Enter ID number");
		lblCreate_ID.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCreate_ID.setBounds(176, 11, 101, 14);
		tsCreate.add(lblCreate_ID);
		
		edtCreate_ID = new JTextField();
		edtCreate_ID.setBounds(176, 36, 120, 20);
		tsCreate.add(edtCreate_ID);
		edtCreate_ID.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				tbMenu.setSelectedIndex(3);
			}
		});
		btnNewButton.setBounds(10, 194, 120, 28);
		tsCreate.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Create password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(176, 67, 104, 14);
		tsCreate.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(176, 92, 120, 20);
		tsCreate.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(176, 123, 101, 14);
		tsCreate.add(lblNewLabel_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(176, 148, 120, 20);
		tsCreate.add(passwordField_1);
		
		JPanel tsClientPage = new JPanel();
		tbMenu.addTab("Client Account", null, tsClientPage, null);
		tsClientPage.setLayout(null);
		
		JTextArea txtClient_Output = new JTextArea();
		txtClient_Output.setWrapStyleWord(true);
		txtClient_Output.setLineWrap(true);
		txtClient_Output.setText("Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test ");
		txtClient_Output.setBounds(234, 11, 185, 177);
		tsClientPage.add(txtClient_Output);
		
		JButton btnClient_AccInfo = new JButton("Account Information");
		btnClient_AccInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClient_AccInfo.setBounds(10, 199, 200, 23);
		tsClientPage.add(btnClient_AccInfo);
		
		JButton btnClient_Deposit = new JButton("Deposit");
		btnClient_Deposit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClient_Deposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClient_Deposit.setBounds(10, 165, 89, 23);
		tsClientPage.add(btnClient_Deposit);
		
		edtClient_Withdraw = new JTextField();
		edtClient_Withdraw.setBounds(121, 136, 89, 20);
		tsClientPage.add(edtClient_Withdraw);
		edtClient_Withdraw.setColumns(10);
		
		edtClient_Deposit = new JTextField();
		edtClient_Deposit.setBounds(10, 136, 89, 20);
		tsClientPage.add(edtClient_Deposit);
		edtClient_Deposit.setColumns(10);
		
		JButton btnClient_Withdraw = new JButton("Withdraw");
		btnClient_Withdraw.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClient_Withdraw.setBounds(121, 165, 89, 23);
		tsClientPage.add(btnClient_Withdraw);
		
		JLabel lblLine1 = new JLabel("_____________________________");
		lblLine1.setBounds(10, 115, 214, 14);
		tsClientPage.add(lblLine1);
		
		JButton btnClient_Menu = new JButton("Go to welcome");
		btnClient_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				tbMenu.setSelectedIndex(0);
			}
		});
		btnClient_Menu.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClient_Menu.setBounds(234, 199, 115, 23);
		tsClientPage.add(btnClient_Menu);
		
		JButton btnClient_Exit = new JButton("Exit");
		btnClient_Exit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClient_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Exit button
				System.exit(0);
				
			}
		});
		btnClient_Exit.setBounds(353, 199, 66, 23);
		tsClientPage.add(btnClient_Exit);
		
		JButton btnClient_Invest = new JButton("Invest!");
		btnClient_Invest.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnClient_Invest.setBounds(10, 0, 89, 23);
		tsClientPage.add(btnClient_Invest);
		
		JPanel tsInvesting = new JPanel();
		tbMenu.addTab("Investing", null, tsInvesting, null);
		
		
		{	// Creating code block here to set all tabs to visible = false; user doesnt need to see it
			// Has to be at the end of the program to account for ALL tabs and what not
			int i = 1, MenuCount = tbMenu.getTabCount();
			while (i < MenuCount) { // cannot use tbMenu.getTabCount, it will skip numbers since tbMenu.getTabCount will change as tabs are removed
				tbMenu.remove(1);
				i++;
			}
			tbMenu.setSelectedIndex(0);
		}
		
		
	}
}
