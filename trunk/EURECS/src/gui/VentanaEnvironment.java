package gui;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.TableView.TableRow;

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
	private JTextArea jTextArea1;
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
	private DefaultTableModel dtm;
	private static SocketManager sm;


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
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Environmental Quality Remote Control System");
			{
				jPanelUp = new JPanel();
				GroupLayout jPanelUpLayout = new GroupLayout((JComponent)jPanelUp);
				jPanelUp.setLayout(jPanelUpLayout);
				{
					jLabelUser = new JLabel();
					jLabelUser.setText("User :");
					jLabelUser.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelUser.setEnabled(true);
				}
				{
					jButtonLogPass = new JButton();
					jButtonLogPass.setText("Login Password");
					jButtonLogPass.setFont(new java.awt.Font("Segoe Print",1,14));
					jButtonLogPass.addActionListener(this);
					jButtonLogPass.setVisible(false);
				}
				{
					jTextFieldUser = new JTextField("stud1");
				}
				{
					jLabelPass = new JLabel();
					jLabelPass.setText("Password:");
					jLabelPass.setFont(new java.awt.Font("Segoe Print",1,14));
					jLabelPass.setVisible(false);
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
				GroupLayout jPanelMiddleLayout = new GroupLayout((JComponent)jPanelMiddle);
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
					jComboBoxMenu.addItem("Sensor activation");
					jComboBoxMenu.addItem("Sensor desactivation");
					jComboBoxMenu.addItem("GPS activation");
					jComboBoxMenu.addItem("GPS desactivation");
					jComboBoxMenu.addItem("Sensor current value");
					jComboBoxMenu.addItem("Geolocated picture");
					jComboBoxMenu.setEnabled(false);
					//jComboBoxMenu.addMouseListener(this);
					//jComboBoxMenu.addActionListener(jComboBoxMenu);
					
				

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
				jTextArea1 = new JTextArea();
				jTextArea1.setText("jTextArea1");
			}
			{
				jPanelListSensor = new JPanel();
				GroupLayout jPanelListSensorLayout = new GroupLayout((JComponent)jPanelListSensor);
				jPanelListSensor.setLayout(jPanelListSensorLayout);
				{
					jLabelListSensor = new JLabel();
					jLabelListSensor.setText("List of Sensors");
					jLabelListSensor.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					dtm= new DefaultTableModel();
					 JTable table = new JTable(dtm);
					 dtm.setRowCount(2);
					 dtm.setColumnCount(1);


				
				}
				
				{
					TableModel jTableSensorModel = 
						new DefaultTableModel(
								new String[][] {{},{}},
								new String[] { "Column 1" });
					jTableSensor = new JTable();
					jTableSensor.setModel(jTableSensorModel);
					
					

					
				}
					jPanelListSensorLayout.setHorizontalGroup(jPanelListSensorLayout.createSequentialGroup()
					.addContainerGap(53, 53)
					.addGroup(jPanelListSensorLayout.createParallelGroup()
					    .addGroup(jPanelListSensorLayout.createSequentialGroup()
					        .addComponent(jTableSensor, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelListSensorLayout.createSequentialGroup()
					        .addGap(30)
					        .addComponent(jLabelListSensor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 17, Short.MAX_VALUE)))
					.addContainerGap(57, 57));
					jPanelListSensorLayout.setVerticalGroup(jPanelListSensorLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelListSensor, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(jTableSensor, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 7, Short.MAX_VALUE));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
				.addGap(24)
				.addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(jPanelListSensor, GroupLayout.Alignment.LEADING, 0, 203, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(101)
				        .addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 84, Short.MAX_VALUE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(statusBar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 457, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 224, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 318, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 318, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jPanelListSensor, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
				        .addGap(22)
				        .addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 342, Short.MAX_VALUE))
				    .addComponent(statusBar, GroupLayout.Alignment.LEADING, 0, 681, Short.MAX_VALUE))
				.addGap(7));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
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
		if (target == jButtonOK)
		{
			Vector <String> v = null ;
			System.out.println("estoy dentro del ok!!!");
				if(jComboBoxMenu.getSelectedIndex()==1)
				{
					System.out.println("estoy dentro del combo!!!");
					jLabelUser.setEnabled(false);
					jTextFieldUser.setEnabled(false);
					jLabelPass.setEnabled(false);
					jTextFieldPass.setEnabled(false);
					
					System.out.println("estoy dentro del list!!!");
					try 
					{
					 System.out.println("String1 " );
					sm.Escribir("LISTSENSOR" + "\n");				
                    System.out.println(sm.Leer());
                    String str= sm.Leer();
                    int num = Integer.parseInt(str);
                    for(int j=0;j<=num;j++)
                    {
                    		v.setSize(v.size() + 1);
                            String resultado = sm.Leer();
                            v.add(j,resultado);
                            System.out.println("String2 " + v.toString());
                            System.out.println(resultado); 
                            dtm.insertRow(j,v);
                          
                            //dtm.setValueAt(resultado,j,0);
                            //dtm.setNumRows(dtm.getRowCount()+1);
                            //dtm.insertRow(j, resultado);
                            //jTableSensor.setValueAt(resultado,j,0);   
                           // jTableSensor.addRowSelectionInterval(j, j);
                            
                            //System.out.println(sizeT.toString());    
                            
             
                    }
                    System.out.println(sm.Leer());
					} 
					catch (IOException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
				else
				{
				System.out.println("NO");
				}
			}
			
		}

	
			
			/** ACCIONES DEl COMBO **/
			
		
		}
