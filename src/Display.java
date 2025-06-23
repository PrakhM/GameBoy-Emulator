import javax.swing.JFrame;
public class Display
{
    public final int height = 144;
    public final int width = 160;
    int[][] display = new int[height][width];
    ActualDisplay actdisp = new ActualDisplay(display);

    public void initializeDisplay()
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("GameBoy Emulator");
        window.add(actdisp);
        window.pack();
        window.setVisible(true);
    }

    public void updateScreen()
    {
        actdisp.repaint();
    }
}
