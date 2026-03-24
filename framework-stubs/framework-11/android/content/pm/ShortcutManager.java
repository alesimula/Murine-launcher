package android.content.pm;

public class ShortcutManager {
    private static final java.lang.String TAG = "ShortcutManager";
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_PINNED = 4;
    public static final int FLAG_MATCH_CACHED = 8;
    private final android.content.Context mContext = null;
    private final android.content.pm.IShortcutService mService = null;
    public ShortcutManager(android.content.Context p0, android.content.pm.IShortcutService p1) {}
    public ShortcutManager(android.content.Context p0) {}
    public boolean setDynamicShortcuts(java.util.List<android.content.pm.ShortcutInfo> p0) { return false; }
    public java.util.List<android.content.pm.ShortcutInfo> getDynamicShortcuts() { return null; }
    public java.util.List<android.content.pm.ShortcutInfo> getManifestShortcuts() { return null; }
    public java.util.List<android.content.pm.ShortcutInfo> getShortcuts(int p0) { return null; }
    public boolean addDynamicShortcuts(java.util.List<android.content.pm.ShortcutInfo> p0) { return false; }
    public void removeDynamicShortcuts(java.util.List<java.lang.String> p0) {}
    public void removeAllDynamicShortcuts() {}
    public void removeLongLivedShortcuts(java.util.List<java.lang.String> p0) {}
    public java.util.List<android.content.pm.ShortcutInfo> getPinnedShortcuts() { return null; }
    public boolean updateShortcuts(java.util.List<android.content.pm.ShortcutInfo> p0) { return false; }
    public void disableShortcuts(java.util.List<java.lang.String> p0) {}
    public void disableShortcuts(java.util.List<java.lang.String> p0, int p1) {}
    public void disableShortcuts(java.util.List<java.lang.String> p0, java.lang.String p1) {}
    public void disableShortcuts(java.util.List<java.lang.String> p0, java.lang.CharSequence p1) {}
    public void enableShortcuts(java.util.List<java.lang.String> p0) {}
    public int getMaxShortcutCountForActivity() { return 0; }
    public int getMaxShortcutCountPerActivity() { return 0; }
    public int getRemainingCallCount() { return 0; }
    public long getRateLimitResetTime() { return 0L; }
    public boolean isRateLimitingActive() { return false; }
    public int getIconMaxWidth() { return 0; }
    public int getIconMaxHeight() { return 0; }
    public void reportShortcutUsed(java.lang.String p0) {}
    public boolean isRequestPinShortcutSupported() { return false; }
    public boolean requestPinShortcut(android.content.pm.ShortcutInfo p0, android.content.IntentSender p1) { return false; }
    public android.content.Intent createShortcutResultIntent(android.content.pm.ShortcutInfo p0) { return null; }
    public void onApplicationActive(java.lang.String p0, int p1) {}
    protected int injectMyUserId() { return 0; }
    @android.annotation.SystemApi
    public java.util.List<android.content.pm.ShortcutManager.ShareShortcutInfo> getShareTargets(android.content.IntentFilter p0) { return null; }
    @android.annotation.SystemApi
    public boolean hasShareTargets(java.lang.String p0) { return false; }
    public void pushDynamicShortcut(android.content.pm.ShortcutInfo p0) {}

    @android.annotation.SystemApi
    public static final class ShareShortcutInfo implements android.os.Parcelable {
        private final android.content.pm.ShortcutInfo mShortcutInfo = null;
        private final android.content.ComponentName mTargetComponent = null;
        public static final android.os.Parcelable.Creator<android.content.pm.ShortcutManager.ShareShortcutInfo> CREATOR = null;
        public ShareShortcutInfo(android.content.pm.ShortcutInfo p0, android.content.ComponentName p1) {}
        private ShareShortcutInfo(android.os.Parcel p0) {}
        public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
        public android.content.ComponentName getTargetComponent() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShortcutMatchFlags {
    }
}
