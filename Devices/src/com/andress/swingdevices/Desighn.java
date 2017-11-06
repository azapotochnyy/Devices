package com.andress.swingdevices;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import com.andress.allclasses.CDplayer;
import com.andress.allclasses.Computers;
import com.andress.allclasses.ELT;
import com.andress.allclasses.Logo;
import com.andress.allclasses.Plazma;
import com.andress.allclasses.Servers;
import com.andress.allclasses.TV;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

/**
 * Created by A.Zapotochnyy on 06.11.2017.
 */

public class Desighn extends JFrame {

	private static final long serialVersionUID = -3855945871140196958L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desighn frame = new Desighn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Desighn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 529);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		DefaultListModel Devices = new DefaultListModel();

		Computers vk2 = new Computers("a", 10000, 11000);
		Computers vk3 = new Computers("a", 2000, 11000);
		Servers serv = new Servers("Apple", 2000, 1223, 2356);
		Plazma plaz = new Plazma("Toshiba", 2500, 4356, 1700);
		ELT elt = new ELT("Electron", 2700, 1666, 1984);
		CDplayer CD = new CDplayer("lenovoplayer", 1543, null);
		vk2.setnameCompany(Logo.KONIA);
		Devices.addElement(vk2);
		Devices.addElement(vk3);
		Devices.addElement(serv);
		Devices.addElement(plaz);
		Devices.addElement(elt);
		Devices.addElement(CD);

		JList list = new JList(Devices);
		list.setBounds(12, 38, 980, 325);

		contentPane.setLayout(null);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		contentPane.add(list);

		JButton btnNewButton = new JButton("Add new Device");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AddNewDivice AddNew = new AddNewDivice(Devices);
				AddNew.setVisible(true);
			}
		});
		btnNewButton.setBounds(59, 376, 180, 67);
		contentPane.add(btnNewButton);

		JLabel namepower = new JLabel();
		namepower.setBounds(301, 376, 477, 33);
		contentPane.add(namepower);

		JButton btnNewButton_1 = new JButton("Edit Device");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object a = list.getSelectedValue();
				if (a instanceof Computers) {
					Computers z = (Computers) a;
					EditDevice EditNew = new EditDevice(z);
					EditNew.setVisible(true);
				}
				if (a instanceof TV) {
					TV n = (TV) a;
					namepower.setText("device name = " + n.name + " " + "Device power =  " + n.power);
				}
				if (a instanceof CDplayer) {
					CDplayer n = (CDplayer) a;
					namepower.setText("device name = " + n.name + "  " + "Device power =  " + n.power);
				}
			}
		});
		btnNewButton_1.setBounds(816, 376, 143, 67);
		contentPane.add(btnNewButton_1);
	}
}
