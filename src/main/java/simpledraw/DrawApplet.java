package simpledraw;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 * SimpleDraw, applet version
 * @author Rémi Bastide
 * @version 1.0
 */

public class DrawApplet
	extends JApplet {
	JToggleButton mySelectButton = new JToggleButton("Select");
	JToggleButton myLineButton = new JToggleButton("Line");
	JToggleButton myCircleButton = new JToggleButton("Circle");
	DrawingPanel myDrawingPanel = new DrawingPanel();

	/**Construct the applet*/
	public DrawApplet() {
	}

	/**Initialize the applet*/
	public void init() {
		getContentPane().setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		mySelectButton.setSelected(true);
		mySelectButton.setToolTipText("Select and move shapes");
		myCircleButton.setToolTipText("Draw a Circle");
		myLineButton.setToolTipText("Draw a Line");

		getContentPane().add(buttonPanel, BorderLayout.NORTH);
		buttonPanel.add(mySelectButton, null);
		buttonPanel.add(myLineButton, null);
		buttonPanel.add(myCircleButton, null);
		getContentPane().add(myDrawingPanel, BorderLayout.CENTER);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(mySelectButton);
		buttonGroup.add(myLineButton);
		buttonGroup.add(myCircleButton);

		setSize(new Dimension(400, 300));

		mySelectButton.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myDrawingPanel.activateSelectionTool();
			}
		}
		);

		myLineButton.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myDrawingPanel.activateLineTool();
			}
		}
		);

		myCircleButton.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myDrawingPanel.activateCircleTool();
			}
		}
		);
	}
}
