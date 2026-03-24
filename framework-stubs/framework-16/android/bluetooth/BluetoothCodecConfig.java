package android.bluetooth;

public final class BluetoothCodecConfig implements android.os.Parcelable {
    public static final int BITS_PER_SAMPLE_16 = 1;
    public static final int BITS_PER_SAMPLE_24 = 2;
    public static final int BITS_PER_SAMPLE_32 = 4;
    public static final int BITS_PER_SAMPLE_NONE = 0;
    public static final int CHANNEL_MODE_MONO = 1;
    public static final int CHANNEL_MODE_NONE = 0;
    public static final int CHANNEL_MODE_STEREO = 2;
    public static final int CODEC_PRIORITY_DEFAULT = 0;
    public static final int CODEC_PRIORITY_DISABLED = -1;
    public static final int CODEC_PRIORITY_HIGHEST = 1000000;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothCodecConfig> CREATOR = null;
    public static final int SAMPLE_RATE_176400 = 16;
    public static final int SAMPLE_RATE_192000 = 32;
    public static final int SAMPLE_RATE_44100 = 1;
    public static final int SAMPLE_RATE_48000 = 2;
    public static final int SAMPLE_RATE_88200 = 4;
    public static final int SAMPLE_RATE_96000 = 8;
    public static final int SAMPLE_RATE_NONE = 0;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_AAC = 1;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_APTX = 2;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_APTX_HD = 3;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_INVALID = 1000000;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_LC3 = 5;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_LDAC = 4;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_OPUS = 6;
    @java.lang.Deprecated
    public static final int SOURCE_CODEC_TYPE_SBC = 0;
    BluetoothCodecConfig() {}
    public int describeContents() { return 0; }
    public int getBitsPerSample() { return 0; }
    public int getChannelMode() { return 0; }
    public int getCodecPriority() { return 0; }
    public long getCodecSpecific1() { return 0L; }
    public long getCodecSpecific2() { return 0L; }
    public long getCodecSpecific3() { return 0L; }
    public long getCodecSpecific4() { return 0L; }
    @java.lang.Deprecated
    public int getCodecType() { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothCodecType getExtendedCodecType() { return null; }
    public int getSampleRate() { return 0; }
    public boolean isMandatoryCodec() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setBitsPerSample(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setChannelMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecPriority(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific1(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific2(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific3(long p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific4(long p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setCodecType(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setExtendedCodecType(android.bluetooth.BluetoothCodecType p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothCodecConfig.Builder setSampleRate(int p0) { return null; }
    }
}
