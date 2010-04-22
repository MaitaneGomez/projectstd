package gui;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;



public class VentanaEnvironment extends javax.swing.JFrame {
	private JButton jButtonExit;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaEnvironment inst = new VentanaEnvironment();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VentanaEnvironment() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jButtonExit = new JButton();
				jButtonExit.setText("Exit");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(370, 370)
				.addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(26, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(549, 549)
				.addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(37, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
