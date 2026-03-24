package android.ddm;

public class DdmHandleThread {
    public static final int CHUNK_THEN = Integer.valueOf(0);
    public static final int CHUNK_THCR = Integer.valueOf(0);
    public static final int CHUNK_THDE = Integer.valueOf(0);
    public static final int CHUNK_THST = Integer.valueOf(0);
    public static final int CHUNK_STKL = Integer.valueOf(0);
    private static android.ddm.DdmHandleThread mInstance;
    private DdmHandleThread() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleTHEN(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleTHST(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleSTKL(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk createStackChunk(java.lang.StackTraceElement[] p0, int p1) { return null; }
}
