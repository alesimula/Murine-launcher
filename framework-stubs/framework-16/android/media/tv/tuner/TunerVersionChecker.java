package android.media.tv.tuner;

@android.annotation.SystemApi
public final class TunerVersionChecker {
    public static final int TUNER_VERSION_UNKNOWN = 0;
    public static final int TUNER_VERSION_1_0 = 65536;
    public static final int TUNER_VERSION_1_1 = 65537;
    public static final int TUNER_VERSION_2_0 = 131072;
    public static final int TUNER_VERSION_3_0 = 196608;
    @android.annotation.FlaggedApi("android.media.tv.flags.tuner_w_apis")
    public static final int TUNER_VERSION_4_0 = 262144;
    public static int getTunerVersion() { return 0; }
    public static boolean supportTunerVersion(int p0) { return false; }
    public static boolean isHigherOrEqualVersionTo(int p0) { return false; }
    public static int getMajorVersion(int p0) { return 0; }
    public static int getMinorVersion(int p0) { return 0; }
    public static boolean checkHigherOrEqualVersionTo(int p0, java.lang.String p1) { return false; }
    public static boolean checkSupportVersion(int p0, java.lang.String p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TunerVersion {
    }
}
