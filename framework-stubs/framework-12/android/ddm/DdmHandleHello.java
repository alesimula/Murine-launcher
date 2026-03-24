package android.ddm;

public class DdmHandleHello extends android.ddm.DdmHandle {
    public static final int CHUNK_HELO = Integer.valueOf(0);
    public static final int CHUNK_WAIT = Integer.valueOf(0);
    public static final int CHUNK_FEAT = Integer.valueOf(0);
    private static final int CLIENT_PROTOCOL_VERSION = 1;
    private static android.ddm.DdmHandleHello mInstance;
    private static final java.lang.String[] FRAMEWORK_FEATURES = null;
    private DdmHandleHello() { super(); }
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleHELO(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    private org.apache.harmony.dalvik.ddmc.Chunk handleFEAT(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void sendWAIT(int p0) {}
}
