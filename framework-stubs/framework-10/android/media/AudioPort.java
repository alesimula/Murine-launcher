package android.media;

public class AudioPort {
    private static final java.lang.String TAG = "AudioPort";
    public static final int ROLE_NONE = 0;
    public static final int ROLE_SOURCE = 1;
    public static final int ROLE_SINK = 2;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_DEVICE = 1;
    public static final int TYPE_SUBMIX = 2;
    public static final int TYPE_SESSION = 3;
    @android.annotation.UnsupportedAppUsage
    android.media.AudioHandle mHandle;
    @android.annotation.UnsupportedAppUsage
    protected final int mRole = 0;
    private final java.lang.String mName = null;
    private final int[] mSamplingRates = null;
    private final int[] mChannelMasks = null;
    private final int[] mChannelIndexMasks = null;
    private final int[] mFormats = null;
    @android.annotation.UnsupportedAppUsage
    private final android.media.AudioGain[] mGains = null;
    @android.annotation.UnsupportedAppUsage
    private android.media.AudioPortConfig mActiveConfig;
    @android.annotation.UnsupportedAppUsage
    AudioPort(android.media.AudioHandle p0, int p1, java.lang.String p2, int[] p3, int[] p4, int[] p5, int[] p6, android.media.AudioGain[] p7) {}
    android.media.AudioHandle handle() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int id() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int role() { return 0; }
    public java.lang.String name() { return null; }
    public int[] samplingRates() { return null; }
    public int[] channelMasks() { return null; }
    public int[] channelIndexMasks() { return null; }
    public int[] formats() { return null; }
    public android.media.AudioGain[] gains() { return null; }
    android.media.AudioGain gain(int p0) { return null; }
    public android.media.AudioPortConfig buildConfig(int p0, int p1, int p2, android.media.AudioGainConfig p3) { return null; }
    public android.media.AudioPortConfig activeConfig() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
