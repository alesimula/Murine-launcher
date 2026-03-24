package android.ddm;

public class DdmHandleNativeHeap {
    public static final int CHUNK_NHGT = Integer.valueOf(0);
    private static android.ddm.DdmHandleNativeHeap mInstance;
    private DdmHandleNativeHeap() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleNHGT(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private native byte[] getLeakInfo();
}
