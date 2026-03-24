package android.media.projection;

public interface IMediaProjection extends android.os.IInterface {
    public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void stop() throws android.os.RemoteException;
    public boolean canProjectAudio() throws android.os.RemoteException;
    public boolean canProjectVideo() throws android.os.RemoteException;
    public boolean canProjectSecureVideo() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException;
    public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public int getTaskId() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void setTaskId(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public boolean isValid() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_MEDIA_PROJECTION")
    @android.annotation.EnforcePermission("android.permission.MANAGE_MEDIA_PROJECTION")
    public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.projection.IMediaProjection {
        public Default() {}
        public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void stop() throws android.os.RemoteException {}
        public boolean canProjectAudio() throws android.os.RemoteException { return false; }
        public boolean canProjectVideo() throws android.os.RemoteException { return false; }
        public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
        public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
        public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
        public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException { return null; }
        public int getTaskId() throws android.os.RemoteException { return 0; }
        public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException {}
        public void setTaskId(int p0) throws android.os.RemoteException {}
        public boolean isValid() throws android.os.RemoteException { return false; }
        public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.projection.IMediaProjection {
        public static final java.lang.String DESCRIPTOR = "android.media.projection.IMediaProjection";
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_stop = 2;
        static final int TRANSACTION_canProjectAudio = 3;
        static final int TRANSACTION_canProjectVideo = 4;
        static final int TRANSACTION_canProjectSecureVideo = 5;
        static final int TRANSACTION_applyVirtualDisplayFlags = 6;
        static final int TRANSACTION_registerCallback = 7;
        static final int TRANSACTION_unregisterCallback = 8;
        static final int TRANSACTION_getLaunchCookie = 9;
        static final int TRANSACTION_getTaskId = 10;
        static final int TRANSACTION_setLaunchCookie = 11;
        static final int TRANSACTION_setTaskId = 12;
        static final int TRANSACTION_isValid = 13;
        static final int TRANSACTION_notifyVirtualDisplayCreated = 14;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.media.projection.IMediaProjection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void applyVirtualDisplayFlags_enforcePermission() throws java.lang.SecurityException {}
        protected void getLaunchCookie_enforcePermission() throws java.lang.SecurityException {}
        protected void getTaskId_enforcePermission() throws java.lang.SecurityException {}
        protected void setLaunchCookie_enforcePermission() throws java.lang.SecurityException {}
        protected void setTaskId_enforcePermission() throws java.lang.SecurityException {}
        protected void isValid_enforcePermission() throws java.lang.SecurityException {}
        protected void notifyVirtualDisplayCreated_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.projection.IMediaProjection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void start(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void stop() throws android.os.RemoteException {}
            public boolean canProjectAudio() throws android.os.RemoteException { return false; }
            public boolean canProjectVideo() throws android.os.RemoteException { return false; }
            public boolean canProjectSecureVideo() throws android.os.RemoteException { return false; }
            public int applyVirtualDisplayFlags(int p0) throws android.os.RemoteException { return 0; }
            public void registerCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public void unregisterCallback(android.media.projection.IMediaProjectionCallback p0) throws android.os.RemoteException {}
            public android.app.ActivityOptions.LaunchCookie getLaunchCookie() throws android.os.RemoteException { return null; }
            public int getTaskId() throws android.os.RemoteException { return 0; }
            public void setLaunchCookie(android.app.ActivityOptions.LaunchCookie p0) throws android.os.RemoteException {}
            public void setTaskId(int p0) throws android.os.RemoteException {}
            public boolean isValid() throws android.os.RemoteException { return false; }
            public void notifyVirtualDisplayCreated(int p0) throws android.os.RemoteException {}
        }
    }
}
