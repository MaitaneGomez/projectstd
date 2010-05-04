package gui;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;

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
public class getPic extends javax.swing.JFrame {
	private JLabel jLabelPic;
	private JTextPane jTextPaneCoord;
	private JLabel jLabelImage;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				getPic inst = new getPic();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public getPic() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jLabelPic = new JLabel();
				jLabelPic.setText("Geolocated picture");
				jLabelPic.setFont(new java.awt.Font("Segoe Print",1,16));
			}
			{
				jLabelImage = new JLabel();
				jLabelImage.setText("image");
				jLabelImage.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			{
				jTextPaneCoord = new JTextPane();
				jTextPaneCoord.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(39, 39)
				.addComponent(jLabelPic, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
				.addGap(29)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(thisLayout.createSequentialGroup()
				        .addComponent(jLabelImage, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(43)
				        .addComponent(jTextPaneCoord, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 47, Short.MAX_VALUE)))
				.addContainerGap(22, 22));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap(32, 32)
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jLabelImage, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				        .addGap(36)
				        .addComponent(jTextPaneCoord, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 0, Short.MAX_VALUE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(0, 53, Short.MAX_VALUE)
				        .addComponent(jLabelPic, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
				        .addGap(54)))
				.addContainerGap(28, 28));
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
