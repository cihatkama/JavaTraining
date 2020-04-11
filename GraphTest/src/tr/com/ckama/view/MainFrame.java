package tr.com.ckama.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainFrame {

	private JFrame frmGraphTestApplication;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmGraphTestApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGraphTestApplication = new JFrame();
		frmGraphTestApplication.setResizable(false);
		frmGraphTestApplication.setTitle("Graph Test Application");
		frmGraphTestApplication.setBounds(100, 100, 450, 300);
		frmGraphTestApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
