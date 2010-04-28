package environment.client;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class loginGUI extends javax.swing.JFrame {
	private JPanel jPanelUp;
	private JPanel jPanelMiddle;
	private JPanel jPanelDown;
	private JLabel jLabelUser;
	private JTextField jTextFieldIP;
	private JLabel jLabelStatus;
	private JButton jButtonLogPass;
	private JButton jButtonNext;
	private JLabel jLabelIp;
	private JLabel jLabelQuest;
	private JButton jButtonLogUser;
	private JTextField jTextFieldPass;
	private JLabel jLabelPass;
	private JTextField jTextFieldUser;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				loginGUI inst = new loginGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public loginGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jPanelUp = new JPanel();
				GroupLayout jPanelUpLayout = new GroupLayout((JComponent)jPanelUp);
				jPanelUp.setLayout(jPanelUpLayout);
				{
					jLabelUser = new JLabel();
					jLabelUser.setText("User :");
					jLabelUser.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jButtonLogPass = new JButton();
					jButtonLogPass.setText("Login Password");
					jButtonLogPass.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jTextFieldUser = new JTextField();
				}
				{
					jLabelPass = new JLabel();
					jLabelPass.setText("Password:");
					jLabelPass.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jTextFieldPass = new JTextField();
				}
				{
					jButtonLogUser = new JButton();
					jButtonLogUser.setText("Login User");
					jButtonLogUser.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				jPanelUpLayout.setHorizontalGroup(jPanelUpLayout.createSequentialGroup()
					.addContainerGap(38, 38)
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addComponent(jLabelPass, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addComponent(jLabelUser, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					        .addGap(41)))
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addComponent(jTextFieldPass, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldUser, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
					.addGap(105)
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addGroup(jPanelUpLayout.createSequentialGroup()
					        .addComponent(jButtonLogUser, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
					    .addGroup(jPanelUpLayout.createSequentialGroup()
					        .addComponent(jButtonLogPass, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(83, Short.MAX_VALUE));
				jPanelUpLayout.setVerticalGroup(jPanelUpLayout.createSequentialGroup()
					.addContainerGap(60, 60)
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					        .addComponent(jButtonLogUser, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					        .addComponent(jTextFieldUser, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addComponent(jLabelUser, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					        .addGap(10)))
					.addGroup(jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonLogPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, 48));
			}
			{
				jPanelMiddle = new JPanel();
				GroupLayout jPanelMiddleLayout = new GroupLayout((JComponent)jPanelMiddle);
				jPanelMiddle.setLayout(jPanelMiddleLayout);
				{
					jLabelQuest = new JLabel();
					jLabelQuest.setText("What vehicle do you want ?");
					jLabelQuest.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jLabelIp = new JLabel();
					jLabelIp.setText("IP :");
					jLabelIp.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jTextFieldIP = new JTextField();
				}
				{
					jButtonNext = new JButton();
					jButtonNext.setText("Next");
					jButtonNext.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				jPanelMiddleLayout.setHorizontalGroup(jPanelMiddleLayout.createSequentialGroup()
					.addContainerGap(72, 72)
					.addComponent(jLabelIp, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(jPanelMiddleLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
					        .addComponent(jTextFieldIP, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
					        .addGap(54))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
					        .addGap(54)
					        .addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(43)
					.addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE));
				jPanelMiddleLayout.setVerticalGroup(jPanelMiddleLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(jPanelMiddleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelIp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldIP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonNext, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, 25));
			}
			{
				jPanelDown = new JPanel();
				{
					jLabelStatus = new JLabel();
					jPanelDown.add(jLabelStatus);
					jLabelStatus.setPreferredSize(new java.awt.Dimension(257, 23));
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelDown, 0, 69, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addComponent(jPanelUp, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE)
				.addComponent(jPanelMiddle, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE)
				.addComponent(jPanelDown, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
