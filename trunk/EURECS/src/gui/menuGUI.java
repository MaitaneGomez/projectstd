package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.Vector;

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
public class menuGUI extends javax.swing.JFrame  implements ActionListener{
	private JPanel jPanelUp;
	private JPanel jPanelStatus;
	private JPanel jPanelOptions;
	private JLabel jLabelText;
	private JTextField jTextFieldChooseSensor;
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
					jListSensors.setVisible(true);
					
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
					jLabelChooseSensor = new JLabel();
					jLabelChooseSensor.setText("What sensor do you want?");
					jLabelChooseSensor.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelChooseSensor.setVisible(false);
				}
				{
					jTextFieldChooseSensor = new JTextField();
				}
				jPanelOptionsLayout.setHorizontalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addComponent(jListSensors, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelListSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addComponent(jLabelChooseSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelOptionsLayout.createSequentialGroup()
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jTextFieldChooseSensor, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					        .addGap(84)))
					.addGap(73)
					.addComponent(jButtonChooseSensor, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE));
				jPanelOptionsLayout.setVerticalGroup(jPanelOptionsLayout.createSequentialGroup()
					.addGroup(jPanelOptionsLayout.createParallelGroup()
					    .addComponent(jListSensors, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabelListSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(jLabelChooseSensor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(jPanelOptionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextFieldChooseSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonChooseSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(74, 74));
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JComboBox c= (JComboBox)e.getSource();
		switch (c.getSelectedIndex())
		{
			case 0:jPanelOptions.setVisible(false);
			break;
			case 1:
			{
				jListSensors.setVisible(true);
				jLabelListSensor.setVisible(true);
				jButtonChooseSensor.setVisible(true);
				jLabelChooseSensor.setVisible(true);
			
				break;
			}
			default: 
			{
				jListSensors.setVisible(false);
				jLabelListSensor.setVisible(false);
				jButtonChooseSensor.setVisible(false);
				jLabelChooseSensor.setVisible(false);
			}
			
			
	/** ACCIONES DE LOS BOTONES DE LOS CLIENTES **/
			
	
			
			public boolean Exit()
			{
				String resp = null;
				boolean result = false;
				try
				{
					sm.Escriir("Exit\r\n");
					resp = sm.leer();
					System.out.println(resp);
					
					if (resp.starWith("208"))
					{
					
						sm.cerrarStreams();
						sm.cerrarSockets();
						result = true;
					}
				}
				catch(IOException e) 
				{
					System.err.println(e);
				}
				return result;
				
			}
			
		}
			
	}
		
	}


