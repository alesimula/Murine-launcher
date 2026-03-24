package android.media;

public class AudioDescriptor {
    public static final int STANDARD_NONE = 0;
    public static final int STANDARD_EDID = 1;
    private final int mStandard = 0;
    private final byte[] mDescriptor = null;
    private final int mEncapsulationType = 0;
    AudioDescriptor(int p0, int p1, byte[] p2) {}
    public int getStandard() { return 0; }
    public byte[] getDescriptor() { return null; }
    public int getEncapsulationType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioDescriptorStandard {
    }
}
