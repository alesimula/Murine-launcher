package android.media;

public final class MediaCodecList {
    private static final java.lang.String TAG = "MediaCodecList";
    private static java.lang.Object sInitLock;
    private static android.media.MediaCodecInfo[] sAllCodecInfos;
    private static android.media.MediaCodecInfo[] sRegularCodecInfos;
    private static java.util.Map<java.lang.String, java.lang.Object> sGlobalSettings;
    public static final int REGULAR_CODECS = 0;
    public static final int ALL_CODECS = 1;
    private android.media.MediaCodecInfo[] mCodecInfos;
    public static final int getCodecCount() { return 0; }
    private static final native int native_getCodecCount();
    public static final android.media.MediaCodecInfo getCodecInfoAt(int p0) { return null; }
    static final java.util.Map<java.lang.String, java.lang.Object> getGlobalSettings() { return null; }
    private static final void initCodecList() {}
    private static android.media.MediaCodecInfo getNewCodecInfoAt(int p0) { return null; }
    static final native java.lang.String getCodecName(int p0);
    static final native java.lang.String getCanonicalName(int p0);
    static final native int getAttributes(int p0);
    static final native java.lang.String[] getSupportedTypes(int p0);
    static final native android.media.MediaCodecInfo.CodecCapabilities getCodecCapabilities(int p0, java.lang.String p1);
    static final native java.util.Map<java.lang.String, java.lang.Object> native_getGlobalSettings();
    static final native int findCodecByName(java.lang.String p0);
    public static android.media.MediaCodecInfo getInfoFor(java.lang.String p0) { return null; }
    private static final native void native_init();
    private MediaCodecList() {}
    public MediaCodecList(int p0) {}
    public final android.media.MediaCodecInfo[] getCodecInfos() { return null; }
    public final java.lang.String findDecoderForFormat(android.media.MediaFormat p0) { return null; }
    public final java.lang.String findEncoderForFormat(android.media.MediaFormat p0) { return null; }
    private java.lang.String findCodecForFormat(boolean p0, android.media.MediaFormat p1) { return null; }
}
