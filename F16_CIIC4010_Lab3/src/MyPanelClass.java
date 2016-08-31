import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        /*//Draw a border
                        g.setColor(Color.blue);
                        g.drawRect(x1, y1, width, height);
                        
                        //Draw a border
                        g.setColor(Color.black);
                        g.drawRect(x1 + 4, y1 + 4, width - 8, height - 8);
                        
                        //Draw a Line
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        //Draw a Line
                        g.setColor(Color.green);
                        g.drawLine(x2, y1, x1, y2);
                        
                        //Draw an Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(75, 75, 55, 55);      */
                        
                        /*Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p); */
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 0, y1 + 0);
                        p3.addPoint(x1 + 115, y1 + 70);
                        p3.addPoint(x1 + 0, y1 + 140);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1 + 46, y1 + 28);
                        p4.addPoint(x1 + 200, y1 + 28);
                        p4.addPoint(x1 + 200, y1 + 56);
                        p4.addPoint(x1 + 92, y1 + 56);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                        Polygon p5 = new Polygon();
                        p5.addPoint(x1 + 92, y1 + 84);
                        p5.addPoint(x1 + 200, y1 + 84);
                        p5.addPoint(x1 + 200, y1 + 112);
                        p5.addPoint(x1 + 46, y1 + 112);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p5);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 13, y1 + 61);
                        p2.addPoint(x1 + 29, y1 + 61);
                        p2.addPoint(x1 + 35, y1 + 46);
                        p2.addPoint(x1 + 41, y1 + 61);
                        p2.addPoint(x1 + 58, y1 + 61);
                        p2.addPoint(x1 + 44, y1 + 71);
                        p2.addPoint(x1 + 49, y1 + 86);
                        p2.addPoint(x1 + 35, y1 + 76);
                        p2.addPoint(x1 + 22, y1 + 86);
                        p2.addPoint(x1 + 26, y1 + 71);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }
}