package android.app;

public class ForegroundServiceDelegationOptions {
    public static final int DELEGATION_SERVICE_DEFAULT = 0;
    public static final int DELEGATION_SERVICE_DATA_SYNC = 1;
    public static final int DELEGATION_SERVICE_MEDIA_PLAYBACK = 2;
    public static final int DELEGATION_SERVICE_PHONE_CALL = 3;
    public static final int DELEGATION_SERVICE_LOCATION = 4;
    public static final int DELEGATION_SERVICE_CONNECTED_DEVICE = 5;
    public static final int DELEGATION_SERVICE_MEDIA_PROJECTION = 6;
    public static final int DELEGATION_SERVICE_CAMERA = 7;
    public static final int DELEGATION_SERVICE_MICROPHONE = 8;
    public static final int DELEGATION_SERVICE_HEALTH = 9;
    public static final int DELEGATION_SERVICE_REMOTE_MESSAGING = 10;
    public static final int DELEGATION_SERVICE_SYSTEM_EXEMPTED = 11;
    public static final int DELEGATION_SERVICE_SPECIAL_USE = 12;
    public final int mClientPid = 0;
    public final int mClientUid = 0;
    @android.annotation.NonNull
    public final java.lang.String mClientPackageName = null;
    @android.annotation.Nullable
    public final android.app.IApplicationThread mClientAppThread = null;
    public final boolean mSticky = false;
    @android.annotation.NonNull
    public java.lang.String mClientInstanceName;
    public final int mForegroundServiceTypes = 0;
    public final int mDelegationService = 0;
    public final int mClientNotificationId = 0;
    @android.annotation.Nullable
    public final android.app.Notification mClientNotification = null;
    public ForegroundServiceDelegationOptions(int p0, int p1, java.lang.String p2, android.app.IApplicationThread p3, boolean p4, java.lang.String p5, int p6, int p7) {}
    public ForegroundServiceDelegationOptions(int p0, int p1, java.lang.String p2, android.app.IApplicationThread p3, boolean p4, java.lang.String p5, int p6, int p7, int p8, android.app.Notification p9) {}
    public boolean isSameDelegate(android.app.ForegroundServiceDelegationOptions p0) { return false; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getDescription() { return null; }
    public static java.lang.String serviceCodeToString(int p0) { return null; }

    public static class Builder {
        int mClientPid;
        int mClientUid;
        java.lang.String mClientPackageName;
        int mClientNotificationId;
        android.app.Notification mClientNotification;
        android.app.IApplicationThread mClientAppThread;
        boolean mSticky;
        java.lang.String mClientInstanceName;
        int mForegroundServiceTypes;
        int mDelegationService;
        public Builder() {}
        public android.app.ForegroundServiceDelegationOptions.Builder setClientPid(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientUid(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientNotification(int p0, android.app.Notification p1) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientAppThread(android.app.IApplicationThread p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setClientInstanceName(java.lang.String p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setSticky(boolean p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setForegroundServiceTypes(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions.Builder setDelegationService(int p0) { return null; }
        public android.app.ForegroundServiceDelegationOptions build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DelegationService {
    }
}
