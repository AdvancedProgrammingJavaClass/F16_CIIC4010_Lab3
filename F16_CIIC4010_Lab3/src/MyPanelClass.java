import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {

	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.red);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        g.setColor(Color.blue);
                        g.drawRect(x1, y1, width, height);
                        
                        //Draw a border
                        g.setColor(Color.black);
                        g.drawRect(x1 + 4, y1 + 4, width - 8, height - 8);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        g.setColor(Color.green);
                        g.drawLine(x2, y1, x1, y2);
                        
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(75, 75, 55, 55);
            }
}