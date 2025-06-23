//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;

public class Main
{
    static Memory mem;

    public static void main(String[] args)
    {
        Display disp = new Display();
        initializeGameBoy(disp, args[0]);
        disp.updateScreen();
    }

    static void initializeGameBoy(Display disp, String romName)
    {
        for(int i = 0; i < disp.height; i++)
        {
            for(int j = 0; j < disp.width; j++)
            {
                disp.display[i][j] = 0;
            }
        }
        LoadRom loadRom = new LoadRom();
        mem = loadRom.load(romName);
        disp.initializeDisplay();
    }
}