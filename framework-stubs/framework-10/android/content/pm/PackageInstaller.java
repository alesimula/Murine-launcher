package android.content.pm;

public class PackageInstaller {
    private static final java.lang.String TAG = "PackageInstaller";
    public static final boolean ENABLE_REVOCABLE_FD = Boolean.valueOf(false);
    public static final java.lang.String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
    public static final java.lang.String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
    public static final java.lang.String ACTION_SESSION_UPDATED = "android.content.pm.action.SESSION_UPDATED";
    public static final java.lang.String ACTION_CONFIRM_INSTALL = "android.content.pm.action.CONFIRM_INSTALL";
    public static final java.lang.String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
    public static final java.lang.String EXTRA_SESSION = "android.content.pm.extra.SESSION";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_STATUS = "android.content.pm.extra.STATUS";
    public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
    public static final java.lang.String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
    public static final java.lang.String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PACKAGE_NAMES = "android.content.pm.extra.PACKAGE_NAMES";
    public static final java.lang.String EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final java.lang.String EXTRA_LEGACY_BUNDLE = "android.content.pm.extra.LEGACY_BUNDLE";
    public static final java.lang.String EXTRA_CALLBACK = "android.content.pm.extra.CALLBACK";
    public static final int STATUS_PENDING_USER_ACTION = -1;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_BLOCKED = 2;
    public static final int STATUS_FAILURE_ABORTED = 3;
    public static final int STATUS_FAILURE_INVALID = 4;
    public static final int STATUS_FAILURE_CONFLICT = 5;
    public static final int STATUS_FAILURE_STORAGE = 6;
    public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
    private final android.content.pm.IPackageInstaller mInstaller = null;
    private final int mUserId = 0;
    private final java.lang.String mInstallerPackageName = null;
    private final java.util.ArrayList<android.content.pm.PackageInstaller.SessionCallbackDelegate> mDelegates = null;
    public PackageInstaller(android.content.pm.IPackageInstaller p0, java.lang.String p1, int p2) {}
    public int createSession(android.content.pm.PackageInstaller.SessionParams p0) throws java.io.IOException { return 0; }
    public android.content.pm.PackageInstaller.Session openSession(int p0) throws java.io.IOException { return null; }
    public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) {}
    public void updateSessionAppLabel(int p0, java.lang.CharSequence p1) {}
    public void abandonSession(int p0) {}
    public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getAllSessions() { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getMySessions() { return null; }
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getStagedSessions() { return null; }
    public android.content.pm.PackageInstaller.SessionInfo getActiveStagedSession() { return null; }
    public void uninstall(java.lang.String p0, android.content.IntentSender p1) {}
    public void uninstall(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    public void uninstall(android.content.pm.VersionedPackage p0, android.content.IntentSender p1) {}
    public void uninstall(android.content.pm.VersionedPackage p0, int p1, android.content.IntentSender p2) {}
    public void installExistingPackage(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    @android.annotation.SystemApi
    public void setPermissionsResult(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void removeSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void unregisterSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}

    public static class SessionParams implements android.os.Parcelable {
        public static final int MODE_INVALID = -1;
        public static final int MODE_FULL_INSTALL = 1;
        public static final int MODE_INHERIT_EXISTING = 2;
        public static final java.util.Set<java.lang.String> RESTRICTED_PERMISSIONS_ALL = null;
        public static final int UID_UNKNOWN = -1;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public int mode;
        @android.annotation.UnsupportedAppUsage
        public int installFlags;
        public int installLocation;
        public int installReason;
        @android.annotation.UnsupportedAppUsage
        public long sizeBytes;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public java.lang.String appPackageName;
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Bitmap appIcon;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public java.lang.String appLabel;
        public long appIconLastModified;
        public android.net.Uri originatingUri;
        @android.annotation.UnsupportedAppUsage
        public int originatingUid;
        public android.net.Uri referrerUri;
        public java.lang.String abiOverride;
        public java.lang.String volumeUuid;
        public java.lang.String[] grantedRuntimePermissions;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public java.lang.String installerPackageName;
        public boolean isMultiPackage;
        public boolean isStaged;
        public long requiredInstalledVersionCode;
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionParams> CREATOR = null;
        public SessionParams(int p0) {}
        public SessionParams(android.os.Parcel p0) {}
        public android.content.pm.PackageInstaller.SessionParams copy() { return null; }
        public boolean areHiddenOptionsSet() { return false; }
        public void setInstallLocation(int p0) {}
        public void setSize(long p0) {}
        public void setAppPackageName(java.lang.String p0) {}
        public void setAppIcon(android.graphics.Bitmap p0) {}
        public void setAppLabel(java.lang.CharSequence p0) {}
        public void setOriginatingUri(android.net.Uri p0) {}
        public void setOriginatingUid(int p0) {}
        public void setReferrerUri(android.net.Uri p0) {}
        @android.annotation.SystemApi
        public void setGrantedRuntimePermissions(java.lang.String[] p0) {}
        public void setWhitelistedRestrictedPermissions(java.util.Set<java.lang.String> p0) {}
        @android.annotation.SystemApi
        public void setEnableRollback(boolean p0) {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public void setAllowDowngrade(boolean p0) {}
        @android.annotation.SystemApi
        public void setRequestDowngrade(boolean p0) {}
        public void setRequiredInstalledVersionCode(long p0) {}
        public void setInstallFlagsForcePermissionPrompt() {}
        @android.annotation.SystemApi
        public void setDontKillApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setInstallAsInstantApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setInstallAsVirtualPreload() {}
        public void setInstallReason(int p0) {}
        @android.annotation.SystemApi
        public void setAllocateAggressive(boolean p0) {}
        public void setInstallerPackageName(java.lang.String p0) {}
        public void setMultiPackage() {}
        @android.annotation.SystemApi
        public void setStaged() {}
        @android.annotation.SystemApi
        public void setInstallAsApex() {}
        public boolean getEnableRollback() { return false; }
        public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SessionInfo implements android.os.Parcelable {
        public static final int INVALID_ID = -1;
        private static final int[] NO_SESSIONS = null;
        public static final int STAGED_SESSION_NO_ERROR = 0;
        public static final int STAGED_SESSION_VERIFICATION_FAILED = 1;
        public static final int STAGED_SESSION_ACTIVATION_FAILED = 2;
        public static final int STAGED_SESSION_UNKNOWN = 3;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public int sessionId;
        public int userId;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public java.lang.String installerPackageName;
        @android.annotation.UnsupportedAppUsage
        public java.lang.String resolvedBaseCodePath;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public float progress;
        @android.annotation.UnsupportedAppUsage
        public boolean sealed;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public boolean active;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public int mode;
        public int installReason;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public long sizeBytes;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public java.lang.String appPackageName;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public android.graphics.Bitmap appIcon;
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
        public java.lang.CharSequence appLabel;
        public int installLocation;
        public android.net.Uri originatingUri;
        public int originatingUid;
        public android.net.Uri referrerUri;
        public java.lang.String[] grantedRuntimePermissions;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public int installFlags;
        public boolean isMultiPackage;
        public boolean isStaged;
        public int parentSessionId;
        public int[] childSessionIds;
        public boolean isStagedSessionApplied;
        public boolean isStagedSessionReady;
        public boolean isStagedSessionFailed;
        private int mStagedSessionErrorCode;
        private java.lang.String mStagedSessionErrorMessage;
        public boolean isCommitted;
        public long updatedMillis;
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionInfo> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public SessionInfo() {}
        public SessionInfo(android.os.Parcel p0) {}
        public int getSessionId() { return 0; }
        public android.os.UserHandle getUser() { return null; }
        public java.lang.String getInstallerPackageName() { return null; }
        public float getProgress() { return 0.0f; }
        public boolean isActive() { return false; }
        public boolean isSealed() { return false; }
        public int getInstallReason() { return 0; }
        @java.lang.Deprecated
        public boolean isOpen() { return false; }
        public java.lang.String getAppPackageName() { return null; }
        public android.graphics.Bitmap getAppIcon() { return null; }
        public java.lang.CharSequence getAppLabel() { return null; }
        public android.content.Intent createDetailsIntent() { return null; }
        public int getMode() { return 0; }
        public int getInstallLocation() { return 0; }
        public long getSize() { return 0L; }
        public android.net.Uri getOriginatingUri() { return null; }
        public int getOriginatingUid() { return 0; }
        public android.net.Uri getReferrerUri() { return null; }
        @android.annotation.SystemApi
        public java.lang.String[] getGrantedRuntimePermissions() { return null; }
        @android.annotation.SystemApi
        public java.util.Set<java.lang.String> getWhitelistedRestrictedPermissions() { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public boolean getAllowDowngrade() { return false; }
        @android.annotation.SystemApi
        public boolean getRequestDowngrade() { return false; }
        @android.annotation.SystemApi
        public boolean getDontKillApp() { return false; }
        @android.annotation.SystemApi
        public boolean getInstallAsInstantApp(boolean p0) { return false; }
        @android.annotation.SystemApi
        public boolean getInstallAsFullApp(boolean p0) { return false; }
        @android.annotation.SystemApi
        public boolean getInstallAsVirtualPreload() { return false; }
        @android.annotation.SystemApi
        public boolean getEnableRollback() { return false; }
        @android.annotation.SystemApi
        public boolean getAllocateAggressive() { return false; }
        @java.lang.Deprecated
        public android.content.Intent getDetailsIntent() { return null; }
        public boolean isMultiPackage() { return false; }
        public boolean isStaged() { return false; }
        public int getParentSessionId() { return 0; }
        public int[] getChildSessionIds() { return null; }
        private void checkSessionIsStaged() {}
        public boolean isStagedSessionApplied() { return false; }
        public boolean isStagedSessionReady() { return false; }
        public boolean isStagedSessionFailed() { return false; }
        public int getStagedSessionErrorCode() { return 0; }
        public java.lang.String getStagedSessionErrorMessage() { return null; }
        public void setStagedSessionErrorCode(int p0, java.lang.String p1) {}
        public boolean isCommitted() { return false; }
        public long getUpdatedMillis() { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface StagedSessionErrorCode {
        }
    }

    static class SessionCallbackDelegate extends android.content.pm.IPackageInstallerCallback.Stub {
        private static final int MSG_SESSION_CREATED = 1;
        private static final int MSG_SESSION_BADGING_CHANGED = 2;
        private static final int MSG_SESSION_ACTIVE_CHANGED = 3;
        private static final int MSG_SESSION_PROGRESS_CHANGED = 4;
        private static final int MSG_SESSION_FINISHED = 5;
        final android.content.pm.PackageInstaller.SessionCallback mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        SessionCallbackDelegate(android.content.pm.PackageInstaller.SessionCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onSessionCreated(int p0) {}
        public void onSessionBadgingChanged(int p0) {}
        public void onSessionActiveChanged(int p0, boolean p1) {}
        public void onSessionProgressChanged(int p0, float p1) {}
        public void onSessionFinished(int p0, boolean p1) {}
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public abstract void onCreated(int p0);
        public abstract void onBadgingChanged(int p0);
        public abstract void onActiveChanged(int p0, boolean p1);
        public abstract void onProgressChanged(int p0, float p1);
        public abstract void onFinished(int p0, boolean p1);
    }

    public static class Session implements java.io.Closeable {
        protected final android.content.pm.IPackageInstallerSession mSession = null;
        public Session(android.content.pm.IPackageInstallerSession p0) {}
        @java.lang.Deprecated
        public void setProgress(float p0) {}
        public void setStagingProgress(float p0) {}
        @android.annotation.UnsupportedAppUsage
        public void addProgress(float p0) {}
        public java.io.OutputStream openWrite(java.lang.String p0, long p1, long p2) throws java.io.IOException { return null; }
        public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
        public void fsync(java.io.OutputStream p0) throws java.io.IOException {}
        public java.lang.String[] getNames() throws java.io.IOException { return null; }
        public java.io.InputStream openRead(java.lang.String p0) throws java.io.IOException { return null; }
        public void removeSplit(java.lang.String p0) throws java.io.IOException {}
        public void commit(android.content.IntentSender p0) {}
        @android.annotation.SystemApi
        public void commitTransferred(android.content.IntentSender p0) {}
        public void transfer(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException {}
        public void close() {}
        public void abandon() {}
        public boolean isMultiPackage() { return false; }
        public boolean isStaged() { return false; }
        public int getParentSessionId() { return 0; }
        public int[] getChildSessionIds() { return null; }
        public void addChildSessionId(int p0) {}
        public void removeChildSessionId(int p0) {}
    }
}
