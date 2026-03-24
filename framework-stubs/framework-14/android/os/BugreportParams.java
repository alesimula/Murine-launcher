package android.os;

@android.annotation.SystemApi
public final class BugreportParams {
    public static final int BUGREPORT_MODE_FULL = 0;
    public static final int BUGREPORT_MODE_INTERACTIVE = 1;
    public static final int BUGREPORT_MODE_REMOTE = 2;
    public static final int BUGREPORT_MODE_WEAR = 3;
    public static final int BUGREPORT_MODE_TELEPHONY = 4;
    public static final int BUGREPORT_MODE_WIFI = 5;
    public static final int BUGREPORT_FLAG_USE_PREDUMPED_UI_DATA = 1;
    public static final int BUGREPORT_FLAG_DEFER_CONSENT = 2;
    public BugreportParams(int p0) {}
    public BugreportParams(int p0, int p1) {}
    public int getMode() { return 0; }
    public int getFlags() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BugreportFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BugreportMode {
    }
}
