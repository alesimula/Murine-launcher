package android.ddm;

public class DdmHandleHello extends android.ddm.DdmHandle {
    public static final int CHUNK_HELO = Integer.valueOf(0);
    public static final int CHUNK_WAIT = Integer.valueOf(0);
    public static final int CHUNK_FEAT = Integer.valueOf(0);
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void sendWAIT(int p0) {}
}
