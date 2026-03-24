package android.ddm;

public class DdmHandleAppName {
    public static final int CHUNK_APNM = Integer.valueOf(0);
    private static volatile android.ddm.DdmHandleAppName.Names sNames;
    private static android.ddm.DdmHandleAppName mInstance;
    private DdmHandleAppName() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    public static void setAppName(java.lang.String p0, int p1) {}
    public static void setAppName(java.lang.String p0, java.lang.String p1, int p2) {}
    public static android.ddm.DdmHandleAppName.Names getNames() { return null; }
    private static void sendAPNM(java.lang.String p0, java.lang.String p1, int p2) {}

    static final class Names {
        private final java.lang.String mAppName = null;
        private final java.lang.String mPkgName = null;
        private Names(java.lang.String p0, java.lang.String p1) {}
        public java.lang.String getAppName() { return null; }
        public java.lang.String getPkgName() { return null; }
    }
}
