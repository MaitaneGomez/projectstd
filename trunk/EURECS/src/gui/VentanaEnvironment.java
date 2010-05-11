package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import javax.swing.BorderFactory;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import environment.util.SocketManager;


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
public class VentanaEnvironment extends javax.swing.JFrame implements  ActionListener
{

	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelUp;
	private JPanel jPanelMiddle;
	private JLabel jLabelUser;
	private JTextField jTextFieldIP;
	private JLabel jLabelHistory;
	private JButton jButtonExit;
	private JButton jButtonOKc;
	private JTextField jTextFieldCurvalue;
	private JTextField jTextFieldChooseSC;
	private JLabel jLabelChooseSC;
	private JLabel jLabelCurvalue;
	private JPanel jPanelCurvalue;
	private JButton jButtonOFF;
	private JButton jButtonON;
	private JTextField jTextFieldChooseS;
	private JLabel jLabelChooseC;
	private JLabel jLabelChangeG;
	private JLabel jLabelChangeS;
	private JPanel jPanelChange;
	private JButton jButtonOKh;
	private JTextField jTextFieldChoose;
	private JLabel jLabelChoose;
	private JTable jTableSensor;
	private JLabel jLabelListSensor;
	private JPanel jPanelListSensor;
	private JLabel statusBar;
	private JButton jButtonOK;
	private JComboBox jComboBoxMenu;
	private JLabel jLabelMenu;
	private JPanel jPanelMenu;
	private JButton jButtonLogPass;
	private JButton jButtonNext;
	private JLabel jLabelIp;
	private JLabel jLabelQuest;
	private JButton jButtonLogUser;
	private JTextField jTextFieldPass;
	private JLabel jLabelPass;
	private JTextField jTextFieldUser;
	private static SocketManager sm;
	private String change = "nada";
	private JLabel jLabelFondo;
	private JPanel backPanel;


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try 
				{
                    Socket serverSocket = new Socket("127.0.0.1", 3000);
                    System.out.println(serverSocket.toString());
                    sm = new SocketManager(serverSocket);
				} 
				catch (IOException e) 
				{
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    System.out.println("Exception del socket");
                    
            }
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
	
	private void initGUI() 
	{
		try 
		{
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);

			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Environmental Quality Remote Control System");
			{
				backPanel = new JPanel();
                backPanel.setLayout(null);
                backPanel.setBounds(0, 0, 740, 606);
                getContentPane().add(backPanel);
                {
                        jLabelFondo = new JLabel();
                        backPanel.add(jLabelFondo);
                        jLabelFondo.setText(" ");
                        jLabelFondo.setIcon(new ImageIcon("image/back.png"));
                        jLabelFondo.setBounds(0, 0, 740, 606);
                        {
							
                            {    
                            jPanelUp = new JPanel();
                    		jPanelUp.setOpaque(false);
                    		jLabelFondo.add(jPanelUp);
                    		GroupLayout jPanelUpLayout = new GroupLayout((JComponent)jPanelUp);
                    		jPanelUp.setLayout(jPanelUpLayout);
                    		{
                    			jLabelUser = new JLabel();
                    			jLabelUser.setText("User :");
                    			jPanelUp.add(jLabelUser);
                    			jLabelUser.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jLabelUser.setEnabled(true);
                    			jLabelUser.setVisible(true);
                    			jLabelUser.setOpaque(false);
                    			jLabelUser.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                    		}
                    		{
                    			jButtonLogPass = new JButton();
                    			jButtonLogPass.setText("Login Password");
                    			jButtonLogPass.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jButtonLogPass.addActionListener(this);
                    			jButtonLogPass.setVisible(false);
                    			jButtonLogPass.setOpaque(true);
                    		}
                    		{
                    			jTextFieldUser = new JTextField("stud1");
                    			jTextFieldUser.setVisible(true);
                    			jTextFieldUser.setOpaque(true);
                    		}
                    		{
                    			jLabelPass = new JLabel();
                    			jLabelPass.setText("Password:");
                    			jLabelPass.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jLabelPass.setVisible(false);
                    			jLabelPass.setOpaque(true);
                    		}
                    		{
                    			jTextFieldPass = new JTextField("11");
                    			jTextFieldPass.setVisible(false);
                    		}
                    		{
                    			jButtonLogUser = new JButton();
                    			jButtonLogUser.setText("Login User");
                    			jButtonLogUser.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jButtonLogUser.addActionListener(this);
                    		}
								jPanelUpLayout.setHorizontalGroup(jPanelUpLayout.createSequentialGroup()
                    					.addContainerGap(24, 24)
                    					.addGroup(jPanelUpLayout.createParallelGroup()
                    					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
                    					        .addComponent(jLabelUser, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(35))
                    					    .addComponent(jLabelPass, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                    					.addGroup(jPanelUpLayout.createParallelGroup()
                    					    .addComponent(jTextFieldPass, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jTextFieldUser, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))
                    					.addGap(28)
                    					.addGroup(jPanelUpLayout.createParallelGroup()
                    					    .addGroup(GroupLayout.Alignment.LEADING, jPanelUpLayout.createSequentialGroup()
                    					        .addComponent(jButtonLogUser, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(0, 24, Short.MAX_VALUE))
                    					    .addGroup(jPanelUpLayout.createSequentialGroup()
                    					        .addComponent(jButtonLogPass, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(0, 0, Short.MAX_VALUE)))
                    					.addContainerGap(17, 17));
                    				jPanelUpLayout.setVerticalGroup(jPanelUpLayout.createSequentialGroup()
                    					.addContainerGap(33, 33)
                    					.addGroup(jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    					    .addComponent(jButtonLogUser, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jTextFieldUser, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jLabelUser, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                    					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    					.addGroup(jPanelUpLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    					    .addComponent(jButtonLogPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jTextFieldPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jLabelPass, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
                    					.addContainerGap(31, 31));
							}
							{
                    			    			
                    		jPanelMiddle = new JPanel();
                    		jPanelMiddle.setOpaque(false);
                    		GroupLayout jPanelMiddleLayout = new GroupLayout((JComponent)jPanelMiddle);
                    		jLabelFondo.add(jPanelMiddle);
                    		jPanelMiddle.setLayout(jPanelMiddleLayout);
                    		{
                    			jLabelQuest = new JLabel();
                    			jLabelQuest.setText("What vehicle do you want ?");
                    			jLabelQuest.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jLabelQuest.setEnabled(false);
                    		}
                    		{
                    			jLabelIp = new JLabel();
                    			jLabelIp.setText("IP :");
                    			jLabelIp.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jLabelIp.setEnabled(false);
                    		}
                    		{
                    			jTextFieldIP = new JTextField("128.7.6.5");
                    			jTextFieldIP.setEnabled(false);
                    		}
                    		{
                    			jButtonNext = new JButton();
                    			jButtonNext.setText("Next");
                    			jButtonNext.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jButtonNext.setEnabled(false);
                    			jButtonNext.addActionListener(this);
                    		}
                    		jPanelMiddleLayout.setHorizontalGroup(jPanelMiddleLayout.createSequentialGroup()
                    			.addContainerGap()
                    			.addGroup(jPanelMiddleLayout.createParallelGroup()
                    			    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
                    			        .addComponent(jLabelIp, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                    			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    			        .addComponent(jTextFieldIP, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                    			    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
                    			        .addPreferredGap(jLabelIp, jLabelQuest, LayoutStyle.ComponentPlacement.INDENT)
                    			        .addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    			.addGap(0, 40, Short.MAX_VALUE)
                    			.addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                    			.addContainerGap(19, 19));
                    		jPanelMiddleLayout.setVerticalGroup(jPanelMiddleLayout.createSequentialGroup()
                    			.addContainerGap(17, 17)
                    			.addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    			.addGap(20)
                    			.addGroup(jPanelMiddleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    			    .addComponent(jLabelIp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                    			    .addComponent(jTextFieldIP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    			    .addComponent(jButtonNext, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    			.addContainerGap(34, 34));
							}
                    		{
                    			jPanelMenu = new JPanel();
                    			jPanelMenu.setOpaque(false);
                    			jLabelFondo.add(jPanelMenu);
                    			GroupLayout jPanelMenuLayout = new GroupLayout((JComponent)jPanelMenu);
                    			jPanelMenu.setLayout(jPanelMenuLayout);
                    			jPanelMenu.setFont(new java.awt.Font("Segoe Print",1,14));
                    		{
                    			jLabelMenu = new JLabel();
                    			jLabelMenu.setText("What do you want to do?");
                    			jLabelMenu.setEnabled(false);
                    			jLabelMenu.setFont(new java.awt.Font("Segoe Print",1,14));
                    		}
                    		{
                    			ComboBoxModel jComboBoxMenuModel = 
                    				new DefaultComboBoxModel(
                    						new String[] {});
                    			jComboBoxMenu = new JComboBox();
                    			jComboBoxMenu.setModel(jComboBoxMenuModel);
                    	        jComboBoxMenu.addItem("Select one...");
                    			jComboBoxMenu.addItem("List of sensors");
                    			jComboBoxMenu.addItem("Historical measurement");
                    			jComboBoxMenu.addItem("Sensor activation");
                    			jComboBoxMenu.addItem("Sensor desactivation");
                    			jComboBoxMenu.addItem("GPS activation");
                    			jComboBoxMenu.addItem("GPS desactivation");
                    			jComboBoxMenu.addItem("Sensor current value");
                    			jComboBoxMenu.addItem("Geolocated picture");
                    			jComboBoxMenu.setEnabled(false);
                   				jComboBoxMenu.addActionListener(this);
							}
                    			
                    		{
                    			jButtonOK = new JButton();
                    			jButtonOK.setText("OK");
                    			jButtonOK.setFont(new java.awt.Font("Segoe Print",1,14));
                    			jButtonOK.setEnabled(false);
                    			jButtonOK.addActionListener(this);
                    		}
                    			jPanelMenuLayout.setHorizontalGroup(jPanelMenuLayout.createSequentialGroup()
                    			.addContainerGap(30, 30)
                    			.addGroup(jPanelMenuLayout.createParallelGroup()
                    			    .addGroup(GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
                    			        .addComponent(jComboBoxMenu, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                    			        .addGap(10))
                    			    .addComponent(jLabelMenu, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                    			.addGap(25)
                    			.addComponent(jButtonOK, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                    			.addContainerGap(130, Short.MAX_VALUE));
                    			jPanelMenuLayout.setVerticalGroup(jPanelMenuLayout.createSequentialGroup()
                    			.addContainerGap()
                    			.addComponent(jLabelMenu, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
                    			.addGap(0, 41, Short.MAX_VALUE)
                    			.addGroup(jPanelMenuLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    			    .addComponent(jButtonOK, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                    			    .addComponent(jComboBoxMenu, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
                    			.addContainerGap(51, 51));
                    		}
                    		{
                    			statusBar = new JLabel();
                    		}
                    		{
                    			jPanelCurvalue = new JPanel();
                    			jPanelCurvalue.setOpaque(false);
                    			jLabelFondo.add(jPanelCurvalue);
                    			GroupLayout jPanelCurvalueLayout = new GroupLayout((JComponent)jPanelCurvalue);
                    			jPanelCurvalue.setLayout(jPanelCurvalueLayout);
                    			
                    			{
                    				jLabelCurvalue = new JLabel();
                    				jLabelCurvalue.setText("Sensor current value");
                    				jLabelCurvalue.setFont(new java.awt.Font("Segoe Print",1,14));
                    				jLabelCurvalue.setEnabled(false);
                    			}
                    			{
                    				jLabelChooseSC = new JLabel();
                    				jLabelChooseSC.setText("Choose sensor:");
                    				jLabelChooseSC.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jLabelChooseSC.setEnabled(false);
                    			}
                    			{
                    				jTextFieldChooseSC = new JTextField();
                    				jTextFieldChooseSC.setEnabled(false);
                    			}
                    			{
                    				jTextFieldCurvalue = new JTextField();
                    				jTextFieldCurvalue.setEnabled(false);
                    			}
                    			{
                    				jButtonOKc = new JButton();
                    				jButtonOKc.setText("OK");
                    				jButtonOKc.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jButtonOKc.addActionListener(this);
                    				jButtonOKc.setEnabled(true);
                    			}
                    			jPanelCurvalueLayout.setHorizontalGroup(jPanelCurvalueLayout.createSequentialGroup()
                    				.addContainerGap(23, 23)
                    				.addGroup(jPanelCurvalueLayout.createParallelGroup()
                    				    .addGroup(GroupLayout.Alignment.LEADING, jPanelCurvalueLayout.createSequentialGroup()
                    				        .addComponent(jLabelChooseSC, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    				        .addComponent(jTextFieldChooseSC, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                    				        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    				        .addComponent(jButtonOKc, 0, 54, Short.MAX_VALUE))
                    				    .addGroup(jPanelCurvalueLayout.createSequentialGroup()
                    				        .addGap(20)
                    				        .addGroup(jPanelCurvalueLayout.createParallelGroup()
                    				            .addGroup(jPanelCurvalueLayout.createSequentialGroup()
                    				                .addComponent(jTextFieldCurvalue, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                    				                .addGap(0, 0, Short.MAX_VALUE))
                    				            .addGroup(GroupLayout.Alignment.LEADING, jPanelCurvalueLayout.createSequentialGroup()
                    				                .addPreferredGap(jTextFieldCurvalue, jLabelCurvalue, LayoutStyle.ComponentPlacement.INDENT)
                    				                .addComponent(jLabelCurvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				                .addGap(0, 34, Short.MAX_VALUE)))
                    				        .addGap(48)))
                    				.addContainerGap());
                    			jPanelCurvalueLayout.setVerticalGroup(jPanelCurvalueLayout.createSequentialGroup()
                    				.addContainerGap()
                    				.addComponent(jLabelCurvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    				.addGroup(jPanelCurvalueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    				    .addComponent(jLabelChooseSC, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				    .addComponent(jTextFieldChooseSC, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				    .addComponent(jButtonOKc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
                    				.addGap(0, 18, Short.MAX_VALUE)
                    				.addComponent(jTextFieldCurvalue, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    				.addContainerGap());
							}
                    		{
                    			jPanelChange = new JPanel();
                    			jPanelChange.setOpaque(false);
                    			jLabelFondo.add(jPanelChange);
                    			GroupLayout jPanelChangeLayout = new GroupLayout((JComponent)jPanelChange);
                    			jPanelChange.setLayout(jPanelChangeLayout);
                    			{
                    				jLabelChangeS = new JLabel();
                    				jLabelChangeS.setText("Change of sensor state");
                    				jLabelChangeS.setFont(new java.awt.Font("Segoe Print",1,14));
                    				jLabelChangeS.setVisible(false);
                    			}
                    			{
                    				jLabelChangeG = new JLabel();
                    				jLabelChangeG.setText("Change of GPS state");
                    				jLabelChangeG.setFont(new java.awt.Font("Segoe Print",1,14));
                    				jLabelChangeG.setVisible(false);
                    			}
                    			{
                    				jLabelChooseC = new JLabel();
                    				jLabelChooseC.setText("Choose sensor:");
                    				jLabelChooseC.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jLabelChooseC.setVisible(false);
								}
                    			{
                    				jTextFieldChooseS = new JTextField();
                    				jTextFieldChooseS.setVisible(false);
                    			}
                    			{
                    				jButtonON = new JButton();
                    				jButtonON.setText("ON");
                    				jButtonON.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jButtonON.addActionListener(this);
                    				jButtonON.setEnabled(false);
                    			}
                    			{
                    				jButtonOFF = new JButton();
                    				jButtonOFF.setText("OFF");
                    				jButtonOFF.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jButtonOFF.addActionListener(this);
                    				jButtonOFF.setEnabled(false);
                    			}
                    			jPanelChangeLayout.setHorizontalGroup(jPanelChangeLayout.createSequentialGroup()
                    				.addContainerGap(19, 19)
                    						.addGroup(jPanelChangeLayout.createParallelGroup()
                    						    .addGroup(GroupLayout.Alignment.LEADING, jPanelChangeLayout.createSequentialGroup()
                    						        .addComponent(jLabelChooseC, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                    						        .addGap(0, 49, Short.MAX_VALUE)
                    						        .addComponent(jButtonOFF, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
                    						    .addGroup(jPanelChangeLayout.createSequentialGroup()
                    						        .addGap(29)
                    						        .addGroup(jPanelChangeLayout.createParallelGroup()
                    						            .addGroup(GroupLayout.Alignment.LEADING, jPanelChangeLayout.createSequentialGroup()
                    						                .addComponent(jLabelChangeS, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                    						                .addGap(0, 13, Short.MAX_VALUE))
                    						            .addGroup(GroupLayout.Alignment.LEADING, jPanelChangeLayout.createSequentialGroup()
                    						                .addComponent(jLabelChangeG, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                    						                .addGap(0, 16, Short.MAX_VALUE))
                    						            .addGroup(GroupLayout.Alignment.LEADING, jPanelChangeLayout.createSequentialGroup()
                    						                .addComponent(jButtonON, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                    						                .addGap(22)
                    						                .addComponent(jTextFieldChooseS, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                    						                .addGap(0, 0, Short.MAX_VALUE)))))
                    						.addContainerGap(64, 64));
                    					jPanelChangeLayout.setVerticalGroup(jPanelChangeLayout.createSequentialGroup()
                    						.addComponent(jLabelChangeS, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    						.addComponent(jLabelChangeG, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    						.addGap(23)
                    						.addGroup(jPanelChangeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    						    .addComponent(jTextFieldChooseS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    						    .addComponent(jLabelChooseC, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                    						.addGap(33)
                    						.addGroup(jPanelChangeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    						    .addComponent(jButtonON, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                    						    .addComponent(jButtonOFF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
                    						.addContainerGap(73, 73));
                    		}
                    		{
                    			jButtonExit = new JButton();
                    			jButtonExit.setText("Exit");
                    			jButtonExit.setFont(new java.awt.Font("Segoe Print",1,16));
                    			jButtonExit.addActionListener(this);
                    		}
                    		{
                    			jPanelListSensor = new JPanel();
                    			jPanelListSensor.setOpaque(false);
                    			jLabelFondo.add(jPanelListSensor);
                    			GroupLayout jPanelListSensorLayout = new GroupLayout((JComponent)jPanelListSensor);
                    			jPanelListSensor.setLayout(jPanelListSensorLayout);
								{
									jLabelListSensor = new JLabel();
									jLabelListSensor.setText("List of Sensors");
                    				jLabelListSensor.setFont(new java.awt.Font("Segoe Print",1,14));
                    				jLabelListSensor.setEnabled(false);
                    			}
                    			{
                    				/*dtm= new DefaultTableModel();
                    				 JTable table = new JTable(dtm);
                    				 dtm.setRowCount(2);
                    				 dtm.setColumnCount(1);*/
                    			}
                    			
                    			{
                    				TableModel jTableSensorModel = 
                    					new DefaultTableModel(
                    							new String[][] {{},{}},
                    							new String[] { "Column 1" });
                    				jTableSensor = new JTable();
                    				jTableSensor.setModel(jTableSensorModel);
                    				jTableSensor.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
                   				}
                    			{
                    				jLabelHistory = new JLabel();
                    				jLabelHistory.setText("Historical Measurements");
                    				jLabelHistory.setFont(new java.awt.Font("Segoe Print",1,14));
                    				jLabelHistory.setEnabled(false);
                    			}
                    			{
                    				jButtonOKh = new JButton();
                    				jButtonOKh.setText("OK");
                    				jButtonOKh.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jButtonOKh.setEnabled(false);
                    				jButtonOKh.addActionListener(this);
                    			}
                    			{
                    				jLabelChoose = new JLabel();
                    				jLabelChoose.setText("Choose a sensor :");
                    				jLabelChoose.setFont(new java.awt.Font("Segoe Print",1,12));
                    				jLabelChoose.setEnabled(false);
                    			}
                    			{
                    				jTextFieldChoose = new JTextField();
                    				jTextFieldChoose.setEnabled(false);
                    			}
                    				jPanelListSensorLayout.setHorizontalGroup(jPanelListSensorLayout.createSequentialGroup()
                    					.addContainerGap()
                    					.addGroup(jPanelListSensorLayout.createParallelGroup()
                    					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListSensorLayout.createSequentialGroup()
                    					        .addGroup(jPanelListSensorLayout.createParallelGroup()
                    					            .addComponent(jTextFieldChoose, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                    					            .addGroup(GroupLayout.Alignment.LEADING, jPanelListSensorLayout.createSequentialGroup()
                    					                .addComponent(jLabelChoose, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                    					                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    					        .addGap(26)
                    					        .addComponent(jButtonOKh, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                    					    .addComponent(jLabelHistory, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
                    					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    					.addGroup(jPanelListSensorLayout.createParallelGroup()
                    					    .addComponent(jTableSensor, GroupLayout.Alignment.LEADING, 0, 353, Short.MAX_VALUE)
                    					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListSensorLayout.createSequentialGroup()
                    					        .addGap(68)
                    					        .addComponent(jLabelListSensor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(0, 182, Short.MAX_VALUE)))
                    					.addContainerGap());
                    					jPanelListSensorLayout.setVerticalGroup(jPanelListSensorLayout.createSequentialGroup()
                    					.addContainerGap(27, 27)
                    					.addGroup(jPanelListSensorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    					    .addComponent(jLabelListSensor, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    					    .addComponent(jLabelHistory, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
                    					.addGap(24)
                    					.addGroup(jPanelListSensorLayout.createParallelGroup()
                    					    .addGroup(jPanelListSensorLayout.createSequentialGroup()
                    					        .addComponent(jTableSensor, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(0, 0, Short.MAX_VALUE))
                    					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListSensorLayout.createSequentialGroup()
                    					        .addGap(26)
                    					        .addComponent(jLabelChoose, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    					        .addGap(16)
                    					        .addGroup(jPanelListSensorLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    					            .addComponent(jTextFieldChoose, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                    					            .addComponent(jButtonOKh, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                    					        .addGap(27)))
                    					.addContainerGap(33, 33));
                    		}
                    			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
                    				.addGroup(thisLayout.createParallelGroup()
                    				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				        .addComponent(jPanelChange, 0, 147, Short.MAX_VALUE)
                    				        .addComponent(jPanelCurvalue, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                    				        .addGap(112))
                    				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				        .addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                    				        .addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                    				        .addGap(0, 22, Short.MAX_VALUE)
                    				        .addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
                    				.addGroup(thisLayout.createParallelGroup()
                    				    .addComponent(jPanelListSensor, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
                    				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				        .addGap(182)
                    				        .addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                    				        .addGap(14)))
                    				.addComponent(statusBar, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE));
                    			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
                    				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				    .addComponent(jPanelListSensor, GroupLayout.PREFERRED_SIZE, 629, GroupLayout.PREFERRED_SIZE)
                    				    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    				    .addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                    				    .addGap(0, 21, Short.MAX_VALUE))
                    				.addGroup(thisLayout.createSequentialGroup()
                    				    .addGroup(thisLayout.createParallelGroup()
                    				        .addComponent(jPanelUp, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE)
                    				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				            .addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                    				            .addGap(82))
                    				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
                    				            .addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                    				            .addGap(82)))
                    				    .addGroup(thisLayout.createParallelGroup()
                    				        .addComponent(jPanelChange, GroupLayout.Alignment.LEADING, 0, 295, Short.MAX_VALUE)
                    				        .addComponent(jPanelCurvalue, GroupLayout.Alignment.LEADING, 0, 295, Short.MAX_VALUE)))
                    				.addComponent(statusBar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE));
                    			pack();
                    	} 
                    		
                }
            }
		}
                     
        catch(Exception ex) 
		{
				System.err.println(ex);
				jTextFieldUser.setText("");
		}

                
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object target= e.getSource();
	
		
		if(target == jButtonLogUser)
		{
			String resp =null;
			String userName = jTextFieldUser.getText(); //Viene del texto que viene
			try 
			{
		
				sm.Escribir("USER " + userName + "\r\n");
				resp = sm.Leer();
				System.out.println(resp);
				if (resp.startsWith("201")) 
				{
					statusBar.setText(resp);
					jLabelPass.setVisible(true);
					jButtonLogPass.setVisible(true);
					jTextFieldPass.setVisible(true);
					//Dejar que se escriba en el password
				}
				else if ((resp.startsWith("400")) || (resp.startsWith("401")))
				{
					statusBar.setText(resp);
					jTextFieldUser.setText("");
				}
			} 
			catch(IOException ex) 
			{
				System.err.println(ex);
				jTextFieldUser.setText("");
			}
		}
		
		if(target == jButtonLogPass)
		{
			String resp = null;
			String userPass=jTextFieldPass.getText();
			try 
			{
				sm.Escribir("PASS " + userPass + "\r\n");
				resp = sm.Leer();
				System.out.println(resp);
				if (resp.startsWith("202")) 
				{
					statusBar.setText(resp);
					jLabelQuest.setEnabled(true);
					jLabelIp.setEnabled(true);
					jTextFieldIP.setEnabled(true);
					jButtonNext.setEnabled(true);
					
					
				}
				else if ((resp.startsWith("403"))) 
				{
					statusBar.setText(resp);
					jTextFieldUser.setText("");
					jTextFieldPass.getText();
					
				}
				else if ((resp.startsWith("402")))
				{
					statusBar.setText(resp);
					jTextFieldUser.setText("");
					jTextFieldPass.setText("");
				}
			} 
			catch(IOException ex) 
			{
				System.err.println(ex);
			}
		}
		
		if(target == jButtonNext)
		{
			String resp = null;
			String ip=jTextFieldIP.getText();
			jLabelMenu.setEnabled(true);
			jComboBoxMenu.setEnabled(true);
			jButtonOK.setEnabled(true);
			
			try 
			{
				sm.Escribir("IP " + ip + "\r\n");
				resp = sm.Leer();
				System.out.println(resp);
				if (resp.startsWith("OK,")) 
				{
					statusBar.setText(resp);					
				}
				else if (resp.startsWith("ERR,")) 
				{
					statusBar.setText(resp);
				}
			} catch(IOException ex) {
				System.err.println(ex);
			}
		}	
		if(target ==jButtonOKh)
		{
			String resp= null;
			String sensor=jTextFieldChoose.getText();
			try 
			{
				sm.Escribir("HISTORYLOG " + sensor + "\r\n");                
                
                resp = sm.Leer();
				System.out.println(resp);
				
				if (resp.startsWith("113")) 
				{
					statusBar.setText(resp);
					String str= sm.Leer();
	                int num = Integer.parseInt(str);
	                System.out.println(str);
	                for(int j=0;j<=num-1;j++)
	                {
	                        String resultado = sm.Leer();
	                        System.out.println(resultado); 
	                        jTableSensor.setValueAt(resultado,j,0);   
	                }
	                String finList= sm.Leer();
	                statusBar.setText(finList);
	                System.out.println(finList);
	                
					
				}
				else if ((resp.startsWith("414"))) 
				{
					statusBar.setText(resp);
					jTextFieldChoose.setText(" ");
					
				}
				else if ((resp.startsWith("415")))
				{
					statusBar.setText(resp);
					jTextFieldChoose.setText("");
				}
			} 
			catch(IOException ex) 
			{
				System.err.println(ex);
			}
			
		}
		/*if ((target == jButtonON) )
		{
	
			String resp =null;
			try 
			{
				sm.Escribir("GPSON \r\n");
				resp = sm.Leer();
				System.out.println(resp);
				if (resp.startsWith("409")) 
				{
					statusBar.setText(resp);
				}
				else if (resp.startsWith("205"))
				{
					statusBar.setText(resp);
				} 
			}
			catch(IOException ex) 
			{
				System.err.println(ex);
			}
		}*/
		if(target == jButtonExit)
		{			
			try 
			{	
				sm.Escribir("QUIT");
				sm.CerrarStreams();
				sm.CerrarSocket();
				
				System.exit(0);
				
				/*sm.Escribir("QUIT");
				resp = sm.Leer();
				System.out.println(resp);
				
				if (resp.startsWith("208"))
				{	
					sm.CerrarStreams();
					sm.CerrarSocket();
					//System.exit(0);
				}	*/		
			} 			
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}			
		}
		if(target == jButtonON)
		{
			if(change =="sensor")
			{
				String resp =null;
				String idSensor = jTextFieldChooseS.getText();
				try 
				{
					sm.Escribir("ON " + idSensor + "\r\n");
					resp = sm.Leer();
					System.out.println(resp);
					if (resp.startsWith("418")) 
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
					else if (resp.startsWith("203"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					} 
					else if (resp.startsWith("417"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
					else if (resp.startsWith("ERR,"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
				}
				catch(IOException ex) 
				{
					System.err.println(ex);
					jTextFieldChooseS.setText("");
				}
			}
			else if (change == "gps")
			{
				String resp =null;
				try 
				{
					sm.Escribir("GPSON \r\n");
					resp = sm.Leer();
					System.out.println(resp);
					if (resp.startsWith("205")) 
					{
						statusBar.setText(resp);
					}
					else if (resp.startsWith("409"))
					{
						statusBar.setText(resp);
					} 
				}
				catch(IOException ex) 
				{
					System.err.println(ex);
				}
			}
		}
		if(target == jButtonOFF)
		{
			if(change =="sensor")
			{
				String resp =null;
				String idSensor = jTextFieldChooseS.getText();
				try 
				{
					sm.Escribir("OFF " + idSensor + "\r\n");
					resp = sm.Leer();
					System.out.println(resp);
					if (resp.startsWith("419")) 
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
					else if (resp.startsWith("204"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					} 
					else if (resp.startsWith("417"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
					else if (resp.startsWith("ERR,"))
					{
						statusBar.setText(resp);
						jTextFieldChooseS.setText("");
					}
				}
				catch(IOException ex) 
				{
					System.err.println(ex);
					jTextFieldChooseS.setText("");
				}
			}
			else if (change == "gps")
			{
				String resp =null;
				try 
				{
					sm.Escribir("GPSOFF \r\n");
					resp = sm.Leer();
					System.out.println(resp);
					if (resp.startsWith("206")) 
					{
						statusBar.setText(resp);
					}
					else if (resp.startsWith("420"))
					{
						statusBar.setText(resp);
					} 
				}
				catch(IOException ex) 
				{
					System.err.println(ex);
				}
			}
		}
		
		if(target ==jButtonOKc)
		{
			String resp =null;
			String idSensor = jTextFieldChooseSC.getText();
			try 
			{
				sm.Escribir("GET_CURVALUE " + idSensor + "\r\n");
				
				resp = sm.Leer();
				System.out.println(resp);
				
				if (resp.startsWith("416")) 
				{
					statusBar.setText(resp);
					jTextFieldChooseSC.setText("");
				}
				else if (resp.startsWith("114"))
				{
					jTextFieldCurvalue.setText(resp);
					statusBar.setText(resp);
					jTextFieldChooseSC.setText("");
				} 
				else if (resp.startsWith("414"))
				{
					statusBar.setText(resp);
					jTextFieldChooseSC.setText("");
				}
				else if (resp.startsWith("415"))
				{
					statusBar.setText(resp);
					jTextFieldChooseSC.setText("");
				}
			}
			catch(IOException ex) 
			{
				System.err.println(ex);
				jTextFieldChooseSC.setText("");
			}
		}

		if (target == jButtonOK)
		{
				if(jComboBoxMenu.getSelectedIndex()==1)
				{
					jLabelUser.setEnabled(false);
					jTextFieldUser.setEnabled(false);
					jLabelPass.setEnabled(false);
					jTextFieldPass.setEnabled(false);
					jLabelListSensor.setEnabled(false);

					try 
					{						
						sm.Escribir("LISTSENSOR" + "\n");				
	                    statusBar.setText(sm.Leer());
	                    String str= sm.Leer();
	                    int num = Integer.parseInt(str);
	                    for(int j=0;j<=num-1;j++)
	                    {
	                            String resultado = sm.Leer();
	                            System.out.println(resultado); 
	                            jTableSensor.setValueAt(resultado,j,0);   
	                    }
	                    	statusBar.setText(sm.Leer());
					} 
					catch (IOException e1) 
					{
						e1.printStackTrace();
					}
				}
				else if ( jComboBoxMenu.getSelectedIndex()==2)
				{
					jLabelHistory.setEnabled(true);
					jTextFieldChoose.setEnabled(true);
					jLabelChoose.setEnabled(true);
					jTableSensor.setEnabled(true);
					jButtonOKh.setEnabled(true);
				}
				else if(jComboBoxMenu.getSelectedIndex()==3)
				{
					change = "sensor";			
					jLabelChangeS.setVisible(true);
					jLabelChangeG.setVisible(false);
					jLabelChooseC.setVisible(true);
					jTextFieldChooseS.setVisible(true);
					System.out.println("Estamos dentro del sensor activate");
					jButtonOFF.setEnabled(false);
					jButtonON.setEnabled(true);									
				}
				else if(jComboBoxMenu.getSelectedIndex()==4)
				{
					change = "sensor";
					jLabelChangeS.setVisible(true);
					jLabelChangeG.setVisible(false);
					jButtonOFF.setEnabled(true);
					jButtonON.setEnabled(false);
					jLabelChooseC.setVisible(true);
					jTextFieldChooseS.setVisible(true);
		
				}
				else if(jComboBoxMenu.getSelectedIndex()==5)
				{
					change = "gps";
					jLabelChangeS.setVisible(false);
					jLabelChangeG.setVisible(true);
					jButtonOFF.setEnabled(false);
					jButtonON.setEnabled(true);
					
					
				}
				else if(jComboBoxMenu.getSelectedIndex()==6)
				{
					change = "gps";
					jLabelChangeS.setVisible(false);
					jLabelChangeG.setVisible(true);
					jButtonOFF.setEnabled(true);
					jButtonOFF.setEnabled(true);
					jButtonON.setEnabled(false);
					
					
				}	
				else if(jComboBoxMenu.getSelectedIndex()==7)
				{
					jLabelCurvalue.setEnabled(true);
					jLabelChooseSC.setEnabled(true);
					jTextFieldCurvalue.setEnabled(true);
					jTextFieldChooseSC.setEnabled(true);
					jButtonOKc.setEnabled(true);
				}
			}
		}	
}
