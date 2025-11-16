
import java.applet.Applet;
import java.awt.*;

/*
<applet code="HumanFace.class" width="400" height="400">
</applet>
*/

public class HumanFace extends Applet {

    public void paint(Graphics g) {

        // Face outline
        g.setColor(Color.ORANGE);
        g.fillOval(100, 50, 200, 250);

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(150, 120, 40, 30);
        g.fillOval(210, 120, 40, 30);

        // Pupils
        g.setColor(Color.BLACK);
        g.fillOval(165, 130, 10, 10);
        g.fillOval(225, 130, 10, 10);

        // Nose
        g.drawLine(200, 150, 190, 200);
        g.drawLine(190, 200, 210, 200);

        // Mouth
        g.setColor(Color.RED);
        g.drawArc(150, 220, 100, 50, 0, -180);

        // Label
        g.setColor(Color.BLACK);
        g.drawString("Smiling Face", 170, 330);
    }
}
