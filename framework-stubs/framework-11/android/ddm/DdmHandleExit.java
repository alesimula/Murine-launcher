package android.ddm;

public class DdmHandleExit {
    public static final int CHUNK_EXIT = Integer.valueOf(0);
    private static android.ddm.DdmHandleExit mInstance;
    private DdmHandleExit() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
}
