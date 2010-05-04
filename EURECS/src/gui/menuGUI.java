package gui;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
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
public class menuGUI extends javax.swing.JFrame {
	private JPanel jPanelUp;
	private JPanel jPanelStatus;
	private JPanel jPanelOptions;
	private JLabel jLabelText;
	private JLabel jLabelListSensor;
	private JList jListSensors;
	private JButton jButtonBack;
	private JComboBox jComboBox;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				menuGUI inst = new menuGUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public menuGUI() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			JTextField tf = new JTextField(20);
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("EURECS Environmental Quality Remote Control System");
			{
				jPanelUp = new JPanel();
				GroupLayout jPanelUpLayout = new GroupLayout((JComponent)jPanelUp);
				jPanelUp.setLayout(jPanelUpLayout);
				{
					jLabelText = new JLabel();
					jLabelText.setText("What do you want to do?");
					jLabelText.setFont(new java.awt.Font("Segoe Script",1,16));
				}
				{
					jButtonBack = new JButton();
					jButtonBack.setText("Back");
					jButtonBack.setEnabled(true);
					
				}
				{
					ComboBoxModel jComboBoxModel = new DefaultComboBoxModel(new String[] {/*"Select one...","List of sensors","Historical mesaurements","Sensor activation","Sensor desactivation","GPS activation","GPS desactivation","Sensor current value","Geolocated picture"*/});
					jComboBox = new JComboBox();
					jComboBox.setModel(jComboBoxModel);
					jComboBox.addItem("cero");
					jComboBox.addItem("uno");
					jComboBox.addItem("dos");
					
					
					int selectedIndex = jComboBox.getSelectedIndex();
			        switch (selectedIndex) {
			           case 1:	jButtonBack.setEnabled(false);
			           				break;
			        }
			
					/*tf.setText(jComboBox.getSelectedItem().toString());
					if (jComboBox.getSelectedItem().toString().equals(("uno")))
					{
								jButtonBack.setVisible(false);
					}
					else if (jComboBox.getSelectedItem().toString().equals(("dos")))
					{
						jButtonBack.setVisible(true);
					}*/

				
					
					/*Object combo = jComboBox.getSelectedItem();
					if (combo.toString().equals("List of sensors"))
					{
						jListSensors.setVisible(true);
						jLabelListSensor.setVisible(true);
					}
					else if (combo.equals("Historical mesaurements"))
					{
						jListSensors.setEnabled(false);
						jLabelListSensor.setEnabled(false);
					}*/
					
					
				}
				jPanelUpLayout.setHorizontalGroup(jPanelUpLayout.createSequentialGroup()
					.addContainerGap(58, 58)
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addComponent(jComboBox, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					        .addGap(30))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addGap(7)
					        .addComponent(jLabelText, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE));
				jPanelUpLayout.setVerticalGroup(jPanelUpLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelText, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jComboBox, GroupLayout.Alignment.BASELINE, 0, 22, Short.MAX_VALUE)
					    .addComponent(jButtonBack, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap());
			}
			{
				jPanelStatus = new JPanel();
				GroupLayout jPanelStatusLayout = new GroupLayout((JComponent)jPanelStatus);
				jPanelStatus.setLayout(jPanelStatusLayout);
				jPanelStatusLayout.setVerticalGroup(jPanelStatusLayout.createParallelGroup());
				jPanelStatusLayout.setHorizontalGroup(jPanelStatusLayout.createParallelGroup());
			}
			{
				jPanelOptions = new JPanel();
				GroupLayout jPanelOptionsLayout = new GroupLayout((JComponent)jPanelOptions);
				jPanelOptions.setLayout(jPanelOptionsLayout);
				{
					ListModel jListSensorsModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jListSensors = new JList();
					jListSensors.setModel(jListSensorsModel);
					jListSensors.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
					jListSensors.setVisible(false);
					
				}
				{
					jLabelListSensor = new JLabel();
					jLabelListSensor.setText("List of Sensors");
					jLabelListSensor.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelListSensor.setVisible(false);
				}
				jPanelOptionsLayout.setHorizontalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addContainerGap(56, 56)
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelOptionsLayout.createSequentialGroup()
					        .addComponent(jLabelListSensor, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 132, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelOptionsLayout.createSequentialGroup()
					        .addGap(61)
					        .addComponent(jListSensors, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap(118, 118));
				jPanelOptionsLayout.setVerticalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelListSensor, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(jListSensors, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelOptions, 0, 153, Short.MAX_VALUE)
				.addComponent(jPanelStatus, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addComponent(jPanelUp, GroupLayout.Alignment.LEADING, 0, 422, Short.MAX_VALUE)
				.addComponent(jPanelStatus, GroupLayout.Alignment.LEADING, 0, 422, Short.MAX_VALUE)
				.addComponent(jPanelOptions, GroupLayout.Alignment.LEADING, 0, 422, Short.MAX_VALUE));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
