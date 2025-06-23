public class Memory
{
    short[] memory; //should be byte technically
    public Memory()
    {
        memory = new short[0xFFFF];
    }

    public void initializeMemory(byte b, int adr)
    {
        memory[adr] = (short)(b & 0xFF); //java byte converts 0xFF to -1;
        System.out.printf("%x\n", (b & 0xFF));
    }
}
