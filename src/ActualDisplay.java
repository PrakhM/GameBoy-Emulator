import javax.swing.JPanel;
import java.awt.*;
public class ActualDisplay extends JPanel
{
    public int factor = 4;
    public int[][] display;

    public ActualDisplay(int[][] display)
    {
        this.display = display;
        this.setPreferredSize(new Dimension(160 * factor, 144 * factor));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.white);
        for (int i = 0; i < 144; i++)
        {
            for (int j = 0; j < 160; j++)
            {
                if (display[i][j] != 0)
                {
                    g2.fillRect(j * factor, i * factor, factor, factor);
                }
            }
        }

        g2.dispose();
    }
}
