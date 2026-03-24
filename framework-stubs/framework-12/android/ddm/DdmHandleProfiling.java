package android.ddm;

public class DdmHandleProfiling extends android.ddm.DdmHandle {
    public static final int CHUNK_MPRS = Integer.valueOf(0);
    public static final int CHUNK_MPRE = Integer.valueOf(0);
    public static final int CHUNK_MPSS = Integer.valueOf(0);
    public static final int CHUNK_MPSE = Integer.valueOf(0);
    public static final int CHUNK_MPRQ = Integer.valueOf(0);
    public static final int CHUNK_SPSS = Integer.valueOf(0);
    public static final int CHUNK_SPSE = Integer.valueOf(0);
    private static final boolean DEBUG = false;
    private static android.ddm.DdmHandleProfiling mInstance;
    private DdmHandleProfiling() { super(); }
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleMPRS(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleMPRE(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleMPSS(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleMPSEOrSPSE(org.apache.harmony.dalvik.ddmc.Chunk p0, java.lang.String p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleMPRQ(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleSPSS(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
}
