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
	private JPanel jPanelOptions;
	private JLabel jLabelText;
	private JTextField jTextFieldChooseSensor;
	private JLabel jLabelDesactivate;
	private JButton jButtonDesactivate;
	private JLabel jLabelSensorDes;
	private JLabel jLabelActivate;
	private JButton jButtonActivate;
	private JLabel jLabelSensorAct;
	private JButton jButtonChooseSensor;
	private JLabel jLabelChooseSensor;
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
				{
					jButtonChooseSensor = new JButton();
					jButtonChooseSensor.setText("Ok");
					jButtonChooseSensor.setFont(new java.awt.Font("Segoe Print",1,14));
					jButtonChooseSensor.setVisible(false);
				}
				{
					jLabelSensorAct = new JLabel();
					jLabelSensorAct.setText("Sensor Activation");
					jLabelSensorAct.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelSensorAct.setVisible(false);
				}
				{
					jButtonActivate = new JButton();
					jButtonActivate.setText("Activate");
					jButtonActivate.setFont(new java.awt.Font("Segoe Print",1,14));
					jButtonActivate.setVisible(false);
				}
				{
					jLabelSensorDes = new JLabel();
					jLabelSensorDes.setText("Sensor desactivation");
					jLabelSensorDes.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelSensorDes.setVisible(false);
				}
				{
					jButtonDesactivate = new JButton();
					jButtonDesactivate.setText("Desactivate");
					jButtonDesactivate.setFont(new java.awt.Font("Segoe Print",1,14));
					jButtonDesactivate.setVisible(false);
				}
				{
					jLabelDesactivate = new JLabel();
					jLabelDesactivate.setText("Do you want to desactivate?");
					jLabelDesactivate.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelDesactivate.setVisible(false);
				}
				{
					jLabelActivate = new JLabel();
					jLabelActivate.setText("Do you want you activate?");
					jLabelActivate.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelActivate.setVisible(false);
				}
				{
					jLabelChooseSensor = new JLabel();
					jLabelChooseSensor.setText("What sensor do you want?");
					jLabelChooseSensor.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelChooseSensor.setVisible(false);
				}
				{
					jTextFieldChooseSensor = new JTextField();
					jTextFieldChooseSensor.setVisible(false);
				}
					jPanelOptionsLayout.setHorizontalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addComponent(jLabelSensorDes, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelActivate, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonChooseSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelListSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jListSensors, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldChooseSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelChooseSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonDesactivate, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelDesactivate, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGap(193)
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelOptionsLayout.createSequentialGroup()
					        .addComponent(jButtonActivate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 117, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelOptionsLayout.createSequentialGroup()
					        .addPreferredGap(jButtonActivate, jLabelSensorAct, LayoutStyle.ComponentPlacement.INDENT)
					        .addComponent(jLabelSensorAct, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap(154, 154));
					jPanelOptionsLayout.setVerticalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addGroup(jPanelOptionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelSensorDes, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelActivate, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonChooseSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelListSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelChooseSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonDesactivate, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelDesactivate, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addComponent(jListSensors, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldChooseSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGap(74)
					.addComponent(jLabelSensorAct, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jButtonActivate, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(115, Short.MAX_VALUE));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanelOptions, 0, 216, Short.MAX_VALUE)
				.addGap(85)
				.addComponent(jPanelStatus, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				    .addComponent(jPanelUp, 0, 422, Short.MAX_VALUE)
				    .addGap(59))
				.addComponent(jPanelOptions, GroupLayout.Alignment.LEADING, 0, 481, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				    .addComponent(jPanelStatus, 0, 422, Short.MAX_VALUE)
				    .addGap(59)));
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
				jPanelOptions.setVisible(false);
				jListSensors.setVisible(false);
				jLabelListSensor.setVisible(false);
				jButtonChooseSensor.setVisible(false);
				jLabelChooseSensor.setVisible(false);
				jTextFieldChooseSensor.setVisible(false);
				jLabelSensorAct.setVisible(false);
				jButtonActivate.setVisible(false);
				jLabelActivate.setVisible(false);
				jLabelSensorDes.setVisible(false);
				jButtonDesactivate.setVisible(false);
				jLabelDesactivate.setVisible(false);
				break;
			}
			case 1:
			{
				jListSensors.setVisible(true);
				jLabelListSensor.setVisible(true);
				jButtonChooseSensor.setVisible(true);
				jLabelChooseSensor.setVisible(true);
				jTextFieldChooseSensor.setVisible(true);
			
				break;
			}
			case 2:
			{
				jLabelSensorAct.setVisible(true);
				jButtonActivate.setVisible(true);
				jLabelActivate.setVisible(true);
				break;
			}
			case 3:
			{
				jLabelSensorDes.setVisible(true);
				jButtonDesactivate.setVisible(true);
				jLabelDesactivate.setVisible(false);
			}
			default: 
			{	jPanelOptions.setVisible(false);
				jListSensors.setVisible(false);
				jLabelListSensor.setVisible(false);
				jButtonChooseSensor.setVisible(false);
				jLabelChooseSensor.setVisible(false);
				jLabelSensorAct.setVisible(false);
				jButtonActivate.setVisible(false);
				jLabelActivate.setVisible(false);
				jLabelSensorDes.setVisible(false);
				jButtonDesactivate.setVisible(false);
				jLabelDesactivate.setVisible(false);
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