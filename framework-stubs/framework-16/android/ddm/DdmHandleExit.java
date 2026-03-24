package android.ddm;

public class DdmHandleExit extends android.ddm.DdmHandle {
    public static final int CHUNK_EXIT = Integer.valueOf(0);
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
}
