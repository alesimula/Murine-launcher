package android.content.pm;

public class LauncherApps {
    static final java.lang.String TAG = "LauncherApps";
    static final boolean DEBUG = false;
    public static final java.lang.String ACTION_CONFIRM_PIN_SHORTCUT = "android.content.pm.action.CONFIRM_PIN_SHORTCUT";
    public static final java.lang.String ACTION_CONFIRM_PIN_APPWIDGET = "android.content.pm.action.CONFIRM_PIN_APPWIDGET";
    public static final java.lang.String EXTRA_PIN_ITEM_REQUEST = "android.content.pm.extra.PIN_ITEM_REQUEST";
    public static final int FLAG_CACHE_NOTIFICATION_SHORTCUTS = 0;
    public static final int FLAG_CACHE_BUBBLE_SHORTCUTS = 1;
    public static final int FLAG_CACHE_PEOPLE_TILE_SHORTCUTS = 2;
    public LauncherApps(android.content.Context p0, android.content.pm.ILauncherApps p1) {}
    public LauncherApps(android.content.Context p0) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public java.util.List<android.os.UserHandle> getProfiles() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public java.util.List<android.content.pm.LauncherActivityInfo> getActivityList(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.START_TASKS_FROM_RECENTS")
    @android.annotation.Nullable
    public android.app.PendingIntent getMainActivityLaunchIntent(android.content.ComponentName p0, android.os.Bundle p1, android.os.UserHandle p2) { return null; }
    @android.annotation.Nullable
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public final android.content.pm.LauncherUserInfo getLauncherUserInfo(android.os.UserHandle p0) { return null; }
    @android.annotation.Nullable
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public android.content.IntentSender getAppMarketActivityIntent(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.FlaggedApi("android.os.allow_private_profile")
    @android.annotation.NonNull
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public java.util.List<java.lang.String> getPreInstalledSystemPackages(android.os.UserHandle p0) { return null; }
    @android.annotation.Nullable
    @android.annotation.FlaggedApi("android.os.get_private_space_settings")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public android.content.IntentSender getPrivateSpaceSettingsIntent() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public android.content.pm.LauncherActivityInfo resolveActivity(android.content.Intent p0, android.os.UserHandle p1) { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.LauncherActivityInfo> getActivityOverrides() { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.graphics.Rect p2, android.os.Bundle p3) {}
    @android.annotation.NonNull
    public java.util.Map<android.content.ComponentName, android.content.Intent> getActivityLaunchIntentForAllApps(android.os.UserHandle p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.ShortcutInfo> getAvailableShortcuts(android.os.UserHandle p0) { return null; }
    public void startPackageInstallerSessionDetailsActivity(android.content.pm.PackageInstaller.SessionInfo p0, android.graphics.Rect p1, android.os.Bundle p2) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public void startAppDetailsActivity(android.content.ComponentName p0, android.os.UserHandle p1, android.graphics.Rect p2, android.os.Bundle p3) {}
    @android.annotation.Nullable
    public android.app.PendingIntent getShortcutIntent(java.lang.String p0, java.lang.String p1, android.os.Bundle p2, android.os.UserHandle p3) { return null; }
    public java.util.List<android.content.pm.LauncherActivityInfo> getShortcutConfigActivityList(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.Nullable
    public android.content.IntentSender getShortcutConfigActivityIntent(android.content.pm.LauncherActivityInfo p0) { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public boolean isPackageEnabled(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    @android.annotation.Nullable
    public android.os.Bundle getSuspendedPackageLauncherExtras(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public boolean shouldHideFromSuggestions(java.lang.String p0, android.os.UserHandle p1) { return false; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String p0, int p1, android.os.UserHandle p2) throws android.content.pm.PackageManager.NameNotFoundException { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.content.pm.LauncherApps.AppUsageLimit getAppUsageLimit(java.lang.String p0, android.os.UserHandle p1) { return null; }
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public boolean isActivityEnabled(android.content.ComponentName p0, android.os.UserHandle p1) { return false; }
    public boolean hasShortcutHostPermission() { return false; }
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public void registerDumpCallback(android.window.IDumpCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public void saveViewCaptureData() {}
    @android.annotation.RequiresPermission("android.permission.READ_FRAME_BUFFER")
    public void unRegisterDumpCallback(android.window.IDumpCallback p0) {}
    @android.annotation.Nullable
    public java.util.List<android.content.pm.ShortcutInfo> getShortcuts(android.content.pm.LauncherApps.ShortcutQuery p0, android.os.UserHandle p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.content.pm.ShortcutInfo> getShortcutInfo(java.lang.String p0, java.util.List<java.lang.String> p1, android.os.UserHandle p2) { return null; }
    @android.annotation.RequiresPermission(conditional=true, value="android.permission.ACCESS_SHORTCUTS")
    public void pinShortcuts(java.lang.String p0, java.util.List<java.lang.String> p1, android.os.UserHandle p2) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SHORTCUTS")
    public void cacheShortcuts(java.lang.String p0, java.util.List<java.lang.String> p1, android.os.UserHandle p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.ACCESS_SHORTCUTS")
    public void uncacheShortcuts(java.lang.String p0, java.util.List<java.lang.String> p1, android.os.UserHandle p2, int p3) {}
    @java.lang.Deprecated
    public int getShortcutIconResId(android.content.pm.ShortcutInfo p0) { return 0; }
    @java.lang.Deprecated
    public int getShortcutIconResId(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return 0; }
    public android.os.ParcelFileDescriptor getShortcutIconFd(android.content.pm.ShortcutInfo p0) { return null; }
    public android.os.ParcelFileDescriptor getShortcutIconFd(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2) { return null; }
    public android.os.ParcelFileDescriptor getUriShortcutIconFd(android.content.pm.ShortcutInfo p0) { return null; }
    public android.graphics.drawable.Drawable getShortcutIconDrawable(android.content.pm.ShortcutInfo p0, int p1) { return null; }
    public android.graphics.drawable.Icon getShortcutIcon(android.content.pm.ShortcutInfo p0) { return null; }
    public android.graphics.drawable.Drawable getShortcutBadgedIconDrawable(android.content.pm.ShortcutInfo p0, int p1) { return null; }
    public void startShortcut(java.lang.String p0, java.lang.String p1, android.graphics.Rect p2, android.os.Bundle p3, android.os.UserHandle p4) {}
    public void startShortcut(android.content.pm.ShortcutInfo p0, android.graphics.Rect p1, android.os.Bundle p2) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public void registerCallback(android.content.pm.LauncherApps.Callback p0) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    public void registerCallback(android.content.pm.LauncherApps.Callback p0, android.os.Handler p1) {}
    public void unregisterCallback(android.content.pm.LauncherApps.Callback p0) {}
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void setArchiveCompatibility(android.content.pm.LauncherApps.ArchiveCompatibilityParams p0) {}
    public void registerPackageInstallerSessionCallback(java.util.concurrent.Executor p0, android.content.pm.PackageInstaller.SessionCallback p1) {}
    public void unregisterPackageInstallerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    @android.annotation.SuppressLint("RequiresPermission")
    @android.annotation.RequiresPermission(conditional=true, anyOf={"android.permission.ACCESS_HIDDEN_PROFILES_FULL", "android.permission.ACCESS_HIDDEN_PROFILES"})
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getAllPackageInstallerSessions() { return null; }
    public void registerShortcutChangeCallback(android.content.pm.LauncherApps.ShortcutChangeCallback p0, android.content.pm.LauncherApps.ShortcutQuery p1, java.util.concurrent.Executor p2) {}
    public void unregisterShortcutChangeCallback(android.content.pm.LauncherApps.ShortcutChangeCallback p0) {}
    public android.content.pm.LauncherApps.PinItemRequest getPinItemRequest(android.content.Intent p0) { return null; }

    @android.annotation.SystemApi
    public static final class AppUsageLimit implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.pm.LauncherApps.AppUsageLimit> CREATOR = null;
        public AppUsageLimit(long p0, long p1) {}
        public long getTotalUsageLimit() { return 0L; }
        public long getUsageRemaining() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static class ArchiveCompatibilityParams {
        public ArchiveCompatibilityParams() {}
        public boolean isEnableIconOverlay() { return false; }
        public boolean isEnableUnarchivalConfirmation() { return false; }
        public void setEnableIconOverlay(boolean p0) {}
        public void setEnableUnarchivalConfirmation(boolean p0) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onPackageRemoved(java.lang.String p0, android.os.UserHandle p1);
        public abstract void onPackageAdded(java.lang.String p0, android.os.UserHandle p1);
        public abstract void onPackageChanged(java.lang.String p0, android.os.UserHandle p1);
        public abstract void onPackagesAvailable(java.lang.String[] p0, android.os.UserHandle p1, boolean p2);
        public abstract void onPackagesUnavailable(java.lang.String[] p0, android.os.UserHandle p1, boolean p2);
        public void onPackagesSuspended(java.lang.String[] p0, android.os.UserHandle p1) {}
        @java.lang.Deprecated
        public void onPackagesSuspended(java.lang.String[] p0, android.os.UserHandle p1, android.os.Bundle p2) {}
        public void onPackagesUnsuspended(java.lang.String[] p0, android.os.UserHandle p1) {}
        public void onShortcutsChanged(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) {}
        public void onPackageLoadingProgressChanged(java.lang.String p0, android.os.UserHandle p1, float p2) {}
        @android.annotation.FlaggedApi("android.multiuser.add_launcher_user_config")
        public void onUserConfigChanged(android.content.pm.LauncherUserInfo p0) {}
    }

    private static class CallbackMessageHandler extends android.os.Handler {
        public CallbackMessageHandler(android.os.Looper p0, android.content.pm.LauncherApps.Callback p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void postOnPackageAdded(java.lang.String p0, android.os.UserHandle p1) {}
        public void postOnPackageRemoved(java.lang.String p0, android.os.UserHandle p1) {}
        public void postOnPackageChanged(java.lang.String p0, android.os.UserHandle p1) {}
        public void postOnPackagesAvailable(java.lang.String[] p0, android.os.UserHandle p1, boolean p2) {}
        public void postOnPackagesUnavailable(java.lang.String[] p0, android.os.UserHandle p1, boolean p2) {}
        public void postOnPackagesSuspended(java.lang.String[] p0, android.os.Bundle p1, android.os.UserHandle p2) {}
        public void postOnPackagesUnsuspended(java.lang.String[] p0, android.os.UserHandle p1) {}
        public void postOnShortcutChanged(java.lang.String p0, android.os.UserHandle p1, java.util.List<android.content.pm.ShortcutInfo> p2) {}
        public void postOnPackageLoadingProgressChanged(android.os.UserHandle p0, java.lang.String p1, float p2) {}
        public void postOnUserConfigChanged(android.content.pm.LauncherUserInfo p0) {}

        private static class CallbackInfo {
            java.lang.String[] packageNames;
            java.lang.String packageName;
            android.os.Bundle launcherExtras;
            boolean replacing;
            android.os.UserHandle user;
            java.util.List<android.content.pm.ShortcutInfo> shortcuts;
            float mLoadingProgress;
        }
    }

    public static final class PinItemRequest implements android.os.Parcelable {
        public static final int REQUEST_TYPE_SHORTCUT = 1;
        public static final int REQUEST_TYPE_APPWIDGET = 2;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.pm.LauncherApps.PinItemRequest> CREATOR = null;
        public PinItemRequest(android.content.pm.IPinItemRequest p0, int p1) {}
        public int getRequestType() { return 0; }
        @android.annotation.Nullable
        public android.content.pm.ShortcutInfo getShortcutInfo() { return null; }
        @android.annotation.Nullable
        public android.appwidget.AppWidgetProviderInfo getAppWidgetProviderInfo(android.content.Context p0) { return null; }
        @android.annotation.Nullable
        public android.os.Bundle getExtras() { return null; }
        public boolean isValid() { return false; }
        public boolean accept(android.os.Bundle p0) { return false; }
        public boolean accept() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RequestType {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShortcutCacheFlags {
    }

    public static interface ShortcutChangeCallback {
        default public void onShortcutsAddedOrUpdated(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) {}
        default public void onShortcutsRemoved(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) {}
    }

    private static class ShortcutChangeCallbackProxy extends android.content.pm.IShortcutChangeCallback.Stub {
        ShortcutChangeCallbackProxy(java.util.concurrent.Executor p0, android.content.pm.LauncherApps.ShortcutChangeCallback p1) { super(); }
        public void onShortcutsAddedOrUpdated(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) {}
        public void onShortcutsRemoved(java.lang.String p0, java.util.List<android.content.pm.ShortcutInfo> p1, android.os.UserHandle p2) {}
    }

    public static class ShortcutQuery {
        public static final int FLAG_MATCH_DYNAMIC = 1;
        @java.lang.Deprecated
        public static final int FLAG_GET_DYNAMIC = 1;
        public static final int FLAG_MATCH_PINNED = 2;
        @java.lang.Deprecated
        public static final int FLAG_GET_PINNED = 2;
        public static final int FLAG_MATCH_MANIFEST = 8;
        public static final int FLAG_MATCH_CACHED = 16;
        @java.lang.Deprecated
        public static final int FLAG_GET_MANIFEST = 8;
        public static final int FLAG_MATCH_PINNED_BY_ANY_LAUNCHER = 1024;
        public static final int FLAG_MATCH_ALL_KINDS = 27;
        public static final int FLAG_MATCH_ALL_KINDS_WITH_ALL_PINNED = 1051;
        @java.lang.Deprecated
        public static final int FLAG_GET_ALL_KINDS = 27;
        public static final int FLAG_GET_KEY_FIELDS_ONLY = 4;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.ACCESS_SHORTCUTS")
        public static final int FLAG_GET_PERSONS_DATA = 2048;
        @android.annotation.SystemApi
        public static final int FLAG_GET_PERSISTED_DATA = 4096;
        long mChangedSince;
        @android.annotation.Nullable
        java.lang.String mPackage;
        @android.annotation.Nullable
        java.util.List<java.lang.String> mShortcutIds;
        @android.annotation.Nullable
        java.util.List<android.content.LocusId> mLocusIds;
        @android.annotation.Nullable
        android.content.ComponentName mActivity;
        int mQueryFlags;
        public ShortcutQuery() {}
        public android.content.pm.LauncherApps.ShortcutQuery setChangedSince(long p0) { return null; }
        public android.content.pm.LauncherApps.ShortcutQuery setPackage(java.lang.String p0) { return null; }
        public android.content.pm.LauncherApps.ShortcutQuery setShortcutIds(java.util.List<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.content.pm.LauncherApps.ShortcutQuery setLocusIds(java.util.List<android.content.LocusId> p0) { return null; }
        public android.content.pm.LauncherApps.ShortcutQuery setActivity(android.content.ComponentName p0) { return null; }
        public android.content.pm.LauncherApps.ShortcutQuery setQueryFlags(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface QueryFlags {
        }
    }
}
