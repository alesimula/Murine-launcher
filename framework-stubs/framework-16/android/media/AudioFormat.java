package android.media;

public final class AudioFormat implements android.os.Parcelable {
    public static final int ENCODING_INVALID = 0;
    public static final int ENCODING_DEFAULT = 1;
    public static final int ENCODING_PCM_16BIT = 2;
    public static final int ENCODING_PCM_8BIT = 3;
    public static final int ENCODING_PCM_FLOAT = 4;
    public static final int ENCODING_AC3 = 5;
    public static final int ENCODING_E_AC3 = 6;
    public static final int ENCODING_DTS = 7;
    public static final int ENCODING_DTS_HD = 8;
    public static final int ENCODING_MP3 = 9;
    public static final int ENCODING_AAC_LC = 10;
    public static final int ENCODING_AAC_HE_V1 = 11;
    public static final int ENCODING_AAC_HE_V2 = 12;
    public static final int ENCODING_IEC61937 = 13;
    public static final int ENCODING_DOLBY_TRUEHD = 14;
    public static final int ENCODING_AAC_ELD = 15;
    public static final int ENCODING_AAC_XHE = 16;
    public static final int ENCODING_AC4 = 17;
    public static final int ENCODING_E_AC3_JOC = 18;
    public static final int ENCODING_DOLBY_MAT = 19;
    public static final int ENCODING_OPUS = 20;
    public static final int ENCODING_LEGACY_SHORT_ARRAY_THRESHOLD = 20;
    public static final int ENCODING_PCM_24BIT_PACKED = 21;
    public static final int ENCODING_PCM_32BIT = 22;
    public static final int ENCODING_MPEGH_BL_L3 = 23;
    public static final int ENCODING_MPEGH_BL_L4 = 24;
    public static final int ENCODING_MPEGH_LC_L3 = 25;
    public static final int ENCODING_MPEGH_LC_L4 = 26;
    @java.lang.Deprecated
    public static final int ENCODING_DTS_UHD = 27;
    public static final int ENCODING_DRA = 28;
    public static final int ENCODING_DTS_HD_MA = 29;
    public static final int ENCODING_DTS_UHD_P1 = 27;
    public static final int ENCODING_DTS_UHD_P2 = 30;
    public static final int ENCODING_DSD = 31;
    @android.annotation.FlaggedApi("android.media.audio.dolby_ac4_level4_encoding_api")
    public static final int ENCODING_AC4_L4 = 32;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_SIMPLE_PROFILE_OPUS = 33;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_SIMPLE_PROFILE_AAC = 34;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_SIMPLE_PROFILE_FLAC = 35;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_SIMPLE_PROFILE_PCM = 36;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_PROFILE_OPUS = 37;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_PROFILE_AAC = 38;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_PROFILE_FLAC = 39;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_PROFILE_PCM = 40;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_ENHANCED_PROFILE_OPUS = 41;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_ENHANCED_PROFILE_AAC = 42;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_ENHANCED_PROFILE_FLAC = 43;
    @android.annotation.FlaggedApi("android.media.audio.iamf_definitions_api")
    public static final int ENCODING_IAMF_BASE_ENHANCED_PROFILE_PCM = 44;
    @java.lang.Deprecated
    public static final int CHANNEL_CONFIGURATION_INVALID = 0;
    @java.lang.Deprecated
    public static final int CHANNEL_CONFIGURATION_DEFAULT = 1;
    @java.lang.Deprecated
    public static final int CHANNEL_CONFIGURATION_MONO = 2;
    @java.lang.Deprecated
    public static final int CHANNEL_CONFIGURATION_STEREO = 3;
    public static final int CHANNEL_INVALID = 0;
    public static final int CHANNEL_OUT_DEFAULT = 1;
    public static final int CHANNEL_OUT_FRONT_LEFT = 4;
    public static final int CHANNEL_OUT_FRONT_RIGHT = 8;
    public static final int CHANNEL_OUT_FRONT_CENTER = 16;
    public static final int CHANNEL_OUT_LOW_FREQUENCY = 32;
    public static final int CHANNEL_OUT_BACK_LEFT = 64;
    public static final int CHANNEL_OUT_BACK_RIGHT = 128;
    public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = 256;
    public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = 512;
    public static final int CHANNEL_OUT_BACK_CENTER = 1024;
    public static final int CHANNEL_OUT_SIDE_LEFT = 2048;
    public static final int CHANNEL_OUT_SIDE_RIGHT = 4096;
    public static final int CHANNEL_OUT_TOP_CENTER = 8192;
    public static final int CHANNEL_OUT_TOP_FRONT_LEFT = 16384;
    public static final int CHANNEL_OUT_TOP_FRONT_CENTER = 32768;
    public static final int CHANNEL_OUT_TOP_FRONT_RIGHT = 65536;
    public static final int CHANNEL_OUT_TOP_BACK_LEFT = 131072;
    public static final int CHANNEL_OUT_TOP_BACK_CENTER = 262144;
    public static final int CHANNEL_OUT_TOP_BACK_RIGHT = 524288;
    public static final int CHANNEL_OUT_TOP_SIDE_LEFT = 1048576;
    public static final int CHANNEL_OUT_TOP_SIDE_RIGHT = 2097152;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_LEFT = 4194304;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_CENTER = 8388608;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_RIGHT = 16777216;
    public static final int CHANNEL_OUT_LOW_FREQUENCY_2 = 33554432;
    public static final int CHANNEL_OUT_FRONT_WIDE_LEFT = 67108864;
    public static final int CHANNEL_OUT_FRONT_WIDE_RIGHT = 134217728;
    public static final int CHANNEL_OUT_HAPTIC_B = 268435456;
    public static final int CHANNEL_OUT_HAPTIC_A = 536870912;
    public static final int CHANNEL_OUT_MONO = 4;
    public static final int CHANNEL_OUT_STEREO = 12;
    public static final int CHANNEL_OUT_QUAD = 204;
    public static final int CHANNEL_OUT_QUAD_SIDE = 6156;
    public static final int CHANNEL_OUT_SURROUND = 1052;
    public static final int CHANNEL_OUT_5POINT1 = 252;
    public static final int CHANNEL_OUT_6POINT1 = 1276;
    public static final int CHANNEL_OUT_5POINT1_SIDE = 6204;
    @java.lang.Deprecated
    public static final int CHANNEL_OUT_7POINT1 = 1020;
    public static final int CHANNEL_OUT_7POINT1_SURROUND = 6396;
    public static final int CHANNEL_OUT_5POINT1POINT2 = 3145980;
    public static final int CHANNEL_OUT_5POINT1POINT4 = 737532;
    public static final int CHANNEL_OUT_7POINT1POINT2 = 3152124;
    public static final int CHANNEL_OUT_7POINT1POINT4 = 743676;
    public static final int CHANNEL_OUT_9POINT1POINT4 = 202070268;
    public static final int CHANNEL_OUT_9POINT1POINT6 = 205215996;
    @android.annotation.FlaggedApi("android.media.audio.sony_360ra_mpegh_3d_format")
    public static final int CHANNEL_OUT_13POINT0 = 30136348;
    public static final int CHANNEL_OUT_22POINT2 = 67108860;
    public static final int SAMPLE_RATE_HZ_MIN = Integer.valueOf(0);
    public static final int SAMPLE_RATE_HZ_MAX = Integer.valueOf(0);
    public static final int SAMPLE_RATE_UNSPECIFIED = 0;
    public static final int CHANNEL_IN_DEFAULT = 1;
    public static final int CHANNEL_IN_LEFT = 4;
    public static final int CHANNEL_IN_RIGHT = 8;
    public static final int CHANNEL_IN_FRONT = 16;
    public static final int CHANNEL_IN_BACK = 32;
    public static final int CHANNEL_IN_LEFT_PROCESSED = 64;
    public static final int CHANNEL_IN_RIGHT_PROCESSED = 128;
    public static final int CHANNEL_IN_FRONT_PROCESSED = 256;
    public static final int CHANNEL_IN_BACK_PROCESSED = 512;
    public static final int CHANNEL_IN_PRESSURE = 1024;
    public static final int CHANNEL_IN_X_AXIS = 2048;
    public static final int CHANNEL_IN_Y_AXIS = 4096;
    public static final int CHANNEL_IN_Z_AXIS = 8192;
    public static final int CHANNEL_IN_VOICE_UPLINK = 16384;
    public static final int CHANNEL_IN_VOICE_DNLINK = 32768;
    public static final int CHANNEL_IN_BACK_LEFT = 65536;
    public static final int CHANNEL_IN_BACK_RIGHT = 131072;
    public static final int CHANNEL_IN_CENTER = 262144;
    public static final int CHANNEL_IN_LOW_FREQUENCY = 1048576;
    public static final int CHANNEL_IN_TOP_LEFT = 2097152;
    public static final int CHANNEL_IN_TOP_RIGHT = 4194304;
    public static final int CHANNEL_IN_MONO = 16;
    public static final int CHANNEL_IN_STEREO = 12;
    public static final int CHANNEL_IN_2POINT0POINT2 = 6291468;
    public static final int CHANNEL_IN_2POINT1POINT2 = 7340044;
    public static final int CHANNEL_IN_3POINT0POINT2 = 6553612;
    public static final int CHANNEL_IN_3POINT1POINT2 = 7602188;
    public static final int CHANNEL_IN_5POINT1 = 1507340;
    public static final int CHANNEL_IN_FRONT_BACK = 48;
    public static final int AUDIO_FORMAT_HAS_PROPERTY_NONE = 0;
    public static final int AUDIO_FORMAT_HAS_PROPERTY_ENCODING = 1;
    public static final int AUDIO_FORMAT_HAS_PROPERTY_SAMPLE_RATE = 2;
    public static final int AUDIO_FORMAT_HAS_PROPERTY_CHANNEL_MASK = 4;
    public static final int AUDIO_FORMAT_HAS_PROPERTY_CHANNEL_INDEX_MASK = 8;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.AudioFormat> CREATOR = null;
    public static final int[] SURROUND_SOUND_ENCODING = null;
    public static java.lang.String toLogFriendlyEncoding(int p0) { return null; }
    public static int inChannelMaskFromOutChannelMask(int p0) throws java.lang.IllegalArgumentException { return 0; }
    public static int channelCountFromInChannelMask(int p0) { return 0; }
    public static int channelCountFromOutChannelMask(int p0) { return 0; }
    public static int convertChannelOutMaskToNativeMask(int p0) { return 0; }
    public static int convertNativeChannelMaskToOutMask(int p0) { return 0; }
    public static java.lang.String javaChannelOutMaskToString(int p0) { return null; }
    public static int getBytesPerSample(int p0) { return 0; }
    public static boolean isValidEncoding(int p0) { return false; }
    public static boolean isPublicEncoding(int p0) { return false; }
    public static boolean isEncodingLinearPcm(int p0) { return false; }
    public static boolean isEncodingLinearFrames(int p0) { return false; }
    public static int[] filterPublicFormats(int[] p0) { return null; }
    public AudioFormat() {}
    public int getEncoding() { return 0; }
    public int getSampleRate() { return 0; }
    public int getChannelMask() { return 0; }
    public int getChannelIndexMask() { return 0; }
    public int getChannelCount() { return 0; }
    public int getFrameSizeInBytes() { return 0; }
    public int getPropertySetMask() { return 0; }
    public java.lang.String toLogFriendlyString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String toDisplayName(int p0) { return null; }

    public static class Builder {
        public Builder() {}
        public Builder(android.media.AudioFormat p0) {}
        public android.media.AudioFormat build() { return null; }
        public android.media.AudioFormat.Builder setEncoding(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioFormat.Builder setChannelMask(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioFormat.Builder setChannelIndexMask(int p0) { return null; }
        public android.media.AudioFormat.Builder setSampleRate(int p0) throws java.lang.IllegalArgumentException { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChannelOut {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Encoding {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncodingCanBeInvalid {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SurroundSoundEncoding {
    }
}
