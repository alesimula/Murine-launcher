package android.media;

public final class MediaCodecList {
    public static final int REGULAR_CODECS = 0;
    public static final int ALL_CODECS = 1;
    public static final int getCodecCount() { return 0; }
    public static final android.media.MediaCodecInfo getCodecInfoAt(int p0) { return null; }
    static final java.util.Map<java.lang.String, java.lang.Object> getGlobalSettings() { return null; }
    static final native java.lang.String getCodecName(int p0);
    static final native java.lang.String getCanonicalName(int p0);
    static final native int getAttributes(int p0);
    static final native java.lang.String[] getSupportedTypes(int p0);
    static final native android.media.MediaCodecInfo.CodecCapabilities getCodecCapabilities(int p0, java.lang.String p1);
    static final native java.util.Map<java.lang.String, java.lang.Object> native_getGlobalSettings();
    static final native int findCodecByName(java.lang.String p0);
    public static android.media.MediaCodecInfo getInfoFor(java.lang.String p0) { return null; }
    public MediaCodecList(int p0) {}
    public final android.media.MediaCodecInfo[] getCodecInfos() { return null; }
    public final java.lang.String findDecoderForFormat(android.media.MediaFormat p0) { return null; }
    public final java.lang.String findEncoderForFormat(android.media.MediaFormat p0) { return null; }
}
