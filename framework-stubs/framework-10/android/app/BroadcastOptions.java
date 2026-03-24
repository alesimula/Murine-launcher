package android.app;

@android.annotation.SystemApi
public class BroadcastOptions {
    private long mTemporaryAppWhitelistDuration;
    private int mMinManifestReceiverApiLevel;
    private int mMaxManifestReceiverApiLevel;
    private boolean mDontSendToRestrictedApps;
    private boolean mAllowBackgroundActivityStarts;
    static final java.lang.String KEY_TEMPORARY_APP_WHITELIST_DURATION = "android:broadcast.temporaryAppWhitelistDuration";
    static final java.lang.String KEY_MIN_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.minManifestReceiverApiLevel";
    static final java.lang.String KEY_MAX_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.maxManifestReceiverApiLevel";
    static final java.lang.String KEY_DONT_SEND_TO_RESTRICTED_APPS = "android:broadcast.dontSendToRestrictedApps";
    static final java.lang.String KEY_ALLOW_BACKGROUND_ACTIVITY_STARTS = "android:broadcast.allowBackgroundActivityStarts";
    public static android.app.BroadcastOptions makeBasic() { return null; }
    private BroadcastOptions() {}
    public BroadcastOptions(android.os.Bundle p0) {}
    public void setTemporaryAppWhitelistDuration(long p0) {}
    public long getTemporaryAppWhitelistDuration() { return 0L; }
    public void setMinManifestReceiverApiLevel(int p0) {}
    public int getMinManifestReceiverApiLevel() { return 0; }
    public void setMaxManifestReceiverApiLevel(int p0) {}
    public int getMaxManifestReceiverApiLevel() { return 0; }
    public void setDontSendToRestrictedApps(boolean p0) {}
    public boolean isDontSendToRestrictedApps() { return false; }
    public void setBackgroundActivityStartsAllowed(boolean p0) {}
    public boolean allowsBackgroundActivityStarts() { return false; }
    public android.os.Bundle toBundle() { return null; }
}
