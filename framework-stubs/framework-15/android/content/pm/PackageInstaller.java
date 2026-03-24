package android.content.pm;

public class PackageInstaller {
    public static final boolean ENABLE_REVOCABLE_FD = Boolean.valueOf(false);
    public static final java.lang.String ACTION_SESSION_DETAILS = "android.content.pm.action.SESSION_DETAILS";
    public static final java.lang.String ACTION_SESSION_COMMITTED = "android.content.pm.action.SESSION_COMMITTED";
    public static final java.lang.String ACTION_SESSION_UPDATED = "android.content.pm.action.SESSION_UPDATED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_INSTALL = "android.content.pm.action.CONFIRM_INSTALL";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_CONFIRM_PRE_APPROVAL = "android.content.pm.action.CONFIRM_PRE_APPROVAL";
    public static final java.lang.String EXTRA_SESSION_ID = "android.content.pm.extra.SESSION_ID";
    public static final java.lang.String EXTRA_SESSION = "android.content.pm.extra.SESSION";
    public static final java.lang.String EXTRA_PACKAGE_NAME = "android.content.pm.extra.PACKAGE_NAME";
    public static final java.lang.String EXTRA_STATUS = "android.content.pm.extra.STATUS";
    public static final java.lang.String EXTRA_PRE_APPROVAL = "android.content.pm.extra.PRE_APPROVAL";
    public static final java.lang.String EXTRA_STATUS_MESSAGE = "android.content.pm.extra.STATUS_MESSAGE";
    public static final java.lang.String EXTRA_OTHER_PACKAGE_NAME = "android.content.pm.extra.OTHER_PACKAGE_NAME";
    public static final java.lang.String EXTRA_STORAGE_PATH = "android.content.pm.extra.STORAGE_PATH";
    public static final java.lang.String EXTRA_INSTALL_CONSTRAINTS = "android.content.pm.extra.INSTALL_CONSTRAINTS";
    public static final java.lang.String EXTRA_INSTALL_CONSTRAINTS_RESULT = "android.content.pm.extra.INSTALL_CONSTRAINTS_RESULT";
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PACKAGE_NAMES = "android.content.pm.extra.PACKAGE_NAMES";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final java.lang.String EXTRA_LEGACY_BUNDLE = "android.content.pm.extra.LEGACY_BUNDLE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_CALLBACK = "android.content.pm.extra.CALLBACK";
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final java.lang.String EXTRA_DELETE_FLAGS = "android.content.pm.extra.DELETE_FLAGS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_DATA_LOADER_TYPE = "android.content.pm.extra.DATA_LOADER_TYPE";
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_RESOLVED_BASE_PATH = "android.content.pm.extra.RESOLVED_BASE_PATH";
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final java.lang.String EXTRA_UNARCHIVE_PACKAGE_NAME = "android.content.pm.extra.UNARCHIVE_PACKAGE_NAME";
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final java.lang.String EXTRA_UNARCHIVE_ID = "android.content.pm.extra.UNARCHIVE_ID";
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final java.lang.String EXTRA_UNARCHIVE_ALL_USERS = "android.content.pm.extra.UNARCHIVE_ALL_USERS";
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final java.lang.String EXTRA_UNARCHIVE_STATUS = "android.content.pm.extra.UNARCHIVE_STATUS";
    public static final java.lang.String EXTRA_WARNINGS = "android.content.pm.extra.WARNINGS";
    public static final int STATUS_PENDING_STREAMING = -2;
    public static final int STATUS_PENDING_USER_ACTION = -1;
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_FAILURE_BLOCKED = 2;
    public static final int STATUS_FAILURE_ABORTED = 3;
    public static final int STATUS_FAILURE_INVALID = 4;
    public static final int STATUS_FAILURE_CONFLICT = 5;
    public static final int STATUS_FAILURE_STORAGE = 6;
    public static final int STATUS_FAILURE_INCOMPATIBLE = 7;
    public static final int STATUS_FAILURE_TIMEOUT = 8;
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_NONE = 0;
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_STREAMING = 1;
    @android.annotation.SystemApi
    public static final int DATA_LOADER_TYPE_INCREMENTAL = 2;
    @android.annotation.SystemApi
    public static final int LOCATION_DATA_APP = 0;
    @android.annotation.SystemApi
    public static final int LOCATION_MEDIA_OBB = 1;
    @android.annotation.SystemApi
    public static final int LOCATION_MEDIA_DATA = 2;
    public static final int PACKAGE_SOURCE_UNSPECIFIED = 0;
    public static final int PACKAGE_SOURCE_OTHER = 1;
    public static final int PACKAGE_SOURCE_STORE = 2;
    public static final int PACKAGE_SOURCE_LOCAL_FILE = 3;
    public static final int PACKAGE_SOURCE_DOWNLOADED_FILE = 4;
    @android.annotation.SystemApi
    public static final int REASON_CONFIRM_PACKAGE_CHANGE = 0;
    @android.annotation.SystemApi
    public static final int REASON_OWNERSHIP_CHANGED = 1;
    @android.annotation.SystemApi
    public static final int REASON_REMIND_OWNERSHIP = 2;
    public static final int UNARCHIVAL_STATUS_UNSET = -1;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_OK = 0;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_ERROR_USER_ACTION_NEEDED = 1;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_ERROR_INSUFFICIENT_STORAGE = 2;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_ERROR_NO_CONNECTIVITY = 3;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_ERROR_INSTALLER_DISABLED = 4;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_ERROR_INSTALLER_UNINSTALLED = 5;
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final int UNARCHIVAL_GENERIC_ERROR = 100;
    public PackageInstaller(android.content.pm.IPackageInstaller p0, java.lang.String p1, java.lang.String p2, int p3) {}
    public int createSession(android.content.pm.PackageInstaller.SessionParams p0) throws java.io.IOException { return 0; }
    @android.annotation.NonNull
    public android.content.pm.PackageInstaller.Session openSession(int p0) throws java.io.IOException { return null; }
    public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) {}
    public void updateSessionAppLabel(int p0, java.lang.CharSequence p1) {}
    public void abandonSession(int p0) {}
    @android.annotation.Nullable
    public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getAllSessions() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getMySessions() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getStagedSessions() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.content.pm.PackageInstaller.SessionInfo getActiveStagedSession() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInstaller.SessionInfo> getActiveStagedSessions() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.DELETE_PACKAGES", "android.permission.REQUEST_DELETE_PACKAGES"})
    public void uninstall(java.lang.String p0, android.content.IntentSender p1) {}
    public void uninstall(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.DELETE_PACKAGES", "android.permission.REQUEST_DELETE_PACKAGES"})
    public void uninstall(android.content.pm.VersionedPackage p0, android.content.IntentSender p1) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.DELETE_PACKAGES", "android.permission.REQUEST_DELETE_PACKAGES"})
    public void uninstall(android.content.pm.VersionedPackage p0, int p1, android.content.IntentSender p2) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.INSTALL_PACKAGES", "com.android.permission.INSTALL_EXISTING_PACKAGES"})
    public void installExistingPackage(java.lang.String p0, int p1, android.content.IntentSender p2) {}
    @android.annotation.RequiresPermission("android.permission.DELETE_PACKAGES")
    public void uninstallExistingPackage(java.lang.String p0, android.content.IntentSender p1) {}
    @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void installPackageArchived(android.content.pm.ArchivedPackageInfo p0, android.content.pm.PackageInstaller.SessionParams p1, android.content.IntentSender p2) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
    public void setPermissionsResult(int p0, boolean p1) {}
    public void checkInstallConstraints(java.util.List<java.lang.String> p0, android.content.pm.PackageInstaller.InstallConstraints p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.content.pm.PackageInstaller.InstallConstraintsResult> p3) {}
    public void waitForInstallConstraints(java.util.List<java.lang.String> p0, android.content.pm.PackageInstaller.InstallConstraints p1, android.content.IntentSender p2, long p3) {}
    public void commitSessionAfterInstallConstraintsAreMet(int p0, android.content.IntentSender p1, android.content.pm.PackageInstaller.InstallConstraints p2, long p3) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    @java.lang.Deprecated
    public void addSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    public void registerSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void removeSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    public void unregisterSessionCallback(android.content.pm.PackageInstaller.SessionCallback p0) {}
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.content.pm.PackageInstaller.InstallInfo readInstallInfo(java.io.File p0, int p1) throws android.content.pm.PackageInstaller.PackageParsingException { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.content.pm.read_install_info")
    public android.content.pm.PackageInstaller.InstallInfo readInstallInfo(android.os.ParcelFileDescriptor p0, java.lang.String p1, int p2) throws android.content.pm.PackageInstaller.PackageParsingException { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.DELETE_PACKAGES", "android.permission.REQUEST_DELETE_PACKAGES"})
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void requestArchive(java.lang.String p0, android.content.IntentSender p1) throws android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INSTALL_PACKAGES", "android.permission.REQUEST_INSTALL_PACKAGES"})
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void requestUnarchive(java.lang.String p0, android.content.IntentSender p1) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INSTALL_PACKAGES", "android.permission.REQUEST_INSTALL_PACKAGES"})
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void reportUnarchivalStatus(int p0, int p1, long p2, android.app.PendingIntent p3) throws android.content.pm.PackageManager.NameNotFoundException {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.INSTALL_PACKAGES", "android.permission.REQUEST_INSTALL_PACKAGES"})
    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public void reportUnarchivalState(android.content.pm.PackageInstaller.UnarchivalState p0) throws android.content.pm.PackageManager.NameNotFoundException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FileLocation {
    }

    public static final class InstallConstraints implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.content.pm.PackageInstaller.InstallConstraints GENTLE_UPDATE = null;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.InstallConstraints> CREATOR = null;
        public InstallConstraints(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4) {}
        public boolean isDeviceIdleRequired() { return false; }
        public boolean isAppNotForegroundRequired() { return false; }
        public boolean isAppNotInteractingRequired() { return false; }
        public boolean isAppNotTopVisibleRequired() { return false; }
        public boolean isNotInCallRequired() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        InstallConstraints(android.os.Parcel p0) {}

        public static final class Builder {
            public Builder() {}
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setDeviceIdleRequired() { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotForegroundRequired() { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotInteractingRequired() { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setAppNotTopVisibleRequired() { return null; }
            @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints.Builder setNotInCallRequired() { return null; }
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.InstallConstraints build() { return null; }
        }
    }

    public static final class InstallConstraintsResult implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.InstallConstraintsResult> CREATOR = null;
        public boolean areAllConstraintsSatisfied() { return false; }
        public InstallConstraintsResult(boolean p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        InstallConstraintsResult(android.os.Parcel p0) {}
    }

    @android.annotation.SystemApi
    public static class InstallInfo {
        InstallInfo(android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> p0) {}
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        public int getInstallLocation() { return 0; }
        public long calculateInstalledSize(android.content.pm.PackageInstaller.SessionParams p0) throws java.io.IOException { return 0L; }
        @android.annotation.FlaggedApi("android.content.pm.read_install_info")
        public long calculateInstalledSize(android.content.pm.PackageInstaller.SessionParams p0, android.os.ParcelFileDescriptor p1) throws java.io.IOException { return 0L; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InstallLocation {
        }
    }

    private static final class LocalIntentSender extends android.content.BroadcastReceiver {
        LocalIntentSender(android.content.Context p0, int p1, android.content.pm.IPackageInstallerSession p2, android.content.IntentSender p3) { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    @android.annotation.SystemApi
    public static class PackageParsingException extends java.lang.Exception {
        public PackageParsingException(int p0, java.lang.String p1) { super(); }
        public int getErrorCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface PackageSourceType {
    }

    public static final class PreapprovalDetails implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.PreapprovalDetails> CREATOR = null;
        public PreapprovalDetails(android.graphics.Bitmap p0, java.lang.CharSequence p1, android.icu.util.ULocale p2, java.lang.String p3) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        PreapprovalDetails(android.os.Parcel p0) {}
        @android.annotation.Nullable
        public android.graphics.Bitmap getIcon() { return null; }
        @android.annotation.NonNull
        public java.lang.CharSequence getLabel() { return null; }
        @android.annotation.NonNull
        public android.icu.util.ULocale getLocale() { return null; }
        @android.annotation.NonNull
        public java.lang.String getPackageName() { return null; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setIcon(android.graphics.Bitmap p0) { return null; }
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLabel(java.lang.CharSequence p0) { return null; }
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setLocale(android.icu.util.ULocale p0) { return null; }
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.PreapprovalDetails.Builder setPackageName(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.content.pm.PackageInstaller.PreapprovalDetails build() { return null; }
        }
    }

    public static class Session implements java.io.Closeable {
        protected final android.content.pm.IPackageInstallerSession mSession = null;
        public Session(android.content.pm.IPackageInstallerSession p0) {}
        @java.lang.Deprecated
        public void setProgress(float p0) {}
        public void setStagingProgress(float p0) {}
        public void addProgress(float p0) {}
        @android.annotation.NonNull
        public java.io.OutputStream openWrite(java.lang.String p0, long p1, long p2) throws java.io.IOException { return null; }
        public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws java.io.IOException {}
        public void stageViaHardLink(java.lang.String p0) throws java.io.IOException {}
        public void fsync(java.io.OutputStream p0) throws java.io.IOException {}
        @android.annotation.NonNull
        public java.lang.String[] getNames() throws java.io.IOException { return null; }
        @android.annotation.NonNull
        public java.io.InputStream openRead(java.lang.String p0) throws java.io.IOException { return null; }
        public void removeSplit(java.lang.String p0) throws java.io.IOException {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("com.android.permission.USE_INSTALLER_V2")
        @android.annotation.Nullable
        public android.content.pm.DataLoaderParams getDataLoaderParams() { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("com.android.permission.USE_INSTALLER_V2")
        public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("com.android.permission.USE_INSTALLER_V2")
        public void removeFile(int p0, java.lang.String p1) {}
        @java.lang.Deprecated
        public void setChecksums(java.lang.String p0, java.util.List<android.content.pm.Checksum> p1, byte[] p2) throws java.io.IOException {}
        public void requestChecksums(java.lang.String p0, int p1, java.util.List<java.security.cert.Certificate> p2, java.util.concurrent.Executor p3, android.content.pm.PackageManager.OnChecksumsReadyListener p4) throws java.security.cert.CertificateEncodingException, java.io.FileNotFoundException {}
        public void commit(android.content.IntentSender p0) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
        public void commitTransferred(android.content.IntentSender p0) {}
        public void transfer(java.lang.String p0) throws android.content.pm.PackageManager.NameNotFoundException {}
        public void close() {}
        public void abandon() {}
        public boolean isMultiPackage() { return false; }
        public boolean isStaged() { return false; }
        public int getInstallFlags() { return 0; }
        public int getParentSessionId() { return 0; }
        @android.annotation.NonNull
        public int[] getChildSessionIds() { return null; }
        public void addChildSessionId(int p0) {}
        public void removeChildSessionId(int p0) {}
        @android.annotation.NonNull
        public android.os.PersistableBundle getAppMetadata() { return null; }
        public void setAppMetadata(android.os.PersistableBundle p0) throws java.io.IOException {}
        public void requestUserPreapproval(android.content.pm.PackageInstaller.PreapprovalDetails p0, android.content.IntentSender p1) {}
        public boolean isApplicationEnabledSettingPersistent() { return false; }
        public boolean isRequestUpdateOwnership() { return false; }
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("android.content.pm.set_pre_verified_domains")
        @android.annotation.RequiresPermission("android.permission.ACCESS_INSTANT_APPS")
        public void setPreVerifiedDomains(java.util.Set<java.lang.String> p0) {}
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("android.content.pm.set_pre_verified_domains")
        @android.annotation.RequiresPermission("android.permission.ACCESS_INSTANT_APPS")
        @android.annotation.NonNull
        public java.util.Set<java.lang.String> getPreVerifiedDomains() { return null; }
    }

    public static abstract class SessionCallback {
        public SessionCallback() {}
        public abstract void onCreated(int p0);
        public abstract void onBadgingChanged(int p0);
        public abstract void onActiveChanged(int p0, boolean p1);
        public abstract void onProgressChanged(int p0, float p1);
        public abstract void onFinished(int p0, boolean p1);
    }

    static class SessionCallbackDelegate extends android.content.pm.IPackageInstallerCallback.Stub {
        final android.content.pm.PackageInstaller.SessionCallback mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        SessionCallbackDelegate(android.content.pm.PackageInstaller.SessionCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onSessionCreated(int p0) {}
        public void onSessionBadgingChanged(int p0) {}
        public void onSessionActiveChanged(int p0, boolean p1) {}
        public void onSessionProgressChanged(int p0, float p1) {}
        public void onSessionFinished(int p0, boolean p1) {}
    }

    public static class SessionInfo implements android.os.Parcelable {
        public static final int INVALID_ID = -1;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_NO_ERROR = 0;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_VERIFICATION_FAILED = 1;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_ACTIVATION_FAILED = 2;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_UNKNOWN = 3;
        @java.lang.Deprecated
        public static final int STAGED_SESSION_CONFLICT = 4;
        public static final int SESSION_NO_ERROR = 0;
        public static final int SESSION_VERIFICATION_FAILED = 1;
        public static final int SESSION_ACTIVATION_FAILED = 2;
        public static final int SESSION_UNKNOWN_ERROR = 3;
        public static final int SESSION_CONFLICT = 4;
        public int sessionId;
        public int userId;
        public java.lang.String installerPackageName;
        public java.lang.String installerAttributionTag;
        public java.lang.String resolvedBaseCodePath;
        public float progress;
        public boolean sealed;
        public boolean active;
        public int mode;
        public int installReason;
        public int installScenario;
        public long sizeBytes;
        public java.lang.String appPackageName;
        public android.graphics.Bitmap appIcon;
        public java.lang.CharSequence appLabel;
        public int installLocation;
        public android.net.Uri originatingUri;
        public int originatingUid;
        public android.net.Uri referrerUri;
        public java.lang.String[] grantedRuntimePermissions;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public int autoRevokePermissionsMode;
        public int installFlags;
        public boolean isMultiPackage;
        public boolean isStaged;
        public boolean forceQueryable;
        public int parentSessionId;
        public int[] childSessionIds;
        public boolean isSessionApplied;
        public boolean isSessionReady;
        public boolean isSessionFailed;
        public boolean isCommitted;
        public long createdMillis;
        public long updatedMillis;
        public int rollbackDataPolicy;
        public long rollbackLifetimeMillis;
        public int rollbackImpactLevel;
        public int requireUserAction;
        public int packageSource;
        public int installerUid;
        public boolean isPreapprovalRequested;
        public boolean applicationEnabledSettingPersistent;
        public int pendingUserActionReason;
        public static final android.os.Parcelable.Creator<android.content.pm.PackageInstaller.SessionInfo> CREATOR = null;
        public SessionInfo() {}
        public SessionInfo(android.os.Parcel p0) {}
        public int getSessionId() { return 0; }
        @android.annotation.NonNull
        public android.os.UserHandle getUser() { return null; }
        @android.annotation.Nullable
        public java.lang.String getInstallerPackageName() { return null; }
        @android.annotation.Nullable
        public java.lang.String getInstallerAttributionTag() { return null; }
        public float getProgress() { return 0.0f; }
        public boolean isActive() { return false; }
        public boolean isSealed() { return false; }
        public int getInstallReason() { return 0; }
        @java.lang.Deprecated
        public boolean isOpen() { return false; }
        @android.annotation.Nullable
        public java.lang.String getAppPackageName() { return null; }
        @android.annotation.Nullable
        public android.graphics.Bitmap getAppIcon() { return null; }
        @android.annotation.Nullable
        public java.lang.CharSequence getAppLabel() { return null; }
        @android.annotation.Nullable
        public android.content.Intent createDetailsIntent() { return null; }
        public int getMode() { return 0; }
        public int getInstallLocation() { return 0; }
        public long getSize() { return 0L; }
        @android.annotation.Nullable
        public android.net.Uri getOriginatingUri() { return null; }
        public int getOriginatingUid() { return 0; }
        @android.annotation.Nullable
        public android.net.Uri getReferrerUri() { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.READ_INSTALLED_SESSION_PATHS")
        @android.annotation.FlaggedApi("android.content.pm.get_resolved_apk_path")
        @android.annotation.Nullable
        public java.lang.String getResolvedBaseApkPath() { return null; }
        @android.annotation.SystemApi
        @android.annotation.Nullable
        public java.lang.String[] getGrantedRuntimePermissions() { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public java.util.Set<java.lang.String> getWhitelistedRestrictedPermissions() { return null; }
        @android.annotation.SystemApi
        public int getAutoRevokePermissionsMode() { return 0; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public boolean getAllowDowngrade() { return false; }
        @android.annotation.SystemApi
        public boolean getRequestDowngrade() { return false; }
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
        @android.annotation.Nullable
        public android.content.Intent getDetailsIntent() { return null; }
        public int getPackageSource() { return 0; }
        public boolean isMultiPackage() { return false; }
        public boolean isStaged() { return false; }
        @android.annotation.SystemApi
        public int getRollbackDataPolicy() { return 0; }
        public boolean isForceQueryable() { return false; }
        public boolean isStagedSessionActive() { return false; }
        public int getParentSessionId() { return 0; }
        public boolean hasParentSessionId() { return false; }
        @android.annotation.NonNull
        public int[] getChildSessionIds() { return null; }
        public boolean isStagedSessionApplied() { return false; }
        public boolean isStagedSessionReady() { return false; }
        public boolean isStagedSessionFailed() { return false; }
        public int getStagedSessionErrorCode() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getStagedSessionErrorMessage() { return null; }
        public void setSessionErrorCode(int p0, java.lang.String p1) {}
        public boolean isCommitted() { return false; }
        public long getCreatedMillis() { return 0L; }
        public long getUpdatedMillis() { return 0L; }
        public int getRequireUserAction() { return 0; }
        public int getInstallerUid() { return 0; }
        public boolean isApplicationEnabledSettingPersistent() { return false; }
        public boolean isPreApprovalRequested() { return false; }
        public boolean isRequestUpdateOwnership() { return false; }
        @android.annotation.SystemApi
        public int getPendingUserActionReason() { return 0; }
        @android.annotation.FlaggedApi("android.content.pm.archiving")
        public boolean isUnarchival() { return false; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SessionParams implements android.os.Parcelable {
        public static final int MODE_INVALID = -1;
        public static final int MODE_FULL_INSTALL = 1;
        public static final int MODE_INHERIT_EXISTING = 2;
        @android.annotation.NonNull
        public static final java.util.Set<java.lang.String> RESTRICTED_PERMISSIONS_ALL = null;
        public static final int UID_UNKNOWN = -1;
        public static final int MAX_PACKAGE_NAME_LENGTH = 255;
        public static final int USER_ACTION_UNSPECIFIED = 0;
        public static final int USER_ACTION_REQUIRED = 1;
        public static final int USER_ACTION_NOT_REQUIRED = 2;
        public static final int PERMISSION_STATE_DEFAULT = 0;
        public static final int PERMISSION_STATE_GRANTED = 1;
        public static final int PERMISSION_STATE_DENIED = 2;
        public int mode;
        public int installFlags;
        public int installLocation;
        public int installReason;
        public int installScenario;
        public long sizeBytes;
        public java.lang.String appPackageName;
        public android.graphics.Bitmap appIcon;
        public java.lang.String appLabel;
        public long appIconLastModified;
        public android.net.Uri originatingUri;
        public int originatingUid;
        public android.net.Uri referrerUri;
        public java.lang.String abiOverride;
        public java.lang.String volumeUuid;
        public java.util.List<java.lang.String> whitelistedRestrictedPermissions;
        public int autoRevokePermissionsMode;
        public java.lang.String installerPackageName;
        public boolean isMultiPackage;
        public int packageSource;
        public boolean isStaged;
        public long requiredInstalledVersionCode;
        public android.content.pm.DataLoaderParams dataLoaderParams;
        public int rollbackDataPolicy;
        public long rollbackLifetimeMillis;
        public int rollbackImpactLevel;
        public boolean forceQueryableOverride;
        public int requireUserAction;
        public boolean applicationEnabledSettingPersistent;
        public int developmentInstallFlags;
        public int unarchiveId;
        @android.annotation.Nullable
        public java.lang.String dexoptCompilerFilter;
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
        @java.lang.Deprecated
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS")
        public void setGrantedRuntimePermissions(java.lang.String[] p0) {}
        @android.annotation.RequiresPermission(value="android.permission.INSTALL_GRANT_RUNTIME_PERMISSIONS", conditional=true)
        @android.annotation.NonNull
        public android.content.pm.PackageInstaller.SessionParams setPermissionState(java.lang.String p0, int p1) { return null; }
        public void setPermissionStates(java.util.Collection<java.lang.String> p0, java.util.Collection<java.lang.String> p1) {}
        public void setPackageSource(int p0) {}
        public void setWhitelistedRestrictedPermissions(java.util.Set<java.lang.String> p0) {}
        @java.lang.Deprecated
        public void setAutoRevokePermissionsMode(boolean p0) {}
        @android.annotation.SystemApi
        public void setEnableRollback(boolean p0) {}
        @android.annotation.SystemApi
        public void setEnableRollback(boolean p0, int p1) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MANAGE_ROLLBACKS")
        @android.annotation.FlaggedApi("android.content.pm.rollback_lifetime")
        public void setRollbackLifetimeMillis(long p0) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MANAGE_ROLLBACKS")
        @android.annotation.FlaggedApi("android.content.pm.recoverability_detection")
        public void setRollbackImpactLevel(int p0) {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public void setAllowDowngrade(boolean p0) {}
        @android.annotation.SystemApi
        public void setRequestDowngrade(boolean p0) {}
        public void setRequiredInstalledVersionCode(long p0) {}
        public void setInstallFlagsForcePermissionPrompt() {}
        public void setDontKillApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setInstallAsInstantApp(boolean p0) {}
        @android.annotation.SystemApi
        public void setInstallAsVirtualPreload() {}
        public void setInstallReason(int p0) {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.ALLOCATE_AGGRESSIVE")
        public void setAllocateAggressive(boolean p0) {}
        public void setInstallFlagAllowTest() {}
        public void setInstallerPackageName(java.lang.String p0) {}
        public void setMultiPackage() {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
        public void setStaged() {}
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.INSTALL_PACKAGES")
        public void setInstallAsApex() {}
        public boolean getEnableRollback() { return false; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission(allOf={"android.permission.INSTALL_PACKAGES", "com.android.permission.USE_INSTALLER_V2"})
        public void setDataLoaderParams(android.content.pm.DataLoaderParams p0) {}
        public void setForceQueryable() {}
        public void setRequireUserAction(int p0) {}
        public void setInstallScenario(int p0) {}
        public void setApplicationEnabledSettingPersistent() {}
        @android.annotation.RequiresPermission("android.permission.ENFORCE_UPDATE_OWNERSHIP")
        public void setRequestUpdateOwnership(boolean p0) {}
        @android.annotation.FlaggedApi("android.content.pm.archiving")
        public void setUnarchiveId(int p0) {}
        public void setDexoptCompilerFilter(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.util.ArrayMap<java.lang.String, java.lang.Integer> getPermissionStates() { return null; }
        @android.annotation.Nullable
        public java.lang.String[] getLegacyGrantedRuntimePermissions() { return null; }
        public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PermissionState {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UserActionRequirement {
        }
    }

    @android.annotation.FlaggedApi("android.content.pm.archiving")
    public static final class UnarchivalState {
        @android.annotation.NonNull
        public static android.content.pm.PackageInstaller.UnarchivalState createOkState(int p0) { return null; }
        @android.annotation.NonNull
        public static android.content.pm.PackageInstaller.UnarchivalState createUserActionRequiredState(int p0, android.app.PendingIntent p1) { return null; }
        @android.annotation.NonNull
        public static android.content.pm.PackageInstaller.UnarchivalState createInsufficientStorageState(int p0, long p1, android.app.PendingIntent p2) { return null; }
        @android.annotation.NonNull
        public static android.content.pm.PackageInstaller.UnarchivalState createNoConnectivityState(int p0) { return null; }
        @android.annotation.NonNull
        public static android.content.pm.PackageInstaller.UnarchivalState createGenericErrorState(int p0) { return null; }
        int getUnarchiveId() { return 0; }
        int getStatus() { return 0; }
        long getRequiredStorageBytes() { return 0L; }
        @android.annotation.Nullable
        android.app.PendingIntent getUserActionIntent() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UnarchivalStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserActionReason {
    }
}
