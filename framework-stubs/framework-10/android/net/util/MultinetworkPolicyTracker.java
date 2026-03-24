package android.net.util;

public class MultinetworkPolicyTracker {
    private static java.lang.String TAG;
    private final android.content.Context mContext = null;
    private final android.os.Handler mHandler = null;
    private final java.lang.Runnable mReevaluateRunnable = null;
    private final java.util.List<android.net.Uri> mSettingsUris = null;
    private final android.content.ContentResolver mResolver = null;
    private final android.net.util.MultinetworkPolicyTracker.SettingObserver mSettingObserver = null;
    private final android.content.BroadcastReceiver mBroadcastReceiver = null;
    private volatile boolean mAvoidBadWifi;
    private volatile int mMeteredMultipathPreference;
    private int mActiveSubId;
    public MultinetworkPolicyTracker(android.content.Context p0, android.os.Handler p1) {}
    public MultinetworkPolicyTracker(android.content.Context p0, android.os.Handler p1, java.lang.Runnable p2) {}
    public void start() {}
    public void shutdown() {}
    public boolean getAvoidBadWifi() { return false; }
    public int getMeteredMultipathPreference() { return 0; }
    public boolean configRestrictsAvoidBadWifi() { return false; }
    private android.content.res.Resources getResourcesForActiveSubId() { return null; }
    public boolean shouldNotifyWifiUnvalidated() { return false; }
    public java.lang.String getAvoidBadWifiSetting() { return null; }
    public void reevaluate() {}
    public boolean updateAvoidBadWifi() { return false; }
    public int configMeteredMultipathPreference() { return 0; }
    public void updateMeteredMultipathPreference() {}

    private class SettingObserver extends android.database.ContentObserver {
        public SettingObserver(android.net.util.MultinetworkPolicyTracker p0) { super(null); }
        public void onChange(boolean p0) {}
        public void onChange(boolean p0, android.net.Uri p1) {}
    }
}
