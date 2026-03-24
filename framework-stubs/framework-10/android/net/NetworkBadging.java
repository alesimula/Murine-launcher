package android.net;

@java.lang.Deprecated
public class NetworkBadging {
    public static final int BADGING_NONE = 0;
    public static final int BADGING_SD = 10;
    public static final int BADGING_HD = 20;
    public static final int BADGING_4K = 30;
    private NetworkBadging() {}
    public static android.graphics.drawable.Drawable getWifiIcon(int p0, int p1, android.content.res.Resources.Theme p2) { return null; }
    private static int getWifiSignalResource(int p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Badging {
    }
}
