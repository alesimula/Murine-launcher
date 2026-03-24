package android.bluetooth;

public final class BluetoothCodecConfig implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_SBC = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_AAC = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_APTX = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_APTX_HD = 3;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_LDAC = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_MAX = 5;
    @android.annotation.UnsupportedAppUsage
    public static final int SOURCE_CODEC_TYPE_INVALID = 1000000;
    @android.annotation.UnsupportedAppUsage
    public static final int CODEC_PRIORITY_DISABLED = -1;
    @android.annotation.UnsupportedAppUsage
    public static final int CODEC_PRIORITY_DEFAULT = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int CODEC_PRIORITY_HIGHEST = 1000000;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_NONE = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_44100 = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_48000 = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_88200 = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_96000 = 8;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_176400 = 16;
    @android.annotation.UnsupportedAppUsage
    public static final int SAMPLE_RATE_192000 = 32;
    @android.annotation.UnsupportedAppUsage
    public static final int BITS_PER_SAMPLE_NONE = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int BITS_PER_SAMPLE_16 = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int BITS_PER_SAMPLE_24 = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int BITS_PER_SAMPLE_32 = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int CHANNEL_MODE_NONE = 0;
    @android.annotation.UnsupportedAppUsage
    public static final int CHANNEL_MODE_MONO = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int CHANNEL_MODE_STEREO = 2;
    private final int mCodecType = 0;
    private int mCodecPriority;
    private final int mSampleRate = 0;
    private final int mBitsPerSample = 0;
    private final int mChannelMode = 0;
    private final long mCodecSpecific1 = 0L;
    private final long mCodecSpecific2 = 0L;
    private final long mCodecSpecific3 = 0L;
    private final long mCodecSpecific4 = 0L;
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothCodecConfig> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public BluetoothCodecConfig(int p0, int p1, int p2, int p3, int p4, long p5, long p6, long p7, long p8) {}
    @android.annotation.UnsupportedAppUsage
    public BluetoothCodecConfig(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    private static java.lang.String appendCapabilityToString(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getCodecName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public int getCodecType() { return 0; }
    public boolean isMandatoryCodec() { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getCodecPriority() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setCodecPriority(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public int getSampleRate() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getBitsPerSample() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getChannelMode() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public long getCodecSpecific1() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getCodecSpecific2() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getCodecSpecific3() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public long getCodecSpecific4() { return 0L; }
    public boolean sameAudioFeedingParameters(android.bluetooth.BluetoothCodecConfig p0) { return false; }
}
