package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import java.awt.Scrollbar;


public class Principal {

	private JFrame frmAulaDeGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmAulaDeGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAulaDeGit = new JFrame();
		frmAulaDeGit.setTitle("Aula de Git");
		frmAulaDeGit.setBounds(100, 100, 450, 300);
		frmAulaDeGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnClique = new JButton(" Clique!");
		btnClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClique.setForeground(Color.RED);
		frmAulaDeGit.getContentPane().add(btnClique, BorderLayout.CENTER);
		
		JCheckBox chkFeito = new JCheckBox("Feito?");
		frmAulaDeGit.getContentPane().add(chkFeito, BorderLayout.SOUTH);
		
		JSpinner spinner = new JSpinner(); 
		frmAulaDeGit.getContentPane().add(spinner, BorderLayout.NORTH);
		
		Scrollbar scrollbar = new Scrollbar();
		frmAulaDeGit.getContentPane().add(scrollbar, BorderLayout.EAST);
	}

}
