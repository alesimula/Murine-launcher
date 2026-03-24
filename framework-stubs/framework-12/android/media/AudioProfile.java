package android.media;

public class AudioProfile {
    public static final int AUDIO_ENCAPSULATION_TYPE_NONE = 0;
    public static final int AUDIO_ENCAPSULATION_TYPE_IEC61937 = 1;
    private final int mFormat = 0;
    private final int[] mSamplingRates = null;
    private final int[] mChannelMasks = null;
    private final int[] mChannelIndexMasks = null;
    private final int mEncapsulationType = 0;
    AudioProfile(int p0, int[] p1, int[] p2, int[] p3, int p4) {}
    public int getFormat() { return 0; }
    public int[] getChannelMasks() { return null; }
    public int[] getChannelIndexMasks() { return null; }
    public int[] getSampleRates() { return null; }
    public int getEncapsulationType() { return 0; }
    public java.lang.String toString() { return null; }
    private static java.lang.String toHexString(int[] p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncapsulationType {
    }
}
