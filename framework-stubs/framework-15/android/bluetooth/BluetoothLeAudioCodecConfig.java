package android.bluetooth;

public final class BluetoothLeAudioCodecConfig implements android.os.Parcelable {
    public static final int BITS_PER_SAMPLE_16 = 1;
    public static final int BITS_PER_SAMPLE_24 = 2;
    public static final int BITS_PER_SAMPLE_32 = 8;
    public static final int BITS_PER_SAMPLE_NONE = 0;
    public static final int CHANNEL_COUNT_1 = 1;
    public static final int CHANNEL_COUNT_2 = 2;
    public static final int CHANNEL_COUNT_NONE = 0;
    public static final int CODEC_PRIORITY_DEFAULT = 0;
    public static final int CODEC_PRIORITY_DISABLED = -1;
    public static final int CODEC_PRIORITY_HIGHEST = 1000000;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothLeAudioCodecConfig> CREATOR = null;
    public static final int FRAME_DURATION_10000 = 2;
    public static final int FRAME_DURATION_7500 = 1;
    public static final int FRAME_DURATION_NONE = 0;
    public static final int SAMPLE_RATE_11025 = 2;
    public static final int SAMPLE_RATE_16000 = 4;
    public static final int SAMPLE_RATE_176400 = 1024;
    public static final int SAMPLE_RATE_192000 = 2048;
    public static final int SAMPLE_RATE_22050 = 8;
    public static final int SAMPLE_RATE_24000 = 16;
    public static final int SAMPLE_RATE_32000 = 32;
    public static final int SAMPLE_RATE_384000 = 4096;
    public static final int SAMPLE_RATE_44100 = 64;
    public static final int SAMPLE_RATE_48000 = 128;
    public static final int SAMPLE_RATE_8000 = 1;
    public static final int SAMPLE_RATE_88200 = 256;
    public static final int SAMPLE_RATE_96000 = 512;
    public static final int SAMPLE_RATE_NONE = 0;
    public static final int SOURCE_CODEC_TYPE_INVALID = 1000000;
    public static final int SOURCE_CODEC_TYPE_LC3 = 0;
    BluetoothLeAudioCodecConfig() {}
    public int describeContents() { return 0; }
    public int getBitsPerSample() { return 0; }
    public int getChannelCount() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getCodecName() { return null; }
    public int getCodecPriority() { return 0; }
    public int getCodecType() { return 0; }
    public int getFrameDuration() { return 0; }
    public int getMaxOctetsPerFrame() { return 0; }
    public int getMinOctetsPerFrame() { return 0; }
    public int getOctetsPerFrame() { return 0; }
    public int getSampleRate() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.bluetooth.BluetoothLeAudioCodecConfig p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setBitsPerSample(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setChannelCount(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecPriority(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecType(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setFrameDuration(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMaxOctetsPerFrame(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMinOctetsPerFrame(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setOctetsPerFrame(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder setSampleRate(int p0) { return null; }
    }
}
