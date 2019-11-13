package simpledraw;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * A Drawing tool in the drawing panel
 */

public abstract class DrawingTool
	implements KeyListener, MouseListener, MouseMotionListener {
	DrawingPanel myPanel;
        Drawing myDrawing;

	DrawingTool(DrawingPanel panel) {
		myPanel = panel;
                myDrawing = panel.myDrawing;
	}

	/**
	 * Draws this tool in the panel
	 * @param g the graphics context to draw into
	 */
	abstract void draw(Graphics2D g);

	public void keyTyped(KeyEvent e) {
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
		myPanel.requestFocus();
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseMoved(MouseEvent e) {
	}
}