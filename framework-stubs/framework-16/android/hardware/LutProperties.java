package android.hardware;

@android.annotation.FlaggedApi("android.hardware.flags.luts_api")
public final class LutProperties {
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static final int SAMPLING_KEY_RGB = 0;
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static final int SAMPLING_KEY_MAX_RGB = 1;
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static final int SAMPLING_KEY_CIE_Y = 2;
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static final int ONE_DIMENSION = 1;
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public static final int THREE_DIMENSION = 3;
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public int getDimension() { return 0; }
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    public int getSize() { return 0; }
    @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
    @android.annotation.NonNull
    public int[] getSamplingKeys() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Dimension {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SamplingKey {
    }
}
