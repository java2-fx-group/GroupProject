import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Choice;
import java.awt.Panel;

public class Car_Loan {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Car_Loan window = new Car_Loan();
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
	public Car_Loan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblCarPaymentCalculator = new JLabel("Car payment calculator ");
		lblCarPaymentCalculator.setFont(new Font("Tahoma", Font.BOLD, 25));

		JLabel lblWhatsYourCredit = new JLabel("What's your credit score?");
		lblWhatsYourCredit.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWhatsYourCredit.setHorizontalAlignment(SwingConstants.LEFT);
		lblWhatsYourCredit.setVerticalAlignment(SwingConstants.TOP);

		JList<String> list = new JList<String>();
		{
			String[] items = { "A", "B", "C", "D" };

		}

		JTextPane txtpnBasedOnYour = new JTextPane();
		txtpnBasedOnYour.setText(
				"Based on your score, the average rate is 13.95% (new) \r\nor 19.38% (used). Consider buying an inexpensive \r\nused car and refinancing in 6-12 months.");

		JLabel lblCarPrice = new JLabel("Car price $");
		lblCarPrice.setFont(new Font("Tahoma", Font.BOLD, 11));

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblAfterNegotiations = new JLabel("After negotiations");
		lblAfterNegotiations.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAfterNegotiations.setForeground(Color.LIGHT_GRAY);

		JLabel lblTradeinDown = new JLabel("Trade-in / down payment ($)");
		lblTradeinDown.setFont(new Font("Tahoma", Font.BOLD, 11));

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel lblYourTradeinCan = new JLabel("Your trade-in can be all or part of a down payment");
		lblYourTradeinCan.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblYourTradeinCan.setForeground(Color.LIGHT_GRAY);

		JTextPane txtpnNerdwalletRecommendsPutting = new JTextPane();
		txtpnNerdwalletRecommendsPutting.setText(
				"NerdWallet recommends putting at least 20% down, \r\nin any combination of trade-in and payment. ");

		JLabel lblInterestRate = new JLabel("Interest rate (%)");
		lblInterestRate.setFont(new Font("Tahoma", Font.BOLD, 11));

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel lblAHigherCredit = new JLabel("A higher credit score means lower interest rates ");
		lblAHigherCredit.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblAHigherCredit.setForeground(Color.LIGHT_GRAY);

		JLabel lblNumberOfMonths = new JLabel("Number of months");
		lblNumberOfMonths.setFont(new Font("Tahoma", Font.BOLD, 11));

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JLabel lblSuggestedMax = new JLabel("Suggested max: 36 months for used cars, 60 for new ");
		lblSuggestedMax.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblSuggestedMax.setForeground(Color.LIGHT_GRAY);

		JLabel lblPaymentDetails = new JLabel("Payment details");
		lblPaymentDetails.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblMonthlyPayment = new JLabel("Monthly payment");
		lblMonthlyPayment.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblbeforeTaxes = new JLabel("(Before taxes & fees)");
		lblbeforeTaxes.setForeground(Color.LIGHT_GRAY);
		lblbeforeTaxes.setFont(new Font("Tahoma", Font.PLAIN, 8));

		JLabel lblTotalAmountPaid = new JLabel("Total amount paid");
		lblTotalAmountPaid.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lbloverTheLife = new JLabel("(Over the life of the loan)");
		lbloverTheLife.setForeground(Color.LIGHT_GRAY);
		lbloverTheLife.setFont(new Font("Tahoma", Font.PLAIN, 8));

		JLabel lblTotalInterestPaid = new JLabel("Total interest paid ");
		lblTotalInterestPaid.setFont(new Font("Tahoma", Font.BOLD, 11));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBackground(new Color(192, 192, 192));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblCarPrice, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTradeinDown, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblYourTradeinCan, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblInterestRate, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblAHigherCredit, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNumberOfMonths, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(lblSuggestedMax, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblWhatsYourCredit))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(57)
									.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(txtpnBasedOnYour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 361, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblAfterNegotiations, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lbloverTheLife, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTotalAmountPaid, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblbeforeTaxes, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblTotalInterestPaid, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblMonthlyPayment, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
								.addComponent(lblPaymentDetails)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCarPaymentCalculator))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnNerdwalletRecommendsPutting, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 615, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCarPaymentCalculator)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblWhatsYourCredit))
						.addComponent(lblPaymentDetails))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblMonthlyPayment)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnBasedOnYour, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(14)
							.addComponent(lblbeforeTaxes)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTotalAmountPaid)))
					.addGap(1)
					.addComponent(lblCarPrice)
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblAfterNegotiations)
							.addGap(11)
							.addComponent(lblTradeinDown)
							.addGap(11)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(lblYourTradeinCan)
							.addGap(18)
							.addComponent(txtpnNerdwalletRecommendsPutting, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblInterestRate)
							.addGap(6)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(lblAHigherCredit)
							.addGap(11)
							.addComponent(lblNumberOfMonths)
							.addGap(6)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lbloverTheLife)
							.addGap(18)
							.addComponent(lblTotalInterestPaid)))
					.addGap(6)
					.addComponent(lblSuggestedMax))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
