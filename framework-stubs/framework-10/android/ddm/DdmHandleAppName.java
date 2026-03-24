package android.ddm;

public class DdmHandleAppName {
    public static final int CHUNK_APNM = Integer.valueOf(0);
    private static volatile java.lang.String mAppName;
    private static android.ddm.DdmHandleAppName mInstance;
    private DdmHandleAppName() {}
    public static void register() {}
    public void connected() {}
    public void disconnected() {}
    public org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void setAppName(java.lang.String p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getAppName() { return null; }
    private static void sendAPNM(java.lang.String p0, int p1) {}
}
