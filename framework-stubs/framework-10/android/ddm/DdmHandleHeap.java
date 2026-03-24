package android.ddm;

public class DdmHandleHeap {
    public static final int CHUNK_HPIF = Integer.valueOf(0);
    public static final int CHUNK_HPSG = Integer.valueOf(0);
    public static final int CHUNK_HPDU = Integer.valueOf(0);
    public static final int CHUNK_HPDS = Integer.valueOf(0);
    public static final int CHUNK_NHSG = Integer.valueOf(0);
    public static final int CHUNK_HPGC = Integer.valueOf(0);
    public static final int CHUNK_REAE = Integer.valueOf(0);
    public static final int CHUNK_REAQ = Integer.valueOf(0);
    public static final int CHUNK_REAL = Integer.valueOf(0);
    private static android.ddm.DdmHandleHeap mInstance;
    private DdmHandleHeap() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPIF(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPSGNHSG(org.apache.harmony.dalvik.ddmc.Chunk p0, boolean p1) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPDU(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPDS(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHPGC(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleREAE(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleREAQ(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleREAL(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
}
