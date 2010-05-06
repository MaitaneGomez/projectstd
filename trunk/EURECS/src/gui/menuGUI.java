package gui;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.Vector;


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
public class menuGUI extends javax.swing.JFrame  implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jPanelUp;
	private JPanel jPanelStatus;
	private JLabel jLabelText;
	private JButton jButton1;
	private JLabel jLabelChooseSensor;
	private JLabel jLabelSensorAct;
	private JPanel jPanelSensorAct;
	private JList jListSensors;
	private JLabel jLabelList;
	private JPanel jPanelList;
	//private JTextField jTextFieldChooseSensor;
	//private JLabel jLabelDesactivate;
	//private JButton jButtonDesactivate;
	//private JLabel jLabelSensorDes;
	//private JLabel jLabelActivate;
	//private JButton jButtonActivate;
	//private JLabel jLabelSensorAct;
	//private JButton jButtonChooseSensor;
	//private JLabel jLabelChooseSensor;
	//private JLabel jLabelListSensor;
	//private JList jListSensors;
	private JButton jButtonBack;
	private JButton jButtonSensorAct;
	private JPanel jPanelSensorDesc;
	private JLabel jLabelChooseDSensor;
	private JComboBox jComboBoxSensorDes;
	private JButton jButtonSensorDes;
	private JLabel jLabelSensorDes;
	private JComboBox jComboBoxSensors;
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
					jButtonBack.addActionListener(this);
					
				}
				{
					

					ComboBoxModel jComboBoxModel = new DefaultComboBoxModel(new String[] {/*"Select one...","List of sensors","Historical mesaurements","Sensor activation","Sensor desactivation","GPS activation","GPS desactivation","Sensor current value","Geolocated picture"*/});
					jComboBox = new JComboBox();
					jComboBox.setModel(jComboBoxModel);

					jComboBox.addItem("Select one...");
					jComboBox.addItem("List of sensors");
					jComboBox.addItem("Sensor activation");
					jComboBox.addItem("Sensor desactivation");
					jComboBox.addItem("GPS activation");
					jComboBox.addItem("GPS desactivation");
					jComboBox.addItem("Sensor current value");
					jComboBox.addItem("Geolocated picture");
					
					jComboBox.addActionListener(this);
				
					
					
				/*int selectedIndex = jComboBox.getSelectedIndex();
			        switch (selectedIndex) {
			           case 2:	jButtonBack.setEnabled(false);
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
					.addContainerGap(57, 57)
					.addGroup(jPanelUpLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addComponent(jComboBox, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
					        .addGap(30))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
					        .addGap(7)
					        .addComponent(jLabelText, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(36)
					.addComponent(jButtonBack, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE));
				jPanelUpLayout.setVerticalGroup(jPanelUpLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelText, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addGroup(jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jComboBox, GroupLayout.Alignment.BASELINE, 0, 22, Short.MAX_VALUE)
					    .addComponent(jButtonBack, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap());
			}
			{
				jPanelSensorAct = new JPanel();
				GroupLayout jPanelSensorActLayout = new GroupLayout((JComponent)jPanelSensorAct);
				jPanelSensorAct.setLayout(jPanelSensorActLayout);
				jPanelSensorAct.setVisible(false);
				{
					jLabelSensorAct = new JLabel();
					jLabelSensorAct.setText("Do you want you activate the sensor?");
					jLabelSensorAct.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					jLabelChooseSensor = new JLabel();
					jLabelChooseSensor.setText("Choose a sensor");
					jLabelChooseSensor.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					jButtonSensorAct = new JButton();
					jButtonSensorAct.setText("OK");
					jButtonSensorAct.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					ComboBoxModel jComboBoxSensorsModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jComboBoxSensors = new JComboBox();
					jComboBoxSensors.setModel(jComboBoxSensorsModel);
					jComboBoxSensors.setFont(new java.awt.Font("Segoe Print",1,12));
				}
					jPanelSensorActLayout.setHorizontalGroup(jPanelSensorActLayout.createSequentialGroup()
					.addContainerGap(21, 21)
					.addGroup(jPanelSensorActLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelSensorActLayout.createSequentialGroup()
					        .addComponent(jLabelChooseSensor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(61)
					        .addComponent(jComboBoxSensors, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					        .addGap(61)
					        .addComponent(jButtonSensorAct, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelSensorActLayout.createSequentialGroup()
					        .addGap(102)
					        .addComponent(jLabelSensorAct, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 26, Short.MAX_VALUE)))
					.addContainerGap(38, 38));
					jPanelSensorActLayout.setVerticalGroup(jPanelSensorActLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelSensorAct, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(jPanelSensorActLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelChooseSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonSensorAct, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jComboBoxSensors, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, 36));
			}
			{
				jPanelSensorDesc = new JPanel();
				GroupLayout jPanelSensorDescLayout = new GroupLayout((JComponent)jPanelSensorDesc);
				jPanelSensorDesc.setLayout(jPanelSensorDescLayout);
				jPanelSensorDesc.setVisible(false);
				{
					jLabelSensorDes = new JLabel();
					jLabelSensorDes.setText("Do you want to desactivate the sensor?");
					jLabelSensorDes.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					jButtonSensorDes = new JButton();
					jButtonSensorDes.setText("OK");
					jButtonSensorDes.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					ComboBoxModel jComboBoxSensorDesModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jComboBoxSensorDes = new JComboBox();
					jComboBoxSensorDes.setModel(jComboBoxSensorDesModel);
					jComboBoxSensorDes.setFont(new java.awt.Font("Segoe Print",1,12));
				}
				{
					jLabelChooseDSensor = new JLabel();
					GroupLayout jLabelChooseDSensorLayout = new GroupLayout((JComponent)jLabelChooseDSensor);
					jLabelChooseDSensor.setLayout(jLabelChooseDSensorLayout);
					jLabelChooseDSensor.setText("Choose a sensor:");
					jLabelChooseDSensor.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelChooseDSensorLayout.setVerticalGroup(jLabelChooseDSensorLayout.createParallelGroup());
					jLabelChooseDSensorLayout.setHorizontalGroup(jLabelChooseDSensorLayout.createParallelGroup());
				}
					jPanelSensorDescLayout.setHorizontalGroup(jPanelSensorDescLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanelSensorDescLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelSensorDescLayout.createSequentialGroup()
					        .addComponent(jLabelChooseDSensor, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					        .addComponent(jComboBoxSensorDes, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					        .addGap(55))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelSensorDescLayout.createSequentialGroup()
					        .addGap(77)
					        .addComponent(jLabelSensorDes, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addComponent(jButtonSensorDes, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE));
					jPanelSensorDescLayout.setVerticalGroup(jPanelSensorDescLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelSensorDes, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(jPanelSensorDescLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelChooseDSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonSensorDes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jComboBoxSensorDes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(30, 30));
			}
			{
				jPanelStatus = new JPanel();
				GroupLayout jPanelStatusLayout = new GroupLayout((JComponent)jPanelStatus);
				jPanelStatus.setLayout(jPanelStatusLayout);
				jPanelStatusLayout.setVerticalGroup(jPanelStatusLayout.createParallelGroup());
				jPanelStatusLayout.setHorizontalGroup(jPanelStatusLayout.createParallelGroup());
			}
			{
				jPanelList = new JPanel();
				GroupLayout jPanelListLayout = new GroupLayout((JComponent)jPanelList);
				jPanelList.setLayout(jPanelListLayout);
				jPanelList.setVisible(false);
				{
					jLabelList = new JLabel();
					jLabelList.setText("List of sensors");
					jLabelList.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					ListModel jListSensorsModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jListSensors = new JList();
					jListSensors.setModel(jListSensorsModel);
				}
				{
					jButton1 = new JButton();
					jButton1.setText("Back");
					jButton1.setFont(new java.awt.Font("Segoe Print",1,14));
				}
					jPanelListLayout.setHorizontalGroup(jPanelListLayout.createSequentialGroup()
					.addContainerGap(62, 62)
					.addGroup(jPanelListLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListLayout.createSequentialGroup()
					        .addComponent(jListSensors, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					        .addGap(73))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListLayout.createSequentialGroup()
					        .addGap(103)
					        .addComponent(jLabelList, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
					.addGap(40)
					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(34, Short.MAX_VALUE));
					jPanelListLayout.setVerticalGroup(jPanelListLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelList, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addGroup(jPanelListLayout.createParallelGroup()
					    .addGroup(jPanelListLayout.createSequentialGroup()
					        .addComponent(jListSensors, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListLayout.createSequentialGroup()
					        .addGap(35)
					        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 46, Short.MAX_VALUE)))
					.addContainerGap(24, 24));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jPanelList, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
				    .addComponent(jPanelSensorAct, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addGap(20)
				.addComponent(jPanelSensorDesc, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanelStatus, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(thisLayout.createSequentialGroup()
				    .addGroup(thisLayout.createParallelGroup()
				        .addComponent(jPanelList, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
				        .addComponent(jPanelSensorAct, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
				    .addGroup(thisLayout.createParallelGroup()
				        .addComponent(jPanelUp, GroupLayout.Alignment.LEADING, 0, 420, Short.MAX_VALUE)
				        .addComponent(jPanelStatus, GroupLayout.Alignment.LEADING, 0, 420, Short.MAX_VALUE))
				    .addContainerGap(64, 64))
				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				    .addPreferredGap(jPanelUp, jPanelSensorDesc, LayoutStyle.ComponentPlacement.INDENT)
				    .addComponent(jPanelSensorDesc, 0, 460, Short.MAX_VALUE)
				    .addContainerGap()));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
			
		/** ACCIONES DEl COMBO **/
		
		JComboBox c = (JComboBox)e.getSource();
		switch (c.getSelectedIndex())
		{
			case 0:
			{
				jPanelList.setVisible(false);
				jPanelSensorAct.setVisible(false);
				jPanelSensorDesc.setVisible(false);
			
				break;
			}
			case 1:
			{
				jPanelList.setVisible(true);
			
				break;
			}
			case 2:
			{
				jPanelSensorAct.setVisible(true);
				break;
			}
			case 3:
			{
				jPanelSensorDesc.setVisible(true);
			}
			default: 
			{	//jPanelOptions.setVisible(false);
			
				break;
			}
		}
		

		
		
	/*	JButton button= (JButton)e.getSource();
		
		if(button == jButtonBack)
		{
			VentanaEnvironment ventana= new VentanaEnvironment();
			ventana.setVisible(true);  
			this.dispose();
			
		}*/
		
	}

			
	

}