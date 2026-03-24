package android.ddm;

public class DdmHandleAppName extends android.ddm.DdmHandle {
    public static final int CHUNK_APNM = Integer.valueOf(0);
    public static void register() {}
    public void onConnected() {}
    public void onDisconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void setAppName(java.lang.String p0, int p1) {}
    public static void setAppName(java.lang.String p0, java.lang.String p1, int p2) {}
    public static android.ddm.DdmHandleAppName.Names getNames() { return null; }

    static final class Names {
        public java.lang.String getAppName() { return null; }
        public java.lang.String getPkgName() { return null; }
    }
}
