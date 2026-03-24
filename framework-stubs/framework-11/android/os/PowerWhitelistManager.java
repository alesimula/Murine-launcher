package android.os;

@android.annotation.SystemApi
public class PowerWhitelistManager {
    private final android.content.Context mContext = null;
    private final android.os.IDeviceIdleController mService = null;
    public static final int EVENT_UNSPECIFIED = 0;
    public static final int EVENT_SMS = 1;
    public static final int EVENT_MMS = 2;
    public PowerWhitelistManager(android.content.Context p0) {}
    public void addToWhitelist(java.lang.String p0) {}
    public void addToWhitelist(java.util.List<java.lang.String> p0) {}
    public int[] getWhitelistedAppIds(boolean p0) { return null; }
    public boolean isWhitelisted(java.lang.String p0, boolean p1) { return false; }
    public void whitelistAppTemporarily(java.lang.String p0, long p1) {}
    public long whitelistAppTemporarilyForEvent(java.lang.String p0, int p1, java.lang.String p2) { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WhitelistEvent {
    }
}
