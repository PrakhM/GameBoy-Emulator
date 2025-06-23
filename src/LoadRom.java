import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class LoadRom
{
    public Memory load(String romName)
    {
        byte[] fileData = null;
        try {
            fileData = Files.readAllBytes(Paths.get(romName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(fileData != null)
        {
            Memory mem = new Memory();
            int adr = 0x150;
            for (byte b : fileData)
            {
                if(adr > 0x8000 - 1)
                {
                    //TODO: Rom bank stuff.
                    System.out.println(adr + " not in range");
                    break;
                }
                mem.initializeMemory(b, adr);
                adr++;
            }

            return mem;
        }
        return null;
    }
}
