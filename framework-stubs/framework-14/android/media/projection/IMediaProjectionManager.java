package android.media.projection;

public interface IMediaProjectionManager extends android.os.IInterface {
    public static final java.lang.String EXTRA_USER_REVIEW_GRANTED_CONSENT = "extra_media_projection_user_consent_required";
    public static final java.lang.String EXTRA_PACKAGE_REUSING_GRANTED_CONSENT = "extra_media_projection_package_reusing_consent";
    public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void stopActiveProjection() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void notifyActiveProjectionCapturedContentResized(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjectionManager {
        public Default() {}
        public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
        public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException {}
        public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
        public void stopActiveProjection() throws android.os.RemoteException {}
        public void notifyActiveProjectionCapturedContentResized(int p0, int p1) throws android.os.RemoteException {}
        public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
        public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException { return false; }
        public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjectionManager {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjectionManager";
        static final int TRANSACTION_hasProjectionPermission = 1;
        static final int TRANSACTION_createProjection = 2;
        static final int TRANSACTION_getProjection = 3;
        static final int TRANSACTION_isCurrentProjection = 4;
        static final int TRANSACTION_requestConsentForInvalidProjection = 5;
        static final int TRANSACTION_getActiveProjectionInfo = 6;
        static final int TRANSACTION_stopActiveProjection = 7;
        static final int TRANSACTION_notifyActiveProjectionCapturedContentResized = 8;
        static final int TRANSACTION_notifyActiveProjectionCapturedContentVisibilityChanged = 9;
        static final int TRANSACTION_addCallback = 10;
        static final int TRANSACTION_removeCallback = 11;
        static final int TRANSACTION_setContentRecordingSession = 12;
        static final int TRANSACTION_setUserReviewGrantedConsentResult = 13;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.media.projection.IMediaProjectionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getProjection_enforcePermission() throws java.lang.SecurityException {}
        protected void setUserReviewGrantedConsentResult_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.projection.IMediaProjectionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean hasProjectionPermission(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public android.media.projection.IMediaProjection createProjection(int p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.media.projection.IMediaProjection getProjection(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean isCurrentProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException { return false; }
            public void requestConsentForInvalidProjection(android.media.projection.IMediaProjection p0) throws android.os.RemoteException {}
            public android.media.projection.MediaProjectionInfo getActiveProjectionInfo() throws android.os.RemoteException { return null; }
            public void stopActiveProjection() throws android.os.RemoteException {}
            public void notifyActiveProjectionCapturedContentResized(int p0, int p1) throws android.os.RemoteException {}
            public void notifyActiveProjectionCapturedContentVisibilityChanged(boolean p0) throws android.os.RemoteException {}
            public void addCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
            public void removeCallback(android.media.projection.IMediaProjectionWatcherCallback p0) throws android.os.RemoteException {}
            public boolean setContentRecordingSession(android.view.ContentRecordingSession p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException { return false; }
            public void setUserReviewGrantedConsentResult(int p0, android.media.projection.IMediaProjection p1) throws android.os.RemoteException {}
        }
    }
}
