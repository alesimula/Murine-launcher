package android.ddm;

public class DdmHandleNativeHeap extends android.ddm.DdmHandle {
    public static final int CHUNK_NHGT = Integer.valueOf(0);
    private static android.ddm.DdmHandleNativeHeap mInstance;
    private DdmHandleNativeHeap() { super(); }
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleNHGT(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private native byte[] getLeakInfo();
}
