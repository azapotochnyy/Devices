package com.andress.swingdevices;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.andress.allclasses.Computers;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class AddNewDivice extends JFrame {

	private static final long serialVersionUID = 606270160519485247L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddNewDivice(DefaultListModel<Computers> Devices) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(156, 163, 264, 25);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setBounds(156, 36, 264, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(156, 77, 264, 22);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(156, 112, 264, 25);
		contentPane.add(textField_2);

		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(279, 13, 62, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Computer ID");
		lblNewLabel_1.setBounds(12, 13, 114, 16);
		contentPane.add(lblNewLabel_1);

		JLabel label = new JLabel("Computer Name");
		label.setBounds(12, 39, 114, 16);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Computer Power");
		label_1.setBounds(12, 80, 114, 16);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("Computer Ram");
		label_2.setBounds(12, 116, 114, 16);
		contentPane.add(label_2);

		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String c = textField.getText();
				Integer a = Integer.parseInt(textField_1.getText());
				Integer b = Integer.parseInt(textField_2.getText());
				Computers comp = new Computers(c, a, b);
				Devices.addElement(comp);
				dispose();
			}
		});
		btnNewButton.setBounds(12, 163, 133, 25);
		contentPane.add(btnNewButton);
	}
}
