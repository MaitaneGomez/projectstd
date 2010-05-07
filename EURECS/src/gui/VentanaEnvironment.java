package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.GroupLayout;
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
public class VentanaEnvironment extends javax.swing.JFrame implements  ActionListener{


	private static final long serialVersionUID = 1L;
	
	private JPanel jPanelUp;
	private JPanel jPanelMiddle;
	private JLabel jLabelUser;
	private JTextField jTextFieldIP;
	private JTable jTable1;
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
				}
				{
					jButtonLogPass = new JButton();
					jButtonLogPass.setText("Login Password");
					jButtonLogPass.setFont(new java.awt.Font("Segoe Print",1,14));
					jButtonLogPass.addActionListener(this);
					//jButtonLogPass.setVisible(false);
				}
				{
					jTextFieldUser = new JTextField();
				}
				{
					jLabelPass = new JLabel();
					jLabelPass.setText("Password:");
					jLabelPass.setFont(new java.awt.Font("Segoe Print",1,14));
					//jLabelPass.setVisible(false);
				}
				{
					jTextFieldPass = new JTextField();
					//jTextFieldPass.setVisible(false);
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
					jLabelQuest.setFont(new java.awt.Font("Segoe Print",1,16));
					//jLabelQuest.setVisible(false);
				}
				{
					jLabelIp = new JLabel();
					jLabelIp.setText("IP :");
					jLabelIp.setFont(new java.awt.Font("Segoe Print",1,16));
					//jLabelIp.setVisible(false);
				}
				{
					jTextFieldIP = new JTextField();
					//jTextFieldIP.setVisible(false);
				}
				{
					jButtonNext = new JButton();
					jButtonNext.setText("Next");
					jButtonNext.setFont(new java.awt.Font("Segoe Print",1,16));
					jButtonNext.setVisible(false);
					jButtonNext.addActionListener(this);
				}
				jPanelMiddleLayout.setHorizontalGroup(jPanelMiddleLayout.createSequentialGroup()
					.addContainerGap(59, 59)
					.addGroup(jPanelMiddleLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
					        .addComponent(jLabelIp, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addComponent(jTextFieldIP, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMiddleLayout.createSequentialGroup()
					        .addPreferredGap(jLabelIp, jLabelQuest, LayoutStyle.ComponentPlacement.INDENT)
					        .addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(10)))
					.addGap(48)
					.addComponent(jButtonNext, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE));
				jPanelMiddleLayout.setVerticalGroup(jPanelMiddleLayout.createSequentialGroup()
					.addContainerGap(29, 29)
					.addComponent(jLabelQuest, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(0, 33, Short.MAX_VALUE)
					.addGroup(jPanelMiddleLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabelIp, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextFieldIP, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jButtonNext, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, 17));
			}
			{
				jPanelMenu = new JPanel();
				GroupLayout jPanelMenuLayout = new GroupLayout((JComponent)jPanelMenu);
				jPanelMenu.setLayout(jPanelMenuLayout);
				jPanelMenu.setFont(new java.awt.Font("Segoe Print",1,14));
				{
					jLabelMenu = new JLabel();
					jLabelMenu.setText("What do you want to do?");
					jLabelMenu.setFont(new java.awt.Font("Segoe Print",1,14));
				}
				{
					ComboBoxModel jComboBoxMenuModel = 
						new DefaultComboBoxModel(
								new String[] { "Item One", "Item Two" });
					jComboBoxMenu = new JComboBox();
					jComboBoxMenu.setModel(jComboBoxMenuModel);
				}
				{
					jButtonOK = new JButton();
					jButtonOK.setText("OK");
					jButtonOK.setFont(new java.awt.Font("Segoe Print",1,14));
				}
					jPanelMenuLayout.setHorizontalGroup(jPanelMenuLayout.createSequentialGroup()
					.addContainerGap(94, 94)
					.addGroup(jPanelMenuLayout.createParallelGroup()
					    .addComponent(jLabelMenu, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
					        .addComponent(jComboBoxMenu, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					        .addGap(10)))
					.addGap(53)
					.addComponent(jButtonOK, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE));
					jPanelMenuLayout.setVerticalGroup(jPanelMenuLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabelMenu, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addGroup(jPanelMenuLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
					        .addComponent(jComboBoxMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jButtonOK, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap(47, 47));
			}
			{
				statusBar = new JLabel();
			}
			{
				TableModel jTable1Model = 
					new DefaultTableModel(
							new String[][] {},
							new String[] { "List of sensors" });
				jTable1 = new JTable();
				jTable1.setModel(jTable1Model);
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(statusBar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(38)
				.addComponent(jTable1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(81, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addGroup(thisLayout.createSequentialGroup()
				    .addGroup(thisLayout.createParallelGroup()
				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				            .addComponent(jPanelUp, 0, 447, Short.MAX_VALUE)
				            .addGap(219))
				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				            .addComponent(jPanelMiddle, 0, 441, Short.MAX_VALUE)
				            .addGap(225))
				        .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				            .addComponent(jPanelMenu, GroupLayout.PREFERRED_SIZE, 441, GroupLayout.PREFERRED_SIZE)
				            .addGap(0, 225, Short.MAX_VALUE))
				        .addComponent(statusBar, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE))
				    .addContainerGap())
				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				    .addGap(77)
				    .addComponent(jTable1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				    .addContainerGap(451, Short.MAX_VALUE)));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		JButton button= (JButton)e.getSource();
		
		if(button == jButtonLogUser)
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
					//jLabelPass.setVisible(true);
					//jButtonLogPass.setVisible(true);
					//jTextFieldPass.setVisible(true);
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
		
		if(button == jButtonLogPass)
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
					//jLabelQuest.setVisible(true);
					//jLabelIp.setVisible(true);
					//jTextFieldIP.setVisible(true);
					jButtonNext.setVisible(true);
					
					
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
		
		if(button == jButtonNext)
		{
			String resp = null;
			String ip=jTextFieldIP.getText();;
			
			try 
			{
				sm.Escribir("IP " + ip + "\r\n");
				resp = sm.Leer();
				System.out.println(resp);
				if (resp.startsWith("OK,")) 
				{
					statusBar.setText(resp);
					
                    sm.Escribir("LISTSENSOR" + "\n");
                    System.out.println(sm.Leer());
                    String str= sm.Leer();
                    int num = Integer.parseInt(str);
                    for(int i=0;i<=num;i++)
                    {
                            String resultado = sm.Leer();
                            System.out.println(resultado); 
                            //jTable1.setValueAt(resultado, i, 0);
                            
                    }
                    System.out.println(sm.Leer());
					
					
					/* PASAR A OTRA VENTANA	
					menuGUI ventana= new menuGUI();
					ventana.setVisible(true);  
					this.dispose();*/	
				}
				else if (resp.startsWith("ERR,")) 
				{
					statusBar.setText(resp);
				}
			} catch(IOException ex) {
				System.err.println(ex);
			}
		}	
		
		
	}

}
