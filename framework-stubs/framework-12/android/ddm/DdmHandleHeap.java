package android.ddm;

public class DdmHandleHeap extends android.ddm.DdmHandle {
    public static final int CHUNK_HPGC = Integer.valueOf(0);
    private static android.ddm.DdmHandleHeap mInstance;
    private DdmHandleHeap() { super(); }
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPGC(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
}
