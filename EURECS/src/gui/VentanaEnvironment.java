package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

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
	private JPanel jPanelDown;
	private JLabel jLabelUser;
	private JTextField jTextFieldIP;
	private JLabel statusBar;
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
					jLabelUser.setFont(new java.awt.Font("Segoe Print",1,16));
				}
				{
					jButtonLogPass = new JButton();
					jButtonLogPass.setText("Login Password");
					jButtonLogPass.setFont(new java.awt.Font("Segoe Print",1,16));
					jButtonLogPass.addActionListener(this);
					jButtonLogPass.setVisible(false);
				}
				{
					jTextFieldUser = new JTextField();
				}
				{
					jLabelPass = new JLabel();
					jLabelPass.setText("Password:");
					jLabelPass.setFont(new java.awt.Font("Segoe Print",1,16));
					jLabelPass.setVisible(false);
				}
				{
					jTextFieldPass = new JTextField();
					jTextFieldPass.setVisible(false);
				}
				{
					jButtonLogUser = new JButton();
					jButtonLogUser.setText("Login User");
					jButtonLogUser.setFont(new java.awt.Font("Segoe Print",1,16));
					jButtonLogUser.addActionListener(this);
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
					jLabelQuest.setVisible(false);
				}
				{
					jLabelIp = new JLabel();
					jLabelIp.setText("IP :");
					jLabelIp.setFont(new java.awt.Font("Segoe Print",1,16));
					jLabelIp.setVisible(false);
				}
				{
					jTextFieldIP = new JTextField();
					jTextFieldIP.setVisible(false);
				}
				{
					jButtonNext = new JButton();
					jButtonNext.setText("Next");
					jButtonNext.setFont(new java.awt.Font("Segoe Print",1,16));
					jButtonNext.setVisible(false);
					jButtonNext.addActionListener(this);
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
				GroupLayout jPanelDownLayout = new GroupLayout((JComponent)jPanelDown);
				jPanelDown.setLayout(jPanelDownLayout);
				{
					statusBar = new JLabel();
					statusBar.setText("");

				}
					jPanelDownLayout.setHorizontalGroup(jPanelDownLayout.createSequentialGroup()
					.addComponent(statusBar, 0, 666, Short.MAX_VALUE));
					jPanelDownLayout.setVerticalGroup(jPanelDownLayout.createSequentialGroup()
					.addContainerGap(18, Short.MAX_VALUE)
					.addComponent(statusBar, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addComponent(jPanelUp, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
				.addComponent(jPanelMiddle, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jPanelDown, 0, 49, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createParallelGroup()
				.addComponent(jPanelUp, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE)
				.addComponent(jPanelMiddle, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE)
				.addComponent(jPanelDown, GroupLayout.Alignment.LEADING, 0, 666, Short.MAX_VALUE));
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
					jLabelQuest.setVisible(true);
					jLabelIp.setVisible(true);
					jTextFieldIP.setVisible(true);
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
					menuGUI ventana= new menuGUI();
					ventana.setVisible(true);  
					this.dispose();
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
