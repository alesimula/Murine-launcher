package android.media.audio.common;

public final class AudioChannelLayout implements android.os.Parcelable {
    public static final int none = 0;
    public static final int invalid = 1;
    public static final int indexMask = 2;
    public static final int layoutMask = 3;
    public static final int voiceMask = 4;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioChannelLayout> CREATOR = null;
    public static final int INDEX_MASK_1 = 1;
    public static final int INDEX_MASK_2 = 3;
    public static final int INDEX_MASK_3 = 7;
    public static final int INDEX_MASK_4 = 15;
    public static final int INDEX_MASK_5 = 31;
    public static final int INDEX_MASK_6 = 63;
    public static final int INDEX_MASK_7 = 127;
    public static final int INDEX_MASK_8 = 255;
    public static final int INDEX_MASK_9 = 511;
    public static final int INDEX_MASK_10 = 1023;
    public static final int INDEX_MASK_11 = 2047;
    public static final int INDEX_MASK_12 = 4095;
    public static final int INDEX_MASK_13 = 8191;
    public static final int INDEX_MASK_14 = 16383;
    public static final int INDEX_MASK_15 = 32767;
    public static final int INDEX_MASK_16 = 65535;
    public static final int INDEX_MASK_17 = 131071;
    public static final int INDEX_MASK_18 = 262143;
    public static final int INDEX_MASK_19 = 524287;
    public static final int INDEX_MASK_20 = 1048575;
    public static final int INDEX_MASK_21 = 2097151;
    public static final int INDEX_MASK_22 = 4194303;
    public static final int INDEX_MASK_23 = 8388607;
    public static final int INDEX_MASK_24 = 16777215;
    public static final int LAYOUT_MONO = 1;
    public static final int LAYOUT_STEREO = 3;
    public static final int LAYOUT_2POINT1 = 11;
    public static final int LAYOUT_TRI = 7;
    public static final int LAYOUT_TRI_BACK = 259;
    public static final int LAYOUT_3POINT1 = 15;
    public static final int LAYOUT_2POINT0POINT2 = 786435;
    public static final int LAYOUT_2POINT1POINT2 = 786443;
    public static final int LAYOUT_3POINT0POINT2 = 786439;
    public static final int LAYOUT_3POINT1POINT2 = 786447;
    public static final int LAYOUT_QUAD = 51;
    public static final int LAYOUT_QUAD_SIDE = 1539;
    public static final int LAYOUT_SURROUND = 263;
    public static final int LAYOUT_PENTA = 55;
    public static final int LAYOUT_5POINT1 = 63;
    public static final int LAYOUT_5POINT1_SIDE = 1551;
    public static final int LAYOUT_5POINT1POINT2 = 786495;
    public static final int LAYOUT_5POINT1POINT4 = 184383;
    public static final int LAYOUT_6POINT1 = 319;
    public static final int LAYOUT_7POINT1 = 1599;
    public static final int LAYOUT_7POINT1POINT2 = 788031;
    public static final int LAYOUT_7POINT1POINT4 = 185919;
    public static final int LAYOUT_9POINT1POINT4 = 50517567;
    public static final int LAYOUT_9POINT1POINT6 = 51303999;
    public static final int LAYOUT_13POINT_360RA = 7534087;
    public static final int LAYOUT_22POINT2 = 16777215;
    public static final int LAYOUT_MONO_HAPTIC_A = 1073741825;
    public static final int LAYOUT_STEREO_HAPTIC_A = 1073741827;
    public static final int LAYOUT_HAPTIC_AB = 1610612736;
    public static final int LAYOUT_MONO_HAPTIC_AB = 1610612737;
    public static final int LAYOUT_STEREO_HAPTIC_AB = 1610612739;
    public static final int LAYOUT_FRONT_BACK = 260;
    public static final int INTERLEAVE_LEFT = 0;
    public static final int INTERLEAVE_RIGHT = 1;
    public static final int CHANNEL_FRONT_LEFT = 1;
    public static final int CHANNEL_FRONT_RIGHT = 2;
    public static final int CHANNEL_FRONT_CENTER = 4;
    public static final int CHANNEL_LOW_FREQUENCY = 8;
    public static final int CHANNEL_BACK_LEFT = 16;
    public static final int CHANNEL_BACK_RIGHT = 32;
    public static final int CHANNEL_FRONT_LEFT_OF_CENTER = 64;
    public static final int CHANNEL_FRONT_RIGHT_OF_CENTER = 128;
    public static final int CHANNEL_BACK_CENTER = 256;
    public static final int CHANNEL_SIDE_LEFT = 512;
    public static final int CHANNEL_SIDE_RIGHT = 1024;
    public static final int CHANNEL_TOP_CENTER = 2048;
    public static final int CHANNEL_TOP_FRONT_LEFT = 4096;
    public static final int CHANNEL_TOP_FRONT_CENTER = 8192;
    public static final int CHANNEL_TOP_FRONT_RIGHT = 16384;
    public static final int CHANNEL_TOP_BACK_LEFT = 32768;
    public static final int CHANNEL_TOP_BACK_CENTER = 65536;
    public static final int CHANNEL_TOP_BACK_RIGHT = 131072;
    public static final int CHANNEL_TOP_SIDE_LEFT = 262144;
    public static final int CHANNEL_TOP_SIDE_RIGHT = 524288;
    public static final int CHANNEL_BOTTOM_FRONT_LEFT = 1048576;
    public static final int CHANNEL_BOTTOM_FRONT_CENTER = 2097152;
    public static final int CHANNEL_BOTTOM_FRONT_RIGHT = 4194304;
    public static final int CHANNEL_LOW_FREQUENCY_2 = 8388608;
    public static final int CHANNEL_FRONT_WIDE_LEFT = 16777216;
    public static final int CHANNEL_FRONT_WIDE_RIGHT = 33554432;
    public static final int CHANNEL_HAPTIC_B = 536870912;
    public static final int CHANNEL_HAPTIC_A = 1073741824;
    public static final int VOICE_UPLINK_MONO = 16384;
    public static final int VOICE_DNLINK_MONO = 32768;
    public static final int VOICE_CALL_MONO = 49152;
    public static final int CHANNEL_VOICE_UPLINK = 16384;
    public static final int CHANNEL_VOICE_DNLINK = 32768;
    public AudioChannelLayout() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioChannelLayout none(int p0) { return null; }
    public int getNone() { return 0; }
    public void setNone(int p0) {}
    public static android.media.audio.common.AudioChannelLayout invalid(int p0) { return null; }
    public int getInvalid() { return 0; }
    public void setInvalid(int p0) {}
    public static android.media.audio.common.AudioChannelLayout indexMask(int p0) { return null; }
    public int getIndexMask() { return 0; }
    public void setIndexMask(int p0) {}
    public static android.media.audio.common.AudioChannelLayout layoutMask(int p0) { return null; }
    public int getLayoutMask() { return 0; }
    public void setLayoutMask(int p0) {}
    public static android.media.audio.common.AudioChannelLayout voiceMask(int p0) { return null; }
    public int getVoiceMask() { return 0; }
    public void setVoiceMask(int p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int none = 0;
        public static final int invalid = 1;
        public static final int indexMask = 2;
        public static final int layoutMask = 3;
        public static final int voiceMask = 4;
    }
}
